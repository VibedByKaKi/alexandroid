package com.amazon.alexa.protocols.features;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.identity.api.UserIdentity;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface FeatureFilter {
    default boolean hasAccess(@Nullable UserIdentity userIdentity, @NonNull String str, @NonNull Set<String> set) {
        return false;
    }

    @NonNull
    Set<String> targetedFeatures();

    default boolean hasAccess(@NonNull String str, @NonNull Set<String> set) {
        return false;
    }
}
