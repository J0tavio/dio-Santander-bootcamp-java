package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioJoao() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
