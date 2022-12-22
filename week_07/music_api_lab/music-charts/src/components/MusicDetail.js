const MusicDetail = ({selectedSong, index}) => {
    return (
        <div className="song-detail">
            <img src={selectedSong["im:image"][2].label} />
            <div className="song-text">
                <h2 className="song-title">{selectedSong["title"].label}</h2>
                <h3 className="song-artist">{selectedSong["im:artist"].label}</h3>
                <p>Currently no. {index} in the charts!</p>
            </div>
        </div>
    )
};

export default MusicDetail;