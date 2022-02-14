$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("covid19R11_Negative_Features.feature");
formatter.feature({
  "line": 1,
  "name": "Filling Online Form for Covid 19 With No Option",
  "description": "Description: To Test Ineligible Covid 19 plan flow",
  "id": "filling-online-form-for-covid-19-with-no-option",
  "keyword": "Feature"
});
formatter.before({
  "duration": 42330573600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User selects fourth question as No for Ineligible flow",
  "description": "",
  "id": "filling-online-form-for-covid-19-with-no-option;user-selects-fourth-question-as-no-for-ineligible-flow",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Negative_Scenarios"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user submits eligible for a CVPP",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user submits do you live in UK Screen",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user submits impact of coronavirus",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user submits receiving an income with no option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be ineligible for covid plan",
  "keyword": "And "
});
formatter.match({
  "location": "Covid19R1_SD.userSubmitsEligibleForACVPP()"
});
