import React from 'react'
import Article from './Article';

const ArticleList = ({articles}) => {
    const articleList = articles.map((article, index) => {
        return <Article key={index} article={article}/>
    });

    return (
        <ul className='article-list'>
            {articleList}
        </ul>
    )
}

export default ArticleList