package fr.eni.bdd;

import fr.eni.beans.Utilisateur;

public interface UtilisateurDao {
	
    void creer( Utilisateur utilisateur ) throws DAOException;

    Utilisateur trouver( String email ) throws DAOException;

}