package com.bitmascot.oup

class UIHelperTagLib {
    static namespace = "UIHelper"
    AuthenticationService authenticationService
    def navigations = []

    def renderErrorMessage = { attrs, body ->
        def model = attrs.model
        String fieldName = attrs.fieldName
        String errorMessage = attrs.errorMessage? g.message(code: attrs.errorMessage): g.message(code: "invalid.input")
        if (model && model.errors && model.errors.getFieldError(fieldName)){
            out << "<small class='form-text text-danger''><strong>${errorMessage}</strong></small>"
        }
    }

    def memberActionMenu = { attrs, body ->
        out << '<li class="nav-item dropdown show">'
        out << g.link(class:"nav-link dropdown-toggle", "data-toggle":"dropdown"){authenticationService.getMemberName()}
        out << '<div class="dropdown-menu">'
        out << g.link(controller: "dashboard", action: "edit", class: "dropdown-item"){g.message(code:"change.password")}
        out << g.link(controller: "authentication", action: "logout", class: "dropdown-item"){g.message(code:"logout")}
        out << "</div></li>"
    }

    def memberDetails = { attrs, body ->
        if(authenticationService.isRegularMember()) {
            out << '<li class="list-group-item">'
            out << 'First Name: '
            out << g.link(class: "text-dark") { authenticationService.getMemberFname() }
            out << '</li>'
            out << '<li class="list-group-item">'
            out << 'Last Name: '
            out << g.link(class: "text-dark") { authenticationService.getMemberLname() }
            out << '</li>'
            out << '<li class="list-group-item">'
            out << 'Address: '
            out << g.link(class: "text-dark") { authenticationService.getMemberAddress() }
            out << '</li>'
            out << '<li class="list-group-item">'
            out << 'Phone Number: '
            out << g.link(class: "text-dark") { authenticationService.getMemberPhone() }
            out << '</li>'
            out << '<li class="list-group-item">'
            out << 'Email ID: '
            out << g.link(class: "text-dark") { authenticationService.getMemberEmail() }
            out << '</li>'
            out << '<li class="list-group-item">'
            out << 'Birth Date: '
            out << g.link(class: "text-dark") { authenticationService.getMemberBdate() }
            out << '</li>'
        }
    }

    def leftNavigation = { attrs, body ->
        if(authenticationService.isRegularMember()) {
            navigations = [
                    [controller: "dashboard", action: "index", name: "Profile Page"],
                    [controller: "dashboard", action: "edit", name: "Change Password"],
            ]
        }

        else if(authenticationService.isAdministratorMember()){
            navigations = [
                    [controller: "member", action: "index", name: "User List"],
            ]
        }

        navigations.each { menu ->
            out << '<li class="list-group-item">'
            out << g.link(controller: menu.controller, action: menu.action) { g.message(code: menu.name, args: ['']) }
            out << '</li>'
        }
    }
}
