import React, { Component } from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './css/App.css';
import Ways from "./components/Ways";

class App extends Component {

    render() {
        return (
        <BrowserRouter>
            <Switch>
                <Route path="/ways" component={Ways}/>
            </Switch>
        </BrowserRouter>
        );
    }
}

export default App;
