package Multimedia;

class MediaRiproducibile {
	  private Riproducibile elemento;

	  public MediaRiproducibile(Riproducibile elemento) {
	    this.elemento = elemento;
	  }

	  public void esegui() {
	    if (elemento instanceof audio || elemento instanceof Video) {
	      elemento.play();
	    } else if (elemento instanceof Immagine) {
	      ((Immagine) elemento).show();
	    }
	  }
	}
