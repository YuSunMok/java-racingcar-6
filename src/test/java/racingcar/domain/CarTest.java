package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {


    @Test
    @DisplayName("전진 할 수 있다.")
    void forward() {
        Car car = createCar();

        car.forward();

        assertThat(car.getForward()).isEqualTo(1);
    }

    @Test
    @DisplayName("주어진 전진 수 만큼 전진했는지 알 수 있다.")
    void equalsMaxForward_true() {
        Car car = createCar();
        int givenForward = 2;
        forward(car, givenForward);

        boolean result = car.equalsMaxForward(givenForward);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("주어진 전진 수 만큼 전진하지 못했다면 false를 반환한다.")
    void equalsMaxForward_false() {
        Car car = createCar();
        car.forward();
        int givenForward = 2;

        boolean result = car.equalsMaxForward(givenForward);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("주어진 값이 기준 값(4)을 넘으면 True를 반환한다.")
    void canForward_true() {
        Car car = createCar();
        int givenNumber = 6;

        boolean result = car.canForward(givenNumber);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("주어진 값이 기준 값(4)을 넘지 못하면 False를 반환한다.")
    void canForward_false() {
        Car car = createCar();
        int givenNumber = 3;

        boolean result = car.canForward(givenNumber);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("전진된 값만큼 문자열로 반환한다.")
    void getForwardToMark() {
        String convertedString = "---";
        int numberOfForward = 3;
        Car car = createCar();
        forward(car, 3);

        String result = car.getForwardToMark();

        assertThat(result).isEqualTo(convertedString);
    }

    @Test
    @DisplayName("자동차 이름을 반환한다.")
    void getName() {
        Car car = createCar();
        String givenName = "목이";

        String result = car.getName();

        assertThat(result).isEqualTo(givenName);
    }

    @Test
    @DisplayName("자동차가 전진된 값을 반환한다.")
    void getForward() {
        Car car = createCar();
        int numberOfForward = 2;
        forward(car, numberOfForward);

        int result = car.getForward();

        assertThat(result).isEqualTo(numberOfForward);
    }

    private static void forward(Car car, int repeatNumber) {
        for (int i = 0; i < repeatNumber; i++) {
            car.forward();
        }
    }

    private static Car createCar() {
        return Car.of("목이");
    }
}