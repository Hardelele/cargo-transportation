import React, {Component} from 'react';
import './css/App.css';
import {HeaderMenu} from "./components/HeaderMenu";
import {Sidebar} from "./components/Sidebar";

class App extends Component {

    render() {
        return (
            <main className="main">
                <HeaderMenu/>
                <div className="content__container">
                    <Sidebar/>
                    <section className="main__content">
                    </section>
                </div>
            </main>
        );
    }
}

export default App;
