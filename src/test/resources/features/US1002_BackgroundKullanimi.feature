Feature: US1002 Kullanici ortak adimlari Background ile calisilir

    Background: ortak adimlari
      Given kullanici amazon anasayfasinda

      Scenario: TC04 amazon nutella arama
        And kullanici Nutella icin arama yapar
        Then sonuclarin Nutella icerdigini test eder
        And sayfayi kapatir

      Scenario: TC05 amazon java arama
        Then kullanici Java icin arama yapar
        And  sonuclarin Java icerdigini test eder
        And sayfayi kapatir