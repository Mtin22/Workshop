import static java.util.Objects.requireNonNull;

public class Board {
    public Integer setxyAxis(final Integer int1, final Integer int2){
        requireNonNull(int1, "number can not be null");
        requireNonNull(int2, "number can not be null");
        return Integer.valueOf(int1 + int2);
    }
}