package racingcar.domain;

import racingcar.config.GameConfig;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Car {

    private final String name;
    private int forward;

    private Car(String name) {
        this.name = name;
        this.forward = 0;
    }

    public static Car of(String name) {
        return new Car(name);
    }

    public void forward() {
        forward++;
    }

    public boolean equalsMaxForward(int forward) {
        return this.forward == forward;
    }

    public boolean canForward(int number) {
        return number >= GameConfig.FORWARD_STANDARD_NUMBER;
    }

    public String getForwardToMark() {
        return IntStream.range(0, forward)
                .mapToObj(i -> "-")
                .collect(Collectors.joining());
    }

    public String getName() {
        return name;
    }

    public int getForward() {
        return forward;
    }

}
