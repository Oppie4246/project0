import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import BuyerForm from "./BuyerForm";
import "./Buyer.css";

const Buyer = () => {
<<<<<<< Updated upstream
     return (
        <div>            
=======
    return (
        <div>
>>>>>>> Stashed changes
            <h1>Looking to buy property?</h1>
            <Link to="/buyerForm" ><h1>New Buyer Registration</h1></Link>
        </div>
    );
};

export default Buyer;