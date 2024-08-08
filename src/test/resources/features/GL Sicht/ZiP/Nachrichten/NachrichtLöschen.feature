@abc
Feature: Als GL eine Nachricht löschen

  Scenario:Als GL eine Nachricht anlegen und löschen

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
    When Ich klicke auf der ZiP Seite "NachrichtenReiterGesendet"
    And Ich klicke die Schaltfläche "Suchen"
    When Ich schreibe in das Suchfeld den von GL ausgegebenen Betreff
    Then Ich prüfe, ob die Nachricht angezeigt wird
    When Ich klicke auf die Checkbox auf der ZiP-Seite
    And Ich klicke die Schaltfläche "Löschen"
    And Ich klicke auf der Seite der Button "OK"
