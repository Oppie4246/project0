import React, { useState } from "react";
//import { useRef, useState } from 'react';



//let value ="123";//creating empty variable | virtual DOM doesnt know var
// function Test(){
//     const [value, setValue] = useState("123");

//     return(
//         <div>
//             {value}
//             <br/>
//             <input onChange={e=>setValue(e.target.value)} />
//         </div>
//     )
// }
//export default Test;





function SaveSeller(){

let [Seller, setSeller] = useState({});

   
function submitSeller(){
    console.log(Seller)
}
    return(
        <div>
            {Seller.firstName}
            {Seller.Surname}
            {Seller.Email}
            {Seller.Phone}
            <br/>

            <form>
            <h3>First Name</h3>
            <input onInput={e=>setSeller({firstName:e.target.value})}/>
            <h3>Surname</h3>
            <input onInput={e=>setSeller({Surname:e.target.value})}/>
            <h3>Email</h3>
            <input onInput={e=>setSeller({Email:e.target.value})}/>
            <h3>Telephone</h3>
            <input onInput={e=>setSeller({Phone:e.target.value})}/>
            </form>

            <br/>

            <button onClick ={e=> submitSeller()}>Submit</button>

        </div>
    )
}

export default SaveSeller;















































// const SellerForm = (props) => {


//     const sFirstNameRef = useRef();
//     const sSurnameRef = useRef();
//     const sEmailRef = useRef();
//     const sPhoneRef = useRef();
    


//     function saveSeller(){
//         let sFirstName  = sFirstNameRef.currentvalue;
//         sessionStorage.setItem("sFirstName", JSON.stringify(sFirstName));

//         let sSurname = sSurnameRef.currentvalue;
//         sessionStorage.setItem("sSurname", JSON.stringify(sSurname));

//         let sEmail=sEmailRef.current.value;
//         sessionStorage.setItem("sEmail", JSON.stringify(sEmail));

//         let sPhone=sPhoneRef.current.value;
//         sessionStorage.setItem("sPhone", JSON.stringify(sPhone));

        
//     }

//     return (
//         <div>
//             <h1>Seller Form</h1>
//             <form name="sellerForm">
//                 <label htmlFor="sFirstName">First Name:</label>
//                 <input id = "sFirstName" name="sFirstName"
//                 type="text" ref={sFirstNameRef} />

//                 <label htmlFor="sSurname">Surname: </label>
//                 <input id="sSurname" name="sSurname" type="text" ref={sSurnameRef}/>

//                 <label htmlFor="sEmail">Email: </label>
//                 <input id="sEmail" name="sEmail" type="email"ref={sEmailRef}/>

//                 <label htmlFor="sPhone">Telephone: </label>
//                 <input id="sPhone" name="sPhone" type="tel" ref={sPhoneRef} />

//                 <input type="button" onClick={saveSeller} value="Submit" />
//             </form>
//         </div>
//     );



// };

// export default SellerForm;