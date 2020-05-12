@login
Feature: Login
  As user, I want to be able to login with username and password

  Background: open login page
    Given user is on the login page

  @inventory_manager
  Scenario: Login as inventory manager and verify that tile is "#Inbox - Odoo"
    When user logs in as an inventory manager
    Then user should verify that title is "#Inbox - Odoo"