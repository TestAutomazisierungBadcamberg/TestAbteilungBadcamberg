@wip
Feature: Bewerber Organisatorisches

  Scenario: Organisatorisches

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    When Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    When Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "anlegen"
    When Ich klicke die Schaltfläche "anlegen"
    And  Ich klicke auf die geöffnete Button Bewerber
    And  ich klicke auf das "NeuBewerberOrganisatorisches"






