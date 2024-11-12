class Historical extends Film {
    private String historicalPeriod;
    private String degreeOfAccuracy;

    public Historical(String title, String director, int length, String esrb, String historicalPeriod, String degreeOfAccuracy) {
        super(title, director, length, esrb);
        this.historicalPeriod = historicalPeriod;
        this.degreeOfAccuracy = degreeOfAccuracy;
    }

    public String getHistoricalPeriod() {
        return historicalPeriod;
    }

    public String getDegreeOfAccuracy() {
        return degreeOfAccuracy;
    }

    @Override
    public void printInfo() {
        System.out.println("Мультфильм " + getTitle() + ", " +
                "режиссёр: " + getDirector() + ", " +
                "продолжительность: " + getLength() + ", " +
                "аудитория: " + getEsrb() + ", " +
                "исторический период: " + getHistoricalPeriod() + ", " +
                "степень соответствия событиям: " + getDegreeOfAccuracy());
    }
}