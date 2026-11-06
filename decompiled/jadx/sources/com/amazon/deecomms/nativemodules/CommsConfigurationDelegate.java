package com.amazon.deecomms.nativemodules;

import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.commsconfiguration.CommsConfigurationAPI;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsConfigurationDelegate implements CommsConfigurationAPI {
    public static final String MODULE_NAME = "CommsConfiguration";
    private final ArcusConfig mArcusConfig;

    @Nullable
    private ReactApplicationContext reactContext;

    public CommsConfigurationDelegate(ArcusConfig arcusConfig) {
        this.mArcusConfig = arcusConfig;
    }

    @Override // com.amazon.alexa.elements.turbomodules.commsconfiguration.CommsConfigurationAPI
    public void getValueForPath(String str, Promise promise) {
        promise.resolve(this.mArcusConfig.getConfigString(str));
    }

    @Override // com.amazon.alexa.elements.turbomodules.commsconfiguration.CommsConfigurationAPI
    public void setReactContext(@Nullable ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
    }
}
