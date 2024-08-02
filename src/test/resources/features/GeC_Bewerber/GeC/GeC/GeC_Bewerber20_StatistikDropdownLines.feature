@klickTest
Feature:Öffnen der Statistik Dropdown-Menü von Lines

  Scenario:Dropdownmenü von Lines öffnen

    Given Ich melde mich als GL "url_TS2_GL"
    Then Ich sehe auf der Seite Dashboard
    And Ich klicke auf der linken Seite der MasterPage auf der Button "GeC"
    Then Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC
    And Ich klicke auf die Drop-Down-Menüs der Schaltfläche "Bewerber"
    Then Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche "Statistik"
    And Ich klicke die Schaltfläche "Statistik"
    When Ich klicke auf der Seite der Button "Lines"
    And Ich klicke auf den Reiter "StatistikLinesDropdownMenu"
