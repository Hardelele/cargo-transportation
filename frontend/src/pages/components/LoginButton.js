import React, {Component} from 'react';
import {NavLink} from "react-router-dom";
import './css/login_btn.css';

class LoginButton extends Component {
    render() {
        return (
            <NavLink className="login_button nav_link" to="/auth">
                SIGN IN
            </NavLink>
        );
    }
}

export default LoginButton;