package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract;
import com.amazon.alexa.voice.handsfree.utils.IdentityServiceSignInContract;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class ConnectionModule {
    @AhfScope
    @Provides
    public AlexaAppSignInContract provideAlexaAppSignInContract() {
        return new IdentityServiceSignInContract();
    }
}
