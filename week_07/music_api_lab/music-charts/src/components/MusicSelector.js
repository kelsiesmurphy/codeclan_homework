import OptionItem from "./OptionItem";

const MusicSelector = ({songs, onSongSelected}) => {

    const musicOptions = songs.map((song, index) => {
        return (
            <OptionItem key={index} song={song} index={index} />
        )
    })

    const handleChange = (event) => {
        const chosenSong = songs[event.target.value]
        onSongSelected(chosenSong, event.target.value)
    }

    return (
        <select className="music-dropdown" defaultValue="" onChange={handleChange}>
            <option value="" disabled>Pick a song</option>
            {musicOptions}
        </select>
    )
};

export default MusicSelector;