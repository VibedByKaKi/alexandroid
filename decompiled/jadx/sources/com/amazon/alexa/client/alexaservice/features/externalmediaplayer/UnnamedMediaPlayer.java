package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.messages.Header;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
interface UnnamedMediaPlayer {
    Set<ComponentState> correctStatesForUnnamedPlayer(ExternalPlayerIdentifier externalPlayerIdentifier, Set<ComponentState> set);

    boolean handle(Header header);

    boolean isAvailable();

    void teardown();

    boolean wasEmpPlayingMusic();
}
