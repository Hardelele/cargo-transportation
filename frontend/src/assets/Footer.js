import React from 'react'
import './Footer.css'
import Language from './components/Language'
import TechSupport from './components/TechSupport'

let Footer = () => {
    return (
        <div className="Footer">
            <TechSupport/>
            <Language/>
        </div>
    );
}

export default Footer;