package racingcar.controller;

import racingcar.config.GameConfig;
import racingcar.domain.CarGame;
import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

    private final InputView inputView;
    private final OutputView outputView;
    private final CarGame carGame;

    public GameController(GameConfig gameConfig) {
        inputView = gameConfig.inputView();
        outputView = gameConfig.outputView();

        carGame = initialize(getCarsFromUser(), getTryNumberFromUser());
    }

    public void run() {
        outputView.showGameResultComments();
        Cars gameResult = carGame.start(outputView);
        outputView.showExecutionResult(gameResult);

        outputView.showGameWinnersComments(gameResult);
    }

    private CarGame initialize(Cars cars, int tryNumber) {
        return CarGame.of(cars, tryNumber);
    }

    private int getTryNumberFromUser() {
        outputView.showGetTryNumberComments();
        return inputView.getTryNumber();
    }

    private Cars getCarsFromUser() {
        outputView.showStartGameComments();
        return inputView.getCars();
    }
}
