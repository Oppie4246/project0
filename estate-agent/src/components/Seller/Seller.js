import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import SellerList from "./SellerList";
import "./Seller.css";





const Seller = () => {
    return (
       <div>
        <h1>SELLERS</h1>           
           <Link to="/sellerForm" ><h1>New Seller Registration</h1></Link>


           <br></br>
            <Link to="/sellerdisplay" >Display Sellers</Link>
       </div>
   );
};

export default Seller;