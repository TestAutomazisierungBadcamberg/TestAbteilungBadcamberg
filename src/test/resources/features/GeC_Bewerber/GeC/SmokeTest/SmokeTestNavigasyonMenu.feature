@klickTest
Feature: Navigation-Menü SmokeTest

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
    Then Ich sehe auf der GeC_Bewerber Seite "ZuruckButtonBezirk"
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
