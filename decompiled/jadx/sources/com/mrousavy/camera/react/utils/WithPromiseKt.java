package com.mrousavy.camera.react.utils;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.core.CameraError;
import com.mrousavy.camera.core.UnknownCameraError;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"withPromise", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "closure", "Lkotlin/Function0;", "", "react-native-vision-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WithPromiseKt {
    public static final void withPromise(@NotNull Promise promise, @NotNull Function0<? extends Object> function0) {
        promise.getClass();
        function0.getClass();
        try {
            promise.resolve(function0.invoke());
        } catch (Throwable th) {
            th.printStackTrace();
            CameraError unknownCameraError = th instanceof CameraError ? th : new UnknownCameraError(th);
            promise.reject(a$$ExternalSyntheticOutline0.m$1(unknownCameraError.getDomain(), "/", unknownCameraError.getId()), unknownCameraError.getMessage(), unknownCameraError.getCause());
        }
    }
}
