package com.amazon.ptz.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Qualifiers {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface EndTutorial {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface StartLoadingAnimation {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface StopLoadingAnimation {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UiThread {
    }
}
