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
import BuyerList from "./components/Buyer/BuyerList";


function App() {
  return (
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<StartPage/>}>
                  <Route path="Seller" element={<Seller/>}/>       
                  <Route path="Property" element={<Property/>}/>                               
                  <Route path="Buyer" element={<Buyer/>}/>
                </Route>
          </Routes>
      </BrowserRouter>
  );
}
export default App;