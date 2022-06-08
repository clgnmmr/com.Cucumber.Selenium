# amazon sayfasında gidip siraiyle nutella ,java ,elma ,armut aratip

Feature: US1007 kullanici amazonda istedigi kelimeleri aratir
  @negative
  Scenario Outline: TC12 amazonda listedeki elementleri aratma

    Given kullanici "amazonUrl" anasayfasindan
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrolu>" icrdigini test eder
    And sayfayi kapatir



    Examples:
    |istenenKelime|istenenKelimeKontrolu|
    |nutella      |nutella              |
    |Java         |Java                 |
    |elma         |elma                 |
    |armut        |armut                |
