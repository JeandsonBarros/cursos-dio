import PropTypes from 'prop-types';

function PetShop({ dogs, cats, customers, customerName, click, status }) {
    return (
        <div>
            <h1>Dogs: {dogs}</h1>
            <h2>Cats:{cats} </h2>
            <div>
                Quantidade de clientes: {customers}
            </div>
            <div>
                Nome do cliente: {customerName}
            </div>
            <div>
                <button onClick={click}>Banho</button>
            </div>
            <div>status: {status} </div>
        </div>);
}

PetShop.defaultProps = {
    cats: 0,
    customers: []
}

PetShop.propTypes = {
    dogs: PropTypes.number.isRequired,
    cats: PropTypes.number,
    customers: PropTypes.array,
    customerName: PropTypes.string.isRequired,
    click: PropTypes.func.isRequired,
    status: PropTypes.oneOf(["Completed", "Disabled"])
};

export default PetShop;