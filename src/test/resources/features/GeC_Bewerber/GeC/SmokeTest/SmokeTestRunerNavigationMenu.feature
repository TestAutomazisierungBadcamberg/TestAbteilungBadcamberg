
Feature: Navigation-Menü Runter Überprüfen

  Scenario: Die Seiten unter dem Navigationsmenü testen
    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And  Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Suchen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Besetzungskarte"
    Then Ich sehe auf der Seite unter der Button "Schließen"
    When Ich sehe auf der GeC_Besetzungskarte Seite Einstellungen
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Besetzung (Ad-Hoc)"
    Then Ich sehe auf der GeC_Bewerber Seite "ZurukButton"
    And Ich klicke Bezirkbesetzung zurück Button
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Reklamationen"
    Then Ich sehe auf der GeC_Bewerber Seite "GeC_ReklamationTabelle"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Störungsmanagement"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterOffenStorungsmenagement"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Kartenanalyse"
    Then Ich sehe auf der Seite unter der Button "Anwendungsdokumentation"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Vertretung Gebietsleiter"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Filter"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Veränderungsmeldungen"
    Then Ich sehe auf der GeC_Bewerber Seite "KatchelVerkehrsmittel"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Ausnahmemanagement"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Neue Gruppe anlegen"

    And Ich klicke auf der linken Seite der MasterPage auf der Button "MeP"
    Then Ich sehe auf der Seite Mitarbeiter
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Mitarbeiter"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterNeuMitarbeiter"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Dispositionskalender"
    Then Ich sehe auf der Seite unter der Button "Heute"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Disposition"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Karte"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Produkt"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Änderungshistorie"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Position"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Position (Blockliste)"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Auftrag"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Erscheinungskalender"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Adressen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Urlaubskontingente"
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite News
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "News"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bezirke"
    And Ich klicke Bezirke zurück Button
    Then Ich sehe auf der Seite Bezirke
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Zeitnachmeldung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Zeiterfassung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Wochenarbeitszeit"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Abwesenheit"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Abwesenheitskalender"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Tourenabfahrtszeiten"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Downloads"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Jobs"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Zusteller"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Umfragen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Stellen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bezirkszuweisung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Formulare"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Fahrtenbücher"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Betriebsmittelverwaltung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bindungsmanagement"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Schulung und Einarbeitung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Schlüsselverwaltung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Interaktive Karte - alle Bezirke"
    Then Ich sehe auf der Seite unter der Button "Bestätigen"
    When Ich sehe auf der ZiP_Interakive Karte Seite Bestätigen
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Automatische Zustellbuchbereitstellung"

    And Ich klicke auf der linken Seite der MasterPage auf der Button "System"
    Then Ich sehe auf der Seite System
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Releasenotes"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Dokumentation"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nutzereinstellungen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Abmelden"






