package com.bitmascot.oup

import grails.web.servlet.mvc.GrailsParameterMap


class DashboardService {

    def serviceMethod() {

    }
    def isMatch(String newPass, String repeatPass){
        if(newPass == repeatPass){
            return true
        }
        return false
    }

    


}
