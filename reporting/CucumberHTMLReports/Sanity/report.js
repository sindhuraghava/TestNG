$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/cucumber/blog.feature");
formatter.feature({
  "name": "blog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate blog entering functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is in blog page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Blogpage.userisinBlogpage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters data in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Blogpage.userEnterintoblog()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "data should appear in search field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Blogpage.thenpage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/cucumber/realtime.feature");
formatter.feature({
  "name": "Search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "open browseer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.realtime.before()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate valid search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cproduct\u003e\" in search field",
  "keyword": "When "
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "product \"\u003cproduct\u003e\" shud be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "MacBook Air"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate valid search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.realtime.searchpage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"iPhone\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.realtime.enterproduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.realtime.clicksearch()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "product \"iPhone\" shud be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.realtime.searched(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate valid search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.realtime.searchpage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Air\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.realtime.enterproduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.realtime.clicksearch()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "product \"MacBook Air\" shud be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.realtime.searched(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "close browseer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.realtime.after()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});