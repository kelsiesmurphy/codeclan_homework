const Image = ({image, index}) => {
    return (
        <li value={index} className="image">
            <img alt={image.alt} src={image.src.medium}/>
            <p>
                Photo by <a href={image.photographer_url}>{image.photographer}</a> on <a href="https://www.pexels.com">Pexels</a>
            </p>
        </li>
    )
};

export default Image;