package All;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {




    ChoiceHandler cHandler = new ChoiceHandler();

    UI ui = new UI();
    Player player = new Player();
    VisibilityManagement vm = new VisibilityManagement(ui);
    Story story = new Story(this, ui, vm, player);
    Story2 story2 = new Story2(this, ui, vm, player);

    public int chapter = 0;

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4,end1,end2;

    public static void main(String[] args) {

        new Game();


    }

    public Game() {

        ui.createUI(cHandler);
        story.defaultSetup();
        vm.showTitleScreen();


    }



    public class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (chapter) {
                case 0:

                switch (yourChoice) {
                    case "start":
                        vm.titleToForest();
                        story.forest();
                        break;
                    case "c1":
                        story.selectPosition(nextPosition1);
                        break;
                    case "c2":
                        story.selectPosition(nextPosition2);
                        break;
                    case "c3":
                        story.selectPosition(nextPosition3);
                        break;
                    case "c4":
                        story.selectPosition(nextPosition4);
                        break;
                }
                case 1:
                    switch (yourChoice) {
                        case "c1":
                            story2.selectPosition(nextPosition1);
                            break;
                        case "c2":
                            story2.selectPosition(nextPosition2);
                            break;
                        case "c3":
                            story2.selectPosition(nextPosition3);
                            break;
                        case "c4":
                            story2.selectPosition(nextPosition4);
                            break;
                        case"end1":
                            story2.selectPosition(end1);
                            break;
                        case"end2":
                            story2.selectPosition(end2);
                            break;
                    }

            }
        }
    }
}