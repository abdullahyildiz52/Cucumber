Feature:  US1001 Nutella arama testi
  Scenario: TC01 kullanıcı Amazonda Nutella arayabilmeli

    Given kullanici amazon anasayfaya gider
    Then  arama kutusuna Nutella Yazip ENTER tusuna basar
    And   arama sonuclarinin Nutella icerdigini test eder
    And   sayfayi kapatir


  Scenario: TC02 kullanci amazonda Samsung aratabilmeli
    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Samsung Yazip ENTER tusuna basar
    And  arama sonuclarinin Samsung icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 kullanci amazonda Java aratabilmeli
    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Java Yazip ENTER tusuna basar
    And  arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir