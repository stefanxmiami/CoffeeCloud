import React from 'react';

const CoffeeItem = ({ coffee }) => {
    return (
        <div>
            <h2>{coffee.name}</h2>
            <p>{coffee.price}</p>
            {/* You could add more coffee attributes here */}
        </div>
    );
};

export default CoffeeItem;
