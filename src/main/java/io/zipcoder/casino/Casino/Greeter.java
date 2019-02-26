package io.zipcoder.casino.Casino;

import io.zipcoder.casino.Games.*;
import io.zipcoder.casino.utilities.Console;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Greeter {
    private Console console;
    private static final String casinoName =
            " __    __                                                         __    __                           ______                    __                   \n" +
            "/  \\  /  |                                                       /  |  /  |                         /      \\                  /  |                  \n" +
            "$$  \\ $$ |__    __ _____  ____   ______   ______   ______        $$ |  $$ |_______   ______        /$$$$$$  | ______   _______$$/ _______   ______  \n" +
            "$$$  \\$$ /  |  /  /     \\/    \\ /      \\ /      \\ /      \\       $$ |  $$ /       \\ /      \\       $$ |  $$/ /      \\ /       /  /       \\ /      \\ \n" +
            "$$$$  $$ $$ |  $$ $$$$$$ $$$$  /$$$$$$  /$$$$$$  /$$$$$$  |      $$ |  $$ $$$$$$$  /$$$$$$  |      $$ |      $$$$$$  /$$$$$$$/$$ $$$$$$$  /$$$$$$  |\n" +
            "$$ $$ $$ $$ |  $$ $$ | $$ | $$ $$    $$ $$ |  $$/$$ |  $$ |      $$ |  $$ $$ |  $$ $$ |  $$ |      $$ |   __ /    $$ $$      \\$$ $$ |  $$ $$ |  $$ |\n" +
            "$$ |$$$$ $$ \\__$$ $$ | $$ | $$ $$$$$$$$/$$ |     $$ \\__$$ |      $$ \\__$$ $$ |  $$ $$ \\__$$ |      $$ \\__/  /$$$$$$$ |$$$$$$  $$ $$ |  $$ $$ \\__$$ |\n" +
            "$$ | $$$ $$    $$/$$ | $$ | $$ $$       $$ |     $$    $$/       $$    $$/$$ |  $$ $$    $$/       $$    $$/$$    $$ /     $$/$$ $$ |  $$ $$    $$/ \n" +
            "$$/   $$/ $$$$$$/ $$/  $$/  $$/ $$$$$$$/$$/       $$$$$$/         $$$$$$/ $$/   $$/ $$$$$$/         $$$$$$/  $$$$$$$/$$$$$$$/ $$/$$/   $$/ $$$$$$/  \n" +
            "                                                                                                                                                    ";
    private static final String blackJackName =
                    "██████╗ ██╗      █████╗  ██████╗██╗  ██╗     ██╗ █████╗  ██████╗██╗  ██╗\n" +
                    "██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝     ██║██╔══██╗██╔════╝██║ ██╔╝\n" +
                    "██████╔╝██║     ███████║██║     █████╔╝      ██║███████║██║     █████╔╝ \n" +
                    "██╔══██╗██║     ██╔══██║██║     ██╔═██╗ ██   ██║██╔══██║██║     ██╔═██╗ \n" +
                    "██████╔╝███████╗██║  ██║╚██████╗██║  ██╗╚█████╔╝██║  ██║╚██████╗██║  ██╗\n" +
                    "╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n" +
                    "                                                                        ";
    private static final String goFishName =
                    " ██████╗  ██████╗ ███████╗██╗███████╗██╗  ██╗\n" +
                    "██╔════╝ ██╔═══██╗██╔════╝██║██╔════╝██║  ██║\n" +
                    "██║  ███╗██║   ██║█████╗  ██║███████╗███████║\n" +
                    "██║   ██║██║   ██║██╔══╝  ██║╚════██║██╔══██║\n" +
                    "╚██████╔╝╚██████╔╝██║     ██║███████║██║  ██║\n" +
                    " ╚═════╝  ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝\n" +
                    "                                             ";
    private static final String crapsName =
                    " ██████╗██████╗  █████╗ ██████╗ ███████╗\n" +
                    "██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                    "██║     ██████╔╝███████║██████╔╝███████╗\n" +
                    "██║     ██╔══██╗██╔══██║██╔═══╝ ╚════██║\n" +
                    "╚██████╗██║  ██║██║  ██║██║     ███████║\n" +
                    " ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚══════╝\n" +
                    "                                        ";
    private static final String macaoName =
                    "███╗   ███╗ █████╗  ██████╗ █████╗  ██████╗ \n" +
                    "████╗ ████║██╔══██╗██╔════╝██╔══██╗██╔═══██╗\n" +
                    "██╔████╔██║███████║██║     ███████║██║   ██║\n" +
                    "██║╚██╔╝██║██╔══██║██║     ██╔══██║██║   ██║\n" +
                    "██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║╚██████╔╝\n" +
                    "╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝ ";

//    public static String getBlackJackName() {
//        return blackJackName;
//    }

    public static String getGoFishName() {
        return goFishName;
    }

//    public static String getCrapsName() {
//        return crapsName;
//    }

    public static String getMacaoName() {
        return macaoName;
    }

    public Greeter(){
        this.console = Console.getConsole();
    }

    public Greeter(Console console) {
        this.console = console;
    }

    public String getUserName() {
        try {
            console.println(casinoName);
            String name = console.getStringInput("Welcome to our Casino! What's your name?");
            return name;
        } catch (NoSuchElementException exception) {
            return "Jane Doe";
        }
    }

    public Boolean getIfGambling(String name) {
        Integer age = console.getIntegerInput(String.format("It's great to meet you, %s. How old are you?", name));
        if (age >= 18) {
            String isGambling = console.getStringInput("And will you be gambling here today?");
            return parseIsGambling(isGambling);
        } else {
            console.print("No problem, we're happy to offer GoFish and Macao for our nongamblers. They do still" +
                    " cost money, though. Your starting balance is \u20A6500 NUC Bucks.\n");
            return false;
        }
    }

    private Boolean parseIsGambling(String isGambling) {
        isGambling = isGambling.toLowerCase().trim();
        if ("yes".equals(isGambling)) {
            console.println("Your starting balance with us is \u20A6500 NUC Bucks. Best of luck!");
            return true;
        } else  if ("no".equals(isGambling)) {
            console.println("Okay, but our non-gambling games do still cost money to play. You have \u20A6500 NUC Bucks to start.");
            return false;
        } else {
            console.println("That sounds like a yes!");
            return true;
        }
    }

    public Game getNextGame() {
        String requestedGame = console.getStandardInputCaps(
                "Would you like to play BlackJack, GoFish, Craps or Macao?");
        return parseGame(requestedGame);
    }

    public Game getNextCleanGame() {
        String requestedGame = console.getStandardInputCaps("Would you like to play GoFish or Macao?");
        if (requestedGame.equals("BLACKJACK") || requestedGame.equals("CRAPS")) {requestedGame = "GOFISH";}
        return parseGame(requestedGame);
    }

    public Game parseGame(String requestedGame) {
        if (requestedGame.equals("TESTINGCHEATSENABLEDTRUE")) {return getCheatingTest();}
        GameEnum enumeration = GameEnum.getValueOf(requestedGame);
        return enumeration.create();
    }



    public enum GameEnum {
        BLACKJACK(BlackJack::new),
        CRAPS(Craps::new),
        GOFISH(GoFish::new),
        MACAO(Macao::new);

        private final Supplier<Game> supplier;

        GameEnum(Supplier<Game> supplier) {
            this.supplier = supplier;
        }

        public Game create() {
            return this.supplier.get();
        }

        public static io.zipcoder.casino.Casino.Greeter.GameEnum getValueOf(String userInput) {
            try {
                return valueOf(userInput);
            } catch (IllegalArgumentException var2) {
                return valueOf("GOFISH");
            }
        }
    }

    private Game getCheatingTest() {
        String input = "yes\nno";
        byte[] inputBytes = input.getBytes();
        ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
        Console console = new Console(new Scanner(inputByteArray), System.out);
        return new Macao(console);
    }

    public boolean getIfLeaving() {
        String isLeaving = console.getStringInput("Would you like to play another game?");
        if (isLeaving.equals("no") || isLeaving.equals("n")) {
            return true;
        } else if (isLeaving.toLowerCase().trim().equals("yes")) {
            console.println("We're happy you're staying!");
            return false;
        } else {
            console.println("It sounds like you'd like to play another game!");
            return false;
        }
    }

    public void balanceTooLow() {
        console.println("Sorry, your balance is too low to keep playing.");
    }

    public void goodBye() {
        console.println(casinoName);
        console.println("Thank you so much for coming! Please come again!");
    }

}