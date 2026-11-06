package com.amazon.alexa.client.alexaservice.features.camera.video;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VideoCaptureSessionAuthority_Factory implements Factory<VideoCaptureSessionAuthority> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final VideoCaptureSessionAuthority_Factory INSTANCE = new VideoCaptureSessionAuthority_Factory();

        private InstanceHolder() {
        }
    }

    public static VideoCaptureSessionAuthority_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VideoCaptureSessionAuthority newInstance() {
        return new VideoCaptureSessionAuthority();
    }

    @Override // javax.inject.Provider
    public VideoCaptureSessionAuthority get() {
        return newInstance();
    }
}
