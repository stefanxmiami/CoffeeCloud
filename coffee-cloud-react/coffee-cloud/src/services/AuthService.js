import axios from 'axios';

const API_URL = 'http://localhost:8080'; // Replace with your API base URL

const AuthService = {
    login: function(userData) {
        return axios
            .post(`${API_URL}/auth/login`, userData)
            .then(response => {
                if (response.data.accessToken) {
                    localStorage.setItem('user', JSON.stringify(response.data));
                }
                return response.data;
            });
    },

    logout: function() {
        localStorage.removeItem('user');
    },

    getCurrentUser: function() {
        return JSON.parse(localStorage.getItem('user'));
    }
};

export default AuthService;
