import React from "react";
import "./SearchBar.scss";

const SearchBar = ({ handleSearch }) => {
  return (
    <div className="searchBar">
      <input type="text" onChange={handleSearch} className="searchBar--input" />
    </div>
  );
};

export default SearchBar;
