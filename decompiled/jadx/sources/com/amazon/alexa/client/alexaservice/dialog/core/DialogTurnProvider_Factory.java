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
public final class DialogTurnProvider_Factory implements Factory<DialogTurnProvider> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final DialogTurnProvider_Factory INSTANCE = new DialogTurnProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static DialogTurnProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DialogTurnProvider newInstance() {
        return new DialogTurnProvider();
    }

    @Override // javax.inject.Provider
    public DialogTurnProvider get() {
        return newInstance();
    }
}
