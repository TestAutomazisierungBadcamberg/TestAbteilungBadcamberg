@smoke
Feature: Navigation-Menü Runter Überprüfen

  Scenario: Die Seiten unter dem Navigationsmenü testen
    Given Ich melde mich als Zusteller "url_TS2_Dortmund_Zusteller"
    When Ich klicke auf jede der Buttons im Navigationsmenü
      | Button                           | Neues Fenster | Verifizierung                    |
      | News                             | nein          | News                             |
      | Nachrichten                      | nein          | NachrichtenButtonPosteingang     |
      | Bezirk                           | ja            | ButtonZuruckBezirk               |
      | Zeiterfassung                    | nein          | ZeiterfassungButtonTimer         |
      | Zeitnachmeldung                  | nein          | ZeitnachmeldungButtonHinzufugen  |
      | Abwesenheit                      | nein          | AbwesenheitSuchfeld              |
      | Störmeldungen                    | nein          | StormeldungenButtonAktualisieren |
      | Lohn                             | nein          | LohnReiterAktuell                |
      | Kostenerstattung                 | nein          | KostenerstattungButtonanlegen    |
      | Downloads                        | nein          | DownloadsSuchfeld                |
      | Jobs                             | nein          | JobsSuchfeld                     |
      | Umfragen                         | nein          | SchulungButtonSuchen             |
      | Schulung und Einarbeitung        | nein          | TourenabfahrtszeitenReiter       |



