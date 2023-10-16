package com.example.xdlolkalkulaor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public String d1 = "";
    public String d2 = "";
    public double n1 = 0;
    public double n2 = 0;
    public int op = 0;
    @FXML
    private Label welcomeText;
    public TextArea Text1;

    public TextArea result;
    public String op1 = "";


    @FXML
    public void button1(){
        digit(1);
    }
    @FXML
    public void button2(){
        digit(2);
    }
    @FXML
    public void button3(){
        digit(3);
    }
    @FXML
    public void button4(){
        digit(4);
    }
    @FXML
    public void button5(){
        digit(5);
    }
    @FXML
    public void button6(){
        digit(6);
    }
    @FXML
    public void button7(){
        digit(7);
    }
    @FXML
    public void button8(){digit(8);}
    @FXML
    public void button9(){
        digit(9);
    }
    @FXML
    public void buttonPlus(){
        calcText("+");

    }
    public void calcText (String x){
        if (op1!=""){
            result.setText(result.getText()+ d1 + x);
        }
        if (op1 == ""){
            d1 = d2;
            d2 = "";
            op1 = x;
        }
        else if (op1 == "+"){
            d1 = Double.parseDouble(d1)+ Double.parseDouble(d2)+ "";
            Text1.setText(d1);
            d2 = "";
        }
        else if (op1 == "-"){
            d1 = Double.parseDouble(d1) - Double.parseDouble(d2)+ "";
            Text1.setText(d1);
            d2 = "";
        }
        else if (op1 == "*"){
            d1 = Double.parseDouble(d1) * Double.parseDouble(d2)+ "";
            Text1.setText(d1);
            d2 = "";
        }
        else if (op1 == "/"){
            d1 = Double.parseDouble(d1) / Double.parseDouble(d2)+ "";
            Text1.setText(d1);
            d2 = "";
        }

        op1 = x;
    }
    public double calc (double n1, double n2, int op){
        if (op==1) return n1 + n2 ;
        if (op==2) return n1 - n2 ;
        if (op==3) return n1 * n2 ;
        if (op==4) return n1 / n2 ;
        return 0;
    }
    public void digit(int x){
        d2 += x;
        Text1.setText(d2);
    }

    @FXML
    public void buttonMinus(){
    calcText("-");
    }
    @FXML
    public void buttonX() {
    calcText("*");

    }
    @FXML
    public void buttonDivide() {
        calcText("/");
    }
    public void buttonDelete() {
        if(Text1.getText().length()>0)
        Text1.setText(Text1.getText().substring(0,Text1.getText().length()-1));
    }
    @FXML
    public void buttonEqual() {
        calcText("");
        d2 = d1;

    }
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}