import React, {Fragment} from 'react';
import {Sidebar} from "../components/Sidebar";

export const ControlPanel = () => {
    return (
        <Fragment>
            <div className="content__container">
                <Sidebar/>
                <section className="main__content">
                </section>
            </div>
        </Fragment>
    )
}