package com.bugsnag.android;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class NativeBugsnagSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BugsnagReactNative";

    public NativeBugsnagSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addFeatureFlag(String str, @Nullable String str2);

    @DoNotStrip
    @ReactMethod
    public abstract void addFeatureFlags(ReadableArray readableArray);

    @DoNotStrip
    @ReactMethod
    public abstract void addMetadata(String str, @Nullable ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void clearFeatureFlag(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void clearFeatureFlags();

    @DoNotStrip
    @ReactMethod
    public abstract void clearMetadata(String str, @Nullable String str2);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap configure(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void configureAsync(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean dispatch(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void dispatchAsync(ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getPayloadInfo(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void getPayloadInfoAsync(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void leaveBreadcrumb(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void pauseSession();

    @DoNotStrip
    @ReactMethod
    public abstract void resumeSession();

    @DoNotStrip
    @ReactMethod
    public abstract void resumeSessionOnStartup();

    @DoNotStrip
    @ReactMethod
    public abstract void startSession();

    @DoNotStrip
    @ReactMethod
    public abstract void updateCodeBundleId(@Nullable String str);

    @DoNotStrip
    @ReactMethod
    public abstract void updateContext(@Nullable String str);

    @DoNotStrip
    @ReactMethod
    public abstract void updateUser(@Nullable String str, @Nullable String str2, @Nullable String str3);
}
