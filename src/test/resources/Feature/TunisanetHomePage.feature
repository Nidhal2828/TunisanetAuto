Feature: Home Page of Tunisanet

  Scenario: Select a menu from the homepage
    Given the user is on the homepage
    When the user hovers over the "Stockage" menu and clicks on the "Disque SSD" submenu
    Then the user is redirected to the "Disque SSD" page
