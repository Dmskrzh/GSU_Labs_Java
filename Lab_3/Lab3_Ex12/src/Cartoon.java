public class Cartoon extends Movie{
    private String artist;
    private String graphicsStyle;

    public Cartoon(String title, String director, int length, String esrb, String artist, String graphicsStyle){
        super(title, director, length, esrb);
        this.artist = artist;
        this.graphicsStyle = graphicsStyle;
    }

    public String getArtist() {
        return artist;
    }

    public String getGraphicsStyle() {
        return graphicsStyle;
    }

    @Override
    public String title() {
        return "Мультфильм " + getTitle() + ", режиссёр: " + getDirector() + ", продолжительность: " + getLength() + ", аудитория: " + getEsrb() + ", художник: " + getArtist() + ", стиль графики: " + getGraphicsStyle();
    }
}
