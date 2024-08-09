@klick889
Feature:ZiP News Bearbeiten

  Scenario:Teste Anzeige  die Tabs auf der ZiP-News Seite
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "News"
    Then  Ich sehe auf der Seite unter der Button "News"
    When Ich wähle mehr  Eintrags  dem Verlag aus
    And Ich klicke die Schaltfläche "Bearbeiten"
    And Ich klicke auf der Seite der Button "OK"
    When Ich wähle mehr  Eintrags  dem Verlag aus
    When Ich wähle einen Eintrag aus
    And Ich klicke die Schaltfläche "Bearbeiten"
    And Ich klicke auf der Seite der Button "Speichern"


