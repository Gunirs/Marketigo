package com.github.gunirs.marketigo.core;

import com.github.gunirs.marketigo.api.IMarketigoContext;
import com.github.gunirs.marketigo.api.bootstrap.IBootstrapLoader;
import com.github.gunirs.marketigo.core.bootstrap.BootstrapLoader;
import com.github.gunirs.marketigo.core.exception.ContextNotInitializedException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MarketigoContextHolder {
    @Setter
    private static IMarketigoContext context;

    private static IBootstrapLoader bootstrapLoader;

    public static IMarketigoContext getContext() throws ContextNotInitializedException {
        if (context == null) {
            throw new ContextNotInitializedException("Context not initialized.");
        }

        return context;
    }

    public static IBootstrapLoader getBootstrapLoader() {
        if (bootstrapLoader == null) {
            bootstrapLoader = new BootstrapLoader();
        }

        return bootstrapLoader;
    }
}
