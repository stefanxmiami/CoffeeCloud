import axios from 'axios';

const API_URL = 'http://localhost:8080'; // Replace with your API's base URL

const CoffeeService = {
    getAllCoffees: function(coffeeData) {
        return axios.get(`${API_URL}/coffees`, coffeeData);
    },

    getCoffeeById: function(id) {
        return axios.get(`${API_URL}/coffees/${id}`);
    },

    createCoffee: function(coffeeData) {
        console.log(coffeeData);
        return axios.post(`${API_URL}/coffees`, coffeeData);
    },

    updateCoffee: function(id, coffeeData) {
        return axios.put(`${API_URL}/coffees/${id}`, coffeeData);
    },

    deleteCoffee: function(id) {
        return axios.delete(`${API_URL}/coffees/${id}`);
    }
};

export default CoffeeService;
