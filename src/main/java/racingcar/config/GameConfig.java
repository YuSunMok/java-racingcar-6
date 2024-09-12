package racingcar.config;


import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameConfig {

    public static int START_NUMBER_FOR_RANDOM_NUMBER = 0;
    public static int END_NUMBER_FOR_RANDOM_NUMBER = 9;
    public static int FORWARD_STANDARD_NUMBER = 4;

    private InputView inputView;
    private OutputView outputView;

    public GameConfig(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public InputView getInputView() {
        return inputView;
    }

    public OutputView getOutputView() {
        return outputView;
    }
}
