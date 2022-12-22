import { useEffect, useState } from "react";
import FooterContainer from "./FooterWrapper";
import ImageContainer from "./ImageContainer";
import SelectorContainer from "./SelectorContainer";

const MainContainer = () => {

    const [images, setImages] = useState([]);
    const [colour, setColour] = useState("#ff0000");

    const getImages = function(){
        fetch('https://api.pexels.com/v1/search?query=shop', {
            headers: {Authorization: '563492ad6f917000010000011e14f4f5c0074ef68fd997ca4584eef8'}})
        .then(res => res.json())
        .then(data => setImages(data.photos))
    }

    useEffect(() => {
        getImages(colour);
    }, [colour])

    const getColour = function(colour){
        setColour(colour)
    }

    return (
        <div className="main-container">
            <h1>This is the main container, colour is: {colour}</h1>
            {/* <SelectorContainer colour={colour} getColour={getColour}/>
            {colour ? <ImageContainer images={images}/> : null} */}
            <FooterContainer />
        </div>
    )
};

export default MainContainer;