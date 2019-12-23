import React, {Component} from 'react';
import axios from "axios";
import './css/form.css';

class Form extends Component {

    state = {
        trips: []
    }

    componentDidMount () {
        axios(`http://localhost:8080/trips`).then(res => {
                const trips = res.data;
                console.log(res.data);
                this.setState({ trips });
            });
    }

    render() {
        return (
            <div className="form__container">
                <div className="form_row form_top">
                    <div className="form_short_elem">id</div>
                    <div className="form_mid_elem">departure</div>
                    <div className="form_mid_elem">destination</div>
                    <div className="form_elem">driver id</div>
                    <div className="form_elem">car id</div>
                    <div className="form_mid_elem">driver price</div>
                    <div className="form_mid_elem">start date</div>
                    <div className="form_mid_elem">end date</div>
                </div>
                { this.state.trips.map(trip =>
                    <div className="form_row">
                        <div className="form_short_elem">{trip.id}</div>
                        <div className="form_mid_elem">{trip.departure}</div>
                        <div className="form_mid_elem">{trip.destination}</div>
                        <div className="form_elem">{trip.driverId}</div>
                        <div className="form_elem">{trip.carId}</div>
                        <div className="form_mid_elem">{trip.driverPrice}</div>
                        <div className="form_mid_elem">{trip.startDate}</div>
                        <div className="form_mid_elem">{trip.endDate}</div>
                    </div>
                )}
            </div>
        );
    }
}

export default Form;