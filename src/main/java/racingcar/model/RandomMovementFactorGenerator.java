package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovementFactorGenerator implements MovementFactorGenerator {

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(0, 9);
    }

}