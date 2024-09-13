package racingcar.validator;

public class Validator {

    public static final int BASE_FOR_CAR_NAME_LENGTH = 5;

    public static void validateUserInputForCarNames(String[] carNames) {
        for (String carName : carNames) {
            int lengthOfCarName = carName.length();
            if (lengthOfCarName > BASE_FOR_CAR_NAME_LENGTH) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void validateUserInputForTryNumber(String TryNumber) {
        if (TryNumber.chars().anyMatch(c -> !Character.isDigit(c))) {
            throw new IllegalArgumentException();
        }
    }
}
