import React from 'react'

const Filter = ({handleTextChange, inputText}) => {

  return (
    <div>
      <input 
        value={inputText}
        type="text"
        onChange={handleTextChange}
        placeholder="Search articles..."/>
    </div>
  )
}

export default Filter