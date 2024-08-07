@smoke
Feature: Navigation-Menü Runter Überprüfen

  Scenario: Die Seiten unter dem Navigationsmenü testen
    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button                           | Neues Fenster | Verifizierung                    | Assertion                 |
      | News                             | nein          | News                             | News                      |
      | Nachrichten                      | nein          | NachrichtenButtonPosteingang     | Nachrichten               |
      | Bezirk                           | ja            | ButtonZuruckBezirk               | Bezirk                    |
      | Zeiterfassung                    | nein          | ZeiterfassungButtonTimer         | Zeiterfassung             |
      | Zeitnachmeldung                  | nein          | ZeitnachmeldungButtonHinzufugen  | Zeiten                    |
      | Abwesenheit                      | nein          | AbwesenheitSuchfeld              | Abwesenheit               |
      | Störmeldungen                    | nein          | StormeldungenButtonAktualisieren | Störmeldungen             |
      | Lohn                             | nein          | LohnReiterAktuell                | Lohn                      |
      | Kostenerstattung                 | nein          | KostenerstattungButtonanlegen    | Kostenerstattung          |
      | Downloads                        | nein          | DownloadsSuchfeld                | Downloads                 |
      | Jobs                             | nein          | JobsSuchfeld                     | Jobs                      |
      | Umfragen                         | nein          | UmfragenButtonSuchen             | Umfragen                  |
      | Schulung und Einarbeitung        | nein          | SchulungButtonSuchen             | Schulung und Einarbeitung |
      | Tourenabfahrtszeiten             | nein          | TourenabfahrtszeitenReiter       | Tourenabfahrtszeiten      |
      | Wetter                           | nein          | WetterTabelle                    | Wetter                    |
      | Formulare                        | nein          | FormulareBezeichnungsfeld        | Formulare                 |
      | Fahrtenbuch                      | nein          | FahrtenbuchButtonHinzufugen      | Fahrtenbuch               |
      | Betriebsmittelverwaltung         | nein          | BetriebsmittelButtonBestellen    | Betriebsmittel            |
      | Stellen                          | ja            | ButtonZuruckStellen              | Bezirk                    |
      | Interaktive Karte - alle Bezirke | nein          | InteraktiveKarteButtonMenu       | Karte                     |
      | Button                           | Neues Fenster | Verifizierung                    | Assertion                 |
      | Stammdaten ändern                | nein          | StammdatenEundernButtonSpeichern | Speichern                 |
      | Passwort ändern                  | nein          | PasswordEundernPasswordsfeld     | Passwort ändern           |
      | Impressum                        | nein          | ImpressumTitel                   | Impressum                 |
      | Kontakt                          | nein          | KontaktTitel                     | Kontakt                   |
      | Datenschutz                      | nein          | DatenschutzTitel                 | Datenschutz               |
      | Abmelden                         | nein          | InteraktiveKarteButtonMenu       | ZiP                       |