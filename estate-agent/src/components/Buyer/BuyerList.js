import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
import BuyerForm from "./BuyerForm";
import "./Buyer.css";

const BuyerList = () => {
    return (
        <div>
            <table name="buyerList" legend="Current Buyers">
                 <tr>
                     <th>First Name</th>
                     <th>Surname</th>
                     <th>Email</th>
                     <th>Phone</th>
                 </tr>
                <tr>
                     {/* <td>{sessionStorage.getitem(firstName)}</td>
                     <td>{sessionStorage.getitem(surname)}</td>
                     <td>{sessionStorage.getitem(email)}</td>
                     <td>{sessionStorage.getitem(phone)}</td> */}
                 </tr>
             </table>
            
            {/* <Link onClick={displayBuyer()}>Display Buyers</Link> */}
            <br></br>
            <Link to="/buyerForm" >Register Buyer</Link>
            <Link to="/" >Home</Link>
        </div>
    );
};

export default BuyerList;