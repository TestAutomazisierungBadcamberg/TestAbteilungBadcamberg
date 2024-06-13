
Feature: Home Page header menus
  Scenario: Header Menus
    Given Ich gehe zur die Startseite
    Then Ich sehe auf der Seite Title "sabris ag"
    When Ich klicke auf dem Cookiesbutton
    Then Ich sehe auf der Seite die Headermenus
    When Ich gehe darüber Headermenu
    When Dann fahre ich alle Menu mit dem Maus