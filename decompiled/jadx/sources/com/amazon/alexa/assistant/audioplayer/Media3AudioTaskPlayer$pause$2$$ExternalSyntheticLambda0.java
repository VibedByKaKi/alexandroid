package com.amazon.alexa.assistant.audioplayer;

import com.amazon.alexa.assistant.foundation.audio.AudioPlayerListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Media3AudioTaskPlayer$pause$2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ Media3AudioTaskPlayer$pause$2$$ExternalSyntheticLambda0(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invokeSuspend$lambda$0;
        Unit onPlaybackStateChanged$lambda$0;
        Unit onPlaybackStateChanged$lambda$1;
        Unit onPlaybackStateChanged$lambda$2;
        Unit onIsPlayingChanged$lambda$3;
        Unit onIsPlayingChanged$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                invokeSuspend$lambda$0 = Media3AudioTaskPlayer$pause$2.invokeSuspend$lambda$0(this.f$0, (AudioPlayerListener) obj);
                return invokeSuspend$lambda$0;
            case 1:
                onPlaybackStateChanged$lambda$0 = Media3AudioTaskPlayer$playerListener$1.onPlaybackStateChanged$lambda$0(this.f$0, (AudioPlayerListener) obj);
                return onPlaybackStateChanged$lambda$0;
            case 2:
                onPlaybackStateChanged$lambda$1 = Media3AudioTaskPlayer$playerListener$1.onPlaybackStateChanged$lambda$1(this.f$0, (AudioPlayerListener) obj);
                return onPlaybackStateChanged$lambda$1;
            case 3:
                onPlaybackStateChanged$lambda$2 = Media3AudioTaskPlayer$playerListener$1.onPlaybackStateChanged$lambda$2(this.f$0, (AudioPlayerListener) obj);
                return onPlaybackStateChanged$lambda$2;
            case 4:
                onIsPlayingChanged$lambda$3 = Media3AudioTaskPlayer$playerListener$1.onIsPlayingChanged$lambda$3(this.f$0, (AudioPlayerListener) obj);
                return onIsPlayingChanged$lambda$3;
            default:
                onIsPlayingChanged$lambda$4 = Media3AudioTaskPlayer$playerListener$1.onIsPlayingChanged$lambda$4(this.f$0, (AudioPlayerListener) obj);
                return onIsPlayingChanged$lambda$4;
        }
    }
}
