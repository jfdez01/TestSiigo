#Author: jhmf01@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@PageFalabella

Feature: Prueba Siigo

@SearchFalabella @PageFalabella
Scenario: Busqueda Falabella en Google
Given I want to enter the Google website
When I search for the word Falabella
Then I select the first item the search

@AddBagProduct @PageFalabella
Scenario: Agregar Producto a la bolsa
Given I want to login to web page FALABELLA
When I add a product to the bag
Then I validate that the product was added to the bag

@ExtendedWarranty @PageFalabella
Scenario: Agregar dos productos con garantia extendida
Given I want to login to web page FALABELLA
When I add two product to the bag
Then I validate that the products was addeds to the bag

@ShippingPrice @PageFalabella
Scenario: Precio de Envio
Given I want to login to web page FALABELLA
When I add two products to the bag
Then I validate the shipping price of the products