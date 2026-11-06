package com.amazon.alexa.smarthomecameras.player;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class VideoPlayer$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VideoPlayer f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ VideoPlayer$$ExternalSyntheticLambda1(VideoPlayer videoPlayer, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = videoPlayer;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onDataChannelStateChanged$lambda$0;
        Unit onDataMessageReceived$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                onDataChannelStateChanged$lambda$0 = VideoPlayer.onDataChannelStateChanged$lambda$0(this.f$0, this.f$1);
                return onDataChannelStateChanged$lambda$0;
            default:
                onDataMessageReceived$lambda$0 = VideoPlayer.onDataMessageReceived$lambda$0(this.f$0, this.f$1);
                return onDataMessageReceived$lambda$0;
        }
    }
}
