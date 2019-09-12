package Book;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Key {
    private String type = Key.getType();

    public static String getType(){
        String[] typy={"Fantasy", "Dramat"};
        Random r=new Random();
        int randomNumber=r.nextInt(typy.length);
        return
                typy[randomNumber];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return type.equals(key.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Key{" +
                "type='" + type + '\'' +
                '}';
    }
}
