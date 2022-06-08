Feature: US1011 Web tablosundaki istenen sutunu yazdırma
@guru
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli




    Given kullanici "guruUrl" anasayfasindan
    And   "Company"  sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir