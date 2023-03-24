import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.scss";
import Home from "./pages/Home/Home";

function App() {
  return (
    <BrowserRouter className="App">
      <Routes>
        <Route path="/courses" element={<Home />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
