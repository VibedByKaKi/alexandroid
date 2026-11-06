package com.amazon.alexa.client.alexaservice.networking.bootstrap;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatusTracker;
import com.amazon.alexa.client.alexaservice.networking.errors.AVSConnectionFailedReason;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class EnsureInitializationChain implements AVSConnectionChain {
    private static final String TAG = "EnsureInitializationChain";
    private final DownchannelStatusTracker downchannelStatusTracker;
    private final AVSConnectionChain nextChain;

    @Inject
    public EnsureInitializationChain(@Named("REFRESH_INTERNAL_CAPABILITIES_CHAIN") AVSConnectionChain aVSConnectionChain, DownchannelStatusTracker downchannelStatusTracker) {
        this.nextChain = aVSConnectionChain;
        this.downchannelStatusTracker = downchannelStatusTracker;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.bootstrap.AVSConnectionChain
    public void execute(AVSConnectionStateCallback aVSConnectionStateCallback) {
        if (this.downchannelStatusTracker.isInitialized()) {
            this.nextChain.execute(aVSConnectionStateCallback);
        } else {
            Log.e(TAG, "AVS Connection chain shouldn't be initiated until InitializationCompletedEvent is published");
            aVSConnectionStateCallback.onFailure(AVSConnectionFailedReason.NOT_INITIALIZED);
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.bootstrap.AVSConnectionChain
    public void teardown() {
        this.nextChain.teardown();
    }
}
