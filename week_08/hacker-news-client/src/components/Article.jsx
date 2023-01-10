import React from 'react'

const Article = ({ article, index }) => {
  return (
    <li>
        <a href={article.url}>
            <h3>{article.title}</h3>
            <p>Posted by: {article.by}</p>
        </a>
    </li>
  )
}

export default Article;