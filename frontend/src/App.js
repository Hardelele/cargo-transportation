import React, {Component} from 'react';
import './css/App.css';

class App extends Component {

    render() {
        return (
            <main className="main">
                <header className="header__container">
                    <div className="header__logo"></div>
                    <nav className="buttons__container">
                        <div className="nav__button"></div>
                        <div className="nav__button"></div>
                        <div className="nav__button"></div>
                        <div className="nav__button"></div>
                    </nav>
                </header>
                <div className="content__container">
                    <aside className="sidebar">
                        <div className="nav__button"></div>
                        <div className="nav__button"></div>
                        <div className="nav__button"></div>
                        <div className="nav__button"></div>
                    </aside>
                    <section className="main__content">

                    </section>
                </div>
            </main>
        );
    }
}

export default App;
