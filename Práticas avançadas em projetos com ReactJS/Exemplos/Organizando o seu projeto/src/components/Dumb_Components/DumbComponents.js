import { useState } from "react";
import { espacoParaTraco } from "../../common/utils/string";
import Button from "./Button";
import Calc from "./Calc";

function DumbComponents() {

    console.log(espacoParaTraco("teste 1"));

    const [value, setValue] = useState(0)
    const [max, setMax] = useState(30)
    const [min, setMin] = useState(0)

    const handleClick = () => {
        setMin(10)
    }

    const handleCalc = ({ target }) => {
        const value = target.value
        setValue(min + max + value)
    }

    return (
        <div>
            <div>
                <Button onClick={handleClick}>
                    Adicionar no carrinho
                </Button>
            </div>
            <div>
                <h3>Valor calculado: {value}</h3>
                <Calc 
                    min={min}
                    max={max}
                    onChange={handleCalc}
                />
            </div>

        </div>
    );
}

export default DumbComponents;