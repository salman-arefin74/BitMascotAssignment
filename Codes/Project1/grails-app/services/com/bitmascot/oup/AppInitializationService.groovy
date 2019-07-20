package com.bitmascot.oup

class AppInitializationService {

    static initialize() {
        initMember()
    }

    private static initMember() {
        if (Member.count() == 0) {
            Member member = new Member()
            member.firstName = "Administrator"
            member.lastName = ""
            member.email = "admin@localhost.com"
            member.password = "admin"
            member.memberType = GlobalConfig.USER_TYPE.ADMINISTRATOR
            member.save(flash: true)
        }
    }
}
