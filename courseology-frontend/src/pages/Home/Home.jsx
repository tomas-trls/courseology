import React from "react";
import Courses from "../../containers/Courses/Courses";

const Home = ({ query }) => {
  return (
    <div className="home-page">
      <Courses query={query} />
    </div>
  );
};

export default Home;
