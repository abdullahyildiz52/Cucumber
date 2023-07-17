

Feature: Amazonda  toplu olarak verilen kelimeleri aratir

  Scenario Outline: TC13 Kullanici Listedeki tum urunler icin testi tekrarlayabilmeli
    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "<aracakaKelime>" yazip, ENTER tusuna basar
    And arama sonuclarinin "<aracakaKelime>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
      |aracakaKelime |
      |Java     |
      |Samsung  |
      |Cannes   |
      |Nederland|




