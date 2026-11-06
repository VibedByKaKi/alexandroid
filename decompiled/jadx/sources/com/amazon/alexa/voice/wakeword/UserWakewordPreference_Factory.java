package com.amazon.alexa.voice.wakeword;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class UserWakewordPreference_Factory implements Factory<UserWakewordPreference> {
    private final Provider<Context> applicationContextProvider;

    public UserWakewordPreference_Factory(Provider<Context> provider) {
        this.applicationContextProvider = provider;
    }

    public static UserWakewordPreference_Factory create(Provider<Context> provider) {
        return new UserWakewordPreference_Factory(provider);
    }

    public static UserWakewordPreference newInstance(Context context) {
        return new UserWakewordPreference(context);
    }

    @Override // javax.inject.Provider
    public UserWakewordPreference get() {
        return newInstance(this.applicationContextProvider.get());
    }
}
