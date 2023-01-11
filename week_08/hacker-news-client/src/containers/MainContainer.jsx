import React, { useState, useEffect } from 'react'
import ArticleList from '../components/ArticleList'
import Filter from '../components/filter'

const MainContainer = () => {

    const [ articles, setArticleData] = useState([])
    const [ filteredArticles, setFilteredArticles ] = useState([])

    const [inputText, setInputText] = useState("")

    useEffect( () => {
        const filter = articles.filter(article => article.title.toLowerCase().includes(inputText.toLowerCase()))
        setFilteredArticles(filter)
    }, [inputText])
    
    const handleTextChange = (event) => {
        setInputText(event.target.value);
    }

    useEffect( () => {
        fetch( 'https://hacker-news.firebaseio.com/v0/topstories.json' )
        .then( res => res.json() )
        .then(( data ) => {
            const articlePromises = data.slice(0,20).map((storyId) => {
                return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`).then(res => res.json())
            })

            Promise.all(articlePromises)
            .then(data => {
                setArticleData(data)
            })
        })
    }, [] )
    
    
    return (
        <>
            <Filter handleTextChange={handleTextChange} inputText={inputText}/>
            <ArticleList articles={inputText ? filteredArticles : articles}/>
        </>
    )
}

export default MainContainer