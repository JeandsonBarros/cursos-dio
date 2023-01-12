import { useEffect, useState, memo } from "react";

//shouldComponentUpdate
const areEqual = (prevProps, nextProps) =>{
    return prevProps.loading === nextProps.loading
}

//O que são Hooks e como ele pode otimizar o código
function TwitterFunction(props) {

    const { loading } = props;
    const [tweet, setTweet] = useState("titulo sei lá")

    //componentDidMount
    useEffect(() => {
        const { posts } = props;
        console.log("componentDidMount: montado");
        console.log(posts);
    }, [])

    //componentDidUpdate
    useEffect(() => {
        if(loading)
            console.log("componentDidUpdate: atualizado ", loading);
    }, [loading])

    //componentWillUnmount
    useEffect(() => {
        return () => {
            console.log("componentWillUnmount: fui removido :(");
        }
    }, [])

    console.log(tweet);
    return (
        <div>
            <button onClick={() => setTweet(true)}>Re-ender</button>
        </div>
    );

}

export default memo(TwitterFunction, areEqual);