import React, {useState} from "react";

function Person () {
    const [formData, setForm] = useState({});

    function submitForm(e){
        e.preventDefault();
        console.log(formData);
    
    }
    
    return (
        <div>
            {formData.firstName}<br/>
            {formData.surname}<br/>
            {formData.email}<br/>
            {formData.phone}<br/>

            <form  onSubmit={e=>submitForm(e)}>
                <input onInput={e=>setForm({...formData, firstName: e.target.value})}/>
                <input onInput={e=>setForm({...formData, surname: e.target.value})}/>
                <input onInput={e=>setForm({...formData, email: e.target.value})}/>
                <input onInput={e=>setForm({...formData, phone: e.target.value})}/>
                <br />
                <button>Submit</button>
            </form>
        </div>
    );

}


export default Person;