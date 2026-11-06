package com.amazon.alexa.ra.core.features.livemode;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/livemode/LiveModeSoundCuePlayerApi;", "", "playIngressSound", "", "playEgressSound", "playMuteSound", "playUnmuteSound", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface LiveModeSoundCuePlayerApi {
    void playEgressSound();

    void playIngressSound();

    void playMuteSound();

    void playUnmuteSound();
}
