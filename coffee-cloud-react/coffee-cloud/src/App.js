import React from 'react';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
// Import your components here
import CoffeeList from './components/CoffeeList';
import AddCoffee from './components/AddCoffee';
import UpdateCoffee from './components/UpdateCoffee';
import Navigation from './components/Navigation';

function App() {
  return (
    <Router>
      <div className="App">
        <Navigation />
        <Switch>
          <Route path="/" exact component={CoffeeList} />
          <Route path="/add" component={AddCoffee} />
          <Route path="/update/:id" component={UpdateCoffee} />
          {/* Add more routes as needed */}
        </Switch>
      </div>
    </Router>
  );
}

export default App;
