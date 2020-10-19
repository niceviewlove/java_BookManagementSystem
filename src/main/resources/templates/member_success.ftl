<html>
	<head>
	<style>
html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video {
    margin: 0;
    padding: 0;
    border: 0;
    font-size: 100%;
    vertical-align: baseline;
}

body {
    font-size: 14px;
    line-height: 1.4;
    color: #212329;
    letter-spacing: -0.04em;
    font-family: 'Roboto', 'Noto Sans KR', sans-serif,'Dotum', helvetica;
}

html, body, #wrapper {
    height: 100%;
}

input {
    border-radius: 0;
    outline: 0;
}

input:disabled {
    color: #d7dbe6;
}

.input {
    display: block;
    position: relative;
    width: 100%;
    height: 36px;
    padding: 4px 0 3px;
    margin: 0;
    border-radius: 0;
    border: 1px solid #fff;
    border-bottom: 1px solid #d7dbe6;
    font-size: 17px;
    line-height: 1.63;
    letter-spacing: -0.5px;
    color: black;
    background: #fff;
    box-sizing: border-box;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}

p {
    display: block;
    /* margin-block-start: 1em;
    margin-block-end: 1em; */
    margin-inline-start: 0px;
    margin-inline-end: 0px;
}

.join-signup-container .signup-container {
    margin: 0 auto;
    padding: 80px 0 60px;
    width: 328px;
}

.signup-container {
    position: relative;
    margin: 0 auto;
    padding: 50px 0 80px;
    width: 1112px;
}

.signup-container .logo {
    display: block;
    margin-bottom: 40px;
    text-align: center;
}

.signup-container .logo img {
    width: 220px;
}   

 .signup-container h1 {
    display: block;
    margin-bottom: 40px;
    text-align: center;
}


.form {
    display: block;
}

.form-input {
    position: relative;
}

.form-input input {
    padding: 12px 14px;
    border: 1px solid #d7dbe6;
    font-size: 16px;
    line-height: 24px;
    letter-spacing: -0.6px;
    box-sizing: border-box;
    transition: border-color 0.15s ease-in-out;
}

.form-input input::placeholder {
    color: #d7dbe6;
}

.signup-container .form-input input {
    width: 328px;
    height: 50px;
}

.form-input .input.error{
    border-color: red;
}

.signup-container .form-input.form-email {
    overflow: hidden;
}

.signup-container .form-input.form-email input {
    float: left;
    width: 150px;
}

.signup-container .form-input.form-email span {
    float: left;
    display: block;
    padding-top: 15px;
    width: 28px;
    text-align: center;
    font-family: 'NotoSansKR';
}

.signup-guide {
    margin: 50px 0 20px;
    font-size: 16px;
    padding-right: 16px;
    line-height: 25px;
    letter-spacing: -0.4px;
    color: #212329;
    font-weight: normal;
}

.signup-guide:first-child {
    margin-top: 0;
}

/* .form-input + .error-msg.success {
    display: none;
} */

.form-input {
    margin-top: 10px;
}

.form-input:disabled {
    color: #82929f;
}


button {
    border: 2px solid #ccc;
    display: inline-block;
    padding: 16px 0 14px;
    text-align: center;
    /*color: #bbc0cd;*/
    color: gray;
    font-weight: bold;
    font-size: 18px;
    border-radius: 0;
    background: none;
    width: 100%;
    margin-top: 10px;
}

.form-input.has-button .btn-small {
    position: absolute;
    top: 0;
    right: 0;
    border-color: #1a7cff;
    color: #1a7cff;
}




/* .btn-small:disabled {
    border-color: #ccc;
    color: #bbc0cd;
} */

.form-input.has-button .btn-small:disabled {
    border-color: #ccc;
    color: #bbc0cd;
}

.hidden {
    display: none;
}

.overlay {
    overflow: hidden;
}

.modal-contents {
    background: #fff;
    box-sizing: border-box;
}


.auth-code-area .timer {
    position: absolute;
    left: 170px;
    top: 50%;
    -ms-transform: translateY(-50%);
    transform: translateY(-50%);
    right: 16px;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    color: #f52926;
    font-weight: normal;
}

.form-input.has-list {
    margin-top: 12px;
}

ol, ul {
    list-style: none;
}

.info-list li {
    font-size: 12px;
    line-height: 18px;
    letter-spacing: -0.1;
    color: #898989;
    font-weight: normal;
    position: relative;
    padding-left: 9px;
}

.info-list li::before {
    content: '';
    position: absolute;
    display: block;
    top: 8px;
    left: 0;
    width: 3px;
    height: 3px;
    background: #bbc0cd;
    border-radius: 50%;
}

.input-checkbox {
    position: relative;
    padding-top: 3px;
    min-height: 28px;
    box-sizing: border-box;
}

.input-checkbox input {
    position: absolute;
    width: 25px;
    height: 25px;
    border: 1px solid #bbc0cd;
    top: 0;
    left: 0;
    /* background-color: transparent; */
    /* z-index: -1; */
}

.input-checkbox label {
    position: relative;
    display: inline-block;
    padding-left: 35px;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4;
    color: #666a75;
    font-weight: normal;
}

.signup-guide .input-checkbox label {
    vertical-align: middle;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    color: #212329;
}

.signup-guide .normal-term {
    font-size: 12px;
    line-height: 18px;
    letter-spacing: -0.1px;
    color: #898989;
    font-weight: normal;
    position: relative;
    padding-left: 9px;
    text-decoration: underline;
    cursor: pointer;
}

.form-input + .notice-time-over {
    margin: 0;
    padding: 8px 0px 16px;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    color: #f52926;
    font-weight: normal;
}



.signup-terms {
    padding: 50px 0 33px;
}

.signup-terms .input-checkbox.input-checkbox {
    margin-top: 15px;
}

.signup-terms .input-check-all + .input-checkbox  {
    margin-top: 25px;
}

.signup-terms .input-checkbox label {
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    color: #212329;
    font-weight: normal;
}


.signup-terms .input-check-all label {
    font-size: 16px;
    line-height: 25px;
    letter-spacing: -0.4px;
    color: #212329;
    font-weight: bold;
}

.signup-terms a {
    color: #8e929f;
    text-decoration: underline;
}

.signup-terms .terms-linked, .signup-terms .terms-desc {
    padding: 2px 0 0 43px;
    color: #8e929f;
}

.signup-terms .terms-linked a {
    display: inline-block;
    margin-right: 6px;
    line-height: 24px;
}

.signup-terms .info-list {
    margin-top: 15px;
}

.signup-terms .info-list a.notice-14 {
    cursor: pointer;
}

.button.button-primary {
    background: #1a7cff;
    color: #fff;
}

.terms-required.error p {
    display: block;
    margin-left: 35px;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    color: #f45452;
    font-weight: normal;
}

.terms-required.success p {
    display: none;
}
	</style>
	</head>
	
	<body>
		<div id="wrapper">
        <div class="join-signup-container">
            <div class="signup-container">
            	<p class="signup-guide">새로운 멤버 등록 성공!</p>
			<a href="./list"><button class="button"><span>등록된 멤버 보기</span></button></a>
			<a href="./intro"><button class="button"><span>초기화면으로</span></button></a>
			</div>
        </div>
    </div>
	</body>
</html>