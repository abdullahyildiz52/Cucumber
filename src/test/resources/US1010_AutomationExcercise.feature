 @wip
  Feature:US1010 kullanici hesap olurur

    Scenario: TC16 kullanici girdigi degerlerle hesap olusrabilmeli

      Given user web sayfasinda
      And user sign up linkine tiklar
      And user Create an account bölümüne email adresi girer
      And signUp butonuna basar
      And user kisisel bilgilerini ve iletisim bilgilerini girer
      And user Create Account butonuna basar
      Then hesap olustugunu test edin