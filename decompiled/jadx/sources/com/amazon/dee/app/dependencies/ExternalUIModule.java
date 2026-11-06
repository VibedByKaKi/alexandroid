package com.amazon.dee.app.dependencies;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class ExternalUIModule {
    Activity activity;

    public ExternalUIModule(Activity activity) {
        this.activity = activity;
    }

    @ExternalUIScope
    @Provides
    public Activity provideActivity() {
        return this.activity;
    }
}
