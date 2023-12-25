import React from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
// Import your components here
import Navigation from './components/Navigation';
import CoffeeList from './components/CoffeeList';
import AddCoffee from './components/AddCoffee';
import UpdateCoffee from './components/UpdateCoffee';
import OrderList from './components/OrderList';
import AddOrder from './components/AddOrder';
import UpdateOrder from './components/UpdateOrder';
import UserList from './components/UserList';
import AddUser from './components/AddUser';
import UpdateUser from './components/UpdateUser';
import Login from './components/Login';
import Logout from './components/Logout';

function App() {
  return (
    <Router>
      <div className="App">
        <Navigation />
        <Routes>
          {/* Coffee Routes */}
          <Route path="/" element={<CoffeeList />} />
          <Route path="/add-coffee" element={<AddCoffee />} />
          <Route path="/update-coffee/:id" element={<UpdateCoffee />} />

          {/* Order Routes */}
          <Route path="/orders" element={<OrderList />} />
          <Route path="/add-order" element={<AddOrder />} />
          <Route path="/update-order/:id" element={<UpdateOrder />} />

          {/* User Routes */}
          <Route path="/users" element={<UserList />} />
          <Route path="/add-user" element={<AddUser />} />
          <Route path="/update-user/:id" element={<UpdateUser />} />

          {/* Authentication Routes */}
          <Route path="/login" element={<Login />} />
          <Route path="/logout" element={<Logout />} />

          {/* Additional routes as needed */}
        </Routes>
      </div>
    </Router>
  );
}

export default App;
