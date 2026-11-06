package com.mapbox.common;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0087 J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¨\u0006\b"}, d2 = {"Lcom/mapbox/common/NativeExceptionController;", "", "()V", "getRethrowNativeExceptions", "", "setRethrowNativeExceptions", "", "value", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class NativeExceptionController {

    @NotNull
    public static final NativeExceptionController INSTANCE = new NativeExceptionController();

    private NativeExceptionController() {
    }

    @JvmStatic
    public static final native boolean getRethrowNativeExceptions();

    @JvmStatic
    public static final native void setRethrowNativeExceptions(boolean value);
}
