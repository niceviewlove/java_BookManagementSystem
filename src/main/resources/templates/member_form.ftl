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
    margin: 50px 0 20px;;
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

.join-signup-container .signup-container .error-msg{
    font-size: 12px;
    color: #f45452;
    line-height: 16px;
}

.form-input + .error-msg {
    padding: 8px 0px 16px;
    color:#f45452;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    font-weight: normal;
    display: none;
}

.form-input +.error-msg p {
   font-size: 14px;
   line-height: 22px;
   letter-spacing: -0.4px;
   color: #f45452;
   font-weight: normal;
   margin: 0;
}

/* .form-input + .error-msg.success {
    display: none;
} */

.form-input + .error-msg.success p {
    display: block;
    font-size: 14px;
    line-height: 22px;
    letter-spacing: -0.4px;
    color: #8e929f;
    font-weight: normal;
    margin: 0;
}

.form-input {
    margin-top: 10px;
}

.form-input:disabled {
    color: #82929f;
}

select {
    display: block;
    padding: 0 25px 0 0;
    width: 100%;
    height: 36px;
    font-size: 17px;
    color: #212329;
    border: 1px solid #fff;
    border-bottom: 1px solid #dedede;
    border-radius: 0;
    background: #fff;
    box-sizing: border-box;
    outline: none;
}

.signup-container .form-input.form-email-select select {
    margin-top: 10px;
    padding: 5px 12px;
    font-size: 16px;
    height: 50px;
    border: 1px solid #d7dbe6;
    box-sizing: border-box;
    background-size: 16px 16px;
    width: 328px;
}

button {
    border: none;
    display: inline-block;
    padding: 16px 0 14px;
    text-align: center;
    font-weight: bold;
    font-size: 18px;
    border-radius: 0;
    background: none;
    border-color: #1a7cff;
    width: 100%;
}

.form-input.has-button .btn-small {
    position: absolute;
    top: 0;
    right: 0;
    border-color: #1a7cff;
    color: #1a7cff;
}


.signup-container .has-button input {
    width: 220px;
    height: 50px;
}

.btn-small {
    display: inline-block;
    position: absolute;
    top: 0;
    right: 0;
    padding: 14px 0 12px;
    text-align: center;
    font-weight: bold;
    font-size: 16px;
    line-height: 22px;
    border: 1px solid;
    background: #fff; 
    width: 98px;
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

.modal-center .modal-contents {
    padding: 27px 25px 25px;
}

.modal-center button {
    padding: 14px 0 13px;
    width: 100%;
    font-size: 16px;
    color: #212329;
    line-height: 22px;
    border-top: 1px solid #979797;
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

.old-address {
    position: relative;
}

.old-address .label-old-address {
    font-size: 12px;
    line-height: 18px;
    letter-spacing: -0.1px;
    color: #8e929f;
    font-weight: normal;
    position: absolute;
    top: -2px;
    left: 0;
    padding: 1px 4px;
    border: 1px solid #bbc0cd;
}

.old-address p {
    display: inline-block;
    padding-left: 38px;
    color: #8e929f;
    word-break: break-all;
}

.popup {
    height: 480px;
}

article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {
    display: block;
}

.child-screen .content-wrapper {
    padding-top: 45px;
    height: 100%;
    box-sizing: border-box;
}

.modal-header {
    position: absolute;
    top: 0;
    width: 100%;
    background: #1a7cff;
    z-index: 1100;
}

.modal-header h1 {
    padding: 14px 50px 11px 16px;
    color: #fff;
    font-size: 16px;
    font-weight: 300;
    text-align: left;
}

.ir {
    font-size: 0;
    line-height: 0;
    color: transparent;
    overflow: hidden;
}

[class|="sp"] {
    padding: 0;
    margin: 0;
    border: 0;
    background: none;
}

.modal-header .btn-close {
    position: absolute;
    top: 0;
    right: 0;
    padding: 14px;
}

.sp-modal-close::before {
    margin-left: 300px;
    content: 'X';
    display: inline-block;
    font-size: 20px;
    line-height: 20px;
    color: white;
    overflow: hidden;
    vertical-align: middle;
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
            	<h1>Member Register</h1>
			<form action="./create" method="POST">
				<div class="form-input">
					<input type="text" class="input input-name" data-type="name" placeholder="이름*" name="name" value="">
				</div>
				<div class="form-input">
					<input type="text" class="input input-gender" data-type="gender" placeholder="성별*" name="gender" value="">
				</div>
				<div class="form-input">
					<input type="text" class="input input-age" data-type="age" placeholder="나이*" name="age" value="">
				</div>
				 <div class="form-input form-email">
                        <input type="text" name="email-front" class="input email-front" data-type="email" placeholder="이메일 앞자리*">
                        <span>@</span>
                        <input type="text" class="input email-end" data-type="check-email" placeholder="이메일 뒷자리*" disabled>
                    </div>
                    <div class="form-input form-email-select">
                        <select name="form-email-select" id="form-email-select">
                            <option value="이메일 선택" noSelected>이메일 선택</option>
                            <option value="naver.com">naver.com</option>
                            <option value="hanmail.net">hanmail.net</option>
                            <option value="nate.com">nate.com</option>
                            <option value="gmail.com">gmail.com</option>
                            <option value="직접입력">직접입력</option>
                        </select>
                    </div>
				   <div class="form-input has-button">
                        <input class="input phone" name="phone" 
                                data-type="phone" placeholder="휴대폰*" type="tel" maxlength="11" onkeyup="this.value=this.value.replace(/[^0-9]/g,'');">
                        <button class="btn-get-code btn-small" disabled><span>인증받기</span></button>
                    </div>
                    <div class="error-msg" id="phone"><p id="phone-msg"></p></div>
                    <div class="form-input has-button auth-code-area hidden">
                        <div class="input-control">
                            <input class="input input-code" name="authCode" data-type="authCode" type="tel" max="6" placeholder="인증번호 6자리 입력">
                            <span class="timer" data-role="bind" data-type="timer"></span>
                        </div>
                        <button class="btn-check-code btn-small"  type="button" disabled>확인</button>
                    </div>
                    <div class="error-msg" id="authCode"><p id="authCode-msg"></p></div>
                    <div class="form-input has-list">
                        <ul class="info-list">
                            <li>인증번호 전송은 통신사에 따라 최대 1분까지 소요될 수 있습니다.</li>
                            <li>인증번호가 도착하지 않을 경우, '인증번호 재전송'을 눌러주세요.</li>
                        </ul>
                    </div>
                     <div class="form-input">
                        <button class="btn-signup button button-primary" type="submit">등록하기</button>
                    </div>
			</form>
			</div>
        </div>
    </div>
    
    <script>
    const selectEmailBtn = document.querySelector('#form-email-select');
selectEmailBtn.addEventListener('click', getEmailAddress);

function getEmailAddress(e) {
    const selected = e.target.value;
    const emailInput = document.querySelector('.email-end');

    if(selected === '직접입력') {
        emailInput.removeEventListener('click',checkClicked);
        emailInput.placeholder = '';
        emailInput.value = '';
        toggleDisabled(emailInput);
    } else {
        emailInput.value = selected;
        emailInput.disabled = true;
        changeClass(emailInput, 'error', 'success');
        displayMsg('email', '', false)
    }
};
    </script>
	</body>
</html>