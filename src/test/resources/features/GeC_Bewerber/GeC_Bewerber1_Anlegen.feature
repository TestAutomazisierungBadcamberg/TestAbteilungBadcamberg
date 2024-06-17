@klickTest
Feature: Bewerber Anlegen

  Scenario: neue Bewerber anlegen
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "anlegen"
    And Ich klicke die Schaltfläche "anlegen"
    And Ich klicke auf die geöffnete Button Bewerber
    And Ich fülle den Reiter Person aus
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe auf der Bewerberseite die bereits angelegte Bewerberliste
    Then





