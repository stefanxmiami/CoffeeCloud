import React, { useState } from 'react';
import CoffeeService from '../services/CoffeeService'; // Importing the default export

const AddCoffee = () => {
    const [name, setName] = useState('');
    const [price, setPrice] = useState('');

    const onSubmit = (e) => {
        e.preventDefault();

        // Using createCoffee from CoffeeService
        CoffeeService.createCoffee({ name, price })
            .then(response => {
                // Handle the response
                console.log('Coffee added successfully', response.data);
                setName('');
                setPrice('');
            })
            .catch(error => {
                // Handle any errors
                console.error('Error adding coffee:', error);
            });
    };

    return (
        <form onSubmit={onSubmit}>
            <label>
                Name:
                <input 
                    type="text" 
                    value={name} 
                    onChange={(e) => setName(e.target.value)} 
                />
            </label>
            <label>
                Price:
                <input 
                    type="text" 
                    value={price} 
                    onChange={(e) => setPrice(e.target.value)} 
                />
            </label>
            <button type="submit">Add Coffee</button>
        </form>
    );
};

export default AddCoffee;
