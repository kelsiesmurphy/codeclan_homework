import React, { useState, useEffect } from 'react'
import ArticleList from '../components/ArticleList'
import Filter from '../components/filter'

const MainContainer = () => {

    const [ articles, setArticleData] = useState([])
    const [ filteredArticles, setFilteredArticles ] = useState([])

    const filterData = (inputText) => {
        const filter = articles.filter(article => {
            return article.title.toLowerCase().includes(inputText.toLowerCase())
        })
        setFilteredArticles(filter)
        console.log(filter);
    }

    useEffect( () => {
        fetch( 'https://hacker-news.firebaseio.com/v0/topstories.json' )
            .then( res => res.json() )
            .then(articleIds => {
                const articlePromises = articleIds.slice(0,20).map((storyId) => {
                    return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`)
                        .then(res => res.json())
                })

                Promise.all(articlePromises)
                    .then(articleData => {
                        setArticleData(articleData)
                        setFilteredArticles(articleData)
                    })
            })
    }, [] )
    
    
    return (
        <>
            <Filter filterData={filterData}/>
            <ArticleList articles={filteredArticles}/>
        </>
    )
}

export default MainContainer