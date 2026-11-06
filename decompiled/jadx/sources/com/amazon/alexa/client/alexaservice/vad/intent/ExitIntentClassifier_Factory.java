package com.amazon.alexa.client.alexaservice.vad.intent;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ExitIntentClassifier_Factory implements Factory<ExitIntentClassifier> {
    private final Provider<Context> contextProvider;

    public ExitIntentClassifier_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ExitIntentClassifier_Factory create(Provider<Context> provider) {
        return new ExitIntentClassifier_Factory(provider);
    }

    public static ExitIntentClassifier newInstance(Context context) {
        return new ExitIntentClassifier(context);
    }

    @Override // javax.inject.Provider
    public ExitIntentClassifier get() {
        return newInstance(this.contextProvider.get());
    }
}
