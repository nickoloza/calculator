package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    String symbol;
    int exception = 0;
    float i ;
    float k ;
    float result ;
    float l;
    String j ;

    @FXML
    private Label Mylabel;


    @FXML
    private void handleButtonzero() {
        numChange(0);
    }

    @FXML
    private void handleButtonOne() {
        numChange(1);
    }

    @FXML
    private void handleButtonTwo() {
        numChange(2);
    }

    @FXML
    private void handleButtonthree() {
        numChange(3);
    }

    @FXML
    private void handleButtonfour() {
        numChange(4);
    }

    @FXML
    private void handleButtonfive() {
        numChange(5);
    }

    @FXML
    private void handleButtonsix() {
        numChange(6);
    }

    @FXML
    private void handleButtonseven() {
        numChange(7);
    }

    @FXML
    private void handleButtoneight() {
        numChange(8);
    }
    @FXML
    private void handleButtonnine() {
        numChange(9);
    }



    @FXML
    private void handleButtonplus() {
        symbol = "+";
        second();
    }


    @FXML
    private void handleButtonminuse() {
        symbol = "-";
        second();
    }

    @FXML
    private void handleButtonmultiply() {
        symbol = "*";
        second();
    }

    @FXML
    private void handleButtondevide() {
        symbol = "/";
        second();
    }




    private void numChange(int num) {
        i =i*10 + num;
        j=Float.toString(i);
        l = i;
        Mylabel.setText(j);

    }


    public void second() {

        if (k == 0 && exception == 1) {
            k = 0;
            exception = 0;

        }else if (k == 0 && exception == 0){
            k = l;
        }
        Mylabel.setText(" ");
        i=0;
    }

    public void equal(String what) {




    }

    public void result() {
        if (symbol == "+"){
            result = i + k;
        }else if (symbol == "-") {
            result = k - i;
        }else if (symbol == "*") {
            result = i * k;
        }else if (symbol == "/") {
            result = k / i;
        }


        j=Float.toString(result);
        Mylabel.setText(j);

        k=result;
        if (k == 0){
            exception = 1;
        }

    }

    public void delete() {
        k=0;
        i=0;
        result = 0;
        Mylabel.setText("---");
    }

}
