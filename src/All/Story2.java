package All;

public class Story2 {

        Game game;
        UI ui;
        VisibilityManagement vm;
        Player player;

    public Story2(Game g,UI userInterface, VisibilityManagement vManager, Player pl){

    game = g;
    ui = userInterface;
    vm = vManager;
    player = pl ;

    }
    public void defaultSetup(){

        ui.hpLabelNumber.setText(""+player.hp);


    }
    public void selectPosition(String nextPositon){

        switch(nextPositon){
            case"meetC": meetC0();break;
            case"meetC1":meetC1();break;
            case"meetC2":meetC2();break;
            case"meetC3":meetC3();break;
            case"note1":note1();break;
            case"teach1":teach1();break;
            case"teach2":teach2();break;
            case"teach3":teach3();break;
            case"note2":note2();break;
            case"note3":note3();break;
            case"leave":leave();break;
            case"End1":End1();break;
            case"Follow":Follow();break;
            case"Follow2":Follow2();break;
            case"finalclass":finalclass();break;
            case"fc1":fc1();break;
            case"fc2":fc2();break;
            case"way1":way1();break;
            case"way2":way2();break;
            case"waynote":waynote();break;
            case"end2":end2();break;
            case"ib":ib();break;
            case"eb":eb();break;
            case"fk":fk();break;
            case"fknote":fknote();break;
            case"End3":End3();break;
            case"BtS":vm.endBehindScences();beind_the_scenes();break;
            case"bts1":beind_the_scenes();break;
            case"bts2":bts2();break;
            case"bts3":bts3();break;

        }

    }

    public void meetC0() {
        ui.mainTextArea.setText("The woman: ”Aandi izhaayan?”\n" +
                "You have no idea what she is talking about.\n" +
                "The woman seems to realize your confusion, \nshe puts down the weapon.");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "meetC1";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void meetC1() {
        ui.mainTextArea.setText("The woman:”gikinoo’amaage, gikinoo’amaage!”\n" +
                "She speaks the phrases slowly and clearly. You remember that you have learned this in your \nclass, and this is the only word you know.");

        ui.choice1.setText("Continue");
        ui.choice2.setText("Back to the last page");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "meetC2";
        game.nextPosition2 = "meetC";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void meetC2() {
        ui.mainTextArea.setText("The woman:”gikinoo’amaage, gikinoo’amaage!”\n" +
                "She speaks the phrases slowly and clearly. You remember that you have learned this in your \nclass, and this is the only word you know.");

        ui.choice1.setText("Continue");
        ui.choice2.setText("Back to the last page");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "meetC3";
        game.nextPosition2 = "meetC1";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void meetC3() {
        ui.mainTextArea.setText("“gikinoo’amaage” is ”to learn”.\n" +
                "You think you’d better write it down before you \nforget it.\n");

        ui.choice1.setText("Take notes");
        ui.choice2.setText("Back to the last page");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "note1";
        game.nextPosition2 = "meetC2";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void note1(){
        ui.mainTextArea.setText("gikinoo’amaage: to learn");



        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "teach1";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    public void teach1(){
        ui.mainTextArea.setText("The woman:”gikinoo’amaage, gikinoo’amaage!”\n" +
                "You supposed she is going to teach you \nsomethings, and you are ready to take notes.\n" +
                "Obviously, her knowledge will be the key to \nyour survival.\n");

        ui.choice1.setText("Check notes");
        ui.choice2.setText("Continue");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "note1";
        game.nextPosition2 = "teach2";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void teach2(){
        ui.mainTextArea.setText("The woman points to herself:”niin”\n" +
                "The woman points to you:”giin”\n" );

        ui.choice1.setText("Take notes");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "note2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void note2(){
        ui.mainTextArea.setText("gikinoo’amaage:to learn  niin:I   \ngiin:you");



        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "teach3";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void teach3(){
        ui.mainTextArea.setText("The woman points to herself then points to you :”niin nawid giin”\n" +
                "The woman points to the trees and the bush:\n”ashkikii.”\n");

        ui.choice1.setText("Take notes");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "note3";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void note3(){
        ui.mainTextArea.setText("gikinoo’amaage:to learn  niin:I\ngiin:you  nawid:and  ashkikii:plant");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "leave";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void leave(){
        ui.mainTextArea.setText("After an experimental teaching and learning, \nthe woman walks deep into the forest.\n" +
                "The woman:”nawid giin!”\n" +
                "\n" +
                "What do you do?\n");

        ui.choice1.setText("Check notes");
        ui.choice2.setText("Follow her");
        ui.choice3.setText("Stay");
        ui.choice4.setText("");

        game.nextPosition1 = "note3";
        game.nextPosition2 = "Follow";
        game.nextPosition3 = "End1";
        game.nextPosition4 = "";
    }
    public void End1(){
        ui.mainTextArea.setText("When you are in the hesitancy, the woman have already leaved.\n" +
                "You try to find a way by yourself, but a familiar \nfallen tree reminds you that you have been \ncircling in the same place.\n<End 1      Losing>");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
    }
    public void Follow(){
        ui.mainTextArea.setText("With her company, you are finally in the mood \nto enjoy the way.\n" +
                "This old forest is full of vitality and hidden \ndangers, making nature so attractive.\n");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "Follow2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void Follow2(){
        ui.mainTextArea.setText("She stops near by a creek and waves her hand.\n You know it is time to rest and study.");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "finalclass";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void finalclass(){
        ui.mainTextArea.setText("She points to this clean creek, some tiny fish \nare shuttling through it:”bizaan.”\n" +
                "She points to the swamp in the distance where \ncarcasses are floating. She puts on a frightened face:”onaabandaa.”");

        ui.choice1.setText("Take notes");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fc1";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void fc1(){
        ui.mainTextArea.setText("gikinoo’amaage:to learn  niin:I\ngiin:you  nawid:and  ashkikii:plant\nbizann:good   onaabadaa:bad");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fc2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void fc2(){
        ui.mainTextArea.setText("It's time to leave.");

        ui.choice1.setText("Check notes");
        ui.choice2.setText("Continue");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fc1";
        game.nextPosition2 = "way1";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void way1(){
        ui.mainTextArea.setText("Departing from the cozy creek, you keep \nmoving forward. \n" +
                "Although you don't know where she will lead you, you trust her guidance.");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "way2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void way2(){
        ui.mainTextArea.setText("You passed by a small bush with some yellow \nberries growing on it. \n" +
                "The woman points to it :”onaabandaa’ashkikii”\n\nWhat do you do?");

        ui.choice1.setText("Check notes");
        ui.choice2.setText("Eat berries");
        ui.choice3.setText("Ignore berries");
        ui.choice4.setText("");

        game.nextPosition1 = "waynote";
        game.nextPosition2 = "eb";
        game.nextPosition3 = "ib";
        game.nextPosition4 = "";
    }
    public void waynote(){
        ui.mainTextArea.setText("gikinoo’amaage:to learn  niin:I\ngiin:you  nawid:and  ashkikii:plant\nbizann:good   onaabadaa:bad");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "way2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void eb(){
        ui.mainTextArea.setText("The woman tries to stop you, but it’s too late.\n" +
                "A searing, acidic fire starts to burn in your \nstomach.\n" +
                "You take 3 damage\n");
        player.hp -= 3;
        if(player.hp > 0){
            ui.hpLabelNumber.setText(""+player.hp);
            ui.choice1.setText("Continue");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "ib";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";}
        else{
            ui.hpLabelNumber.setText(""+player.hp);
            ui.choice1.setText("End 2");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "end2";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
    public void end2(){
        ui.mainTextArea.setText("From the lack of survival skills and an excess of exploratory desire, a pioneer is born, after \nthousands of death.\n\n<End 2    a Pioneer>");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

    }
    public void ib(){
        ui.mainTextArea.setText("You keep moving forward.\n" +
                "A fork in the road appears in front of you.\n");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fk";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    public void fk(){
        ui.mainTextArea.setText("The woman points to the right road:\n”bizaan nawid giin”\n" +
                "The woman points to the left one:\n”bizaan nawid niin”\n" +
                "Then she walks towards the left roud.\n" +
                "What do you do?\n");

        ui.choice1.setText("Check notes");
        ui.choice2.setText("Go left");
        ui.choice3.setText("Go right");
        ui.choice4.setText("");

        game.nextPosition1 = "fknote";
        game.nextPosition2 = "End1";
        game.nextPosition3 = "End3";
        game.nextPosition4 = "";
    }
    public void fknote(){
        ui.mainTextArea.setText("gikinoo’amaage:to learn  niin:I\ngiin:you  nawid:and  ashkikii:plant\nbizann:good   onaabadaa:bad");

        ui.choice1.setText("Continue");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fk";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void End3(){
        ui.mainTextArea.setText("As you step inside, the forest surrounding you \nbegins to fade. Finally, you find yourself in a \nschool corridor, where several classmates pass by and greet to you." +
                "You did it--with the help \nfrom a kind native from thousands of years ago.\n<End 3      Welcome to modern times>");

        ui.choice1.setText("Behind the Scenes");
        game.nextPosition1 = "BtS";
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");


        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void beind_the_scenes(){
        ui.endTextArea.setText("Hi, I'm Cino.\n" +
                "It's a pleasure to see that you've played this far. That means you've made it through the entire \ngame! This game has 4 endings, including an \n“End 0\". If you missed any of them, you can try and find them.\n" +
                "This is my first attempt at creating a literal \n\"video game\". I created it to express thoughts \non indigenous culture that I learned from \n\"Campus, Community, and Culture\" class.");
        ui.endButton1.setText("");
        ui.endButton2.setText("Next");
        game.end1="";
        game.end2="bts2";

    }
    public void bts2(){
        ui.endTextArea.setText("Yes, the indigenous language in the game is \nreal. It is called Anishinaabemowin (Ojibwe), \nfrom the Chippewa people. I tried to simulate a \nlow-intensity survival scenario where the players learn nature knowledge from a Chippewa \nperson and eventually find their way home." +
                "\nDue to my limited coding skills, imperfect \nEnglish, and the limited research time, the \nscenes are not perfectly realistic. I also \napologize for simplifying some of the \nAnishinaabemowin syntax to make the game \neasier to understand.");
        ui.endButton1.setText("Last");
        ui.endButton2.setText("Next");
        game.end1="bts1";
        game.end2="bts3";
    }
    public void bts3(){
        ui.endTextArea.setText("However, I hope my work can convey a positive message and idea: that the Chippewa and \nother indigenous peoples have a splendid \nculture and knowledge system, conveyed \nthrough their own beautiful languages. I believe video games are an ideal medium to give \npeople more opportunities to experience these \ntreasures, to learn from them, and, furthermore, to respect and protect them.\n" +
                "I believe creating experiences and building \nconnections are what video games are about." +
                "\nThank you for reading this.\n");
        ui.endButton1.setText("Last");
        ui.endButton2.setText("");
        game.end1="bts2";
        game.end2="b";
    }
}
