import React, { useState, useEffect } from 'react';
import MusicDetail from "../components/MusicDetail";
import MusicSelector from "../components/MusicSelector";
import MusicPlayer from "../components/MusicPlayer";

const MusicWrapper = () => {

    const [songs, setSongs] = useState([])
    const [selectedSong, setSelectedSong] = useState(null)
    const [selectedSongIndex, setSelectedSongIndex] = useState(0)

    useEffect(() => {
        getSongs();
    }, []);

    const getSongs = function(){
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        .then(res => res.json())
        .then(songs => setSongs(songs.feed.entry))
    }

    const onSongSelected = function(song, index){
        setSelectedSong(song)
        setSelectedSongIndex(parseInt(index) + 1)
    }

    return (
        <div className="music-selector">
            <h1>Top Charts!</h1>
            <MusicSelector songs={songs} onSongSelected={onSongSelected}/>
            {selectedSong ? 
                <div className="music-details">
                    <MusicDetail selectedSong={selectedSong} index={selectedSongIndex}/>
                    <MusicPlayer selectedSong={selectedSong}/>
                </div> : null}
            
        </div>
    )
};

export default MusicWrapper;