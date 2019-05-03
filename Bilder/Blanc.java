package Bilder;

public class Blanc {
    private String name;
    private Type type;
    private int day;
    private int week;
    private int month;

    public Blanc(String name, Type type, int day, int week, int month) {
        this.name = name;
        this.type = type;
        this.day = day;
        this.week = week;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getDay() {
        return day;
    }

    public int getWeek() {
        return week;
    }

    public int getMonth() {
        return month;
    }
}
