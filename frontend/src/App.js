import React, {Component} from 'react';
import './css/App.css';
import {HeaderMenu} from "./components/HeaderMenu";
import {BrowserRouter, Route, Switch} from "react-router-dom";
import {Home} from "./pages/Home";
import {ControlPanel} from "./pages/ControlPanel";

class App extends Component {

    render() {
        return (
            <BrowserRouter>
                <main className="main">
                    <HeaderMenu/>
                    <Switch>
                        <Route path="/" exact component={Home}/>
                        <Route path="/panel" component={ControlPanel}/>
                    </Switch>
                </main>
            </BrowserRouter>
        );
    }
}

export default App;
