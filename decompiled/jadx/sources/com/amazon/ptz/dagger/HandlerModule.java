package com.amazon.ptz.dagger;

import android.os.Handler;
import android.os.Looper;
import com.amazon.ptz.util.Qualifiers;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class HandlerModule {
    @Provides
    @Qualifiers.UiThread
    public Handler provideMainHandler() {
        return new Handler(Looper.getMainLooper());
    }
}
