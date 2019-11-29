import React, {Component} from 'react';
import './css/home.css';

class Home extends Component {
    render() {
        return (
            <div className="home__container">
                <div className="top__container top__background">
                    <div className="login_button">SIGN IN</div>
                    <div className="empty_space"></div>
                    <div className="top_logo__container">
                        <div className="logo_margin"></div>
                        Cargo <br/> Transportation
                    </div>
                </div>
                <div className="center__container">
                    <div className="center__empty_space"></div>
                    <div className="center_logo__container">About company</div>
                    <div className="center__empty_space"></div>
                    <div className="center_content">
                        <div className="card">
                            <div className="title_card">Activity of the company</div>
                            <div className="text_card"></div>
                        </div>
                        <div className="card">
                            <div className="title_card">Tariffs</div>
                            <div className="text_card"></div>
                        </div>
                        <div className="card">
                            <div className="title_card">Vacancies</div>
                            <div className="text_card"></div>
                        </div>
                        <div className="card">
                            <div className="title_card">Contact us</div>
                            <div className="text_card"></div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Home;