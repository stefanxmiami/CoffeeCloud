import axios from 'axios';

const API_URL = 'http://localhost:8080'; // Replace with your API base URL

const OrderService = {
    getAllOrders: function() {
        return axios.get(`${API_URL}/orders`);
    },

    getOrderById: function(id) {
        return axios.get(`${API_URL}/orders/${id}`);
    },

    createOrder: function(orderData) {
        return axios.post(`${API_URL}/orders`, orderData);
    },

    updateOrder: function(id, orderData) {
        return axios.put(`${API_URL}/orders/${id}`, orderData);
    },

    deleteOrder: function(id) {
        return axios.delete(`${API_URL}/orders/${id}`);
    }
};

export default OrderService;
