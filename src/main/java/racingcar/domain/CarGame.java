package racingcar.domain;

import racingcar.util.RandomNumberGenerator;
import racingcar.view.OutputView;

import java.util.List;

public class CarGame {

    private final Cars cars;
    private final int tryNumber;

    private CarGame(Cars cars, int tryNumber) {
        this.cars = cars;
        this.tryNumber = tryNumber;
    }

    public static CarGame of(Cars cars, int tryNumber) {
        return new CarGame(cars, tryNumber);
    }

    public Cars start(OutputView outputView) {
        List<Car> carList = cars.getCars();

        for (int i = 0; i < tryNumber; i++) {
            Cars result = playGame(carList);
            outputView.showExecutionResult(result);
        }

        return Cars.Of(carList);
    }

    private Cars playGame(List<Car> carList) {
        for (Car car : carList) {
            int randomNumber = RandomNumberGenerator.generate();

            if (car.canForward(randomNumber)) {
                car.forward();
            }
        }
        return Cars.Of(carList);
    }

}
