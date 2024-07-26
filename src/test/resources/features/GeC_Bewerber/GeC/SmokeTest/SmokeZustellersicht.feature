Feature: Navigation-Menü Runter Überprüfen

  Scenario: Die Seiten unter dem Navigationsmenü testen
    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button                           | Neues Fenster | Verifizierung |
      | News                             | nein          |               |
      | Nachrichten                      | nein          |               |
      | Bezirk                           | ja            |               |
      | Zeiterfassung                    | nein          |               |
      | Zeitnachmeldung                  | nein          |               |
      | Abwesenheit                      | nein          |               |
      | Störmeldungen                    | nein          |               |
      | Lohn                             | nein          |               |
      | Kostenerstattung                 | nein          |               |
      | Downloads                        | nein          |               |
      | Jobs                             | nein          |               |
      | Umfragen                         | nein          |               |
      | Schulung und Einarbeitung        | nein          |               |
      | Tourenabfahrtszeiten             | nein          |               |
      | Wetter                           | nein          |               |
      | Formulare                        | nein          |               |
      | Fahrtenbuch                      | nein          |               |
      | Betriebsmittelverwaltung         | nein          |               |
      | Stellen                          | ja            |               |
      | Interaktive Karte - alle Bezirke | nein          |               |
      | Stammdaten ändern                | nein          |               |
      | Passwort ändern                  | nein          |               |
      | Impressum                        | nein          |               |
      | Kontakt                          | nein          |               |
      | Datenschutz                      | nein          |               |
      | Abmelden                         | ja            |               |


