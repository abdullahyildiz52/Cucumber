
@US1008
Feature: US1008 liste olarak verileen kullanicilar ile negatif login testi

  Scenario Outline: TC14 liste olarak verileen kullanicilar ile negatif login testi yapabilmeli
    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna "<kullaniciAdi>" yazar
    And password kutusuna "<password>" yazar
    When login butonuna basar
    And basarili olarak giris yapildigini test eder

    Then sayfayi kapatir

    Examples:
      | kullaniciAdi | password |
      | selgun | 12345 |
      | sevda | 56984 |
      | aysegul | 56987 |
      | murat | 6584945 |
      | abdullah | 894548 |
