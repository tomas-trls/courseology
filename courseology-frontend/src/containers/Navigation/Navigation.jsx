import React from "react";
import { Link } from "react-router-dom";
import logo from "../../assets/images/Courseology.png";
import SearchBar from "../../components/SearchBar/SearchBar";
import "./Navigation.scss";
const Navigation = ({ handleSearch }) => {
  return (
    <nav className="navbar">
      <img src={logo} className="navbar__logo" alt="logo" />
      <Link to={"/"} className="navbar__link">
        Home
      </Link>
      <SearchBar handleSearch={handleSearch} />
    </nav>
  );
};

export default Navigation;
