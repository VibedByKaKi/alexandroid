package com.amazon.dee.app.dependencies;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class ApplicationModule {
    Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationScope
    public Application provideApplication() {
        return this.application;
    }

    @Provides
    @ApplicationScope
    public Context provideContext() {
        return this.application.getApplicationContext();
    }
}
