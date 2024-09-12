package racingcar.config;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.view.InputView;
import racingcar.view.OutputView;


class GameConfigTest {

    @Test
    @DisplayName("InputView를 반환한다.")
    void getInputView() {
        InputView inputView = new InputView();
        GameConfig gameConfig = new GameConfig(inputView, null);

        InputView getinputView = gameConfig.getInputView();

        Assertions.assertThat(inputView).isEqualTo(getinputView);
    }

    @Test
    @DisplayName("OutputView를 반환한다.")
    void getOutputView() {
        OutputView outputView = new OutputView();
        GameConfig gameConfig = new GameConfig(null, outputView);

        OutputView getOutputView = gameConfig.getOutputView();

        Assertions.assertThat(outputView).isEqualTo(getOutputView);
    }

}