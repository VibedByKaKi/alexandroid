package com.amazon.alexa.presence.service.dagger;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceContextModule;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultExecutor", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes18.dex */
public final class ForegroundServiceContextModule {

    @NotNull
    private final Context applicationContext;

    public ForegroundServiceContextModule(@NotNull Context context) {
        context.getClass();
        this.applicationContext = context;
    }

    @Provides
    @NotNull
    /* renamed from: defaultExecutor, reason: from getter */
    public final Context getApplicationContext() {
        return this.applicationContext;
    }
}
