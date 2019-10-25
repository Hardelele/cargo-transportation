import React, {Component} from 'react';
import axios from "axios";
import './css/App.css';

class App extends Component {

    state = {
        trips: []
    };

    componentDidMount() {
        axios.get('https://localhost:8081/trips')
            .then(response => {
                console.log(this.state.trips);
                const trips = response.data;
                this.setState({
                    trips
                });
            })
    }

    render() {
        return (
            <div className="App">

                { this.state.trips.map(trip => <div>{trip.destination}</div>)}
            </div>
        );
    }
}

export default App;
