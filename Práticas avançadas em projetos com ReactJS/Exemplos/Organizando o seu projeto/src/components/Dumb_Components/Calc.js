import PropTypes from 'prop-types'

function Calc({ max, min, onChange }) {
    return ( 
    <div>
        <p>Valor mínimo: {min}</p>
        <p>Valor máximo: {max}</p>
        <input type="number" onChange={onChange} />
    </div> );
}

Calc.propTypes = {
    max: PropTypes.number.isRequired,
    min: PropTypes.number.isRequired,
    onChange: PropTypes.func.isRequired
}

export default Calc;