@SWP
Feature: Navigation-Menü Runter Überprüfen

  Scenario: Die Seiten unter dem Navigationsmenü testen
    Given Ich melde mich als GL "SWP_Url"
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
    When Ich klicke  Reiter auf der Button "ZurukButton"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Reklamationen"
    Then Ich sehe auf der GeC_Bewerber Seite "GeC_ReklamationTabelle"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Störungsmanagement"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterOffenStorungsmenagement"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Ausnahmemanagement"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Neue Gruppe anlegen"
    And Ich klicke auf der linken Seite der MasterPage auf der Button "MeP"
    Then Ich sehe auf der Seite Mitarbeiter
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Mitarbeiter"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterNeuMitarbeiter"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Dispositionskalender"
    Then Ich sehe auf der Seite unter der Button "Heute"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Produkt"
    Then Ich sehe auf der Seite unter der Button "Produkte"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Position"
    Then Ich sehe auf der Seite unter der Button "Positionen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Position (Blockliste)"
    Then Ich sehe auf der Seite unter der Button "Positionen (Blockliste)"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Auftrag"
    Then Ich sehe auf der Seite unter der Button "Aufträge"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Erscheinungskalender"
    Then Ich sehe auf der Seite unter der Button "Erscheinungskalender"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bruttolohnabrechnung"
    Then Ich sehe auf der Seite "KatchelAbrecnungsperiode"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Urlaubskontingente"
    Then Ich sehe auf der Seite unter der Button "Urlaubskontingente"
    And Ich klicke auf der linken Seite der MasterPage auf der Button "ZiP"
    Then Ich sehe auf der Seite News
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "News"
    Then  Ich sehe auf der Seite unter der Button "News"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nachrichten"
    Then Ich sehe auf der Seite unter der Button "Nachrichten"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bezirke"
    Then Ich sehe auf der Seite "ButtonZurukZiPBezirke"
    And Ich klicke auf den Reiter "ButtonZurukZiPBezirke"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Abwesenheit"
    Then Ich sehe auf der Seite unter der Button "Abwesenheit"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Abwesenheitskalender"
    Then Ich sehe auf der Seite unter der Button "Abwesenheitskalender"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Downloads"
    Then Ich sehe auf der Seite unter der Button "ZiP - Downloads"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Jobs"
    Then Ich sehe auf der Seite unter der Button "ZiP - Jobs"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Zusteller"
    Then Ich sehe auf der Seite unter der Button "ZiP - Zusteller"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bezirkszuweisung"
    Then Ich sehe auf der Seite unter der Button "Bezirkszuweisung"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Automatische Zustellbuchbereitstellung"
    And Ich klicke auf der linken Seite der MasterPage auf der Button "System"
    Then Ich sehe auf der Seite System
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Releasenotes"
    Then Ich sehe auf der Seite unter der Button "Releasenotes"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Dokumentation"
    Then Ich sehe auf der Seite unter der Button "Dokumentation"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Nutzereinstellungen"
    Then Ich sehe auf der Seite unter der Button "Nutzereinstellungen"
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Abmelden"



























