package All;

public class Story {

    Game game;
    UI ui;
    VisibilityManagement vm;
    Player player;
    //Player player = new Player();

    public Story(Game g,UI userInterface, VisibilityManagement vManager,Player pl){

        game = g;
        ui = userInterface;
        vm = vManager;
        player = pl;

    }

    public void defaultSetup(){

        player.hp =5;
        ui.hpLabelNumber.setText(""+player.hp);


    }
    public void selectPosition(String nextPositon){

        switch(nextPositon){
            case "conForest": conForest();break;
            case "leaveForest": leaveForest();break;
            case"E":goE();break;
            case"E2":goE2();break;
            case"E3":goE3();break;
            case"S":goS();break;
            case"S2":goS2();break;
            case"W":goW();break;
            case"W2":goW2();break;
            case"W3":goW3();break;
            case"N":goN();break;
            case"N2":goN2();break;
            case"N3":goN3();break;
            case"meet":meet();break;
            case"meet2":meet2();break;
            case"end0":end0();break;
            case"as":forest();break;
        }

    }

    public void forest(){
        ui.mainTextArea.setText("A lovely day.\nYou realize you have been trapped in this\nweird place. \nJust a few minutes ago, you were on your way \nto EAP class, and suddenly, you are here.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "conForest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void conForest(){
        ui.mainTextArea.setText("The cloudless blue sky is above your head, \nthe soft moist soil is under your feet, and the \nendless primitive forest surrounds you.\n" + "Perhaps you accidentally travel through time, \nback to hundreds even thousands of years ago.\n");
        ui.choice1.setText("Continue");
        ui.choice2.setText("Back to the last page");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leaveForest";
        game.nextPosition2 = "as";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    public void leaveForest() {
        //position = "leaveForest";
        ui.mainTextArea.setText("Staying in a primeval forest is not a wise idea, \nyou decide to move.\n\nWhere do you go?");
        ui.choice1.setText("Go East");
        ui.choice2.setText("Go South");
        ui.choice3.setText("Go West");
        ui.choice4.setText("Go North");

        game.nextPosition1 = "E";
        game.nextPosition2 = "S";
        game.nextPosition3 = "W";
        game.nextPosition4 = "N";
    }

    public void goE() {
        //position = "E";
        ui.mainTextArea.setText("You are stopped by a cliff.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "E2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void goE2() {
        //position = "E2";
        ui.mainTextArea.setText("You can see another forest below, reminding \nyou of the green fleece blanket. \nThe sun appears on the horizon, emitting gentle light. \nA group of unknown birds fly over, like a \nfew white pixels in the sky.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("Back to the last page");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "E3";
        game.nextPosition2 = "E";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void goE3() {
        //position = "E3";
        ui.mainTextArea.setText("A nice view. \nIt seems to be morning now.");
        ui.choice1.setText("Back to the crossroad");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leaveForest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void goS() {
        //position = "S";
        ui.mainTextArea.setText("You are stopped by a giant fallen trunk.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "S2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void goS2() {
        //position = "S2";
        ui.mainTextArea.setText("You observe the huge stake nearby. \nThere are countless rings on the exposed \nsurface.");
        ui.choice1.setText("Back to the crossroad");
        ui.choice2.setText("Back to the last page");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leaveForest";
        game.nextPosition2 = "S";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void goW() {
        //position = "W";
        ui.mainTextArea.setText("Endless forest.");
        ui.choice1.setText("Back");
        ui.choice2.setText("Move forward");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leaveForest";
        game.nextPosition2 = "W2";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void goW2() {
       // position = "W2";
        ui.mainTextArea.setText("You are stopped by bushes.\n" +
                "The bushes are slightly shaking.\n" +
                "There seemed to be something living inside……\n");
        ui.choice1.setText("Back");
        ui.choice2.setText("Walk closer");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "W";
        game.nextPosition2 = "W3";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void goW3() {
        //position = "W3";
        ui.mainTextArea.setText("You are bitten by a snake disguised as a stick.\n" +
                "A sharp pain shoots through you. You hope it is not venomous.\n\n" +
                "You take 2 damage.\n");
        player.hp -= 2;
        if(player.hp > 0){
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("Back to the crossroad");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leaveForest";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";}
        else{
            ui.hpLabelNumber.setText(""+player.hp);
            ui.choice1.setText("End 0");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "end0";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }



    }

    public void end0(){
        ui.mainTextArea.setText("You feel a sense of total desperation.\nYou are just a fresh student. \nHow dare you believe you can deicide your fate in front of nature?\nAt least, you can choose an end.\n<End 0    the Same River>");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

    }

    public void goN(){
        //position = "N";
        ui.mainTextArea.setText("Endless forest.");
        ui.choice1.setText("Back");
        ui.choice2.setText("Move forward");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leaveForest";
        game.nextPosition2 = "N2";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    public void goN2(){
        //position = "N2";
        ui.mainTextArea.setText("Endless forest.");
        ui.choice1.setText("Back");
        ui.choice2.setText("Move forward");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "N";
        game.nextPosition2 = "N3";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    public void goN3(){
        //position = "N3";
        ui.mainTextArea.setText("You are stopped by bushes.\n" +
                "The bushes are slightly shaking.\n" +
                "There seemed to be something living inside……\n");
        ui.choice1.setText("Back");
        ui.choice2.setText("Walk closer");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "N2";
        game.nextPosition2 = "meet";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    //meet//////////////////////////////////////////////////////////////////////////////////
    public void meet(){
        //position = "meet";
        ui.mainTextArea.setText("A strange woman shows up.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "meet2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void meet2(){
        //position = "meet2";

        game.chapter = 1;

        ui.mainTextArea.setText("Dressed in a red robe with intricate patterns, she holds a lance and wears several weird but \nbeautiful plumes on her head.\n" +
                "You assume she is one of the indigenous \npeople.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "meetC";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

}
