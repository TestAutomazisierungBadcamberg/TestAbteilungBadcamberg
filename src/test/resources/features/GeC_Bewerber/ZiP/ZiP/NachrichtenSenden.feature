@gl
Feature: Als GL eine Nachricht erstellen und prüfen, ob die Zustelleransicht angezeigt wird


  Scenario:Als GL eine Nachricht erstellen

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
    Then Ich sehe auf der Seite unter der Button "Nachrichten"
    When Ich klicke die Schaltfläche "Neue Nachricht"
    And Ich fülle alle Felder aus, um eine Nachricht zu erstellen


  Scenario:Als Zusteller prüfen, ob die von GL angelegte Nachricht angezeigt wird
    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button      | Neues Fenster | Verifizierung                | Assertion   |
      | Nachrichten | nein          | NachrichtenButtonPosteingang | Nachrichten |
    And Ich klicke die Schaltfläche "Suchen"
    When Ich schreibe in das Suchfeld den von GL ausgegebenen Betreff

