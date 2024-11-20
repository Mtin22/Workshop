import static java.util.Objects.requireNonNull;

public class Board {
    private Integer int1;
    private Integer int2;
    public Board(final Integer int1, final Integer int2){
        
    }
    public Integer getxAxis() {
        return int1;
    }

    public Integer getyAxis(){
        return int2;
    }

    public void setxAxis(int xAxis){
        requireNonNull(this.int1 = xAxis);
    }

    public void setyAxis(int yAxis){
        requireNonNull(this.int2 = yAxis);
    }
}