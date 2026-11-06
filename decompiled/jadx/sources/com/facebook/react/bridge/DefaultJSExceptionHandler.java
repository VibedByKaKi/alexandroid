package com.facebook.react.bridge;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/DefaultJSExceptionHandler;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "<init>", "()V", "handleException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultJSExceptionHandler implements JSExceptionHandler {
    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(@NotNull Exception e) {
        e.getClass();
        if (!(e instanceof RuntimeException)) {
            throw new RuntimeException(e);
        }
    }
}
