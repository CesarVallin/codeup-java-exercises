package movies;

public class Movie {
    // ---------------------------------------------------------------------------------------------------------
    // Static properties.....
    private String name;
    private String category;
    // ---------------------------------------------------------------------------------------------------------
    // Constructor...
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Getters & Setters...
    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
