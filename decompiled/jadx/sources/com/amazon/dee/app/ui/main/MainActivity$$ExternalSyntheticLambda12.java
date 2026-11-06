package com.amazon.dee.app.ui.main;

import android.app.Activity;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.amazon.alexa.voice.ui.ra.RaHomeIngressCallbacks;
import com.amazon.alexa.voice.ui.ra.RaHomeIngressType;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda12 implements SplashScreen.OnExitAnimationListener, Action1, RaHomeIngressCallbacks {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda12(Object obj) {
        this.f$0 = obj;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        LoginForTestUi.lambda$loginForTesting$1((String) this.f$0, (Throwable) obj);
    }

    @Override // com.amazon.alexa.voice.ui.ra.RaHomeIngressCallbacks
    public void onIngressTapped(RaHomeIngressType raHomeIngressType) {
        ((MainActivity) this.f$0).onConversationIngressBarTapped(raHomeIngressType);
    }

    @Override // androidx.core.splashscreen.SplashScreen.OnExitAnimationListener
    public void onSplashScreenExit(SplashScreenViewProvider splashScreenViewProvider) {
        KhSplashAnimation.playOnExit$lambda$0((Activity) this.f$0, splashScreenViewProvider);
    }
}
