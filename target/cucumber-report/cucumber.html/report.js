$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bingo.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the login functionality",
  "description": "User should be able to login with the valid credentials",
  "id": "validate-the-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8038080000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to navigate to the login page",
  "description": "",
  "id": "validate-the-login-functionality;user-should-be-able-to-navigate-to-the-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on login link \"Log In\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter Username \"primeTest123@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "password \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BingoSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 252995900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 23
    }
  ],
  "location": "BingoSteps.iClickOnLoginLink(String)"
});
formatter.result({
  "duration": 596607400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "primeTest123@gmail.com",
      "offset": 16
    }
  ],
  "location": "BingoSteps.enterUsername(String)"
});
formatter.result({
  "duration": 2244176100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 10
    }
  ],
  "location": "BingoSteps.password(String)"
});
formatter.result({
  "duration": 417733900,
  "status": "passed"
});
formatter.match({
  "location": "BingoSteps.clickOnLoginButton()"
});
formatter.result({
  "duration": 2161544000,
  "status": "passed"
});
formatter.match({
  "location": "BingoSteps.errorMessageIsDisplayed()"
});
formatter.result({
  "duration": 819544300,
  "status": "passed"
});
formatter.after({
  "duration": 908516400,
  "status": "passed"
});
});