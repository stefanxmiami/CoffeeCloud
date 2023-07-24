import React, { useState, useEffect } from 'react';
import axios from 'axios';
// You might also want to import your API base URL if it's defined in another file
// import { API_URL } from '../constants';

const CoffeeList = () => {
    const [coffees, setCoffees] = useState([]);

    useEffect(() => {
        fetchCoffees();
    }, []);

    const fetchCoffees = async () => {
        try {
            // Use the correct URL here. This is just a placeholder
            const response = await axios.get('/api/coffees');
            setCoffees(response.data);
        } catch (error) {
            console.error('Error fetching coffees: ', error);
        }
    };

    return (
        <div>
            <h1>Coffee List</h1>
            {coffees.length > 0 ? (
                coffees.map(coffee => (
                    <div key={coffee.id}>
                        <h2>{coffee.name}</h2>
                        <p>{coffee.price}</p>
                        {/* You could add more coffee attributes here */}
                    </div>
                ))
            ) : (
                <p>No coffees found.</p>
            )}
        </div>
    );
};

export default CoffeeList;
