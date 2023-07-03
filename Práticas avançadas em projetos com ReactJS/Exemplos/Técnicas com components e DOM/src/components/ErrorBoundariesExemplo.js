import { Component } from "react";
import FragmentExemple from "./FragmentExemplo";

class ErrorBoundariesExemplo extends Component {

    constructor(props) {
        super(props);
        this.state = {
            error: false
        }
    }

    componentDidCatch(error, errorInfo) {
        console.log("teve error");
        this.setState({ error: true })
    }

    render() {
        return (
            <div>
                {this.error ? 
                <img src="https://media.tenor.com/DI59VcCU-SYAAAAC/dinofaurio-dinosaur.gif" alt="" /> :
                <FragmentExemple />}
            </div>);
    }
}

export default ErrorBoundariesExemplo;