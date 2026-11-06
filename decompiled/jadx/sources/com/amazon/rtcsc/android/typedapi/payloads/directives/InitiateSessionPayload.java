package com.amazon.rtcsc.android.typedapi.payloads.directives;

import com.amazon.rtcsc.android.typedapi.constants.KeyExchange;
import com.amazon.rtcsc.android.typedapi.payloads.Payload;
import com.amazon.rtcsc.android.typedapi.types.IceServer;
import com.amazon.rtcsc.android.typedapi.types.MediaStreams;
import java.util.List;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class InitiateSessionPayload extends Payload {
    private final List<IceServer> iceServers;
    private final String keyExchange;
    private final MediaStreams mediaStreams;
    private final Boolean trickleICE;

    public InitiateSessionPayload(@NonNull String str, @NonNull String str2, @NonNull KeyExchange keyExchange, @NonNull Boolean bool, @NonNull MediaStreams mediaStreams, @NonNull List<IceServer> list) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("sessionId is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("sessionDomain is marked non-null but is null");
            throw null;
        }
        if (keyExchange == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("keyExchange is marked non-null but is null");
            throw null;
        }
        if (bool == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("trickleICE is marked non-null but is null");
            throw null;
        }
        if (mediaStreams == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("mediaStreams is marked non-null but is null");
            throw null;
        }
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("iceServers is marked non-null but is null");
            throw null;
        }
        this.iceServers = list;
        this.keyExchange = keyExchange.name();
        this.mediaStreams = mediaStreams;
        this.trickleICE = bool;
        this.sessionId = str;
        this.sessionDomain = str2;
    }

    public InitiateSessionPayload(@NonNull String str, @NonNull String str2, @NonNull KeyExchange keyExchange, @NonNull Boolean bool, @NonNull MediaStreams mediaStreams) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("sessionId is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("sessionDomain is marked non-null but is null");
            throw null;
        }
        if (keyExchange == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("keyExchange is marked non-null but is null");
            throw null;
        }
        if (bool == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("trickleICE is marked non-null but is null");
            throw null;
        }
        if (mediaStreams != null) {
            this.iceServers = null;
            this.keyExchange = keyExchange.name();
            this.mediaStreams = mediaStreams;
            this.trickleICE = bool;
            this.sessionId = str;
            this.sessionDomain = str2;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("mediaStreams is marked non-null but is null");
        throw null;
    }
}
