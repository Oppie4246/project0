import React, { useState } from "react";
import "../styles/SellerPropertyForm.css";
import { Link } from "react-router-dom";

export default ()=> {

    return (
        <div id="body">
            <h1>Confirm Property</h1>
            <p>Please edit or confirm the following details:</p>
            <form>
                <table>
                    <tr>
                        <td>
                            <h3>Address <Link to="/sellaproperty"><button>Edit</button></Link></h3>
                            {/* <p>Address Line 1</p>
                            <p>Address Line 2</p>
                            <p>City</p>
                            <p>County</p>
                            <p>Postcode</p> */}
                            <p>{sessionStorage.getItem("address1")}</p>
                            <p>{sessionStorage.getItem("address2")}</p>
                            <p>{sessionStorage.getItem("city")}</p>
                            <p>{sessionStorage.getItem("county")}</p>
                            <p>{sessionStorage.getItem("postcode")}</p>
                        </td>
                        <td>
                            <h3>Property Type <Link to="/sellaproperty"><button>Edit</button></Link></h3>
                            {/* <p>Flat</p> */}
                            <p>{sessionStorage.getItem("type")}</p>
                            <h3>Bedrooms <Link to="/sellaproperty"><button>Edit</button></Link></h3>
                            {/* <p>2</p> */}
                            <p>{sessionStorage.getItem("bedrooms")}</p>
                        </td>
                        <td>
                            <h3>Price <Link to="/sellaproperty"><button>Edit</button></Link></h3>
                            {/* <h3>£240,000 </h3> */}
                            <h3>£{sessionStorage.getItem("price")}</h3>
                        </td>
                        <td>
                            <h3>Features <Link to="/sellaproperty"><button>Edit</button></Link></h3>
                            <ul>
                                <li>Parking</li>
                                <li>Pet Friendly</li>
                                <li>Gym Included</li>
                            </ul>
                        </td>
                    </tr>
                </table>

                <h3>Property Description <Link to="/sellaproperty"><button>Edit</button></Link></h3>
                {/* <p>Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. 
                    Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen 
                    space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate 
                    utility room housing a washer/dryer.
                    Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers.
                </p> */}
                <p>{sessionStorage.getItem("details")}</p>

                <div id="images">
                    <img class="images" src={require('../../assets/image1.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('../../assets/bathroom1.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('../../assets/bathroom2.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('../../assets/bedroom1.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('../../assets/gym.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('../../assets/kitchen.jpeg')} alt="Bathroom image" />
                </div>
                <button type="submit">Submit</button>
            </form>
        </div>
    )
}