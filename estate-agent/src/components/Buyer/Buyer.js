import React from "react";
import { Link } from "react-router-dom";
import BuyerList from "./BuyerList";
import "../styles/Buyer.css";

const Buyer = () => {
     return (
        <div>
            <h1>Looking to buy property?</h1>         
            <Link to="/buyerForm" ><h1>New Buyer Registration</h1></Link>
        </div>
    );
};

export default Buyer;