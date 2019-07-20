<meta name="layout" content="public"/>

<div class="card">
    <div class="card-header">
        Registration Panel
    </div>
    <div class="card-body">
        <g:form controller="authentication" action="doRegistration">
            <g:render template="/member/form"/>
            <g:submitButton name="registration" value="Register" class="btn btn-primary"/>
            <g:link controller="authentication" action="login" class="btn btn-primary"><g:message code="cancel"/></g:link>
        </g:form>
    </div>
</div>
