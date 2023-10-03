Feature: Mercado Libre Country
  Navigate and filter items by category & country


@Textiles
Scenario: Navigate and select Textiles
Given I open CHROME
And I navigate to Mercado Libre
And Select country
And Move to Categories
And Select Category Industrias
And Click Subcategory Textiles
And Filter by Location
And Select Textiles Item



