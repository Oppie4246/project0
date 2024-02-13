import React from "react";
import "./PropertyList.css";
import PropertyListing from "./PropertyListing";
import { Link } from "react-router-dom";

export default ()=> {

    const properties = [
        {
            address1: "Example 1",
            address2:"Address Line 2",
            city: "City",
            county: "County",
            postcode: "Postcode",
            price: "£140,000",
            //image: "",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        },
        {
            address1: "Example 2",
            address2:"Address Line 2",
            city: "City",
            county: "County",
            postcode: "Postcode",
            price: "£240,000",
            //image: "",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        },
        {
            address1: "Example 3",
            address2:"Address Line 2",
            city: "City",
            county: "County",
            postcode: "Postcode",
            price: "£240,000",
            //image: "",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        }
    ];

    return (
        <div id="body">
            <h1>Properties </h1>
            <p><button> Add New Property</button></p>
            {properties.map((property) => <PropertyListing property={property} />)}
        </div>
    )
}