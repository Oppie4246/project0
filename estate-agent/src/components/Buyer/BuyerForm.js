import React from "react";
import { useRef, useState } from 'react';

const BuyerForm = (props) => {
    
    const firstNameRef = useRef();
    const surnameRef = useRef();
    const emailRef = useRef();
    const phoneRef = useRef();

    function saveBuyer(){
        let firstName=firstNameRef.current.value;
        sessionStorage.setItem("firstName", JSON.stringify(firstName));
        let surname=surnameRef.current.value;
        sessionStorage.setItem("surname", JSON.stringify(surname));
        let email=emailRef.current.value;
        sessionStorage.setItem("email", JSON.stringify(email));
        let phone=phoneRef.current.value;
        sessionStorage.setItem("phone", JSON.stringify(phone));
    };

    return (
        <div>
            <h1>Buyer Form</h1>
            <form name="buyerForm" >
                <label htmlFor="firstName">First Name: </label>
                <input id="firstName" name="firstName" type="text" ref={firstNameRef} />
                <label htmlFor="surname">Surname: </label>
                <input id="surname" name="surname" type="text" ref={surnameRef}/>
                <label htmlFor="email">Email: </label>
                <input id="email" name="email" type="email"ref={emailRef}/>
                <label htmlFor="phone">Telephone: </label>
                <input id="phone" name="phone" type="tel" ref={phoneRef} />
                <input type="button" onClick={saveBuyer} value="Submit" />
            </form>
        </div>
    );
};

export default BuyerForm;