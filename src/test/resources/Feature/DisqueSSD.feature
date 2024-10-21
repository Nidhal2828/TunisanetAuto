#Author: Nidhal
Feature: Disque SSD

  Scenario: add a product from the page Disque SSD
    Given user is on the page Disque SSD
    When user click on product "Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go"
    Then user is directed to product page and verif the name off product is "Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go"
