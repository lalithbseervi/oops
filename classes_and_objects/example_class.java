package classes_and_objects;

public class example_class {
    public static void main(String[] args) {
        Artist default_artist = new Artist();
        Artist gustav_klimt = new Artist("gustav klimt");
        gustav_klimt.draw();
        System.out.println(gustav_klimt.name);
    }
}

class Artist {
    String name;
    int experience;

    Artist() {
        name = "Underground Artist";
        System.out.println("created an artist");
    }

    Artist(String input_name) {
        name = input_name;
    }

    void draw() {
        System.out.println("drawing done");
    };
    void color() {
        System.out.println("coloring done");
    };
}