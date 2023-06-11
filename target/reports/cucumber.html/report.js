$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenario({
  "name": "Sky Blue Background",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.button_exists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.I_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to Sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.the_background_color_will_change_to_Sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "White Background Change",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set SkyWhite Background\" button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.button_exists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.I_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});