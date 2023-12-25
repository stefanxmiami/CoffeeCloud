import React, { useState } from 'react';
import AuthService from '../services/AuthService'; // You'll need to create this service

function Login() {
    const [credentials, setCredentials] = useState({
        username: '',
        password: ''
    });

    const handleSubmit = (e) => {
        e.preventDefault();
        AuthService.login(credentials).then(response => {
            console.log('Logged in successfully');
            // Handle login success (e.g., redirect, store token)
        });
    };

    return (
        <form onSubmit={handleSubmit}>
            {/* Fields for username and password */}
            <button type="submit">Logout</button>
        </form>
    );
}

export default Login;
