import React, { useState } from "react";
import "./SellerPropertyForm.css";
import { Link } from "react-router-dom";

export default ()=> {

    let [data, setData] = useState({});

    const elements = Array.from(document.querySelectorAll('input[type="checkbox"]'))

    function log() {
        console.log(elements);
    }

    function submitData() {
        for(let key in data) {
            sessionStorage.setItem(key, data[key])
        }
    }

    return (
        <div id="body">
            <button onClick={e=>log()}>Click me</button>
            <h1>Sell a Property</h1>
                <h3>Property Type</h3>
                <select onInput={e=>setData({...data, "type": e.target.value})} >
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
                <select onInput={e=>setData({...data, "bedrooms": e.target.value})} value={sessionStorage.getItem("bedrooms")}>
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6+</option>
                </select>
                <h3>Price: </h3>
                £ <input onInput={e=>setData({...data, "price": e.target.value})} value={sessionStorage.getItem("price")} />
                <h3>Address: </h3>
                <table><tbody>
                    <tr>
                        <td>Address Line 1: 
                        </td><input onInput={e=>setData({...data, "address1": e.target.value})} value={sessionStorage.getItem("address1")}/><br/>
                    </tr>
                    <tr>
                        <td>Address Line 2: 
                        </td><input onInput={e=>setData({...data, "address2": e.target.value})} value={sessionStorage.getItem("address2")}/><br/>
                    </tr>
                    <tr>
                        <td>City: 
                        </td><input onInput={e=>setData({...data, "city": e.target.value})} value={sessionStorage.getItem("city")}/><br/>
                    </tr>
                    <tr>
                        <td>County: 
                        </td><input onInput={e=>setData({...data, "county": e.target.value})} value={sessionStorage.getItem("county")}/><br/>
                    </tr>
                    <tr>
                        <td>Postcode: 
                        </td><input onInput={e=>setData({...data, "postcode": e.target.value})} value={sessionStorage.getItem("postcode")}/><br/>
                    </tr>
                </tbody></table>
                <h3>Photos: </h3>
                <input id="img" type="file" />
                <h3>Property Description: </h3>
                <textarea onInput={e=>setData({...data, "details": e.target.value})} value={sessionStorage.getItem("details")}/>
                <h3>Property Features</h3>
                <table>
                    <tr>
                        <td><label><input type="checkbox" onInput={e=>setData({...data, "cb1": e.target.value})}/> Garden</label></td>
                        <td><label><input type="checkbox" /> Parking</label></td>
                        <td><label><input type="checkbox" /> Retirement Home</label></td>
                    </tr>
                    <tr>
                        <td><label><input type="checkbox" /> Student Accomodation</label></td>
                        <td><label><input type="checkbox" /> Pet Friendly</label></td>
                        <td><label><input type="checkbox" /> Furnished</label></td>
                    </tr>
                    <tr>
                        <td><label><input type="checkbox" /> Shared Ownership</label></td>
                        <td><label><input type="checkbox" /> Gym Included</label></td>
                    </tr>
                </table>
                <Link to="/sellaproperty/confirm"><button onClick={e=>submitData()}>Submit</button></Link>
                
        </div>
    )
}