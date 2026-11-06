package com.amazon.alexa.elements.turbomodules;

import androidx.room.Room$$ExternalSyntheticBUOutline0;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeDeviceInformationSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DeviceInformationModule";

    public NativeDeviceInformationSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void get(Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @DoNotStrip
    @Nullable
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet(Arrays.asList("amazonInfo", "bundle", "device", "system"));
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                Room$$ExternalSyntheticBUOutline0.m("Native Module Flow doesn't declare constants: %s", new Object[]{hashSet3});
                return null;
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                Room$$ExternalSyntheticBUOutline0.m("Native Module doesn't fill in constants: %s", new Object[]{hashSet});
                return null;
            }
        }
        return typedExportedConstants;
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getDeviceInfo(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getDevicePartnerInfo(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "DeviceInformationModule";
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @DoNotStrip
    @ReactMethod
    public abstract void navigateToAlexaSettingOnFireOS(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d);
}
