@kliki
Feature: Mitarbeiter Anlegen

  Scenario: neue Bewerber anlegen
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "anlegen"
    And Ich klicke die Schaltfläche "anlegen"
    And Ich klicke auf die geöffnete Button Mitarbeiter
    And Ich fülle den Reiter Person für Mitarbeiter aus
    And Ich klicke auf der linken Seite der MasterPage auf der Button "MeP"
    When Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Mitarbeiter"
    Then Ich sehe die von mir angelegte Bewerber
    When Ich klicke auf den Bewerber
    Then Ich sehe auf der Seite unter der Button "Ändern"
    And Ich klicke auf der Seite der Button "Ändern"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterHR"
    And Ich klicke auf der Seite GeC_Bewerber auf den Button "ReiterHR"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterOrganisatorisches"
    And Ich klicke auf der Seite GeC_Bewerber auf den Button "ReiterOrganisatorisches"
    And Ich wahle warteliste von Ergebnis Menu
    When Ich klicke auf der Seite der Button "Speichern"
    And Ich klicke auf der Seite der Button "OK"
    When Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Mitarbeiter"
    And Ich klicke auf den Reiter "MitarbeiterReiterInBearbeitung"
    Then Ich sehe die von mir angelegte Bewerber
    And Ich klicke die Schaltfläche "Suchen"
    And Ich schreibe in das Suchfeld den gewünschten Bewerber, den ich ändern möchte
    And Ich klicke auf der Button OK, nachdem ich in das Feld Suche die gewünschten Bewerber eingegeben habe
    When Ich lösche die von mir angelegte Mitarbeiter
    And Ich klicke die Schaltfläche "löschen"
    And Ich klicke auf der Seite der Button "OK"
    Then Ich sehe auf der Seite eine Minute die Meldung, dass die Löschung erfolgreich war
