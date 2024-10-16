module es.ieslosmontecillos.uicontroltableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.uicontroltableview to javafx.fxml;
    exports es.ieslosmontecillos.uicontroltableview;
}