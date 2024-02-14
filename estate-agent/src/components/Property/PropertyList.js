import React from "react";
import "../styles/PropertyList.css";
import PropertyListing from "./PropertyListing";
import { useState } from "react";
import image1 from '../../assets/image1.jpeg'
import bedroom1 from '../../assets/bedroom1.jpeg'
import gym from '../../assets/gym.jpeg'


export default ()=> {

    const properties = [
        {
            status: "Sold",
            address1: "Example 1",
            address2:"Address Line 2",
            city: "City",
            county: "Yorkshire",
            postcode: "Postcode",
            price: 140000,
            image: "/static/media/image1.42fb22d8050a1b04fc77.jpeg",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        },
        {
            status: "For Sale",
            address1: "Example 2",
            address2:"Address Line 2",
            city: "City",
            county: "Greater Manchester",
            postcode: "Postcode",
            price: 240000,
            image: "/static/media/bedroom1.e6efbef9f2e2e515a5f6.jpeg",
            type: "Flat",
            bedrooms: 2,
            //features:
            details: "Stunning two bedroom balcony apartment facing the waterfront available 4th February 2024. Situated on the 2nd Floor, the apartment offers a large open plan living room and kitchen space with integrated appliances, dishwasher, fridge/freezer, oven and hob and a separate utility room housing a washer/dryer. Large double bedrooms with walk through wardrobe to en-suite bathrooms with large walk in showers."
        },
        {
            status: "Withdrawn",
            address1: "Example 3",
            address2:"Address Line 2",
            city: "City",
            county: "Cumbria",
            postcode: "Postcode",
            price: 240000,
            image: "/static/media/gym.662c31fb2dbea8e8ff6e.jpeg",
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
                <strong>Filter by: </strong>
                <select name="status" id="status">
                    <option>status</option>
                    <option>For Sale</option>
                    <option>Sold</option>
                    <option>Withdrawn</option>
                </select>
                <select name="type">
                    <option>type</option>
                    <option>Detached</option>
                    <option>Semi-Detached</option>
                    <option>Terraced</option>
                    <option>Flat</option>
                    <option>Bungalow</option>
                    <option>Land</option>
                    <option>Park Home</option>
                    <option>Student Halls</option>
                </select>
                <select name="county">
                    <option>county</option>
                    <option>Cheshire</option>
                    <option>Cumbria</option>
                    <option>County Durham</option>
                    <option>Greater Manchester</option>
                    <option>Lancashire</option>
                    <option>Merseyside</option>
                    <option>Northumberland</option>
                    <option>Yorkshire</option>
                </select>
                <select name="price">
                    <option>price</option>
                    <option>&lt; £100,000</option>
                    <option>&lt; £200,000</option>
                    <option>&lt; £300,000</option>
                    <option>&lt; £400,000</option>
                    <option>&lt; £500,000</option>
                    <option>+ £500,000</option>
                </select>
                <select name="bedrooms">
                    <option>bedrooms</option>
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6+</option>
                </select>
                <button id="edit" onClick={e=>window.location.reload()}>Reset filters</button>
            </div>

            <br />

            {properties.map(property => {       
                if((!search.status || search.status == property.status)
                   && (!search.type || search.type == property.type)
                   && (!search.county || search.county == property.county)
                   && (!search.price || (parseInt(search.price.split("£")[1])*1000) > property.price)
                   && (!search.bedrooms || search.bedrooms == property.bedrooms)){
                        return <PropertyListing property={property} />
                } 
            } )
            }
        </div>
    )
}