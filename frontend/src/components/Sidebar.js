import '../css/App.css';
import React from "react";

export const Sidebar = () => (
    <aside className="sidebar">
        <div className="sidebar__button">
            <div className="sidebar_button_icon"></div>
            <div className="sidebar_button_text">Водители</div>
        </div>
        <div className="sidebar__button">
            <div className="sidebar_button_icon"></div>
            <div className="sidebar_button_text">Машины</div>
        </div>
        <div className="sidebar__button">
            <div className="sidebar_button_icon"></div>
            <div className="sidebar_button_text">Клиенты</div>
        </div>
        <div className="sidebar__button">
            <div className="sidebar_button_icon"></div>
            <div className="sidebar_button_text">Рейсы</div>
        </div>
        <div className="sidebar__button">
            <div className="sidebar_button_icon"></div>
            <div className="sidebar_button_text">Права</div>
        </div>
    </aside>
)