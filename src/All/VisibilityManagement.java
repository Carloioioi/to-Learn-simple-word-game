package All;

public class VisibilityManagement {

    UI ui;

    public VisibilityManagement(UI userInterface){

        ui = userInterface;

    }

    public void showTitleScreen(){

        //show the title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        ui.subTitlePanel.setVisible(true);

        //hide the game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);

        ui.endButtonPanel.setVisible(false);
        ui.endPanel.setVisible(false);
    }
    public void titleToForest(){

        //Hide the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.subTitlePanel.setVisible(false);

        //Show the game screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

        ui.endButtonPanel.setVisible(false);
        ui.endPanel.setVisible(false);
    }
    public void endBehindScences(){
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.subTitlePanel.setVisible(false);


        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);

        ui.endButtonPanel.setVisible(true);
        ui.endPanel.setVisible(true);
    }
}
