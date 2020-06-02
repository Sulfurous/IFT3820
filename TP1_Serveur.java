// TP1_Serveur.java 

// usage : java TP1_Serveur <port number>.
// default port is 1500.
// connection to be closed by client.
// this server handles only 1 connection.

import java.net.*;
import java.io.*;

/**  TP1_Serveur
 **  Utilisation:
 **  Lancer l'application par la commande java TP1_Serveur <port d'ecoute>
 **  Le serveur reste en attente d'un client. Quand la connexion est etablie, 
 **  il va afficher les messages envoyees par ce client
 **	 quitter l'application avec ctrl+C
 **/

public class TP1_Serveur 
{
    
    public static void main(String args[]) 
	{
	
		int port=1500;
		ServerSocket socket_serveur;
		BufferedReader input;
		PrintWriter output;
		
		System.out.println("\n\n*********************************");
		System.out.println("***********Serveur***************");
		System.out.println("*********************************\n\n");
		
		// si le port est donner en argument!!
		if(args.length == 1) 
		{
			try 
			{ 
				port = Integer.parseInt(args[0]);
			}
			catch (Exception e) {
				System.out.println("port d'ecoute= 1500 (par defaut)");
				port = 1500;
			}
		}
		
		
		//Ouverture du socket en attente de connexions
		try 
		{
			socket_serveur = new ServerSocket(port);
			System.out.println("Serveur en attente de clients sur le port " + 
					   socket_serveur.getLocalPort());
			
			// boucle infinie: traitement d'une connexion client
			while(true) 
			{
				Socket socket = socket_serveur.accept();
				System.out.println("nouvelle connexion acceptee " +
						   socket.getInetAddress() +
						   ":" + socket.getPort());
				input = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
				

				try 
				 {
          // Envoie du message de connexion pour Question 1.
					output = new PrintWriter(socket.getOutputStream(),true);
					output.println("Connexion reussie. Bienvenue !");
				 }
				 catch (IOException e) 
				 {
				 	System.out.println("Erreur while sending message to client: "+e);
				 }
          // Inserez le code supplementaire ici pour question 2 et 3
				
			}
			
			
		}
		catch (IOException e) 
		{
			System.out.println(e);
		}
    }
}
