import React, { Component } from 'react';
import axios from "axios";
import {NavLink} from "react-router-dom";

class Ways extends Component {
    getWays = () => {
     axios.get('http://localhost:8081/ways').then((res) => {
       console.log(res.data);
     });
    }
}

export default Ways;