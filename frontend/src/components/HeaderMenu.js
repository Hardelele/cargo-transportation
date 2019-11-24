import '../css/App.css';
import React from "react";

export const HeaderMenu = () => (
    <header className="header__container">
        <div className="header__logo">Cargo Transportation</div>
        <nav className="buttons__container">
            <div className="nav__button">Панель управления</div>
            <div className="nav__button">Калькулятор прибыли</div>
            <div className="nav__button">Гениратор документации</div>
            <div className="nav__button"></div>
        </nav>
    </header>
)
