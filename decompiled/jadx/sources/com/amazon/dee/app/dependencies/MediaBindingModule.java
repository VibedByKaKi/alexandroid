package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.dee.app.resources.AppStringResources;
import com.amazon.dee.app.resources.DefaultAppStringResources;
import com.amazon.dee.app.ui.main.MainActivity;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class MediaBindingModule {
    @Provides
    @ApplicationScope
    public AppStringResources provideAppStringResources(Context context) {
        return new DefaultAppStringResources(context);
    }

    @Provides
    @ApplicationScope
    @Named("notificationDeepLinkLauncher")
    public Class<?> provideNotificationDeepLinkLauncherClass() {
        return MainActivity.class;
    }
}
