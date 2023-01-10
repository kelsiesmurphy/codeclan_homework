import React from 'react'

const Filter = ({handleTextChange, inputText}) => {

  return (
    <div className='input-wrapper'>
      <input 
        id="input"
        value={inputText}
        type="text"
        onChange={handleTextChange}
        placeholder="Filter Stories"/>
    </div>
  )
}

export default Filter