import { useEffect, useState } from "react";
import FooterContainer from "./FooterWrapper";
import ImageContainer from "./ImageContainer";
import SelectorContainer from "./SelectorContainer";

const MainContainer = () => {

    const [images, setImages] = useState([]);
    const [colour, setColour] = useState("#ff0000");

    const getImages = function(imageColour){
        fetch(("https://api.pexels.com/v1/search?query=shop&color=" + imageColour), {
            headers: {Authorization: '563492ad6f9170000100000192276e1cd1ae45d1bd31b7e89fbd020c'}})
        .then(res => res.json())
        .then(data => setImages(data.photos))
    }

    const getColour = function(colour){
        setColour(colour)
        getImages(colour.replace('#', ''))
    }

    return (
        <div className="main-container">
            <h1>Select Images By Colour</h1>
            <SelectorContainer colour={colour} getColour={getColour}/>
            {colour ? <ImageContainer images={images}/> : null}
            <FooterContainer />
        </div>
    )
};

export default MainContainer;