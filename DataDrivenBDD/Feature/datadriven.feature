Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters "<username>" and "<password>"
 Then Message displayed Login Successfully
 Then close the browser
Examples:
    | username       | password      |
    | ravinangre     | 7875888498    |
    | ravinangre1983 | 8830158607    |