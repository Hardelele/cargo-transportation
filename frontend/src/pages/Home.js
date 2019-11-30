import React, {Component} from 'react';
import './css/home.css';
import LoginButton from "./components/LoginButton";

class Home extends Component {
    render() {
        return (
            <div className="home__container">
                <div className="top__container top__background">
                    <LoginButton/>
                    <div className="empty_space"></div>
                    <div className="top_logo__container">
                        <div className="logo_margin"></div>
                        <div className="top_logo__text">Cargo <br/> Transportation</div>
                    </div>
                </div>
                <div className="center__container">
                    <div className="center__empty_space"></div>
                    <div className="center_logo__container">About company</div>
                    <div className="center__empty_space"></div>
                    <div className="center_content__info">
                        <div className="card">
                            <div className="card_img"></div>
                            <div className="title_card">Who we are?</div>
                            <div className="title_card__after"></div>
                            <div className="text_card">
                                We've been start work in transportation
                                business along 15 years. During this time
                                we earned trust from our customers and
                                learned to do their job efficiently.
                            </div>
                        </div>
                        <div className="card">
                            <div className="title_card"></div>
                            <div className="title_card__after"></div>
                            <div className="text_card"></div>
                        </div>
                        <div className="card">
                            <div className="title_card"></div>
                            <div className="title_card__after"></div>
                            <div className="text_card"></div>
                        </div>
                        <div className="card">
                            <div className="title_card">Contact us</div>
                            <div className="title_card__after"></div>
                            <div className="text_card"></div>
                        </div>
                    </div>
                    <div className="center_content__bottom">
                        <div className="news__container"></div>
                        <div className="request__container"></div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Home;