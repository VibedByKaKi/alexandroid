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
public final class DialogExtrasAuthority_Factory implements Factory<DialogExtrasAuthority> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final DialogExtrasAuthority_Factory INSTANCE = new DialogExtrasAuthority_Factory();

        private InstanceHolder() {
        }
    }

    public static DialogExtrasAuthority_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DialogExtrasAuthority newInstance() {
        return new DialogExtrasAuthority();
    }

    @Override // javax.inject.Provider
    public DialogExtrasAuthority get() {
        return newInstance();
    }
}
