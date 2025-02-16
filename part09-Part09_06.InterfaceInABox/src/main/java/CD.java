public class CD implements Packable {
    private String artist;
    private String name;
    private int publicationYear;
    
    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1; //El peso de todos los CDs es fijo: 0.1 Kg
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
}
