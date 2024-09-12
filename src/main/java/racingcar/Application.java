package racingcar;

import racingcar.config.GameConfig;
import racingcar.controller.GameController;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {

        GameConfig gameConfig = new GameConfig(
                new InputView(),
                new OutputView()
        );

        GameController gameController = new GameController(gameConfig);
        gameController.run();
    }
}
