package Prototyp;

class WikiLink implements Copyable{
    int id;
    String link;

    public WikiLink(int id, String name){
        this.link = name;
        this.id = id;
    }

    @Override
    public String toString(){

        return "Wikipedia link [id = " + id + ", URL = " + link + "]";
    }

    public Object copy(){
        WikiLink copy = new WikiLink ( id, link);
        return copy;
    }
}
