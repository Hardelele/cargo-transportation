import React, {Component} from 'react';
import './css/app.css';
import {BrowserRouter, Route, Switch} from "react-router-dom";
import Home from "./pages/Home";
import Auth from "./pages/Auth";
import Panel from "./pages/Panel";
import Calc from "./pages/Calc";
import Register from "./pages/Register";

class App extends Component {

    render() {
        return (
            <BrowserRouter>
                <div className="main__container">
                    <Switch>
                        <Route path="/" exact component={Home}/>
                        <Route path="/auth" component={Auth}/>
                        <Route path="/register" component={Register}/>
                        <Route path="/panel" component={Panel}/>
                        <Route path="/calc" component={Calc}/>
                    </Switch>
                </div>
            </BrowserRouter>
        );
    }
}

export default App;
