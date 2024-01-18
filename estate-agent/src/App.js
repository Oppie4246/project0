import './App.css';
import React from "react";

import StartPage from "./components/StartPage/StartPage";

// Feature: Register Seller
import Seller from "./components/Seller/Seller";
import SellerList from "./componets/Seller/SellerList";

// Feature: Manage Properties
import Property from "./componets/Property/Property";
import PropertyList from "./componets/Property/PropertyList";

// Feature: Register Buyer
import Buyer from "./componets/Buyer/Buyer";
import BuyerList from "./componets/Buyer/BuyerList";


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
