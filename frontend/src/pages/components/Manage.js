import React, {Component} from 'react';
import Form from "./Form";

class Manage extends Component {
    render() {
        return (
            <div className="center-panel">
                <div className="sidebar">
                    <ul>
                        <li>
                            <div className="sidebar_button">Trips</div>
                        </li>
                        <li>
                            <div className="sidebar_button">Drivers</div>
                        </li>
                        <li>
                            <div className="sidebar_button">Auto</div>
                        </li>
                    </ul>
                </div>
                <div className="manage__container">
                    <Form/>
                </div>
            </div>
        );
    }
}

export default Manage;