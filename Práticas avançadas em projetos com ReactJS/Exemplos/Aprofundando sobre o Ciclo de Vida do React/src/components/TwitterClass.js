import { Component } from "react";

//Ciclo de Vida e suas fases
class TwitterClass extends Component {

    state = {
        tweet: "titulo sei lá"
    }

    /* É invocado antes que o mounting ocorra. 
       componentWillMount foi renomeado e não é recomendado para uso. 
       O novo nome é UNSAFE_componentWillMount().
       Ver https://reactjs.org/link/unsafe-component-lifecycles para detalhes. */
    componentWillMount() {
        console.log("componentWillMount");
    }

    //É invocado imediatamente após um componente ser montado
    componentDidMount() {
        const { posts, loading } = this.props;
        console.log("componentDidMount");
        console.log(posts);
        console.log("componentDidUpdate: loading", loading);
    }

    /* componentDidUpdate(prevProps, prevState, snapshot)
       componentDidUpdate() é invocado imediatamente após alguma atualização ocorrer.
       Este método não é chamado pelo initial render. */
    componentDidUpdate(prevProps) {
        const { loading } = this.props;
        if (this.props.loading !== prevProps.loading) {
            console.log("componentDidUpdate: loading", loading);
        }
    }

    /* componentWillUnmount() é invocado imediatamente antes que um
       componente seja desmontado e destruído.  */
    componentWillUnmount() {
        console.log("componentWillUnmount: fui removido :(");
    }

    /* shouldComponentUpdate(nextProps, nextState)
    Use shouldComponentUpdate() para permitir que o React saiba se o resultado de
    um componente não é afetado pelas mudanças atuais em state ou props.  */
    shouldComponentUpdate(nextProps, nextState) {
        return this.state.tweet !== nextState.tweet
    }

    tweet = () => {
        this.setState({tweet: true})
    }

    render() {
        const { posts } = this.props;
        console.log(posts);
        return (
            <div>
                <button onClick={this.tweet}>Re-ender</button>
            </div>
        );
    }

}

export default TwitterClass;