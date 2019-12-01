import React, {Component} from 'react';
import "./css/panel.css"
import PanelNav from "./components/PanelNav";
import {BrowserRouter, Route} from "react-router-dom";

import Manage from "./components/Manage";
import Docs from "./components/Docs";
import Dash from "./components/Dash";

class Panel extends Component {
    render() {
        return (
            <div className="panel__container">
                <div className="header-panel">
                    <div className="header_logo">
                        <div className="title-upper">Cargo Transportation</div>
                        <div className="title-bottom">Control panel</div>
                    </div>
                    <PanelNav/>
                    <div className="profile__container">
                        <div className="profile_img"></div>
                    </div>
                </div>
                <div className="center-panel">
                    <Route path="/panel/manage" component={Manage}/>
                    <Route path="/panel/docs" component={Docs}/>
                    <Route path="/panel/dash" component={Dash}/>
                </div>
                <div className="footer-panel"></div>
            </div>
        );
    }
}

export default Panel;