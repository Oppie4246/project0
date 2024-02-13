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


    const buyers = [
        {
            firstName: "Dave",
            secondName: "Smith",
            email: "dave@cats.com",
            phone: "01234567891",
            buyerId: 1
        },
        {
            firstName: "Dave",
            secondName: "Smith",
            email: "dave@cats.com",
            phone: "01234567891",
            buyerId: 2
        },
        {
            firstName: "Dave",
            secondName: "Smith",
            email: "dave@cats.com",
            phone: "01234567891",
            buyerId: 3
        }
    ];
       
    return (
        <div className="container">
            <h1>Buyers:</h1>
            {buyers.map((buyer) => <BuyerList buyer={buyer} />)}
            <Link to="/buyerForm" >Register New Buyer</Link>
            <br></br>
            <Link to="/" >Home</Link>
        </div>  
    )
};