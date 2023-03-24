import React, { useEffect, useState } from "react";
import CoursesCard from "../../components/CoursesCard/CoursesCard";
import "./Courses.scss";

const Courses = () => {
  const [courses, setCourses] = useState([]);
  const [query, setQuery] = useState("");

  useEffect(() => {
    const getCourses = async () => {
      const path = "http://localhost:8080/courses";
      const res = await fetch(path);
      const data = await res.json();
      setCourses(data);
    };
    getCourses();
  });

  const handleSearch = (event) => {
    setQuery(event.target.value);
  };

  const filteredArr = courses.filter((course) => {
    return course.name.toLowerCase().includes(query.toLowerCase());
  });

  const cardsJSX = filteredArr.map((course) => {
    return (
      <div key={course.id}>
        <CoursesCard
          image={course.image}
          courseName={course.name}
          author={course.author}
          rating={course.rating}
          numberOfRatings={course.numberOfRatings}
          price={course.price}
        />
      </div>
    );
  });
  return (
    <div className="main">
      <div className="main__searchBar">
        <input
          type="text"
          onChange={handleSearch}
          className="main__searchBar--input"
        />
      </div>
      <div className="main__courses">{cardsJSX}</div>
    </div>
  );
};

export default Courses;
