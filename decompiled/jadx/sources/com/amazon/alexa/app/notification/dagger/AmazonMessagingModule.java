package com.amazon.alexa.app.notification.dagger;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes.dex */
public class AmazonMessagingModule {
    @Provides
    @Singleton
    public ADM provideADM(Context context) {
        return new ADM(context);
    }
}
