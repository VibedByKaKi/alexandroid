package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.dee.app.services.accessibility.AccessibilityService;
import com.amazon.dee.app.services.accessibility.DefaultAccessibilityService;
import com.amazon.dee.app.services.bluetooth.BluetoothService;
import com.amazon.dee.app.services.bluetooth.DefaultBluetoothService;
import com.amazon.dee.app.services.mlkit.BarcodeModulePreloader;
import com.amazon.dee.app.services.mlkit.MlKitBarcodeModulePreloader;
import com.amazon.dee.app.services.useragent.UserAgentService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class DeviceModule {
    @Provides
    @ApplicationScope
    public AccessibilityService provideAccessibilityService(Context context, Mobilytics mobilytics) {
        return new DefaultAccessibilityService(context, mobilytics);
    }

    @Provides
    @ApplicationScope
    public BluetoothService provideBluetoothService(Context context, MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar, Lazy<Mobilytics> lazy) {
        return new DefaultBluetoothService(context, mainActivityLifecycleObserverRegistrar, lazy);
    }

    @Provides
    @ApplicationScope
    public UserAgentService provideUserAgentService() {
        return new DeviceModule$$ExternalSyntheticLambda0();
    }

    @Provides
    @ApplicationScope
    public BarcodeModulePreloader provideBarcodeModulePreloader(MlKitBarcodeModulePreloader mlKitBarcodeModulePreloader) {
        return mlKitBarcodeModulePreloader;
    }
}
