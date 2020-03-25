package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        switch (mine) {
            case ROCK:
                switch (theirs) {
                    case SCISSORS:
                        return Result.WIN;
                    case PAPER:
                        return Result.LOSE;
                }

            case PAPER:
                switch (theirs) {
                    case ROCK:
                        return Result.WIN;
                    case SCISSORS:
                        return Result.LOSE;
                }

            case SCISSORS:
                switch (theirs) {
                    case PAPER:
                        return Result.WIN;
                    case ROCK:
                        return Result.LOSE;
                }
        }

        return Result.DRAW;
    }
}
