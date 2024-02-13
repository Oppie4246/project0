import React from "react";
import { Link } from "react-router-dom";
import SellerList from "./SellerList";
import "../styles/Seller.css";

const Seller = () => {
    return (
       <div>
        <h1>Looking to sell property?</h1>           
           <Link to="/sellerForm" ><h1>New Seller Registration</h1></Link>
       </div>
   );
};

export default Seller;