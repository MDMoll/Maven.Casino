package io.zipcoder.casino.casino.games.dicegames.diceutilities;

import io.zipcoder.casino.casino.games.dicegames.Craps;

import java.util.stream.Stream;

public enum BetExplanations {
        PLACE("The Place bet wins if the chosen number is rolled before a 7"),
        LAY("The Lay bet wins if a 7 is rolled before the point"),
        ANYCRAPS("Any Craps pays off on 2, 3 or 12 before rolling a 7"),
        FIELD("The Field wins if 4, 5, 6, 8, 9 or 10 hits before 7"),
        HORN("The Horn wins on 2, 3, 11 or 12 before rolling a 7"),
        HARDWAYS("Hardways involves two dice of the same face value, which must be hit before 7 or the corresponding sum thrown 'easy'\n");
        private String betRules;

        BetExplanations(String betRules) {
            this.betRules = betRules;
        }

        public String getExplanations() {
            return betRules;
        }

        public static Stream<BetExplanations> stream() {
            return Stream.of(BetExplanations.values());
        }
    }
