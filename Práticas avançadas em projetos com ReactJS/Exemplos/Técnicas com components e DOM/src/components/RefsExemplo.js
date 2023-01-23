import { useEffect, useRef } from "react";

function RefsExemplo() {

    const inputRef = useRef()
    const countRef = useRef(1)

    useEffect(() => {
        setTimeout(() => {
            /* não re-renderiza tela quando valor muda */
            countRef.current = 300
            console.log("AQUI");
        }, 3000)
    }, [])

    return (
        <>
            Entrada: <input ref={inputRef} type="text" /> <br/>
            <button onClick={() => {
                inputRef.current.focus()
            }} >
                Forcar input
            </button>
            <p></p>
            Contar: <span ref={countRef}> {countRef.current} </span>
        </>
    );
}

export default RefsExemplo;