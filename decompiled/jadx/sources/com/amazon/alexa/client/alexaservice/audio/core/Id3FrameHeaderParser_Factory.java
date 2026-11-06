package com.amazon.alexa.client.alexaservice.audio.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class Id3FrameHeaderParser_Factory implements Factory<Id3FrameHeaderParser> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final Id3FrameHeaderParser_Factory INSTANCE = new Id3FrameHeaderParser_Factory();

        private InstanceHolder() {
        }
    }

    public static Id3FrameHeaderParser_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Id3FrameHeaderParser newInstance() {
        return new Id3FrameHeaderParser();
    }

    @Override // javax.inject.Provider
    public Id3FrameHeaderParser get() {
        return newInstance();
    }
}
