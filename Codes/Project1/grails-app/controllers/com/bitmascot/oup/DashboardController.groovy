package com.bitmascot.oup

import grails.web.servlet.mvc.GrailsParameterMap

class DashboardController {
    DashboardService dashboardService
    AuthenticationService authenticationService

    def index() { }

    def edit() {
        def currentPass = params.cp
        def newPass = params.np
        def repeatPass = params.rp
        def matchPass = authenticationService.getMemberPass()

        currentPass = currentPass.encodeAsMD5()
        //System.out.println(currentPass)
        //System.out.println(matchPass)

        if(currentPass == matchPass){
            if(newPass == repeatPass){
                authenticationService.setMemberPass(newPass)
                redirect(controller: "dashboard", action: "index")
            }
        }
    }
    def debug() {}

    def debug2() {}




}
