package starter;

import controllers.Controller;
import controllers.StartScreenController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    private String team = "team 13";
    private String TITLE = (String.format("STRATEGO TEAM 13 - %s", team));
    private int WIDTH = 640;
    private int HEIGHT = 480;
    private static Stage stage;



    @Override
    public void start(Stage stage) {

        MainApplication.stage = stage;

        stage.setTitle(TITLE);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
        stage.show();

        switchController(new StartScreenController());
//
//        StrategoModel model = new StrategoModel();
    //   StartScreenView view = new StartScreenView();
//        new StrategoPresenter(model, view);
//
//        stage.setScene(new Scene(view.getRoot()));
//        stage.show();
    }

    public static void switchController(Controller controller) {
        stage.setScene(new Scene(controller.getView().getRoot()));
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
