import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css'; // Import styles for the Home page
import '../App.css';

const Home = () => {
  return (
    <div className="home-container">
      <h1>Welcome to ConnexCard</h1>
      <p>Sign up or log in to connect with the world and enhance your professional network.</p>
      <div className="home-buttons">
        <Link to="/signup" className="btn">Sign Up</Link>
        <Link to="/login" className="btn">Login</Link>
      </div>
    </div>
  );
};

export default Home;
