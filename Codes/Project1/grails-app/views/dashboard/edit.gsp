<%@ page contentType="text/html;charset=UTF-8" %>
<meta name="layout" content="main2"/>

<div class="card">
    <div class="card-header">
        <g:message code="password" args="['Update']"/>
    </div>
    <div class="card-body">

        <g:form controller="dashboard" action="edit">
            <div class="form-group">
                <label><g:message code="current.password"/> *</label>
                <g:passwordField name="cp" class="form-control" placeholder="Please Enter Current Password"/>
                <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please Enter a Password."/>
            </div>

            <div class="form-group">
                <label><g:message code="new.password"/> *</label>
                <g:passwordField name="np" class="form-control" placeholder="Please Enter New Password"/>
                <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please Enter a Password."/>
            </div>

            <div class="form-group">
                <label><g:message code="repeated.password"/> *</label>
                <g:passwordField name="rp" class="form-control" placeholder="Please Confirm New Password"/>
                <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please Enter a Password."/>
            </div>
            <g:submitButton class="btn btn-primary" name="update" value="${g.message(code: "update")}"/>
        </g:form>

    </div>
</div>