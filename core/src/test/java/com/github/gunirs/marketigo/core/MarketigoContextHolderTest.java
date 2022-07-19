package com.github.gunirs.marketigo.core;

import com.github.gunirs.marketigo.api.IMarketigoContext;
import com.github.gunirs.marketigo.core.exception.ContextNotInitializedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class MarketigoContextHolderTest {
    @BeforeEach
    public void beforeEach() {
        MarketigoContextHolder.setContext(null);
    }

    @Test
    public void GetContext_WhenContextInitialized_ReturnInstanceIMarketigoContext() throws ContextNotInitializedException {
        IMarketigoContext marketigoContextMock = Mockito.mock(IMarketigoContext.class);

        MarketigoContextHolder.setContext(marketigoContextMock);
        IMarketigoContext actualContext = MarketigoContextHolder.getContext();

        assertThat(actualContext).isNotNull();
        assertThat(actualContext).isInstanceOf(IMarketigoContext.class);
    }

    @Test
    public void GetContext_WhenContextNotInitialized_ThrowContextNotInitializedException() {
        assertThatExceptionOfType(ContextNotInitializedException.class)
                .isThrownBy(MarketigoContextHolder::getContext);
    }
}
