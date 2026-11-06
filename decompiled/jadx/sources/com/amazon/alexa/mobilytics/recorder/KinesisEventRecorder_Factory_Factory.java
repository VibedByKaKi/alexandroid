package com.amazon.alexa.mobilytics.recorder;

import android.content.Context;
import com.amazon.alexa.mobilytics.recorder.KinesisEventRecorder;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class KinesisEventRecorder_Factory_Factory implements Factory<KinesisEventRecorder.Factory> {
    private final Provider<Context> contextProvider;

    public KinesisEventRecorder_Factory_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static KinesisEventRecorder_Factory_Factory create(Provider<Context> provider) {
        return new KinesisEventRecorder_Factory_Factory(provider);
    }

    public static KinesisEventRecorder.Factory newInstance(Context context) {
        return new KinesisEventRecorder.Factory(context);
    }

    @Override // javax.inject.Provider
    public KinesisEventRecorder.Factory get() {
        return newInstance(this.contextProvider.get());
    }
}
