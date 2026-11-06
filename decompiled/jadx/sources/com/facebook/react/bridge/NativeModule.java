package com.facebook.react.bridge;

import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface NativeModule {
    @Deprecated
    default boolean canOverrideExistingModule() {
        return false;
    }

    @Nonnull
    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
