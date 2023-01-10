const Selector = ({colour, getColour}) => {

    const handleColourChange = (event) => {
        getColour(event.target.value)
    };

    return (
        <div className="colour-picker">
            <label htmlFor="colour-picker">Pick a colour:</label>
            <input type="color" id="colour-picker" onChange={handleColourChange} value={colour} />
        </div>
    )
};

export default Selector;