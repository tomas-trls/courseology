import { useState } from "react";
import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import "./App.scss";
import Navigation from "./containers/Navigation/Navigation";
import CourseDetails from "./pages/CourseDetails/CourseDetails";
import Home from "./pages/Home/Home";

function App() {
  const [query, setQuery] = useState("");

  const handleSearch = (event) => {
    setQuery(event.target.value);
  };
  return (
    <BrowserRouter className="App">
      <Navigation handleSearch={handleSearch} />
      <Routes>
        <Route path="/" element={<Navigate exact from="/" to="/courses" />} />
        <Route path="/courses" element={<Home query={query} />}></Route>
        <Route path="/course/:courseId" element={<CourseDetails />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
