public class Musical extends Movie {
    private String musicalInstrument;
    private int numberOfSongs;

    public Musical(String title, String director, int length, String esrb, String musicalInstrument, int numberOfSongs) {
        super(title, director, length, esrb);
        this.musicalInstrument = musicalInstrument;
        this.numberOfSongs = numberOfSongs;
    }

    public String getMusicalInstrument() {
        return musicalInstrument;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    @Override
    public String title() {
        return "Мультфильм " + getTitle() + ", режиссёр: " + getDirector() + ", продолжительность: " + getLength() + ", аудитория: " + getEsrb() + ", музыкальный инструмент: " + getMusicalInstrument() + ", кол-во песен: " + getNumberOfSongs();
    }
}

