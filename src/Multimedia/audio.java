package Multimedia;

class audio extends elemento_multimediale implements Riproducibile {
	  private int durata;
	  private int volume;

	  public audio(String titolo, int durata, int volume) {
	    super(titolo);
	    this.durata = durata;
	    this.volume = volume;
	  }

	  public int getDurata() {
	    return durata;
	  }

	  public void play() {
	    for (int i = 0; i < durata; i++) {
	      System.out.println(getTitolo() + " " + "!".repeat(volume));
	    }
	  }

	  public void abbassaVolume() {
	    if (volume > 0) {
	      volume--;
	    }
	  }

	  public void alzaVolume() {
	    volume++;
	  }
	}