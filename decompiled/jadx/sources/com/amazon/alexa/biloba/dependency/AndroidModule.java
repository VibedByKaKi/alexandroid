package com.amazon.alexa.biloba.dependency;

import com.amazon.alexa.biloba.utils.PermissionUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class AndroidModule {
    @Provides
    @Singleton
    public Gson provideGson() {
        return new GsonBuilder().create();
    }

    @Provides
    @Singleton
    public PermissionUtils providePermissionUtils() {
        return new PermissionUtils();
    }
}
