public abstract class Movie {
    private String title;
    private String director;
    private int length;
    private String esrb;

    public Movie() {}
    public Movie(String title, String director, int length, String esrb){
        this.title = title;
        this.director = director;
        this.length = length;
        this.esrb = esrb;
    }
    public String getTitle() {
        return title;
    }
        public String getDirector() {
        return director;
    }
        public int getLength() {
        return length;
    }
        public String getEsrb() {
        return esrb;
    }
    public abstract String title();
}
