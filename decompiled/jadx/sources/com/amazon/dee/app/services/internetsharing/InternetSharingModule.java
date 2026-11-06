package com.amazon.dee.app.services.internetsharing;

import android.app.Application;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.internetsharing.nan.NanSubscriberManager;
import com.amazon.dee.app.services.internetsharing.nan.NanSubscriberManagerImpl;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class InternetSharingModule {
    @Provides
    @ApplicationScope
    public InternetSharingManager provideInternetSharingManager(Application application, NanSubscriberManager nanSubscriberManager) {
        return new InternetSharingManagerImpl(application, nanSubscriberManager);
    }

    @Provides
    @ApplicationScope
    public NanSubscriberManager provideNanSubscriberManager(Application application) {
        return new NanSubscriberManagerImpl(application);
    }
}
