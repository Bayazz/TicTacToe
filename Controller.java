package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    public Label label;
    private boolean turnX = true;
    private boolean playabe = true;
    private int buttonID;
    Button button;
    Stage window;



    String[] simpleArray = {"1","2","3","4","5","6","7","8","9"};

    public void setWindow (Stage window){
        this.window = window;

    }




    public void setOnAction(ActionEvent actionEvent) {


        buttonID = Integer.parseInt(((Button)actionEvent.getSource()).getId());

        button = (Button) actionEvent.getSource();


        if (button.getText().isEmpty()&&playabe){

            if (turnX){
                button.setText("X");
                fixData();
                checkWinner();

                turnX = false;

            }else {
                button.setText("0");
                fixData();
                checkWinner();

                turnX = true;

            }

        }

    }

    public void fixData(){
        if (buttonID == 1){
            simpleArray[0] = button.getText();
        }else if (buttonID == 11){
            simpleArray[1] = button.getText();
        }else if (buttonID == 111){
            simpleArray[2] = button.getText();
        }else if (buttonID == 2){
            simpleArray[3] = button.getText();
        }else if (buttonID == 22){
            simpleArray[4] = button.getText();
        }else if (buttonID == 222){
            simpleArray[5] = button.getText();
        }else if (buttonID == 3){
            simpleArray[6] = button.getText();
        }else if (buttonID == 33){
            simpleArray[7] = button.getText();
        }else if (buttonID == 333){
            simpleArray[8] = button.getText();
        }
    }

    public void checkWinner(){


        if ((simpleArray[0] == simpleArray[1]) &&(simpleArray[0]== simpleArray[2])){
            showResult();
        }else if ((simpleArray[3] == simpleArray[4]) &&(simpleArray[4]== simpleArray[5])){
            showResult();
        }else if ((simpleArray[6] == simpleArray[7]) &&(simpleArray[7]== simpleArray[8])){
            showResult();
        }else if ((simpleArray[0] == simpleArray[3]) &&(simpleArray[3]== simpleArray[6])){
            showResult();
        }
        else if ((simpleArray[1] == simpleArray[4]) &&(simpleArray[4]== simpleArray[7])){
            showResult();
        }
        else if ((simpleArray[2] == simpleArray[5]) &&(simpleArray[5]== simpleArray[8])){
            showResult();
        }
        else if ((simpleArray[0] == simpleArray[4]) &&(simpleArray[4]== simpleArray[8])){
            showResult();
        }else if ((simpleArray[2] == simpleArray[4]) &&(simpleArray[4]== simpleArray[6])){
            showResult();
        }
    }
    public void showResult(){
        label.setText("Attention! " + button.getText() + " WON!");
        playabe = false;
    }

    public void restartOnAction(ActionEvent actionEvent)throws Exception{

        window.close();
        new Main().start(new Stage());

    }


}
