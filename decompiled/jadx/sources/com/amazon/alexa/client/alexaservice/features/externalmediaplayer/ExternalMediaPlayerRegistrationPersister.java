package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.LocalPlayerIdentifier;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class ExternalMediaPlayerRegistrationPersister extends CachingPersister<LocalPlayerIdentifier, ExternalMediaPlayerRegistration> {
    @Inject
    public ExternalMediaPlayerRegistrationPersister(@Named("player_registration_loader") Lazy<PersistedDataLoader> lazy) {
        super(ExternalMediaPlayerRegistration.class, new LocalPlayerIdentifierKeyFactory(0), lazy);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LocalPlayerIdentifierKeyFactory implements CachingPersister.PersisterKeyFactory<LocalPlayerIdentifier> {
        public /* synthetic */ LocalPlayerIdentifierKeyFactory(int i) {
            this();
        }

        private LocalPlayerIdentifierKeyFactory() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKeyFactory
        public LocalPlayerIdentifier create(String str) {
            return LocalPlayerIdentifier.create(str);
        }
    }
}
