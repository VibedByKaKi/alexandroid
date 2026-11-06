package com.amazon.alexa.android.ui;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class ActivityStarterModule {
    @Provides
    public static ActivityStarter provideActivityStarter(Context context) {
        return new PluggableActivityStarter(new DefaultActivityStarter(context));
    }
}
