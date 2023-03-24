import React from "react";
import Courses from "../../containers/Courses/Courses";
import Navigation from "../../containers/Navigation/Navigation";

const Home = () => {
  return (
    <div className="home-page">
      <Navigation />
      <Courses />
    </div>
  );
};

export default Home;
