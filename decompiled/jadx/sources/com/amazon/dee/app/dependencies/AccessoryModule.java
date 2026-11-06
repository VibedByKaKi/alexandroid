package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.accessory.Accessories;
import com.amazon.alexa.accessorykit.AccessoriesFactory;
import com.amazon.alexa.api.AlexaServicesConnection;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public final class AccessoryModule {
    static final String ACCESSORIES_ALEXA_SERVICE_CONNECTION = "AccessoriesAlexaServiceConnection";
    private final Context context;

    public AccessoryModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    public Accessories provideAccessories(Context context, @Named("AccessoriesAlexaServiceConnection") AlexaServicesConnection alexaServicesConnection) {
        return AccessoriesFactory.createAccessories(context, alexaServicesConnection, "com.amazon.dee.app", "AlexaMobileAndroid_prod", false, MobilyticsModule.MOBILYTICS_DOMAIN);
    }

    @Provides
    public Context provideContext() {
        return this.context;
    }
}
