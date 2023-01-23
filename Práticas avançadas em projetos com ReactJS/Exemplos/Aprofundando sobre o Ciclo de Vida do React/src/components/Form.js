import { useContext } from "react";
import { ThemeContext } from "./Theme";

function Form() {

    const theme = useContext(ThemeContext)
   
    const renderFormLogin = (
        <form>
            <h4>Form login</h4>
            <label>Email: </label>
            <input type="email" /><br />
            <label>Senha: </label>
            <input type="password" />
        </form>
    )

    const renderLogged = (<h5>Você está loagado</h5>)

    return (
        <div>
            {theme.token ? renderLogged : renderFormLogin}
        </div>
    );
}

export default Form;