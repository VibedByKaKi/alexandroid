package com.amazon.deecomms.calling.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class BaseCallingPresenter_Factory implements Factory<BaseCallingPresenter> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final BaseCallingPresenter_Factory INSTANCE = new BaseCallingPresenter_Factory();

        private InstanceHolder() {
        }
    }

    public static BaseCallingPresenter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BaseCallingPresenter newInstance() {
        return new BaseCallingPresenter();
    }

    @Override // javax.inject.Provider
    public BaseCallingPresenter get() {
        return newInstance();
    }
}
