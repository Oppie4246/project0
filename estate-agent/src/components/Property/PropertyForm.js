import React, { useState } from "react";
//import '../styles/SellerForm.css';
import { Link, useEffect } from 'react-router-dom';

import profile from '../../assets/profile.png';
import phone from '../../assets/phone.png';
import email from '../../assets/email.png';


const PropertyForm = () => {   

    const [formData, setForm] = useState({});
    
    function submitForm(e){
        e.preventDefault();
                 
            fetch("http://localhost:8000/properties", {
                method: "POST",
                headers: {
                    "content-Type": "application/json",
                },
                body: JSON.stringify(formData),
            })
            .then((response) => response.json())
            .then((data) => console.log(data))
            .catch((error) => console.log(error));
          
            
        for(let key in formData) {
            sessionStorage.setItem(key, formData[key])
        };
    };