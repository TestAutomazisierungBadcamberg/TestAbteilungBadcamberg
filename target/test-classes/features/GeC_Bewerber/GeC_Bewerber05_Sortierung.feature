
Feature: Sortierung nach diversen Kriterien auf- und absteigend

  Scenario: Sortierung Option überprüfen, ob sie funktioniert

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Sortierung"
    And Ich klicke die Schaltfläche "Sortierung"
    When Ich sortiere je nach Spalte
