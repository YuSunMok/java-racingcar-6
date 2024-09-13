package racingcar.config;


import racingcar.view.InputView;
import racingcar.view.OutputView;

public record GameConfig(InputView inputView, OutputView outputView) {

    public static int START_NUMBER_FOR_RANDOM_NUMBER = 0;
    public static int END_NUMBER_FOR_RANDOM_NUMBER = 9;
    public static int FORWARD_STANDARD_NUMBER = 4;

}
