import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import SellerList from "./SellerList";
import "./Seller.css";

const Seller = () => {
    return (
       <div>            
           <br></br>
           <Link to="/sellerForm" ><h1>Register New Seller</h1></Link>
       </div>
   );
};

export default Seller;