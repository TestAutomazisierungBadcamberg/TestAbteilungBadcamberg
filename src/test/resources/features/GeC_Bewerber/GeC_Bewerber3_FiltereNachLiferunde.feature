@klickTest
Feature: Filtere nach Liferunde
  Scenario: Filter Option überprüfen, ob nach Lieferrunde gefiltert wird
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Filterung"
    And Ich klicke die Schaltfläche "Filterung"
    Then Ich sehe auf der GeC_Bewerber Seite "FilternDialogFensterLieferrunde"
    When Ich klicke auf der Seite GeC_Bewerber auf den Button "FilternDialogFensterLieferrunde"
    And Ich klicke auf das Checkbox TZU
    Then Ich überprüfe ob sich in der Bewerberliste etwas ändert



