#Author: MED
Feature: Climatiseur

  Scenario Outline: Verification page climatiseur
    Given Utilisateur dans la page Climatiseur
    When Utilisateur clique sur le produit "<produit>"
    Then Utilisateur est dans la page produit "<produit>"

    Examples: 
      | produit                                       |
      | Climatiseur Samsung 9000 BTU Digital Inverter |
     
