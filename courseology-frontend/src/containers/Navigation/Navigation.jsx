import React from "react";
import { Link } from "react-router-dom";
import SearchBar from "../../components/SearchBar/SearchBar";
import "./Navigation.scss";
const Navigation = ({ handleSearch }) => {
  return (
    <nav className="navbar">
      <Link to={"/"} className="navbar__link">
        Home
      </Link>
      <SearchBar handleSearch={handleSearch} />
    </nav>
  );
};

export default Navigation;
