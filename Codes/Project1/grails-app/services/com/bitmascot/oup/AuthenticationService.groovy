package com.bitmascot.oup


class AuthenticationService {

    private static final String AUTHORIZED = "AUTHORIZED"
    String pass

    def setMemberAuthorization(Member member) {
        def authorization = [isLoggedIn: true, member: member]
        AppUtil.getAppSession()[AUTHORIZED] = authorization
    }

    def doLogin(String email, String password){
        password = password.encodeAsMD5()
        Member member = Member.findByEmailAndPassword(email, password)
        if (member){
            setMemberAuthorization(member)
            return true
        }
        return false
    }

    boolean isAuthenticated(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        if (authorization && authorization.isLoggedIn){
            return true
        }
        return false
    }


    def getMember(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        return authorization?.member
    }

    def getMemberName(){
        def member = getMember()
        return "${member.firstName} ${member.lastName}"
    }

    def getMemberFname(){
        def member = getMember()
        return "${member.firstName}"
    }
    def getMemberLname(){
        def member = getMember()
        return "${member.lastName}"
    }
    def getMemberAddress(){
        def member = getMember()
        return "${member.address}"
    }
    def getMemberPhone(){
        def member = getMember()
        return "${member.phone}"
    }
    def getMemberEmail(){
        def member = getMember()
        return "${member.email}"
    }
    def getMemberBdate(){
        def member = getMember()
        return "${member.bdate}"
    }
    def getMemberPass(){
        def member = getMember()
        return "${member.password}"
    }

    def isAdministratorMember(){
        def member = getMember()
        if (member && member.memberType == GlobalConfig.USER_TYPE.ADMINISTRATOR){
            return true
        }
        return false
    }
    def isRegularMember(){
        def member = getMember()
        if (member && member.memberType == GlobalConfig.USER_TYPE.REGULAR_MEMBER){
            return true
        }
        return false
    }

    def setMemberPass(String newPass){
        def member = getMember()
        member.password = newPass
    }


}
