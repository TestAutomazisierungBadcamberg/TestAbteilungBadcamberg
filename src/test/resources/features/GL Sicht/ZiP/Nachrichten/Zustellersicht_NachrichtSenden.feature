@sdf
Feature: Als zusteller eine Nachricht erstellen und senden

  Scenario:Auf der Zusteller-Seite eine Nachricht für einen der ausgewählten Gebietsleiter anlegen

    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button      | Neues Fenster | Verifizierung                | Assertion   |
      | Nachrichten | nein          | NachrichtenButtonPosteingang | Nachrichten |

    When Ich klicke die Schaltfläche "Neue Nachricht"
    And Ich fülle alle Felder für  einen der ausgewählten Gebietsleiter aus, um eine Nachricht zu erstellen
    And Ich sende eine Nachricht
    Then Ich sehe auf der ZiP Seite "NachrichtErfolgsmeldung"
    When Ich klicke auf der ZiP Seite "ZustellersichtNachrichtenReiterGesendet"
    And Ich klicke die Schaltfläche "Suchen"
    When Ich schreibe in das Suchfeld den von Zusteller ausgegebenen Betreff
    And Ich klicke auf der Seite der Button "Ok"
    Then Ich prüfe, ob die Nachricht angezeigt wird

    Scenario: Ich prüfe, ob die Nachricht auf der GL- Seite angezeigt wird
      Given Ich melde mich als GL "url_TS2_GL"
      Then Ich sehe auf der Seite Dashboard
      And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
      Then Ich sehe auf der Seite unter der Button "sabris GeC"
      And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
      Then Ich sehe auf der Seite unter der Button "Nachrichten"
      And Ich klicke die Schaltfläche "Suchen"
      When Ich schreibe in das Suchfeld den von Zusteller ausgegebenen Betreff
      And Ich klicke auf der Seite der Button "Ok"
      Then Ich prüfe, ob die Nachricht angezeigt wird





