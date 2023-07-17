
 @heroku
  Feature: US1009 kullanici olmayan bir webelementi test eder
    Scenario: TC15 olmayan butonu test edebilmeli

      Given kullanici "heroqaUrl" anasayfaya gider
      When  Add Element butona basar
      And   Delete butonu gorunur oluncaya kadar bekler
      Then  Delete butonunun gorunur oldugunu test eder
      And Delete butonuna basarak butonu siler
      And    Delete butonunun gorunmedigini test edin





