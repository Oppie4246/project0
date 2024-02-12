import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import BuyerForm from "./BuyerForm";
import "./Buyer.css";

const Buyer = () => {
     return (
        <div>
            <h1></h1>
            <br></br>
            <Link to="/buyerForm" >Register New Buyer</Link>
        </div>
    );
};

export default Buyer;