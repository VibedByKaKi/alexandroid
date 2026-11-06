package com.amazon.alexa.auto.storage;

import android.content.Context;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class StorageModule {
    public static final String NAVIGATION_STORE = "navigation_store";

    @Provides
    @Singleton
    @Named(NAVIGATION_STORE)
    public PersistentStorage provideNavigationPreferenceStorage(Context context) {
        return new SharedPreferencesStorage(context.getSharedPreferences(NAVIGATION_STORE, 0));
    }
}
