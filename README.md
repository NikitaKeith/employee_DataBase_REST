# "Employee" Restful Service
<p>
endpoints:<br />
<ul>
  <li><b>/api/v1/employees</b> with GET: all employees</li>
  <li><b>/api/v1/employees/{id}</b> with GET: employee with this id</li>
  <li><b>/api/v1/employees</b> with POST: save employee in DB</li>
  <li><b>/api/v1/employees/{id}</b> with PUT: edit the employee</li>
  <li><b>/api/v1/employees/{id}</b> with DELETE: delete the employee</li>
</p>
<p>
<li><b>/actuator/health</b>
<li><b>/actuator/info</b>
</p>
  
<h3>Versions:</h3>
0.1.0.ALPHA - Basic functions with CRUD commands<br/>
0.1.1.ALPHA - add actuators endpoints and fix URLs<br/>
<br/>
<h3>The following was used for the program:</h3>
<ul>
<li>Spring Boot</li>
<li>Spring Actuators</li>
<li>Hibernate</li>
<li>MySQL DB</li>
</ul>
