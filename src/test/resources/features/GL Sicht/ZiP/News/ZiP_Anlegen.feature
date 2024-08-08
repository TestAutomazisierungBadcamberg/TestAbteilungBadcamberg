@klickTest121
Feature:ZiP News Seite Anlegen

  Scenario:Teste Anlegen auf der ZiP News Seite
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "News"
    Then Ich sehe auf der Seite unter der Button "News"
    And Ich klicke die Schaltfläche "Anlegen"
    Then  Ich sehe auf der Seite unter der Button "Speichern"
    And Ich klicke auf der News-dropdown menu
    Then  Ich sehe auf der Seite unter der Button "Speichern"
    And Ich klicke auf der News-dropdown menu
    And Ich klicke  auf der Gesellschaftenoption Button
    And Ich klicke auf die Geselschaften auswahlen Button
    And Ich klicke auf der Seite der Button "Ok"
    When Ich fülle das Titelfeld aus
    And Ich klicke auf der Seite der Button "Speichern"