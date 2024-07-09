@klickTest1
Feature:Bewerber einem Bezirk zuweisen

  Scenario:Weise einen Bewerber einem Bezirk zu

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Suchen"
    And Ich klicke die Schaltfläche "Suchen"
    And Ich schreibe in das Suchfeld den gewünschten Bewerber, den ich ändern möchte
    And Ich klicke auf der Button OK, nachdem ich in das Feld Suche die gewünschten Bewerber eingegeben habe
    Then Ich sehe die von mir angelegte Bewerber
    And Ich klicke auf den Bewerber
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterHR"
    And Ich klicke auf den Reiter "ReiterHR"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterOrganisatorisches"
    And Ich klicke auf den Reiter "ReiterOrganisatorisches"
    Then Ich sehe auf der Seite unter der Button "Ändern"
    And Ich klicke auf der Seite der Button "Ändern"
    When Ich klicke auf den Reiter "ReiterOrganisatorischesButtonVerfugbarFur"
    And Ich wahle auf der Liste Tageszeitung
    When Ich klicke auf der Seite der Button "Speichern"
    Then Ich sehe auf der GeC_Bewerber Seite "ReiterBezirkszuweisung"
    When Ich klicke auf den Reiter "ReiterBezirkszuweisung"
    And Ich klicke auf der Seite der Button "Speichern"
    Then Ich sehe auf der Seite unter der Button "Karte laden"
    When Ich wahle ein Projekt aus
    And Ich klicke auf der Seite der Button "Karte laden"
