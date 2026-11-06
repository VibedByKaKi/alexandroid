package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.content.Context;
import com.google.common.base.Preconditions;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class ContextModule {
    private final Context context;

    public ContextModule(Context context) {
        Preconditions.checkNotNull(context, "Context cannot be null");
        this.context = context;
    }

    @Provides
    @Singleton
    public Context providesContext() {
        return this.context;
    }
}
