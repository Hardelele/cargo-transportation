import React, {Component} from 'react';
import './css/App.css';

class App extends Component {

    render() {
        return (
            <main className="main">
                <header className="header__container">
                    <div className="header__logo">Cargo Transportation</div>
                    <nav className="buttons__container">
                        <div className="nav__button">Панель управления</div>
                        <div className="nav__button">Калькулятор прибыли</div>
                        <div className="nav__button">Гениратор документации</div>
                        <div className="nav__button"></div>
                    </nav>
                </header>
                <div className="content__container">
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
                    <section className="main__content">

                    </section>
                </div>
            </main>
        );
    }
}

export default App;
