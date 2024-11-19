package de.tum.cit.fop;

public class LectureHall{
    private String name;
    private int capacity;
    private int rows;
    private Apprentice[][] rowsOfApprentices;

    public LectureHall(String name, int capacity, int rows) {
        this.name = name;
        this.capacity = capacity;
        if (capacity <= 90){
            capacity = 90;
        }
        capacity -= capacity % 30;
        rows = capacity / 30;
        rowsOfApprentices = new Apprentice[rows][30];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Apprentice[][] getRowsOfApprentices() {
        return rowsOfApprentices;
    }

    public void setRowsOfApprentices(Apprentice[][] rowsOfApprentices) {
        this.rowsOfApprentices = rowsOfApprentices;
    }
}
