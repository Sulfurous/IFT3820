import java.util.Scanner;
public class TP1 {
    public static void main(String args[]) {
        boolean choixEstAccepter = false;
        Scanner input = new Scanner(System.in);
        boolean quitter = false;
        int choix =-1;
        while(!quitter){
            afficherMenu();
            choix = new Scanner(System.in).nextInt();
            System.out.println(choix);
            switch (choix){
                case 1:
                //Option1();
                System.out.println("Option1");
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
/*Bareme
//I. Option 1:	(28 pts)	
//		1- demande et utilisation adresse/port				4
//		2-connexion au serveur						5
//		3-flux entrant/ flux sortant (client et serveur)			6
//		4-Envoi option + réception acquittement du serveur		8
//		5-fermeture de connexion					4

//II. Option 2:	(36 pts)
//		1-connexion et envoi option/acquittement			3
//		2-Envoi nom fichier et ajout de "_cp" du coté serveur		4
//		3-envoi fichier ligne par ligne 				              8
//		4-acquittement + temporisateur			              8
//		5- perte au niveau serveur de la deuxième trame		5
//		6-perte au niveau client du  cinquième acquittement		5
//		7-déconnexion + acquittement					3

//III. Option 3:	(27 pts)
//		1-connexion et envoi option/acquittement			3
//		2-génération de la liste de fichier au niveau du serveur		8
//		3-envoi du contenu + réception acquittement serveur		7
//		4-affichage du coté client					6
//		5-déconnexion + acquittement					3

//VI. Autres:   (5 pts)
//		1-Lancement serveur pour écoute				3
//		2-Menu en boucle infinie		 			1
//		3-Option quitter						1*/

    public static boolean Quitter(){
        System.out.println("Voulez vous quitter? o/n");
        String input = new Scanner(System.in).nextLine();
        boolean quitter = input.equals("o");
        return quitter;
    }

    public static void afficherMenu(){
        System.out.println("*******Bienvenu*******");
        System.out.println("Menu :");
        System.out.println("1 : Tester connexion au serveur");
        System.out.println("2 : Transférer un fichier vers le serveur");
        System.out.println("3 : Lister le contenu du répertoire courant du serveur");
        System.out.println("4 : Quitter l’application");
        System.out.println("Faite votre choix :");
    }

    public static void Option1(){
//I. Option 1:	(28 pts)	
//		1- demande et utilisation adresse/port				4
//		2-connexion au serveur						        5
//		3-flux entrant/ flux sortant (client et serveur)	6
//		4-Envoi option + réception acquittement du serveur	8
//		5-fermeture de connexion					        4
    }
    public static void Option2(){
//II. Option 2:	(36 pts)
//		1-connexion et envoi option/acquittement			3
//		2-Envoi nom fichier et ajout de "_cp" du coté serveur		4
//		3-envoi fichier ligne par ligne 				              8
//		4-acquittement + temporisateur			              8
//		5- perte au niveau serveur de la deuxième trame		5
//		6-perte au niveau client du  cinquième acquittement		5
//		7-déconnexion + acquittement					3
    }
    public static void Option3(){
        }
}