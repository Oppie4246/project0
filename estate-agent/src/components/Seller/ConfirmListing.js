import React, { useState } from "react";
import "./SellerPropertyForm.css";

export default ()=> {

    return (
        <div id="body">
            <h1>Confirm Property</h1>
            <p>Please edit or confirm the following details:</p>
            <form>
                <table>
                    <tr>
                        <td>
                            <h3>Address <button>Edit</button></h3>
                            <p>Address Line 1</p>
                            <p>Address Line 2</p>
                            <p>City</p>
                            <p>County</p>
                            <p>Postcode</p>
                        </td>
                        <td>
                            <h3>Property Type <button>Edit</button></h3>
                            <p>Flat</p>
                            <h3>Bedrooms <button>Edit</button></h3>
                            <p>2</p>
                        </td>
                        <td>
                            <h3>Price <button>Edit</button></h3>
                            <h3>£240,000 </h3>
                        </td>
                        <td>
                            <h3>Features <button>Edit</button></h3>
                            <ul>
                                <li>Parking</li>
                                <li>Pet Friendly</li>
                                <li>Gym Included</li>
                            </ul>
                        </td>
                    </tr>
                </table>

                <h3>Property Description</h3>
                <p>Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. 
                    Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen 
                    space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate 
                    utility room housing a washer/dryer.
                    Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers.
                </p>

                <div id="images">
                    <img class="images" src={require('./SellerPropertyImages/image1.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('./SellerPropertyImages/bathroom1.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('./SellerPropertyImages/bathroom2.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('./SellerPropertyImages/bedroom1.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('./SellerPropertyImages/gym.jpeg')} alt="Bathroom image" />
                    <img class="images" src={require('./SellerPropertyImages/kitchen.jpeg')} alt="Bathroom image" />
                </div>
                <button type="submit">Submit</button>
            </form>
        </div>
    )
}