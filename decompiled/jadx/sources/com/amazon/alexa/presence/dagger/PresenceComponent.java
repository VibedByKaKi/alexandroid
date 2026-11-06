package com.amazon.alexa.presence.dagger;

import com.amazon.alexa.presence.PresenceLifecycleManager;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {PresenceModule.class})
@Singleton
/* loaded from: classes18.dex */
public interface PresenceComponent {
    void inject(PresenceLifecycleManager presenceLifecycleManager);
}
