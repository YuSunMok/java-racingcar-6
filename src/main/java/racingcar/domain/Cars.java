package racingcar.domain;

import java.util.*;

public class Cars {

    List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars Of(List<Car> cars) {
        return new Cars(cars);
    }

    public String getWinnersForDisplay() {
        Integer maxForward = findMaxForward();
        return String.join(",", createWinners(maxForward));
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    private Integer findMaxForward() {
        return cars.stream()
                .max(Comparator.comparingInt(Car::getForward))
                .map(Car::getForward)
                .orElse(null);
    }

    private List<String> createWinners(int maxForward) {
        return cars.stream()
                .filter(car -> car.equalsMaxForward(maxForward))
                .map(Car::getName)
                .toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
