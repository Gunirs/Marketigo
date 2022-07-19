package com.github.gunirs.marketigo.core.bootstrap;

import com.github.gunirs.marketigo.api.bootstrap.IBootstrapLoader;

import java.io.IOException;
import java.nio.file.Path;

public final class BootstrapLoader implements IBootstrapLoader {
    @Override
    public void loadCore(Path path) throws IOException {
        // FIXME: 19.07.2022
        // MarketigoContextHolder.setContext()
    }
}
