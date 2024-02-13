import React from "react";
import { Link } from "react-router-dom";
import BuyerList from "./BuyerList";
import "./Buyer.css";






const Buyer = () => {
     return (
        <div>
            <h1>JSON SERVER</h1>
            <br></br>
            <Link to="/buyerForm" >Register New Buyer</Link>

        </div>
    );
};

export default Buyer();