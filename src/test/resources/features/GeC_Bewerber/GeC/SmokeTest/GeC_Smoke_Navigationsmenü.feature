
Feature: Navigation-Menü überprüfen

  Scenario: Die Seiten unter dem Navigationsmenü auf Fehlermeldung überprüfen
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Suchen"
    And Ich klicke die Schaltfläche "Suchen"
    And Ich schreibe in das Suchfeld den gewünschten Bewerber, den ich ändern möchte
    And Ich klicke auf der Button OK, nachdem ich in das Feld Suche die gewünschten Bewerber eingegeben habe
    Then Ich sehe die von mir angelegte Bewerber
    And Ich klicke auf den Bewerber
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterHR"
    And Ich klicke  Reiter auf der Button "ReiterHR"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterOrganisatorisches"
    And Ich klicke  Reiter auf der Button "ReiterOrganisatorisches"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterVorlagen"
    And Ich klicke  Reiter auf der Button "ReiterVorlagen"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterBezirkszuweisung"
    And Ich klicke  Reiter auf der Button "ReiterBezirkszuweisung"
    And Ich klicke auf der Zurücknavigation Button
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterDokumente"
    And Ich klicke  Reiter auf der Button "ReiterDokumente"
    And Ich klicke auf der Dokumente Zurücknavigation Button
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterKommentar"
    And Ich klicke  Reiter auf der Button "ReiterKommentar"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterHistorie"
    And Ich klicke  Reiter auf der Button "ReiterHistorie"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterMerkmale"
    And Ich klicke  Reiter auf der Button "ReiterMerkmale"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Besetzungskarte"
    When Ich sehe auf der GeC_Besetzungskarte Seite Einstellungen
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Besetzung (Ad-Hoc)"
    And Ich klicke Bezirkbesetzung zurück Button

    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Reklamationen"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Störungsmanagement"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Kartenanalyse"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Vertretung Gebietsleiter"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Veränderungsmeldungen"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Ausnahmemanagement"
    And Ich klicke auf der linken Seite der MasterPage auf der Button "MeP"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC





