import React, { useState } from "react";
import "./SellerPropertyForm.css";
import { Link } from "react-router-dom";

//a form to register a property
// The SellerProperty components is where new propperties can be added using the 
// SellerPropertyForm subcomponent.  A property is always to a seller.  This component 
// also allows the the updating a property status.  Updating property status to SOLD will 
// also requires a Buyer information which provided via the BuyerSelector subcomponent 
// which is implemented as a modal list.

export default ()=> {

    return (
        <div id="body">
            <h1>Sell a Property</h1>
            <form>
                <h3>Property Type</h3>
                <select>
                    <option>Detatched</option>
                    <option>Semi-Detatched</option>
                    <option>Terraced</option>
                    <option>Flat</option>
                    <option>Bungalow</option>
                    <option>Land</option>
                    <option>Park Home</option>
                    <option>Student Halls</option>
                </select>
                <h3>Number of Bedrooms</h3>
                <select>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6+</option>
                </select>
                <h3>Price: </h3>
                <input type="number"/>
                <h3>Address: </h3>
                <table>
                    <tr>
                        <td>Address Line 1: 
                        </td><input /><br/>
                    </tr>
                    <tr>
                        <td>Address Line 2: 
                        </td><input /><br/>
                    </tr>
                    <tr>
                        <td>City: 
                        </td><input /><br/>
                    </tr>
                    <tr>
                        <td>County: 
                        </td><input /><br/>
                    </tr>
                    <tr>
                        <td>Postcode: 
                        </td><input /><br/>
                    </tr>
                </table>
                <h3>Photos: </h3>
                <input id="img" type="file" />
                <h3>Extra Details: </h3>
                <textarea place/>
                <h3>Attributes</h3>
                <table>
                    <tr>
                        <td><label><input type="checkbox" /> Garden</label></td>
                        <td><label><input type="checkbox" /> Parking</label></td>
                        <td><label><input type="checkbox" /> Retirement Home</label></td>
                    </tr>
                    <tr>
                        <td><label><input type="checkbox" /> Student Accomodation</label></td>
                        <td><label><input type="checkbox" /> Pet Friendly</label></td>
                        <td><label><input type="checkbox" /> Furnished</label></td>
                    </tr>
                </table>
                <Link to="/sellaproperty/confirm"><button>Submit</button></Link>
            </form>
        </div>
    )
}