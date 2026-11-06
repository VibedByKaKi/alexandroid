package com.amazon.ptz.gestures.handlers;

import com.amazon.ptz.gestures.Gesture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface GestureHandler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Router {
    }

    boolean canHandle(Gesture gesture);

    void handle(Gesture gesture);
}
