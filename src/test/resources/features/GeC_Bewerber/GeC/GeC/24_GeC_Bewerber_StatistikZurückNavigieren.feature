@klickTest
Feature: StatistikZurückNavigieren

  Scenario: Statistiken Zurück-Button Uberprufen

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Statistik"
    And Ich klicke die Schaltfläche "Statistik"
    Then Ich sehe auf der Seite unter der Button "Bewerber Statistik"
    And Ich klicke auf der Zurück-navigieren Button
    Then Ich sehe auf der Seite unter der Button "Bewerber Statistik"
    And Ich klicke die Schaltfläche "Statistik"
    And Ich klicke auf der Zurück-navigieren Button
    Then Ich sehe auf der Seite unter der Button "Bewerber Statistik"
    And Ich klicke die Schaltfläche "Statistik"





