import React, {Fragment} from 'react';
import '../css/pages/home.css';
import '../css/components/article.css';

export const Home = () => {
    return (
        <Fragment>
            <div className="content__container home__container">
                <div className="home__content">
                    <div className="article">
                        <div className='article_title'>О приложении</div>
                        <div className="article_content"></div>
                    </div>
                </div>
            </div>
        </Fragment>
    )
}

