import React from "react";
import { Link } from "react-router-dom";

function PropertyListing(props) {

    return (
        <div class="propertyListing">
            <h3>{props.property.address1}, {props.property.city}, {props.property.county}, {props.property.postcode} - {props.property.price} <Link to="/sellaproperty/confirm"><button>Edit</button></Link></h3> 
            <table>    
                <tr>
                    <td>
                        <img class="leadImage" src={require('../../assets/image1.jpeg')} alt="Bathroom image" />
                    </td>
                    <td>
                        <h3>Property Type </h3>
                        <p>{props.property.type}</p>
                        <h3>Bedrooms</h3>
                        <p>{props.property.bedrooms}</p>
                    </td>
                    <td>
                        <h3>Features</h3>
                        <ul>
                            <li>Parking</li>
                            <li>Pet Friendly</li>
                            <li>Gym Included</li>
                        </ul>
                    </td>
                    <td>
                        <p>{props.property.details}</p>
                    </td>
                </tr>
            </table>
        </div>     
    )
}

export default PropertyListing;