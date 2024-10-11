class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;
    String ISBN;
    boolean tersedia;
  
    // Konstruktor
    public Buku(String judul, String pengarang, String penerbit, 
               int tahunTerbit, String ISBN) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.ISBN = ISBN;
        this.tersedia = true; // Buku baru langsung tersedia
    }
  }