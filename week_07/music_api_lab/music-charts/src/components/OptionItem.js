const OptionItem = ({song, index}) => {
    return (
        <option value={index}>{song["title"].label}</option>
    )
};

export default OptionItem;