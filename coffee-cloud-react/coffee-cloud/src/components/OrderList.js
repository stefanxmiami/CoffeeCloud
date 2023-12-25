import React, { useState, useEffect } from 'react';
import OrderService from '../services/OrderService'; // You'll need to create this service

function OrderList() {
    const [orders, setOrders] = useState([]);

    useEffect(() => {
        OrderService.getAllOrders().then(response => {
            setOrders(response.data);
        });
    }, []);

    return (
        <div>
            <h2>Orders</h2>
            {/* Display orders here */}
        </div>
    );
}

export default OrderList;
