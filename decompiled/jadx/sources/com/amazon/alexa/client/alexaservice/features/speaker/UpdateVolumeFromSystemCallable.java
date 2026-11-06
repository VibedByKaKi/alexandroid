package com.amazon.alexa.client.alexaservice.features.speaker;

import java.util.concurrent.Callable;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class UpdateVolumeFromSystemCallable implements Callable<Void> {
    private final VolumeAuthority volumeAuthority;

    @Inject
    public UpdateVolumeFromSystemCallable(VolumeAuthority volumeAuthority) {
        this.volumeAuthority = volumeAuthority;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.volumeAuthority.updateFromSystem();
        return null;
    }
}
