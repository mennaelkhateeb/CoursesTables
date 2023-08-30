module tables.coursestables {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens tables.coursestables to javafx.fxml;
    exports tables.coursestables;
}