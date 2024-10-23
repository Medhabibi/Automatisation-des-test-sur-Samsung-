# Author: MED BEN SALHA
Feature: Ajouter au panier

  Scenario: Vérification de l'ajout au panier
    Given Utilisateur est sur la page du produit "Climatiseur"
    When Utilisateur ajoute le produit au panier
    And Utilisateur accede au panier
    Then Utilisateur verifie que le produit est bien ajouté au panier
