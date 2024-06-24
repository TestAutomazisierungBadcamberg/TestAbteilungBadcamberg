
Feature: Kommenter löschen

  Scenario: Löschen eines Kommentar

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
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterKommentar"
    When Ich klicke auf den Reiter "ReiterKommentar"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterKommentarInDemKommentarSteht"
    When Ich lösche einen Kommentar
    Then Ich sehe auf der GeC_Bewerber Seite "KommentarAlertMeldung"