package com.amazon.deecomms.conversation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.deecomms.api.CommsManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultCommsDynamicFeatureService implements CommsDynamicFeatureService {
    private CommsManager manager;

    public DefaultCommsDynamicFeatureService(@NonNull CommsManager commsManager) {
        this.manager = commsManager;
    }

    @Override // com.amazon.deecomms.conversation.CommsDynamicFeatureService
    public void pushFeatures(@Nullable UserIdentity userIdentity) {
    }
}
