
Feature: Automation ZiP Dowloands teste als GL und überprüfe Zustellersicht

  Scenario:Teste die Tabs auf der ZiP-Download-Seite und validiere sie auf der Zustellersicht-Seite
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
  Then Ich sehe auf der Seite unter der Button "sabris GeC"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Downloads"
    Then  Ich sehe auf der Seite unter der Button "ZiP - Downloads"
    #And Ich klicke auf die Download Dropdown
    And Ich klicke die Schaltfläche "Ausklappen"
    Then  Ich sehe auf der Seite unter der Button "ZiP - Downloads"
    And Ich klicke kunden akte
