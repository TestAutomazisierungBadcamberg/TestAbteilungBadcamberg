
Feature: Reiter mit Maus

  Scenario: Mit der Maus über die drei Reiter oben fahren
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe auf der GeC_Bewerber Seite "BewerberMaskeObenDreiReiter"
    When Ich fahre auf der Seite drei Reiter