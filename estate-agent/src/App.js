import React from "react";
import {Route, Routes, BrowserRouter} from "react-router-dom";
import './App.css';

// Start Page of Website
import StartPage from "./components/StartPage/StartPage";

// Feature: Register Seller
import Seller from "./components/Seller/Seller";
import SellerList from "./components/Seller/SellerList";

// Feature: Manage Properties
import Property from "./components/Property/Property";
import PropertyList from "./components/Property/PropertyList";

// Feature: Register Buyer
import Buyer from "./components/Buyer/Buyer";
import BuyerForm from "./components/Buyer/BuyerForm";

// Feature: Import Nav
import Nav from "./components/Nav/Nav";


function App() {
  return (
    <BrowserRouter>
      <Nav />
      <Routes>
      <Route path="buyerform" element={<BuyerForm/>}/>
        <Route path="/" element={<StartPage/>}>
          <Route path="seller" element={<Seller/>}/>       
          <Route path="property" element={<Property/>}/>                               
          <Route path="buyer" element={<Buyer/>}/>
          
        </Route>
      </Routes>
    </BrowserRouter>
  );
}
export default App;