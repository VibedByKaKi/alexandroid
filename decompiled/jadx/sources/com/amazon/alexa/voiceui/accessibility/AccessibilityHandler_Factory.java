package com.amazon.alexa.voiceui.accessibility;

import android.content.Context;
import com.amazon.alexa.voice.ui.speech.AttentionSystemContract;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AccessibilityHandler_Factory implements Factory<AccessibilityHandler> {
    private final Provider<AccessibilityDelegate> accessibilityDelegateProvider;
    private final Provider<AttentionSystemContract> attentionSystemContractProvider;
    private final Provider<Context> contextProvider;

    public AccessibilityHandler_Factory(Provider<AttentionSystemContract> provider, Provider<AccessibilityDelegate> provider2, Provider<Context> provider3) {
        this.attentionSystemContractProvider = provider;
        this.accessibilityDelegateProvider = provider2;
        this.contextProvider = provider3;
    }

    public static AccessibilityHandler_Factory create(Provider<AttentionSystemContract> provider, Provider<AccessibilityDelegate> provider2, Provider<Context> provider3) {
        return new AccessibilityHandler_Factory(provider, provider2, provider3);
    }

    public static AccessibilityHandler newInstance(AttentionSystemContract attentionSystemContract, AccessibilityDelegate accessibilityDelegate, Context context) {
        return new AccessibilityHandler(attentionSystemContract, accessibilityDelegate, context);
    }

    @Override // javax.inject.Provider
    public AccessibilityHandler get() {
        return newInstance(this.attentionSystemContractProvider.get(), this.accessibilityDelegateProvider.get(), this.contextProvider.get());
    }
}
