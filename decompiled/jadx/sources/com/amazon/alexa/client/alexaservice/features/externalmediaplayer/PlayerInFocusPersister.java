package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PlayerInFocusPersister extends CachingPersister<PlayerInFocusKey, ExternalPlayerIdentifier> {
    @Inject
    public PlayerInFocusPersister(@Named("player_in_focus_loader") Lazy<PersistedDataLoader> lazy) {
        super(ExternalPlayerIdentifier.class, new PlayerInFocusKeyFactory(0), lazy);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PlayerInFocusKeyFactory implements CachingPersister.PersisterKeyFactory<PlayerInFocusKey> {
        public /* synthetic */ PlayerInFocusKeyFactory(int i) {
            this();
        }

        private PlayerInFocusKeyFactory() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKeyFactory
        public PlayerInFocusKey create(String str) {
            return PlayerInFocusKey.valueOf(str);
        }
    }
}
