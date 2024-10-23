#Author: Med
Feature: Page dacceuil samsung

  Scenario Outline: Verification des menu de la page dacceuil
    Given Utilisateur est sur la page dacceuil
    When Utilisateur survole la souris sur le "<menu>"
    And clique sur le "<sous menu>"
    Then utilisateur est dirige vers la page "<sous menu>"

    Examples: 
      | menu           |  | sous menu   |
      | Électroménager |  | Climatiseur |
