@nachric
Feature: Als GL Alle Nachrichten Scrollen
  Scenario: ich scrolle nach unten und oben
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite News
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
    Then Ich sehe auf der Seite unter der Button "Nachrichten"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Neue Nachricht"
    When Ich scrolle nach unten und nach oben

