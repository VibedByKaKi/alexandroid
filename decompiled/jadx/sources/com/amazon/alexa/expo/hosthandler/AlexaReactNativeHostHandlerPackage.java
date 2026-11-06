package com.amazon.alexa.expo.hosthandler;

import android.content.Context;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaReactNativeHostHandlerPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<ReactNativeHostHandler> createReactNativeHostHandlers(Context context) {
        return Collections.singletonList(new AlexaReactNativeHostHandler());
    }
}
