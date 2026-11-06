package com.amazon.alexa.client.alexaservice.features.iocomponent;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.features.iocomponent.payload.TrustedStatesPayload;
import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.TrustedStatesProvider;
import com.amazon.alexa.client.core.componentstate.BaseComponentStateProvider;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class TrustedStatesComponentStateProvider extends BaseComponentStateProvider {
    private static final String TAG = "TrustedStatesComponentStateProvider";
    private final TrustedStatesProvider trustedStatesProvider;

    @Inject
    public TrustedStatesComponentStateProvider(TrustedStatesProvider trustedStatesProvider) {
        super(AvsApiConstants.Alexa.IOComponents.NAMESPACE, AvsApiConstants.Alexa.IOComponents.ComponentStates.TrustedStates.NAME);
        this.trustedStatesProvider = trustedStatesProvider;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        String str = TAG;
        Log.i(str, "getStates() from TrustedStatesComponentStateProvider");
        if (this.trustedStatesProvider == null) {
            return null;
        }
        Log.i(str, "UnlockState:" + this.trustedStatesProvider.getUnlockState());
        return ComponentState.create(getComponentStateHeader(), TrustedStatesPayload.create(this.trustedStatesProvider.getUnlockState(), this.trustedStatesProvider.getLastTimeInUnlockedState(), this.trustedStatesProvider.getUnlockMethod(), this.trustedStatesProvider.getSessionStates()));
    }
}
