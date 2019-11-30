import React, {Component} from 'react';
import "./css/panel.css"
import PanelNav from "./components/PanelNav";

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
                <div className="center-panel"></div>
                <div className="footer-panel"></div>
            </div>
        );
    }
}

export default Panel;