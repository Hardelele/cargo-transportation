import React, {Component} from 'react';
import {NavLink} from "react-router-dom";
import './css/panel_nav.css';

class PanelNav extends Component {
    render() {
        return (
            <nav className="header_nav__container">
                <NavLink className="header_button" to="manage">Management</NavLink>
                <NavLink className="header_button" to="docs">Documents</NavLink>
                <NavLink className="header_button" to="dash">Dashboard</NavLink>
            </nav>
        );
    }
}

export default PanelNav;