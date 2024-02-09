import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import BuyerForm from "./BuyerForm";
import "./Buyer.css";

export default ()=> {
    return (
        <div>
            <Link to="/buyerForm" >Register Buyer</Link>
        </div>
    )
}