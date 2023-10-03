#Author: Arialdys

 Feature: Mercado Libre Country
    Navigate and filter items by category & country

  @Perfumes
    Scenario: Navigate and select Perfume
    Given I open CHROME
    And I navigate to Mercado Libre
    And Select country
    And Move to Categories
    And Select Category Perfumes
    And Click Subcategory Perfumes
    And Filter by Location
    Then Select Perfume Item


