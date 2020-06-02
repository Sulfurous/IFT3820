import java.net.*;
import java.io.*;
import java.util.Scanner;

/**  TCPClient
 **  Utilisation:
 **  Lancer l'application par la commande java tcpClient <adresse IP du serveur> <port destination>
 **  Ins�rer une ligne et taper "entrer" pour l'envoyer au serveur
 **	 quitter l'application en tapant "."
 **/

public class TP1_Client 
{

	public static InetAddress adresse = null;
	public static int port = 1500;


/**
 * Methode qui affiche le menu des options disponibles et execute la methode demander par l'usager.
 * 
 */
	
	public static void valideParametres(final String[] args) {
		if (args.length == 2) {
			// adresse
			try {
				adresse = InetAddress.getByName(args[0]);
			} catch (final UnknownHostException e) {
				System.out.println("\nL'adresse du serveur est invalide.");
				System.out.println("L'adresse 127.0.0.1 sera utiliser par defaut.\n");
			}

			// port
			try {
				port = Integer.parseInt(args[1]);
			} catch (final Exception e) {
				System.out.println("\nLe numero de port est invalide.");
				System.out.println("Le port 1500 sera utiliser par defaut.\n");
				port = 1500;
			}
		}

		// on assigne l'adresse si ceci n'a pas encore ete fait un parametre
		if (adresse == null) {
			try {
				adresse = InetAddress.getByName("127.0.0.1");
			} catch (final UnknownHostException e) {
				System.out.print(e);
				System.exit(1);
			}
			port = 1500;
		}

	}

	public static boolean Quitter() {
		System.out.println("Voulez vous quitter? o/n");
		final String input = new Scanner(System.in).nextLine();
		final boolean quitter = input.equals("o");
		return quitter;
	}

	public static void afficherMenu() {
		System.out.println("*******Bienvenu*******");
		System.out.println("Menu :");
		System.out.println("1 : Tester connexion au serveur");
		System.out.println("2 : Transférer un fichier vers le serveur");
		System.out.println("3 : Lister le contenu du répertoire courant du serveur");
		System.out.println("4 : Quitter l’application");
		System.out.println("Faite votre choix :");
	}

	public static void methode1() {
		/// public static void methode1(InetAddress adresse, int port){

		boolean didConnect = false;
		Socket socket = null;
		BufferedReader input;

		System.out.println("\nEtablissement de connexion vers : " + adresse.getHostAddress() + ":" + port
				+ ", veuillez patienter...");
		do {
			try {
				socket = new Socket(adresse, port);
				System.out.println("Connecter au serveur " + socket.getInetAddress() + ":" + socket.getPort());
				input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				final String message = input.readLine();
				if (message == null)
					System.out.println("Contenu du message recu est vide.");
				System.out.println("Message provenant du serveur: " + message);
				didConnect = true;

			} catch (final UnknownHostException e) {
				System.out.println("\nServeur " + adresse + ":" + port + " inconnu.");
				// Si serveur inconnu, la fonction arrete ici.
			} catch (final SocketException e) {
				System.out.println("Aucun serveur detecter a : " + adresse + ":" + port);
				System.out.println(
						"Le programme va arreter son execution pour qu'une adresse et un port valide puisse etre utiliser.");
				System.exit(1);
			} catch (final IOException e) {
				System.out.println("Erreur: " + e);
				return;
			}
		} while (didConnect == false);

		// Test fut completer avec succes. Fermeture du socket.
		try {
			System.out.println(
					"fermeture de connexion avec le serveur " + socket.getInetAddress() + ":" + socket.getPort());
			socket.close();
		} catch (final IOException e) {
			System.out.println("Erreur lors de la fermeture du socket: " + e);
		}

	}

	public static void main(String args[]) {

		valideParametres(args);
        boolean choixEstAccepter = false;
        Scanner input = new Scanner(System.in);
        boolean quitter = false;
        int choix =-1;
        while(!quitter){
            afficherMenu();
            choix = new Scanner(System.in).nextInt();
            //System.out.println(choix);
            switch (choix){
                case 1:
                methode1();
                break;
                case 2:
                //Option2();
                System.out.println("Option2");
                break;
                case 3:
                //Option3();
                System.out.println("Option3");
                break;
                case 4:
                quitter = true;
                System.out.println("Bye bye");
                break;
                default:
                System.out.println("Reéssayez");
            }
        }
    }


		
		// si l'adresse et le port sont donn�s en argument!!
		
		
		
		//connexion au serveur
		
	
		//Envoi de message texte au serveur
	/*
		try 
		{
			//les �changes avec le ssocket serveur se font � travers impout et output
			input = new BufferedReader(new InputStreamReader(System.in)); 
			output = new PrintWriter(socket.getOutputStream(),true);
			
			// on envoi le message ins�r� sur console
			while(true) 
			{
				lineToBeSent = input.readLine();
				
				// arr�t si ligne= "."
				if(lineToBeSent.equals("."))
				{
					break;
				}
				output.println(lineToBeSent);
			}
		}
		catch (final IOException e) 
		{
			System.out.println(e);
		}

		try 
		{
			System.out.println("fermeture de connexion avec le serveur " +
							socket.getInetAddress()+
							":" + socket.getPort());
			socket.close();
		}
		catch (final IOException e) 
		{
			System.out.println(e);
		}*/

	}
