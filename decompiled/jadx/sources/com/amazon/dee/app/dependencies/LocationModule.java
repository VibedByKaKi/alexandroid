package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.location.LocationProvider;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class LocationModule {
    @Provides
    @ApplicationScope
    public LocationProvider provideLocationProvider(Context context) {
        return new LocationProvider(context);
    }
}
