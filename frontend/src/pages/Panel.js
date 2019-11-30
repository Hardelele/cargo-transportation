import React, {Component} from 'react';
import "./css/panel.css"

class Panel extends Component {
    render() {
        return (
            <div className="panel__container">
                <div className="header-panel">
                    <div className="header_logo">
                        <div className="title-upper">Cargo Transportation</div>
                        <div className="title-bottom">Control panel</div>
                    </div>
                    <nav className="header_nav__container">
                        <div className="header_button"></div>
                    </nav>
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