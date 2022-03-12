Feature: AddProduct on Amazon

  @E2E

  Scenario: Amazon shopping Page
    Given User  Open the Browser and Enter Url
    Then User click on search box
    Then User enter "2020+Newest+Dell+Inspiron+15+3000+PC+Laptop" for product search
    Then User click on search
    Then User click on DellInsiron Product
    Then User click on Add to Cart
    Then User is on HomePage


