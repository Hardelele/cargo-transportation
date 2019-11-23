import React, {Component} from 'react';
import './css/App.css';

class App extends Component {

    render() {
        return (
            <div className="MainContainer">
                <header className="Header Container">
                    <div className="HeaderButton">Панель</div>
                    <div className="HeaderButton">Калькулятор</div>
                    <div className="HeaderButton">Документы</div>
                </header>
                <div className="Content Container"></div>
                <footer className="Footer Container"></footer>
            </div>
        );
    }
}

export default App;
