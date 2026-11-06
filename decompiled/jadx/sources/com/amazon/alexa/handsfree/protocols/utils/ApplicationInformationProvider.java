package com.amazon.alexa.handsfree.protocols.utils;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ApplicationInformationProvider {
    @Nullable
    Integer getDspAppBuildCode();

    @Nullable
    Integer getFalcoLibBuildCode();

    @Nullable
    Integer getVoxAppBuildCode();
}
