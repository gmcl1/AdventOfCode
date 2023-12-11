package org.example;


public class PartOne {

    private final String INPUT;

    public PartOne(){
        INPUT = "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red\n" +
                "Game 2: 15 green, 20 red, 8 blue; 12 green, 7 red; 10 green, 2 blue, 15 red; 13 blue, 15 red\n" +
                "Game 3: 8 red, 2 blue; 3 green, 10 blue, 10 red; 7 green, 4 blue, 7 red; 8 red, 6 green, 13 blue; 4 green, 3 blue, 10 red; 7 blue, 7 green, 5 red\n" +
                "Game 4: 13 green, 14 blue, 9 red; 6 green, 14 red, 18 blue; 9 red, 11 green, 3 blue; 11 green, 10 red, 14 blue; 17 blue, 3 red, 4 green; 17 blue, 1 red, 9 green\n" +
                "Game 5: 2 green, 1 red; 8 blue, 2 green, 6 red; 5 blue, 9 red, 2 green; 3 green, 8 red, 6 blue; 6 blue, 5 red\n" +
                "Game 6: 3 green, 7 blue, 5 red; 3 green, 6 red; 11 blue, 6 red, 1 green\n" +
                "Game 7: 8 red, 4 green, 11 blue; 12 blue, 1 green, 5 red; 6 red, 1 green, 5 blue; 12 blue, 2 green, 2 red; 4 blue, 4 green, 3 red; 9 blue, 4 green, 8 red\n" +
                "Game 8: 1 red, 4 green; 6 red, 1 green; 10 red; 1 blue, 2 green; 4 green, 3 red; 1 blue, 8 red\n" +
                "Game 9: 9 blue, 13 green, 1 red; 10 green, 4 blue, 4 red; 3 red, 4 blue, 14 green; 13 blue, 1 red, 12 green\n" +
                "Game 10: 2 blue, 16 red, 2 green; 1 green, 16 red, 6 blue; 9 red, 3 green; 1 green, 2 blue, 8 red; 8 red, 6 blue, 3 green\n" +
                "Game 11: 7 green, 11 red, 12 blue; 3 blue, 6 green, 6 red; 10 blue, 13 green; 1 red, 13 green, 9 blue; 2 blue, 2 red, 13 green; 2 red, 3 blue, 15 green\n" +
                "Game 12: 3 green, 2 red, 2 blue; 7 green, 5 blue; 1 blue, 1 red, 3 green\n" +
                "Game 13: 2 green, 2 red, 3 blue; 3 blue, 3 red, 3 green; 3 green, 2 red; 2 blue, 3 red, 3 green; 2 green, 3 red, 1 blue\n" +
                "Game 14: 4 green, 9 red; 11 green, 10 red, 12 blue; 6 red, 3 green, 12 blue; 5 green, 4 red, 4 blue; 18 blue, 7 red, 11 green; 16 blue, 4 red, 10 green\n" +
                "Game 15: 5 green, 2 red, 9 blue; 18 green, 6 red, 20 blue; 11 blue, 12 green, 11 red; 9 red, 17 blue, 16 green; 7 green, 1 red, 9 blue\n" +
                "Game 16: 9 blue, 11 green; 8 green, 2 blue; 1 red, 6 green, 4 blue\n" +
                "Game 17: 2 red, 2 green, 2 blue; 7 blue, 4 green, 3 red; 2 red, 8 blue, 1 green; 2 red, 6 blue, 2 green; 4 blue, 3 red; 4 green, 5 red, 6 blue\n" +
                "Game 18: 6 green, 7 red; 3 blue, 6 green, 1 red; 6 red, 3 blue, 5 green\n" +
                "Game 19: 6 red, 4 green, 5 blue; 2 red, 4 blue, 13 green; 1 green, 1 blue, 2 red; 4 green\n" +
                "Game 20: 7 red, 17 blue, 6 green; 3 blue, 6 green, 8 red; 7 blue, 6 red, 1 green; 3 green; 8 red, 7 green, 14 blue\n" +
                "Game 21: 5 red, 3 blue, 7 green; 1 blue, 2 red, 5 green; 2 blue, 8 green, 3 red; 3 blue, 8 red, 4 green; 5 red, 1 blue, 3 green\n" +
                "Game 22: 2 red, 6 green, 1 blue; 3 red, 3 green, 1 blue; 2 green, 7 red, 2 blue; 5 green, 1 red\n" +
                "Game 23: 2 red, 16 green, 1 blue; 1 red, 12 green, 3 blue; 12 green, 1 blue, 3 red\n" +
                "Game 24: 7 red, 1 blue, 12 green; 2 red, 19 green, 3 blue; 19 green, 1 blue, 12 red; 6 green, 16 red, 5 blue; 11 red, 4 blue, 12 green\n" +
                "Game 25: 2 blue, 3 red, 8 green; 4 blue, 2 red, 9 green; 2 red, 7 blue\n" +
                "Game 26: 17 red, 8 blue, 3 green; 3 green, 13 red, 4 blue; 20 red, 1 green, 6 blue; 7 blue, 2 red, 2 green; 20 red, 8 blue; 2 green, 16 red, 8 blue\n" +
                "Game 27: 3 blue, 17 green, 19 red; 16 green, 5 red, 6 blue; 17 green, 16 red, 4 blue\n" +
                "Game 28: 1 green, 7 red, 1 blue; 8 green, 12 red, 1 blue; 1 blue, 9 red, 1 green\n" +
                "Game 29: 3 green, 3 blue, 2 red; 3 green, 2 red, 1 blue; 3 green, 2 red, 3 blue; 3 blue, 3 red, 4 green\n" +
                "Game 30: 3 red, 8 blue, 3 green; 1 green, 1 red; 17 green, 17 blue; 19 green, 15 blue, 1 red; 1 green, 2 red, 16 blue\n" +
                "Game 31: 11 green, 11 blue, 14 red; 6 blue, 15 green, 2 red; 11 blue, 19 green, 2 red\n" +
                "Game 32: 9 red, 2 green; 7 green, 4 blue, 2 red; 6 red, 5 green, 1 blue; 4 red, 4 blue, 1 green; 8 red, 6 green\n" +
                "Game 33: 6 blue, 16 red, 9 green; 5 red, 7 blue, 13 green; 1 green, 9 blue, 1 red; 4 green, 9 blue, 17 red; 2 green, 10 red, 13 blue; 9 red, 1 blue, 14 green\n" +
                "Game 34: 2 red, 2 green, 4 blue; 3 blue, 2 green; 1 green, 1 red, 2 blue; 1 red, 3 blue, 3 green; 2 green, 8 blue, 2 red; 3 blue, 1 red\n" +
                "Game 35: 4 red, 14 blue, 2 green; 1 green, 15 blue, 1 red; 1 blue, 2 red, 1 green\n" +
                "Game 36: 4 blue, 1 red, 2 green; 2 green, 15 blue, 8 red; 7 blue, 1 red; 7 red, 1 green, 1 blue\n" +
                "Game 37: 2 blue, 1 green, 5 red; 2 blue, 2 green, 4 red; 2 blue, 5 red, 8 green; 3 green, 2 blue, 1 red; 1 red, 1 blue, 5 green; 2 blue, 1 red, 8 green\n" +
                "Game 38: 2 blue, 4 green, 11 red; 7 green, 6 red, 2 blue; 1 green, 3 red, 1 blue; 4 blue, 4 green, 4 red; 2 red, 5 blue, 2 green\n" +
                "Game 39: 7 green, 7 blue, 2 red; 11 blue, 4 green, 8 red; 10 red, 4 green, 1 blue; 8 green, 9 blue; 9 green, 4 red; 1 green, 8 blue\n" +
                "Game 40: 1 green, 13 blue; 6 blue, 7 red; 8 red; 1 green, 13 blue, 3 red; 1 green, 16 red, 13 blue; 14 blue, 14 red, 1 green\n" +
                "Game 41: 5 green, 2 blue, 10 red; 4 green, 2 blue, 5 red; 6 green, 9 red, 1 blue; 4 red, 1 blue; 1 red, 3 green, 2 blue; 3 red\n" +
                "Game 42: 17 green, 11 blue, 11 red; 5 blue, 11 green, 9 red; 10 blue, 13 red, 4 green; 8 green, 4 blue, 15 red\n" +
                "Game 43: 1 red, 3 blue; 1 green, 3 blue, 1 red; 2 blue, 1 green; 2 green, 1 blue; 1 red, 3 blue\n" +
                "Game 44: 7 green, 5 red, 1 blue; 6 green, 1 blue, 5 red; 2 blue, 6 green; 3 green, 2 red; 4 green; 6 red\n" +
                "Game 45: 16 red, 14 blue, 19 green; 1 red, 5 green, 6 blue; 16 blue, 2 green, 1 red; 15 green, 6 red, 16 blue\n" +
                "Game 46: 8 blue, 2 green; 4 red, 3 green, 6 blue; 1 green, 8 blue, 3 red; 3 green, 12 blue, 1 red\n" +
                "Game 47: 9 green, 3 blue; 1 green, 1 blue; 4 blue, 9 green, 6 red; 8 green, 4 blue, 6 red; 6 red, 12 green, 1 blue; 4 blue, 7 green\n" +
                "Game 48: 11 green, 4 blue, 1 red; 11 blue, 8 red, 9 green; 4 blue, 3 red, 7 green; 10 blue, 2 green, 9 red; 8 green, 2 blue, 2 red\n" +
                "Game 49: 8 green, 1 blue, 5 red; 1 green, 1 blue; 3 green, 4 red, 2 blue; 1 blue, 7 green, 1 red; 1 blue, 7 green, 3 red; 5 red, 5 green\n" +
                "Game 50: 2 green, 2 red, 4 blue; 8 blue, 2 green, 7 red; 4 blue, 5 red; 9 red, 4 blue; 5 blue, 9 red; 2 green, 8 red, 6 blue\n" +
                "Game 51: 6 green, 1 red, 2 blue; 2 red, 4 blue, 6 green; 9 blue, 4 green\n" +
                "Game 52: 7 green, 3 red, 12 blue; 8 blue, 9 red, 5 green; 2 blue, 10 green, 8 red; 12 red, 5 green, 3 blue; 8 red, 8 green, 12 blue; 2 green\n" +
                "Game 53: 2 green, 9 blue, 5 red; 6 red, 3 green; 5 red, 2 green\n" +
                "Game 54: 9 red, 13 blue; 1 green, 9 red, 16 blue; 12 red, 1 blue, 4 green\n" +
                "Game 55: 1 red, 2 blue, 3 green; 1 blue; 1 red, 5 blue, 3 green; 1 blue, 3 green; 5 blue\n" +
                "Game 56: 1 green, 4 red, 1 blue; 1 blue, 2 red, 13 green; 5 blue, 4 red; 13 green, 3 red, 3 blue\n" +
                "Game 57: 13 blue, 2 red, 7 green; 3 green, 4 red, 14 blue; 3 red, 3 green, 3 blue; 7 blue, 5 green, 1 red\n" +
                "Game 58: 6 red; 1 blue, 4 red, 2 green; 3 green, 1 blue; 7 green, 1 red; 6 red, 13 green, 1 blue; 3 red, 13 green, 1 blue\n" +
                "Game 59: 5 green, 10 red, 8 blue; 7 red, 3 green, 2 blue; 6 green, 3 red, 6 blue\n" +
                "Game 60: 2 green, 5 red, 15 blue; 2 green, 9 blue; 9 blue, 8 green, 3 red; 2 green, 6 red, 2 blue\n" +
                "Game 61: 8 blue, 3 green, 4 red; 1 red, 10 blue, 1 green; 4 red, 5 green, 3 blue; 3 red, 8 blue, 5 green\n" +
                "Game 62: 19 blue, 3 red, 14 green; 1 green, 7 blue, 1 red; 15 red, 20 blue, 6 green; 8 red, 4 green, 14 blue\n" +
                "Game 63: 13 red, 1 blue; 18 red, 4 green; 6 green, 9 red, 1 blue; 7 green, 1 blue, 9 red; 5 red, 1 blue, 4 green; 5 green, 1 blue, 17 red\n" +
                "Game 64: 2 green, 1 blue, 5 red; 2 red, 5 green; 6 red, 4 green\n" +
                "Game 65: 1 blue, 7 green, 1 red; 7 red, 1 green; 1 blue, 3 green, 3 red; 7 red, 3 green; 3 green, 7 red; 1 blue, 4 green\n" +
                "Game 66: 7 green, 6 blue, 8 red; 4 green, 9 red, 3 blue; 6 green, 4 blue; 5 blue, 2 green; 6 red, 4 green, 2 blue\n" +
                "Game 67: 10 blue, 17 green, 17 red; 11 red, 9 blue, 9 green; 9 blue, 19 red, 5 green; 5 red, 3 blue, 20 green; 11 red, 1 blue, 7 green\n" +
                "Game 68: 9 green, 4 red, 5 blue; 11 blue, 9 green, 2 red; 11 blue, 2 red, 6 green; 2 green, 6 red, 3 blue; 1 blue, 6 green, 4 red\n" +
                "Game 69: 3 red, 15 blue, 1 green; 4 red, 14 blue, 2 green; 4 red, 18 blue, 4 green\n" +
                "Game 70: 3 red, 8 green; 2 red, 6 green; 4 red, 2 blue, 2 green; 8 red, 1 green, 2 blue; 6 red, 3 blue, 4 green; 13 green, 8 red\n" +
                "Game 71: 3 green, 17 red; 2 red, 3 green; 2 green, 8 red, 1 blue; 11 red, 4 blue; 3 green, 11 red, 3 blue\n" +
                "Game 72: 1 red, 17 blue, 8 green; 2 red, 11 blue, 16 green; 3 red, 16 blue, 1 green; 2 red, 3 green, 10 blue\n" +
                "Game 73: 1 blue, 10 green, 8 red; 19 green, 10 red, 5 blue; 3 green, 13 red, 8 blue; 12 green, 4 blue; 2 green, 10 blue, 12 red\n" +
                "Game 74: 17 blue, 7 red, 10 green; 16 blue, 5 red; 9 blue, 7 green, 2 red; 10 red, 4 green, 14 blue\n" +
                "Game 75: 10 green, 5 blue, 4 red; 7 red, 10 blue, 7 green; 7 blue, 9 green, 2 red\n" +
                "Game 76: 13 green, 16 red, 20 blue; 4 red, 14 blue, 5 green; 12 red, 1 blue, 8 green\n" +
                "Game 77: 4 red, 2 green; 8 blue, 3 green, 2 red; 5 blue, 7 green, 3 red\n" +
                "Game 78: 12 green, 8 red, 8 blue; 10 green, 9 red, 10 blue; 16 blue, 1 red, 17 green; 4 red, 15 green, 13 blue\n" +
                "Game 79: 4 green, 2 red; 15 red, 3 blue; 15 red, 5 green\n" +
                "Game 80: 4 blue, 1 green, 13 red; 13 red, 1 blue, 5 green; 5 blue, 9 red; 3 blue, 3 green; 1 red; 3 red, 7 green, 6 blue\n" +
                "Game 81: 10 red, 3 green, 4 blue; 2 red, 5 green, 16 blue; 3 green, 1 blue; 9 blue, 2 green, 12 red\n" +
                "Game 82: 1 green, 9 blue, 1 red; 10 blue, 1 red, 1 green; 1 green, 7 blue; 8 blue\n" +
                "Game 83: 1 blue, 5 red; 2 blue, 3 red; 1 green, 2 blue, 1 red; 2 red, 1 blue, 1 green; 1 green, 1 blue; 2 red, 1 green\n" +
                "Game 84: 5 red, 14 blue, 2 green; 6 blue, 5 red, 8 green; 12 green, 3 blue, 5 red; 2 red, 10 green; 9 green, 14 blue\n" +
                "Game 85: 2 blue, 2 red; 14 red, 6 green, 5 blue; 5 green, 4 blue, 6 red; 8 red, 5 blue, 6 green\n" +
                "Game 86: 1 blue, 10 red; 4 red; 9 blue, 18 red, 3 green; 1 green, 1 blue, 7 red; 3 green, 8 red, 9 blue; 14 red, 2 green, 4 blue\n" +
                "Game 87: 1 green, 11 red, 8 blue; 1 green, 11 red, 2 blue; 7 red, 4 blue; 6 blue, 1 red, 2 green; 13 blue, 2 green; 6 blue, 12 red, 3 green\n" +
                "Game 88: 2 blue, 4 red, 8 green; 4 blue, 7 red; 3 red, 10 green, 4 blue; 9 green, 3 blue, 5 red; 4 red, 6 blue, 3 green\n" +
                "Game 89: 6 red, 10 green; 15 green, 15 red, 10 blue; 15 red, 1 green, 4 blue; 13 red, 6 blue, 4 green\n" +
                "Game 90: 17 green, 2 red, 1 blue; 6 green; 1 blue, 1 green; 1 blue, 16 green, 3 red; 14 green, 1 red\n" +
                "Game 91: 3 blue, 8 green; 3 green, 7 red, 9 blue; 12 blue; 9 red, 7 blue, 4 green; 1 green, 7 red, 1 blue\n" +
                "Game 92: 11 blue, 9 red, 12 green; 1 blue, 14 red, 6 green; 9 green, 6 red, 6 blue\n" +
                "Game 93: 1 red, 2 blue; 3 blue, 6 green; 1 red, 4 green, 3 blue\n" +
                "Game 94: 3 green, 3 blue; 1 red, 3 blue, 9 green; 3 blue, 10 green, 3 red; 10 green, 6 blue, 2 red; 9 blue, 14 green, 2 red; 1 red, 4 blue, 1 green\n" +
                "Game 95: 7 blue, 10 green; 3 blue, 5 green, 2 red; 4 blue, 10 green, 12 red; 6 green, 2 red, 6 blue\n" +
                "Game 96: 2 blue, 18 green, 8 red; 13 green, 3 blue, 3 red; 3 blue, 15 red, 8 green; 13 green, 10 red, 2 blue\n" +
                "Game 97: 14 blue, 2 red; 15 blue, 1 green, 2 red; 3 red, 6 blue, 1 green; 1 green, 14 blue, 4 red\n" +
                "Game 98: 4 blue, 9 red; 10 red, 1 green, 11 blue; 7 blue, 1 red; 1 red, 6 blue, 1 green\n" +
                "Game 99: 7 red, 6 green, 2 blue; 8 red; 16 green, 7 red, 4 blue\n" +
                "Game 100: 1 red, 1 green, 9 blue; 6 blue, 4 green, 3 red; 4 red, 2 green; 3 green, 2 red, 11 blue; 6 green, 5 blue, 1 red";
        test();
    }

    public void test(){

        String[] cubes = {"12 red", "13 green", "14 blue"};
        int total = 0;

        for(String gameOverview : INPUT.split("\n")){

            boolean couldPass = true;

            String[] game = gameOverview.split(":");
            int gameId = Integer.parseInt(game[0].split(" ")[1]);

            String[] gameCubes = game[1].split(";");

            for(String cubeSet : gameCubes){
                String[] sets = cubeSet.split(",");
                for(String set : sets){
                    set = set.stripLeading();
                    String[] setBreakdown = set.split(" ");

                    int amount = Integer.parseInt(setBreakdown[0]);
                    String color = setBreakdown[1];

                    for(String cube : cubes){
                        String[] cubeBreakdown = cube.split(" ");
                        String cubeColor = cubeBreakdown[1];
                        int cubeAmount = Integer.parseInt(cubeBreakdown[0]);

                        if(cubeColor.equals(color) && cubeAmount < amount){
                            couldPass = false;
                        }

                    }

                }
            }

            if(couldPass){
                total+=gameId;
            }

        }


        System.out.println(total);


    }

}
