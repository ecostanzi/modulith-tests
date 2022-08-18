package com.example.modulithtest.modules;

import org.junit.jupiter.api.Test;
import org.moduliths.docs.Documenter;
import org.moduliths.model.Modules;

import java.io.IOException;

public class ModuleTest {

    @Test
    void testModules() throws IOException {
        var modules = Modules.of("com.example.modulithtest.modules");
        modules.forEach(System.out::println);

        var canvasOptions = Documenter.CanvasOptions.defaults();
        var options = Documenter.Options.defaults();
        new Documenter(modules).writeDocumentation(options, canvasOptions);

        modules.verify();
    }
}
