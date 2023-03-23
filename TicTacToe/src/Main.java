import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variablen deklarieren
        char f1, f2, f3, f4, f5, f6, f7, f8, f9;
        int spieler;
        boolean gewonnen;


        // Variablen initialisieren
        f1 = '#';
        f2 = '#';
        f3 = '#';
        f4 = '#';
        f5 = '#';
        f6 = '#';
        f7 = '#';
        f8 = '#';
        f9 = '#';
        spieler = 1;
        gewonnen = false;


        // Spiel wird gestartet
        Scanner eingabe = new Scanner(System.in);
        while (gewonnen == false) {
            PrinteSpielfeld(f1, f2, f3, f4, f5, f6, f7, f8, f9);

            if (spieler == 1) { // Wenn Spieler 1 dran ist,
                System.out.println("Spieler 1 ist dran");
                int zug = eingabe.nextInt(); // Schaltet den Scanner für die nächste eingabe ein
                System.out.println("Sie haben Position " + zug + " Gewählt");

                // Prüfen welches Feld gewählt wurde

                switch (zug) {
                    case 1:
                        f1 = 'X';
                        break;
                    case 2:
                        f2 = 'X';
                        break;
                    case 3:
                        f3 = 'X';
                        break;
                    case 4:
                        f4 = 'X';
                        break;
                    case 5:
                        f5 = 'X';
                        break;
                    case 6:
                        f6 = 'X';
                        break;
                    case 7:
                        f7 = 'X';
                        break;
                    case 8:
                        f8 = 'X';
                        break;
                    case 9:
                        f9 = 'X';
                        break;


                }

            } else if (spieler == 2) { // Spieler zwei ist dran
                System.out.println("Spieler 2 ist dran");
                int zug = eingabe.nextInt(); // Schaltet den Scanner für die nächste eingabe ein
                System.out.println("Sie haben Position " + zug + " Gewählt");

                // Prüfen welches Feld gewählt wurde

                switch (zug) {
                    case 1:
                        f1 = 'O';
                        break;
                    case 2:
                        f2 = 'O';
                        break;
                    case 3:
                        f3 = 'O';
                        break;
                    case 4:
                        f4 = 'O';
                        break;
                    case 5:
                        f5 = 'O';
                        break;
                    case 6:
                        f6 = 'O';
                        break;
                    case 7:
                        f7 = 'O';
                        break;
                    case 8:
                        f8 = 'O';
                        break;
                    case 9:
                        f9 = 'O';
                        break;


                }


            } else{
                System.out.println("Spiel Kaputt");
                gewonnen = true;
            }

            // Überprüfen ob gewonnen wurde

            if (f1==f2 && f1==f3 && f1 != '#'){
                gewonnen = true;

            } else if (f4==f5 && f4==f6 && f4 != '#'){
                gewonnen = true;


            }else if (f7==f8 && f7==f9 && f7 != '#'){
                gewonnen = true;


            }else if (f1==f4 && f1==f7 && f1 != '#'){
                gewonnen = true;


            }else if (f2==f5 && f2==f8 && f2 != '#'){
                gewonnen = true;


            }else if (f3==f6 && f3==f9 && f3 != '#'){
                gewonnen = true;


            }else if (f1==f5 && f1==f8 && f1 != '#'){
                gewonnen = true;


            }else if (f7==f5 && f7==f3 && f7 != '#'){
                gewonnen = true;


            }else{

            }

            if(gewonnen == true){
                System.out.println("Spieler " + spieler + " Hat gewonnen!");
                PrinteSpielfeld(f1, f2, f3, f4, f5, f6, f7, f8, f9);
            } else{

            }




            // Spieler wechseln

            if (spieler == 1){
                spieler++;
            } else {
                spieler--;
            }





        }


    }

    public static void PrinteSpielfeld(char f1, char f2, char f3, char f4, char f5, char f6, char f7, char f8, char f9) {
        System.out.println(f1 + "|" + f2 + "|" + f3);
        System.out.println(f4 + "|" + f5 + "|" + f6);
        System.out.println(f7 + "|" + f8 + "|" + f9);

    }
}


