import Selector from "../components/Selector";

const SelectorContainer = ({colour, getColour}) => {
    return (
        <Selector colour={colour} getColour={getColour}/>
    )
};

export default SelectorContainer;