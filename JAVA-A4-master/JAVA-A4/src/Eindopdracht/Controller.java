package Eindopdracht;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void handleUserInput(String n1, String op, String n2) {
        int i1 = Integer.parseInt(n1);
        int i2 = Integer.parseInt(n2);
        int res = this.model.calculate(i1, op, i2);
        this.view.setResult(String.valueOf(res));
    }

    public void start() {
        this.view.show();
    }

}

