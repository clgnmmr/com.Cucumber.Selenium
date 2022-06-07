# otel my camp sitesinde 3 adet negative test seneryosu olusturalım
  #1 dogru username yanlıs password
  #2 yanlıs username dogru password
  #3 yanlıs username yanlıs password

  Feature: US1006 Yanlis bilgilerle siteye giris yapilamaz
    Scenario:TC09 yanlıs password ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasindan
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapılamadigini test eder
      And  sayfayi kapatir


      Scenario: TC10  yanlis kullanici adı ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasindan
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapılamadigini test eder
      And  sayfayi kapatir

        Scenario: TC11 yanlıs kullanıcı adı ve yanlıs sifre  ile giris yapilamaz
          Given kullanici "HMCUrl" anasayfasindan
          Then Log in yazisina tiklar
          And gecersiz username girer
          And gecersiz password girer
          And Login butonuna basar
          Then sayfaya giris yapılamadigini test eder
          And  sayfayi kapatir