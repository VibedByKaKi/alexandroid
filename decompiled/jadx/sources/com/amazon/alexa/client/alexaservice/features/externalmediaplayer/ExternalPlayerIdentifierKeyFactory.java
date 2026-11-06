package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class ExternalPlayerIdentifierKeyFactory implements CachingPersister.PersisterKeyFactory<ExternalPlayerIdentifier> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKeyFactory
    public ExternalPlayerIdentifier create(String str) {
        return ExternalPlayerIdentifier.create(str);
    }
}
