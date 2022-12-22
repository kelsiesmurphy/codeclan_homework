import FooterContainer from "./FooterWrapper";
import ImageContainer from "./ImageContainer";

const MainContainer = () => {
    return (
        <div className="main-container">
            <h1>This is the main container</h1>
            <ImageContainer />
            <FooterContainer />
        </div>
    )
};

export default MainContainer;