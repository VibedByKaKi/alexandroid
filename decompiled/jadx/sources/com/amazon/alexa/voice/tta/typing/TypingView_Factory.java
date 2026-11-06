package com.amazon.alexa.voice.tta.typing;

import com.amazon.alexa.voice.tta.RouterDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes19.dex */
public final class TypingView_Factory implements Factory<TypingView> {
    private final Provider<RouterDelegate> typingRouterProvider;

    public TypingView_Factory(Provider<RouterDelegate> provider) {
        this.typingRouterProvider = provider;
    }

    public static TypingView_Factory create(Provider<RouterDelegate> provider) {
        return new TypingView_Factory(provider);
    }

    public static TypingView newInstance(RouterDelegate routerDelegate) {
        return new TypingView(routerDelegate);
    }

    @Override // javax.inject.Provider
    public TypingView get() {
        return newInstance(this.typingRouterProvider.get());
    }
}
