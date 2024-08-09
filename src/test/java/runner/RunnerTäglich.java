package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {
                "src/test/resources/features/GL Sicht/GeC/Bewerber/01_GeC_Bewerber_Anlegen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/02_GeC_Bewerber_ErgebnisÄndern.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/15_GeC_Bewerber_Bearbeiten.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/03_GeC_Bewerber_FiltereNachLiferunde.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/04_GeC_Bewerber_PersonÄndern.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/05_GeC_Bewerber_Sortierung.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/06_GeC_Bewerber_ReiterMitMaus.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/07_GeC_Bewerber_KommentarErfasse.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/08_GeC_Bewerber_Kommentare.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/09_GeC_Bewerber_KommentarÄndern.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/10_GeC_Bewerber_KommentarLöschen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/12_GeC_Bewerber_Zurückbutton.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/13_GeC_BewerberVorlagen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/14_GeC_Bewerber_VorlageEmfängerAuswählen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/18_GeC_Bewerber_StatistikÖffnen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/19_GeC_Bewerber_StatistikenDoughnutsmenu.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/20_GeC_Bewerber_StatistikDropdownLines.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/21_GeC_Bewerber_StatistikDropdownDoughnut.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/24_GeC_Bewerber_StatistikZurückNavigieren.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/27_GeC_Bewerber_MitarbeiterAnlegen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/29_GeC_Bewerber_Bezirkszuweisung.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/30_GeC_Bewerber_Bezirkzuweisungöffnen.feature",
                "src/test/resources/features/GL Sicht/GeC/Bewerber/32_GeC_Bewerber_Löschen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/NachrichtLöschen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/NachrichtSenden.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/NachrichtSendenAnZustellerUndPrüfen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/Scrollen.feature",
                "src/test/resources/features/GL Sicht/ZiP/News/ZiP_Anlegen.feature",
                "src/test/resources/features/GL Sicht/ZiP/News/Zip_News.feature",
                "src/test/resources/features/GL Sicht/ZiP/News/ZiP_Reiterzahl.feature"

        },
        glue = {"stepDefinition"},
        plugin = {
                "json:test-output/cucumber-reports/cucumber.json",
                "html:S:\\\\sabris_intern\\\\TestAutomatisierung\\\\cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerTäglich extends AbstractTestNGCucumberTests {
}
