import React from "react";
import "./CoursesCard.scss";

const CoursesCard = ({
  image,
  courseName,
  author,
  rating,
  numberOfRatings,
  price,
}) => {
  return (
    <div className="card">
      <img src={image} alt="" className="card__image" />
      <div className="card__description">
        <h3 className="card__title">{courseName}</h3>
        <p className="card__author">{author}</p>
        <div className="card__rating-container">
          <p className="card__rating">{rating}</p>
          <p className="card__ratingAmount">{numberOfRatings}</p>
        </div>
        <p className="card__price">£{price}</p>
      </div>
    </div>
  );
};

export default CoursesCard;
