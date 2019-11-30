import React, {Component} from 'react';
import Form from "./components/Form";

class Panel extends Component {
    render() {
        return (
            <div className="panel__container">
                <Form/>
            </div>
        );
    }
}

export default Panel;