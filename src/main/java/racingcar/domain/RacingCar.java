package racingcar.domain;

public class RacingCar implements Comparable<RacingCar> {
    private static final int DEFAULT_POINT = 1;
    private static final String DESCRIPTION_DELIMITER = " : ";
    private static final String POSITION_BAR = "-";
    private final String name;
    private int position = DEFAULT_POINT;

    public RacingCar(String name) {
        this.name = name;
    }

    public RacingCar(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public boolean isSamePosition(RacingCar other) {
        return this.position == other.position;
    }

    public void advance() {
        position++;
    }

    public String getDesc() {
        return name + DESCRIPTION_DELIMITER + POSITION_BAR.repeat(position);
    }

    @Override
    public int compareTo(RacingCar o) {
        return this.position - o.position;
    }
}
