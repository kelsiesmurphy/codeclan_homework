import Film from "../components/Film";

const UpcomingReleasesWrapper = ({ films }) => {
    const filmNodes = films.map((film) => {
        return (
            <Film key={film.key} name={film.name} url={film.url}/>
        )
    })
    return (
        <ul className="upcoming-releases-wrapper">
            {filmNodes}
        </ul>
    )
};

export default UpcomingReleasesWrapper;