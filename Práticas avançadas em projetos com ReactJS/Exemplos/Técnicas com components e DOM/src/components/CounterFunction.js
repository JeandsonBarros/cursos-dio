import { useState } from "react"

function CounterFunction({ render }) {

    const [count, setCount] = useState(0);

    const increment = () => {
        setCount(count + 1)
    }

    const decrement = () => {
        setCount(count - 1)
    }

    return (
        <div>
            {
                render({
                    decrement: decrement,
                    increment: increment,
                    count
                })
            }

        </div>
    );
}

export default CounterFunction;