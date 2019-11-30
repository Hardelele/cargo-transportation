import React, {Component} from 'react';
import axios from "axios";

class Form extends Component {

    state = {
        trips: []
    }

    componentDidMount () {
        axios.get(`http://localhost:8080/trips`).then(res => {
                const trips = res.data;
                console.log(res.data);
                this.setState({ trips });
            });
    }

    render() {
        return (
            <ul>
                { this.state.trips.map(trip => <li key={trip.id}>{trip.departure} -> {trip.destination}</li>)}
            </ul>
        );
    }
}

export default Form;