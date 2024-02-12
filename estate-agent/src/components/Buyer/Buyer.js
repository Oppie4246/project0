import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import BuyerForm from "./BuyerForm";
import "./Buyer.css";

const Buyer = () => {
     return (
        <div>            
            <br></br>
            <Link to="/buyerForm" ><h1>Register New Buyer</h1></Link>
        </div>
    );
};

export default Buyer;