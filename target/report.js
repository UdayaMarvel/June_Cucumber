$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace/June_Cucumber/src/test/resources/TodaysDeals.feature");
formatter.feature({
  "name": "Amazon Todays Deals",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@todaydeals"
    }
  ]
});
formatter.background({
  "name": "Common Function",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "launch the browser with url \"https://www.amazon.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TodaysDealStepDefinition.launch_the_browser_with_url(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"com.amazon.TodaysDealStepDefinition.driver\" is null\r\n\tat com.amazon.TodaysDealStepDefinition.launch_the_browser_with_url(TodaysDealStepDefinition.java:33)\r\n\tat ✽.launch the browser with url \"https://www.amazon.com\"(C:/Users/ADMIN/eclipse-workspace/June_Cucumber/src/test/resources/TodaysDeals.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Todays Deals",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todaydeals"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regress"
    }
  ]
});
formatter.step({
  "name": "user signing in with one dim map",
  "rows": [
    {
      "cells": [
        "user1",
        "udayamarvel@gmail.com"
      ]
    },
    {
      "cells": [
        "user2",
        "udaya@gmail.com"
      ]
    },
    {
      "cells": [
        "user3",
        "marvel@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TodaysDealStepDefinition.user_signing_in_with_one_dim_map(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the mail id",
  "keyword": "And "
});
formatter.match({
  "location": "TodaysDealStepDefinition.user_enter_the_mail_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on todays deals",
  "keyword": "When "
});
formatter.match({
  "location": "TodaysDealStepDefinition.user_clicks_on_todays_deals()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the products displayed with percentage",
  "keyword": "Then "
});
formatter.match({
  "location": "TodaysDealStepDefinition.validate_the_products_displayed_with_percentage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on product",
  "keyword": "When "
});
formatter.match({
  "location": "TodaysDealStepDefinition.user_clicks_on_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the related product displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TodaysDealStepDefinition.validate_the_related_product_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the related product displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TodaysDealStepDefinition.validate_the_related_product_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate",
  "keyword": "Then "
});
formatter.match({
  "location": "TodaysDealStepDefinition.validate()"
});
formatter.result({
  "status": "skipped"
});
});