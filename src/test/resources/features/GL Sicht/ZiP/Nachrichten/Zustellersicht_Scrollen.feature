@scroll
Feature: Als Zusteller alle Nachrichten Scrollen

  Scenario: ich scrolle nach unten und oben
    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button      | Neues Fenster | Verifizierung                | Assertion   |
      | Nachrichten | nein          | NachrichtenButtonPosteingang | Nachrichten |
    When Ich scrolle nach unten und nach oben
    When Ich klicke auf der ZiP Seite "ZustellersichtNachrichtenReiterGesendet"
    And Ich scrolle nach unten und nach oben


