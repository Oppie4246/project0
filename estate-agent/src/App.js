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
import {Nav} from "./components/Nav/Nav";

//About Section
import About from "./components/About/About";

//Upload and confirm a property
import SellerPropertyForm from "./components/Seller/SellerPropertyForm";
import ConfirmListing from "./components/Seller/ConfirmListing";

function App() {
  return (

    <div className="App">
      
        <Nav />
        <Routes>
          <Route path="/about" element={<About/>} />
          <Route path="/properties" element={<PropertyList/>} />
          <Route path="/sellaproperty" element={<SellerPropertyForm/>} />
          <Route path="/sellaproperty/confirm" element={<ConfirmListing/>} />
          <Route path="/property" element={<Property/>} />
          <Route path="/Buyer" element={<Buyer/>} />
        </Routes>
        
    </div>
  );
}
export default App;

{/* <BrowserRouter>

<Routes>
          <Route path="/" element={<StartPage/>}>
            <Route path="seller" element={<Seller/>}/>       
            <Route path="property" element={<Property/>}/>                               
            <Route path="buyer" element={<Buyer/>}/>
          </Route>
        </Routes>
      </BrowserRouter> */}