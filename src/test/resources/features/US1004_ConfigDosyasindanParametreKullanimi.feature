Feature:US1004 kullanıcı parametre ile configuration file'i kullanabilmeli
  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanabilmeli

    Given kullanici "amazonUrl" anasayfasindan
    Then kullanici 5 sn bekler
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir