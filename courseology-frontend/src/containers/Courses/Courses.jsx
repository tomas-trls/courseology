import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import CoursesCard from "../../components/CoursesCard/CoursesCard";
import "./Courses.scss";

const Courses = ({ query }) => {
  const [courses, setCourses] = useState([]);
  const getCourses = async () => {
    const path = "http://localhost:8080/courses";
    const res = await fetch(path);
    const data = await res.json();
    setCourses(data);
  };
  useEffect(() => {
    getCourses();
  });

  const filteredArr = courses.filter((course) => {
    return course.name.toLowerCase().includes(query.toLowerCase());
  });

  const cardsJSX = filteredArr.map((course) => {
    return (
      <Link to={`/course/${course.id}}`} key={course.id}>
        <CoursesCard
          image={course.image}
          courseName={course.name}
          author={course.author}
          rating={course.rating}
          numberOfRatings={course.numberOfRatings}
          price={course.price}
        />
      </Link>
    );
  });
  return (
    <div className="main">
      <div className="main__courses">{cardsJSX}</div>
    </div>
  );
};

export default Courses;
