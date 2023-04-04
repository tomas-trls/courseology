import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const CourseDetails = () => {
  const { courseId } = useParams();
  const [course, setCourse] = useState({});

  const PATH = "http://localhost:8080/course/";

  const getCourseById = async () => {
    const res = await fetch(PATH + Number.parseInt(courseId));
    const data = await res.json();
    setCourse(data);
  };

  useEffect(() => {
    getCourseById();
  });

  return (
    <div>
      <h1>{course.name}</h1>
      <p>{course.information}</p>
    </div>
  );
};

export default CourseDetails;
