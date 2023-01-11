import React, { useEffect, useState } from 'react'

const Filter = ({ filterData }) => {
  
  const [inputText, setInputText] = useState("")

  const handleTextChange = (event) => {
    setInputText(event.target.value);
  }

  useEffect(() => {
    filterData(inputText)
  }, [inputText])

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