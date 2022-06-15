package Unit9Lab2;

public class NamedCow extends Cow {
    private String name;

    public NamedCow(String type, String name, String sound) {
        super(type, sound);
    }

    public String getName() {
        return name;
    }
}
