package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.config.GameConfig;

public class RandomNumberGenerator {

    public static int generate() {
        return Randoms.pickNumberInRange(
                GameConfig.START_NUMBER_FOR_RANDOM_NUMBER,
                GameConfig.END_NUMBER_FOR_RANDOM_NUMBER
        );
    }
}
