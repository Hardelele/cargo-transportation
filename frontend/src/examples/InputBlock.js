import React from 'react';
import './InputBlock.css';

function InputBlock() {
    return (
        <div className="InputBlock">
            <form action="/">
                <input placeholder="login" className="input" name="login" />
                <br/>
                <input placeholder="password" className="input" name="password"/>
                <br/>
                <input type="submit" name="send" className="button" value="Sign in"/>
            </form>
        </div>
    );
}

export default InputBlock;