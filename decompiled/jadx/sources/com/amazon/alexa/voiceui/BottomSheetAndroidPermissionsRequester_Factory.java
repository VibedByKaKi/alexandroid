package com.amazon.alexa.voiceui;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class BottomSheetAndroidPermissionsRequester_Factory implements Factory<BottomSheetAndroidPermissionsRequester> {
    private final Provider<Context> contextProvider;

    public BottomSheetAndroidPermissionsRequester_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static BottomSheetAndroidPermissionsRequester_Factory create(Provider<Context> provider) {
        return new BottomSheetAndroidPermissionsRequester_Factory(provider);
    }

    public static BottomSheetAndroidPermissionsRequester newInstance(Context context) {
        return new BottomSheetAndroidPermissionsRequester(context);
    }

    @Override // javax.inject.Provider
    public BottomSheetAndroidPermissionsRequester get() {
        return newInstance(this.contextProvider.get());
    }
}
