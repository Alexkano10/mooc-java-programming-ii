
public class Record implements Comparable<Record> {
    
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public Record(String gender, String country, int year, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }
    
    @Override
    public int compareTo(Record other) {
        return Double.compare(this.literacyPercent, other.literacyPercent); // menor a mayor
    }
    
}
