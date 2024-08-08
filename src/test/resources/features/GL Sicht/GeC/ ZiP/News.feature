@klickTest
Feature: Automation ZiP News testen

  Scenario:Teste die Tabs auf der ZiP-News-Seite
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "News"
    Then  Ich sehe auf der Seite unter der Button "News"
    And Ich klicke auf der ZiP-maske Aktuell
    Then  Ich sehe auf der Seite unter der Button "News"
    And Ich klicke auf der ZiP-maske Archiv
    Then  Ich sehe auf der Seite unter der Button "News"
    And Ich klicke auf der ZiP-maske Aktuell
    Then  Ich sehe auf der Seite unter der Button "News"
    And Ich klicke die Schaltfläche "Anlegen"
    Then  Ich sehe auf der Seite unter der Button "Speichern"
    And Ich klicke auf der News-dropdown menu
    Then  Ich sehe auf der Seite unter der Button "Speichern"
    And Ich klicke  auf der Gesellschaftenoption Button
    And Ich klicke auf die Geselschaften auswahlen Button
    And Ich klicke auf der Seite der Button "Ok"
    When Ich fülle das Titelfeld aus
    Then  Ich sehe auf der Seite unter der Button "Textkörper"
   # When Ich fülle das Textkörperfeld aus
    And Ich klicke auf der Seite der Button "Speichern"
    Then  Ich sehe auf der Seite unter der Button "News"
    And Ich klicke die Schaltfläche "Anlegen"
    And Ich klicke auf der News-dropdown menu
    When Ich fülle das Titelfeld aus
    Then  Ich sehe auf der Seite unter der Button "Textkörper"
    And Ich klicke auf der Seite der Button "Speichern"
