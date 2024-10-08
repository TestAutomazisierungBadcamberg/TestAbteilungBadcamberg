@löschen
Feature: Auf der Zusteller-Seite eine der von mir angelegte Nachricht löschen

  Scenario:Auf der Zusteller-Seite eine Nachricht für einen der ausgewählten Gebietsleiter anlegen und löschen

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
    When Ich klicke auf die Checkbox auf der ZiP-Seite
    And Ich klicke die Schaltfläche "Löschen"
    And Ich klicke auf der Seite der Button "OK"


  Scenario:Als GL eine Nachricht für alle Gesellschaften anlegen

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
    Then Ich sehe auf der Seite unter der Button "Nachrichten"
    When Ich klicke die Schaltfläche "Neue Nachricht"
    And Ich fülle alle Felder für alle Gesellschaften aus, um eine Nachricht zu erstellen
    And Ich sende eine Nachricht
    Then Ich sehe auf der ZiP Seite "NachrichtErfolgsmeldung"

  Scenario:Auf der Zusteller-Seite die von GL angelegte Nachrichten löschen

    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button      | Neues Fenster | Verifizierung                | Assertion   |
      | Nachrichten | nein          | NachrichtenButtonPosteingang | Nachrichten |

    And Ich klicke die Schaltfläche "Suchen"
    When Ich schreibe in das Suchfeld den von Zusteller ausgegebenen Betreff
    And Ich klicke auf der Seite der Button "Ok"
    Then Ich prüfe, ob die Nachricht angezeigt wird
    When Ich klicke auf die Checkbox auf der ZiP-Seite
    And Ich klicke die Schaltfläche "Löschen"
    And Ich klicke auf der Seite der Button "OK"
