package Multimedia;

import java.util.Scanner;

public class Player {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    elemento_multimediale[] elementi = new elemento_multimediale[5];

    for (int i = 0; i < elementi.length; i++) {
      System.out.println("Inserisci il tipo di elemento multimediale (1 per Immagine, 2 per Video, 3 per Audio):");
      int tipo = input.nextInt();
      input.nextLine();

      System.out.println("Inserisci il titolo dell'elemento multimediale:");
      String titolo = input.nextLine();
      switch (tipo) {
        case 1:
          System.out.println("Inserisci la luminosità dell'immagine:");
          int luminosita = input.nextInt();
          input.nextLine();

          elementi[i] = new Immagine(titolo, luminosita);
          break;

        case 2:
          System.out.println("Inserisci il volume del video:");
          int volume = input.nextInt();
          input.nextLine();

          System.out.println("Inserisci la durata del video:");
          int durataVideo = input.nextInt();
          input.nextLine();
          
          System.out.println("Inserisci la luminosità del video:");
          luminosita = input.nextInt();
          input.nextLine();

          elementi[i] = new Video(titolo, durataVideo, volume, luminosita);
          break;

        case 3:
          System.out.println("Inserisci il volume della registrazione audio:");
          volume = input.nextInt();
          input.nextLine();

          System.out.println("Inserisci la durata dell'audio:");
          int durataAudio = input.nextInt();
          input.nextLine();
          
          elementi[i] = new audio(titolo, durataAudio, volume);
          break;

        default:
          System.out.println("Tipo non valido!");
          i--;
          break;
      }
    }

    int scelta = -1;

    while (scelta != 0) {
      System.out.println("Quale elemento vuoi riprodurre? (0 per uscire)");
      scelta = input.nextInt();

      if (scelta >= 1 && scelta <= 5) {
        elemento_multimediale elemento = elementi[scelta - 1];

        if (elemento instanceof Riproducibile) {
          Riproducibile riproducibile = (Riproducibile) elemento;
          riproducibile.play();
        } else if (elemento instanceof Immagine) {
          Immagine immagine = (Immagine) elemento;
          immagine.show();
        } else {
          System.out.println("L'elemento selezionato non è riproducibile!");
        }
      } else if (scelta != 0) {
        System.out.println("Scelta non valida!");
      }
    }

    input.close();
  }
}
