package com.amazon.alexa.handsfree.settings.voxsettings;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VoxSettingsEnqueuer_Factory implements Factory<VoxSettingsEnqueuer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final VoxSettingsEnqueuer_Factory INSTANCE = new VoxSettingsEnqueuer_Factory();

        private InstanceHolder() {
        }
    }

    public static VoxSettingsEnqueuer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VoxSettingsEnqueuer newInstance() {
        return new VoxSettingsEnqueuer();
    }

    @Override // javax.inject.Provider
    public VoxSettingsEnqueuer get() {
        return newInstance();
    }
}
