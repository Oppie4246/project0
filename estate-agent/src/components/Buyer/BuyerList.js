import React from "react";
import { Link } from "react-router-dom";

function BuyerList(props) {

    return (
        <div className="buyerList">
            <h3>{props.buyer.firstName}, {props.buyer.surname}, {props.buyer.email}, {props.buyer.phone}, {props.buyer.buyerId} <Link to="/buyer"><button>Edit</button></Link></h3> 
            <table>    
                <tr>
                    <td>
                        <h3>Buyer: </h3>
                        <p>{props.buyer.buyerId}</p>
                        <h3>First Name: </h3>
                        <p>{props.buyer.firstName}</p>
                        <h3>Surname: </h3>
                        <p>{props.buyer.surname}</p>
                        <h3>Email: </h3>
                        <p>{props.buyer.email}</p>
                        <h3>Telephone: </h3>
                        <p>{props.buyer.phone}</p>
                    </td>
                <tr/>
                    <td>
                        <p>{props.buyer.details}</p>
                    </td>
                </tr>
            </table>
        </div>     
    )
}

export default BuyerList;