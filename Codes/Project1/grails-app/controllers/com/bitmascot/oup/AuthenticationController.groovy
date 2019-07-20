package com.bitmascot.oup

class AuthenticationController {

    AuthenticationService authenticationService
    MemberService memberService

    def login() {
        if (authenticationService.isAuthenticated()) {
            redirect(controller: "dashboard", action: "index")
        }
    }


    def doLogin() {
        if (authenticationService.doLogin(params.email, params.password)) {
            if(authenticationService.isRegularMember()) {
                redirect(controller: "dashboard", action: "index")
            }
            else if(authenticationService.isAdministratorMember()){
                redirect(controller: "member", action: "index")
                }
        } else {
           // flash.message = AppUtil.infoMessage("Email Address or Password not Valid.", false)
            redirect(controller: "authentication", action: "login")
        }
    }


    def logout() {
        session.invalidate()
        redirect(controller: "authentication", action: "login")
    }

    //registration

    def registration() {
        [member: flash.redirectParams]
    }


    def doRegistration() {
        def response = memberService.save(params)
        if (response.isSuccess) {
            authenticationService.setMemberAuthorization(response.model)
            redirect(controller: "dashboard", action: "index")
        } else {
            flash.redirectParams = response.model
            redirect(controller: "authentication", action: "registration")
        }
    }


}
