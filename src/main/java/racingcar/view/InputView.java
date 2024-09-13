package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.validator.Validator;

import java.util.Arrays;
import java.util.List;

public class InputView {

    public Cars getCars() {
        String userInputForCarNames = Console.readLine();
        String[] carNames = getCarNamesFrom(userInputForCarNames);

        Validator.validateUserInputForCarNames(carNames);

        List<Car> cars = convertToCarsFrom(carNames);

        return Cars.Of(cars);
    }

    public int getTryNumber() {
        String userInputForTryNumber = Console.readLine();

        Validator.validateUserInputForTryNumber(userInputForTryNumber);

        return Integer.parseInt(userInputForTryNumber);
    }

    private String[] getCarNamesFrom(String userInputForCarNames) {
        return userInputForCarNames.split(",");
    }

    private List<Car> convertToCarsFrom(String[] carNames) {
        return Arrays.stream(carNames)
                .map(Car::of)
                .toList();
    }
}
