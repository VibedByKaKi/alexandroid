package com.amazon.apl.android.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class MediaPlayer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaPlayer f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MediaPlayer$$ExternalSyntheticLambda0(MediaPlayer mediaPlayer, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaPlayer;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$seekTo$6(this.f$1);
                break;
            case 1:
                this.f$0.lambda$seek$5(this.f$1);
                break;
            case 2:
                this.f$0.lambda$setTrackIndex$8(this.f$1);
                break;
            default:
                this.f$0.lambda$setAudioTrack$10(this.f$1);
                break;
        }
    }
}
