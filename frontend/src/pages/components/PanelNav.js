import React, {Component} from 'react';
import {NavLink} from "react-router-dom";
import './css/login_btn.css';

class PanelNav extends Component {
    render() {
        return (
            <nav className="header_nav__container">
                <div className="button__container">
                    <NavLink className="header_button" to="panel/manage">Database</NavLink>
                </div>
            </nav>
        );
    }
}

export default PanelNav;