package Bilder;

public class ReceptBilder implements Recept {
    private String name;
    private Type type;
    private int day;
    private int week;
    private int month;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setType(Type type) {
        this.type=type;
    }

    @Override
    public void setDay(int day) {
        this.day=day;
    }

    @Override
    public void setWeek(int week) {
        this.week=week;
    }

    @Override
    public void setMonth(int month) {
        this.month=month;
    }
    public Blanc getResult(){
        return new Blanc(name,type,day,week,month);
    }
}
