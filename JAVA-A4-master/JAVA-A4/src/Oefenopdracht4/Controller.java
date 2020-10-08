package Oefenopdracht4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Controller extends JPanel{
    JButton clickButton;
    private View view;
    private Model model;

    public Controller(){
        model = new Model();
        view = new View();
        this.add(view);
        clickButton = new JButton("Click");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                view.setDisplay(model.getNameArray().toString());
            }
        });
        this.add(clickButton);
    }
}
