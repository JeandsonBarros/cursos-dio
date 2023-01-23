function Buttons({decrement, increment, count}) {
    return (
        <div>
            <h1>Valor atual = {count}</h1>
            <button onClick={increment}>Adicionar 1</button>
            <button onClick={decrement}>Decrementar 1</button>
        </div>
    );
}

export default Buttons;