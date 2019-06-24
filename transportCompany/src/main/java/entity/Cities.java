package entity;

public class Cities {

    private int id;
    private String name;
    private double lat;
    private double lon;
    private boolean airport;
    private boolean seaport;

    public Cities(int id, String name, double lat, double lon, boolean airport, boolean seaport) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.airport = airport;
        this.seaport = seaport;
    }

    public Cities() {
    }

    public Cities(int id, String name, double lat, double lon) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    public Cities(int id) {
        this.id = id;
    }

    public Cities(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public boolean isAirport() {
        return airport;
    }

    public void setAirport(boolean airport) {
        this.airport = airport;
    }

    public boolean isSeaport() {
        return seaport;
    }

    public void setSeaport(boolean seaport) {
        this.seaport = seaport;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", airport=" + airport +
                ", seaport=" + seaport +
                '}';
    }
}
