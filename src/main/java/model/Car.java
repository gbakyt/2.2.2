package model;

/**
 * @author Gaziz Bakyt
 */

public class Car {

    private Integer id;
    private String model;
    private String series;

    public Car(Integer id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public Car() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }


}