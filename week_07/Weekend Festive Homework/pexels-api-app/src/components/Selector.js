const Selector = ({colour, getColour}) => {

    const handleColourChange = (event) => {
        getColour(event.target.value)
    };

    return (
        <div className="colour-picker">
            <h3>Selector</h3><label htmlFor="colour-picker">Color Picker:</label>
            <input type="color" id="colour-picker" onChange={handleColourChange} value={colour} />
            <button>New</button>
        </div>
    )
};

export default Selector;