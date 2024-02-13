import React, {useState, useEffect} from 'react';
import Link from "react-router-dom";
import "../styles/SellerDisplay.css"

import Axios from "axios";
import SELLERO from "../database/sellers.json"


function SellerDisplay(){

    const [sellers, setSellers] = useState([]);

    useEffect(() => {

        Axios.get("../database/sellers.json").then((res) => {
            setSellers(res.data);
        });
    
}, []);


return(
    <div className='SellerDisplay'>

        <button className='sButton'>DISPLAY SELLERS</button>
        <br></br>

        {
            SELLERO.map(record => {
                return(
                    <div className="container">
                        <p>{`Seller ID: ${record.sellerID}`}</p>
                        <p>{`First name: ${record.firstname}`}</p>
                        <p>{`Surname: ${record.surname}`}</p>
                        <p>{`Email: ${record.email}`}</p>
                        <p>{`Telephone: ${record.telephone}`}</p>

                    </div>
                )
            })

        }

    </div>
)
}

export default SellerDisplay;