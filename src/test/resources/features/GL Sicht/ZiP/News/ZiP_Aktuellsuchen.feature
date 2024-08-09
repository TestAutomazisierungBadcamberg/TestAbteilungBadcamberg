@klickTest12
Feature:der ZiP-News Seite Actuell Suchen
  Scenario:Teste Aktuell Suchen der ZiP-News Seite

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "News"
    Then Ich sehe auf der Seite unter der Button "News"
    And Ich klicke die Schaltfläche "Suchen"
    When Ich gebe den Text in dem Suchfeld ein
    And Ich klicke auf der Seite der Button "Ok"