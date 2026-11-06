package com.bugsnag.android;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class NativeBugsnagImpl extends NativeBugsnagSpec {
    private final BugsnagReactNativeImpl impl;

    public NativeBugsnagImpl(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new BugsnagReactNativeImpl(reactApplicationContext);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void addFeatureFlag(String str, @Nullable String str2) {
        this.impl.addFeatureFlag(str, str2);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void addFeatureFlags(ReadableArray readableArray) {
        this.impl.addFeatureFlags(readableArray);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void addMetadata(String str, ReadableMap readableMap) {
        this.impl.addMetadata(str, readableMap);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void clearFeatureFlag(String str) {
        this.impl.clearFeatureFlag(str);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void clearFeatureFlags() {
        this.impl.clearFeatureFlags();
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void clearMetadata(String str, @Nullable String str2) {
        this.impl.clearMetadata(str, str2);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public WritableMap configure(ReadableMap readableMap) {
        return this.impl.configure(readableMap);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void configureAsync(ReadableMap readableMap, Promise promise) {
        this.impl.configureAsync(readableMap, promise);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public boolean dispatch(ReadableMap readableMap) {
        return this.impl.dispatch(readableMap);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void dispatchAsync(ReadableMap readableMap, Promise promise) {
        this.impl.dispatchAsync(readableMap, promise);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeBugsnagSpec.NAME;
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public WritableMap getPayloadInfo(ReadableMap readableMap) {
        return this.impl.getPayloadInfo(readableMap);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void getPayloadInfoAsync(ReadableMap readableMap, Promise promise) {
        this.impl.getPayloadInfoAsync(readableMap, promise);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void leaveBreadcrumb(ReadableMap readableMap) {
        this.impl.leaveBreadcrumb(readableMap);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void pauseSession() {
        this.impl.pauseSession();
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void resumeSession() {
        this.impl.resumeSession();
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void resumeSessionOnStartup() {
        this.impl.resumeSessionOnStartup();
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void startSession() {
        this.impl.startSession();
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void updateCodeBundleId(@Nullable String str) {
        this.impl.updateCodeBundleId(str);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void updateContext(@Nullable String str) {
        this.impl.updateContext(str);
    }

    @Override // com.bugsnag.android.NativeBugsnagSpec
    public void updateUser(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.impl.updateUser(str, str2, str3);
    }
}
