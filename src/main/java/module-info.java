module es.etg.tierno.prog.simulacro {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.etg.tierno.prog.simulacro to javafx.fxml;
    exports es.etg.tierno.prog.simulacro;
}
