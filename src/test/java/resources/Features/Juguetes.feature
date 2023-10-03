
  Feature: Mercado Libre Country
    Navigate and filter items by category & country

    @Juguetes
    Scenario: Navigate and select Juguetes 0 a 24 meses
    Given I open CHROME
    And I navigate to Mercado Libre
    And Select country
    And Move to Categories
    And Select Category Juegos
    And Click Subcategory Juguetes
    And Filter by Location
    And Select Juguete Item