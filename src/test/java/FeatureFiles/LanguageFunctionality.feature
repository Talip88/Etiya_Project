Feature: Language Functionality
  Scenario: Change the language
    Given Navigate to Etiya WebSite
    When Click language button
      | languageButton   |
      | turkish |
    Then User should be able to change language