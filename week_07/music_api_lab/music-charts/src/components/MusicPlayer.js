import ReactAudioPlayer from "react-audio-player";

const MusicPlayer = ({selectedSong}) => {
    return (
        <ReactAudioPlayer
            src={selectedSong.link[1].attributes.href}
            autoPlay
            controls
        />
    )
};

export default MusicPlayer;