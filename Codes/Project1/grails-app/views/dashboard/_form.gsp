<div class="form-group">
    <label><g:message code="current.password"/> *</label>
    <g:passwordField name="password" class="form-control" value="" placeholder="Please Enter Current Password"/>
    <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please Enter a Password."/>
</div>

<div class="form-group">
    <label><g:message code="new.password"/> *</label>
    <g:passwordField name="password" class="form-control" value="${member?.password}" placeholder="Please Enter New Password"/>
    <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please Enter a Password."/>
</div>

<div class="form-group">
    <label><g:message code="repeated.password"/> *</label>
    <g:passwordField name="password" class="form-control" value="" placeholder="Please Confirm New Password"/>
    <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please Enter a Password."/>
</div>