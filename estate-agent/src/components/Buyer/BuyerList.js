import React, {useState, useReducer, useEffect} from "react";
import { Link } from "react-router-dom";
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
                     <td>{'firstName'}</td>
                     <td>{'surname'}</td>
                     <td>{'email'}</td>
                     <td>{'phone'}</td>
                 </tr>
             </table>
         
            <br></br>
            <Link to="/buyerForm" >Register Buyer</Link>
            <br></br>
            <Link to="/" >Home</Link>
        </div>
    );
};

export default BuyerList;