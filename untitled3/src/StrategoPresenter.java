//import models.StrategoModel;
//import view.StartScreenView;
//
//public class StrategoPresenter {
//    private StrategoModel model;
//    private StartScreenView view;
//    StrategoModel reverse = new StrategoModel();
//
//    public StrategoPresenter(
//            StrategoModel model, StartScreenView view) {
//        this.model = model;
//        this.view = view;
//
//        addEventHandlers();
//        updateView();
//    }
//    private void addEventHandlers() {
//        // Add event handlers (inner classes or
//        // lambdas) to view controls.
//        // In the event handlers: call model methods
//        // and updateView().
//
//        view.getButton().setOnAction( (event) ->  {
//
//            if (view.getTextField().getText().isEmpty()){
//                view.getTextField().setText("enter name here");
//            }
//            else {
//
//                reverse.setText(view.getTextField().getText());
//                reverse.reverse();
//                updateView();
//
//            }
//
//
//
//
//
//        });
//
//
//
//
//    }
//
//
//    private void updateView() {
//
//
//        view.getTextField().setText(reverse.getText());
//
//    }
//
//}
