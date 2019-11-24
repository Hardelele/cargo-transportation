import '../css/App.css';
import React from "react";
import {NavLink} from "react-router-dom";

export const HeaderMenu = () => (
    <header className="header__container">
        <div className="header__logo"><NavLink className="nav_link" to="/">Cargo Transportation</NavLink></div>
        <nav className="buttons__container">
            <div className="nav__button"><NavLink className="nav_link" to="/panel">Панель управления</NavLink></div>
            <div className="nav__button">Калькулятор прибыли</div>
            <div className="nav__button">Гениратор документации</div>
        </nav>
    </header>
)
