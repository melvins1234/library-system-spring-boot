package com.library.sytem.library_system;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModularityTests {
    static ApplicationModules modules = ApplicationModules.of(LibrarySystemApplication.class);

    @Test
    void verifiesModularStructure() {
        modules.verify();
    }
}
