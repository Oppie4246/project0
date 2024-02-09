import React, {useState, useReducer, useEffect} from "react";
import SellerList from "./SellerList";
import "./Seller.css";
import {Link, NavLink} from "react-router-dom";

export default ()=> {
    return (
        <div>
            <h1>Seller</h1>

            <Link to ="/SellerForm" className="title" >Seller Form</Link>
        </div>
    )
}