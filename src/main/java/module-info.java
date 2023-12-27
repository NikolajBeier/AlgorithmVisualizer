module com.av.algorithmvisualizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.av.algorithmvisualizer to javafx.fxml;
    exports com.av.algorithmvisualizer;
}