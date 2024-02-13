// import React, {useState, useEffect} from "react";
// import { Link } from "react-router-dom";
// import "./BuyerDisplay.css";
// //import database from "../database/buyers.json

// import Axios from "axios";
// import BUYERO from '../database/buyers.json'





// function BuyerDisplay(){

//      const [buyers, setBuyers] =useState([]);


//      useEffect(() => {

//          Axios.get("../database/buyers.json").then((res) => {
//              setBuyers(res.data);
//          }); 

//      }, []);

    

//     return(
//         <div className="BuyerDisplay">

//             <button>DISPLAY BUYERS</button>
//             <br></br>

//             {
//                 BUYERO.map(record => {
//                     return(
//                         <div className="container">
//                             <p>{`Buyer ID: ${record.buyerID}`}</p>
//                             <p>{`First name: ${record.firstname}`}</p>
//                             <p>{`Surname: ${record.surname}`}</p>
//                             <p>{`Email: ${record.email}`}</p>
//                             <p>{`Telephone: ${record.telephone}`}</p>

//                         </div>
//                     )
//                 })
//             }

//             {/* <button>Display Buyers</button>
//             {buyers.map((buyer, index) => (
//                 <div key={index}>
//                     <p>{`FirstName: ${buyer.firstname}`} </p>
//                     <p>{`Surname: ${buyer.surname}`}</p>
//                     <p>{`Email: ${buyer.email}`}</p>
//                     <p>{`Telephone: ${buyer.telephone}`}</p>
//                 </div>

//             ))}
//              */}
//         </div>
//     );
// }


// export default BuyerDisplay;