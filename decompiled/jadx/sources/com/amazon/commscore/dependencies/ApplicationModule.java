package com.amazon.commscore.dependencies;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.commscore.dependencies.annotation.ApplicationContext;
import com.amazon.commscore.dependencies.annotation.BuildType;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class ApplicationModule {
    private Context context;

    public ApplicationModule(@NonNull Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationContext
    public Context providesApplicationContext() {
        return this.context;
    }

    @Provides
    @BuildType
    public String providesBuildType() {
        return "release";
    }
}
