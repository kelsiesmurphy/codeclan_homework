import Image from "../components/Image";

const ImageContainer = ({ images }) => {

    const imageNodes = images.map((image, index) => {
        return (
            <Image key={index} image={image} index={index}/>
        )
    })

    return (
        <ul>{imageNodes}</ul>
        
    )
};

export default ImageContainer;