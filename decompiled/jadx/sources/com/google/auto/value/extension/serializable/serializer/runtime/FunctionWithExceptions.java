package com.google.auto.value.extension.serializable.serializer.runtime;

import java.util.function.Function;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class FunctionWithExceptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface FunctionWithException<I, O> {
        O apply(I i) throws Exception;
    }

    private FunctionWithExceptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$wrapper$0(FunctionWithException functionWithException, Object obj) {
        try {
            return functionWithException.apply(obj);
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static <I, O> Function<I, O> wrapper(FunctionWithException<I, O> functionWithException) {
        return new Functions$$ExternalSyntheticLambda11(functionWithException, 16);
    }
}
