import React from "react";
import "../styles/PropertyList.css";
import PropertyListing from "./PropertyListing";
import { Link } from "react-router-dom";
import { useState } from "react";
import image1 from '../../assets/image1.jpeg'

export default ()=> {

    const properties = [
        {
            status: "sold",
            address1: "Example 1",
            address2:"Address Line 2",
            city: "City",
            county: "County",
            postcode: "Postcode",
            price: 140000,
            image: {image1},
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        },
        {
            status: "for sale",
            address1: "Example 2",
            address2:"Address Line 2",
            city: "City",
            county: "County",
            postcode: "Postcode",
            price: 240000,
            //image: "",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        },
        {
            status: "withdrawn",
            address1: "Example 3",
            address2:"Address Line 2",
            city: "City",
            county: "County",
            postcode: "Postcode",
            price: 240000,
            //image: "",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        }
    ];

    let [search, setSearch] = useState({});

    function setInput(e) {
        let newData = {...search};
        let newKey = e.target.name;
        newData[newKey] = e.target.value;
        setSearch(newData);
    }

    return (
        <div id="body">
            <h1>Properties </h1>
            <p><button> Add New Property</button></p>
            <div onInput={e=>setInput(e)}>
                <p><input name="status" placeholder="search status"/></p>
                <p><input name="city" placeholder="search city"/></p>
                <p><input name="county" placeholder="search county"/></p>
                <p><input name="price" placeholder="search price"/></p>
                <p><input name="type" placeholder="search type"/></p>
                <p>
                    <select name="bedrooms">
                        <option>0</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6+</option>
                    </select>
                </p>
            </div>

            {/* {properties.map((property) => <PropertyListing property={property} />)} */}
            {properties.map(property => {          
                if(property.status == search.status) {                          
                    return <PropertyListing property={property} />
                }
                if(property.city == search.city) {                          
                    return <PropertyListing property={property} />
                }
                if(property.county == search.county) {                          
                    return <PropertyListing property={property} />
                }
                if(property.price == search.price) {                          
                    return <PropertyListing property={property} />
                }
                if(property.type == search.type) {                          
                    return <PropertyListing property={property} />
                }
                if(property.bedrooms == search.bedrooms) {                          
                    return <PropertyListing property={property} />
                }
            })}
        </div>
    )
}