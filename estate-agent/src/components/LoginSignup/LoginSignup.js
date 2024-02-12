import React, { useState } from "react";
import './LoginSignup.css';
import profile from '../../assets/profile.png';
import email from '../../assets/email.png';
import lock from '../../assets/lock.jpg';

const LoginSignup = () => {

    const [action, setAction] = useState('Sign Up');
    const [formData, setForm] = useState({});


    return (
        <div className='container'>
            <div className='header'>
                <div className='title'>{action}</div>
                <div className='underline'></div>
            </div>
            <div className='inputs'>
                {action === "Login" ? <div></div> : <div className='input'>
                    <img src={profile} alt='silhouette icon image of a person' />
                    <input type="text" id="name" name="name" placeholder="Name" onInput={e => setForm({ ...formData, name: e.target.value })} />
                </div>}
                <div className='input'>
                    <img src={email} alt='silhouette icon image of an email evelope' />
                    <input type="email" id="email" name="email" placeholder="Email Address" onInput={e => setForm({ ...formData, email: e.target.value })} />
                </div>
                <div className='input'>
                    <img src={lock} alt='silhouette icon image of a padlock' />
                    <input type="password" id="password" name="password" placeholder="Password" onInput={e => setForm({ ...formData, password: e.target.value })} />
                </div>
            </div>
            {action === "Sign Up" ? <div></div> : <div className="forgotPassword">Lost Password? <span>Click Here!</span></div>}
            <div className='submitContainer'>
                <div className={action === "Login" ? "submit grey" : "submit"} onClick={() => { setAction("Sign Up") }} >Sign Up</div>
                <div className={action === "Sign Up" ? "submit grey" : "submit"} onClick={() => { setAction("Login") }} >Login</div>
            </div>
        </div>
    );
};

export default LoginSignup;