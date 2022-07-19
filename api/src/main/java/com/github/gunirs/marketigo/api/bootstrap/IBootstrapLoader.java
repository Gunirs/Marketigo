package com.github.gunirs.marketigo.api.bootstrap;

import java.io.IOException;
import java.nio.file.Path;

public interface IBootstrapLoader {
    void loadCore(Path path) throws IOException;
}
