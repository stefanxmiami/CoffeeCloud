import React, { useState } from 'react';

const AddCoffee = ({ addCoffee }) => {
    const [name, setName] = useState('');
    const [price, setPrice] = useState('');

    const onSubmit = (e) => {
        e.preventDefault();

        addCoffee({ name, price });

        setName('');
        setPrice('');
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
