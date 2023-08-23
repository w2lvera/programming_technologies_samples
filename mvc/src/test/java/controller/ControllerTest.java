package controller;

import model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    void testCreation() {
        Controller c = new Controller();
        Model model = c.model;
        Assertions.assertNotNull(model);
        Assertions.assertNotNull(model.getCurrentShape());
    }

    @Test
    void testTranslation() {
        Controller c = new Controller();
        Assertions.assertTrue(c.translate() instanceof java.awt.Rectangle);
    }
}
