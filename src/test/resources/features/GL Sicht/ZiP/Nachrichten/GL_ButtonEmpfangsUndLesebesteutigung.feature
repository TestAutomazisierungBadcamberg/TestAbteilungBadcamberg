@saa
Feature: Die Daten, wann die Nachricht empfangen und gelesen wurde, werden korrekt zur Verfügung gestellt

  Scenario:Auf der GL-Seite eine Nachricht erstellen

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
    Then Ich sehe auf der Seite unter der Button "Nachrichten"
    When Ich klicke die Schaltfläche "Neue Nachricht"
    And Ich fülle alle Felder für den Zusteller aus, um eine Nachricht zu erstellen
    And Ich sende eine Nachricht
    Then Ich sehe auf der ZiP Seite "NachrichtErfolgsmeldung"


  Scenario:Auf der Zusteller-Seite klicke ich auf die Nachricht, um zu prüfen, ob die Meldung auf der Seite angezeigt wird

    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button      | Neues Fenster | Verifizierung                | Assertion   |
      | Nachrichten | nein          | NachrichtenButtonPosteingang | Nachrichten |
    And Ich klicke die Schaltfläche "Suchen"
    When Ich schreibe in das Suchfeld den von GL ausgegebenen Betreff
    And Ich klicke auf der Seite der Button "Ok"
    Then Ich prüfe, ob die Nachricht angezeigt wird
    When Ich klicke auf die Nachrichten
    Then Ich sehe auf der ZiP Seite "NachrichtBesteutigungsMeldung"
    And Ich klicke auf der Seite der Button "OK"
    And Ich klicke auf der Seite der Button "OK"





