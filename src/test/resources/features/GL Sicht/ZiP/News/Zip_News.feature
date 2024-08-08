
Feature: Automation ZiP News testen

  Scenario:Teste Anzeige  die Tabs auf der ZiP-News Seite
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


