package com.amazon.alexa.client.alexaservice.dialog.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DialogTurnDataProvider_Factory implements Factory<DialogTurnDataProvider> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final DialogTurnDataProvider_Factory INSTANCE = new DialogTurnDataProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static DialogTurnDataProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DialogTurnDataProvider newInstance() {
        return new DialogTurnDataProvider();
    }

    @Override // javax.inject.Provider
    public DialogTurnDataProvider get() {
        return newInstance();
    }
}
