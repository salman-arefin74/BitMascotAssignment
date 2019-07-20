package com.bitmascot.oup


class MemberInterceptor {

    AuthenticationService authenticationService

    boolean before() {
        if (authenticationService.isAdministratorMember()){
            return true
        }

        redirect(controller: "dashboard", action: "index")
        return false
    }
}
