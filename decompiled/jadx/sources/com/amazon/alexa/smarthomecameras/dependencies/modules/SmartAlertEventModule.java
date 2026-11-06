package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.google.common.base.Preconditions;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class SmartAlertEventModule {
    private String imageUrl;

    public SmartAlertEventModule(String str) {
        Preconditions.checkNotNull(str, "imageUrl cannot be null");
        this.imageUrl = str;
    }

    @Provides
    public String providesImageUrl() {
        return this.imageUrl;
    }
}
