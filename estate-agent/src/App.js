import React from "react";
import {Route, Routes, BrowserRouter} from "react-router-dom";
import './App.css';

import Person from "./components/Person/Person";


function App() {
  return (

    <div className="App">

        <Person />

    </div>
  );
}
export default App;