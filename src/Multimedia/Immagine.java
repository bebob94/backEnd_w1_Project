package Multimedia;

class Immagine extends elemento_multimediale {
	  private int luminosita;

	  public Immagine(String titolo, int luminosita) {
	    super(titolo);
	    this.luminosita = luminosita;
	  }

	  public void show() {
	    System.out.println(getTitolo() + " " + "*".repeat(luminosita));
	  }

	  public void aumentaLuminosita() {
	    luminosita++;
	  }

	  public void diminuisciLuminosita() {
	    if (luminosita > 0) {
	      luminosita--;
	    }
	  }
	}