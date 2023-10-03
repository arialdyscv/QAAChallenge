Feature: Mercado Libre Country
  Navigate and filter items by category & country

@Celular
Scenario: Navigate and select Smartphone
Given I open CHROME
And I navigate to Mercado Libre
And Select country
And Move to Categories
And Hover Category Tecnologia
And Select Subcategory Celulares
And Select Celular Category
And Filter by Location
Then Select Celular Item