package Prototyp;

class Main1 {
    public static void main(String[] args) {

        WikiLink original = new WikiLink ( 18, "www.wiki.lifeisgood.com/live" );
        System.out.println ( original );

        WikiLink copy = (WikiLink) original.copy ();
        System.out.println ( copy );
    }
}
