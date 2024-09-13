package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {

    private static final String START_GAME_COMMENTS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRY_NUMBER_COMMENTS = "시도할 회수는 몇회인가요?";
    private static final String EXECUTION_RESULT = "실행 결과";
    private static final String FINAL_WINNER = "최종 우승자 : ";

    public void showStartGameComments() {
        System.out.println(START_GAME_COMMENTS);
    }

    public void showGetTryNumberComments() {
        System.out.println(TRY_NUMBER_COMMENTS);
    }

    public void showGameWinnersComments(Cars cars) {
        System.out.print(FINAL_WINNER + cars.getWinnersForDisplay());
    }

    public void showGameResultComments() {
        System.out.println();
        System.out.println(EXECUTION_RESULT);
    }

    public void showExecutionResult(Cars cars) {
        List<Car> carList = cars.getCars();

        for (Car car : carList) {
            System.out.println(getExecutionResultAt(car));
        }
        System.out.println();
    }

    private String getExecutionResultAt(Car car) {
        return car.getName() + " : " + car.getForwardToMark();
    }
}
