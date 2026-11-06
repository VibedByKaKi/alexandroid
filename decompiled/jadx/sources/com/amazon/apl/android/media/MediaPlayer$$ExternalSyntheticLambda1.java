package com.amazon.apl.android.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class MediaPlayer$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaPlayer f$0;

    public /* synthetic */ MediaPlayer$$ExternalSyntheticLambda1(MediaPlayer mediaPlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaPlayer mediaPlayer = this.f$0;
        switch (i) {
            case 0:
                mediaPlayer.lambda$pause$1();
                break;
            case 1:
                mediaPlayer.lambda$next$2();
                break;
            case 2:
                mediaPlayer.lambda$release$9();
                break;
            case 3:
                mediaPlayer.lambda$rewind$4();
                break;
            case 4:
                mediaPlayer.lambda$play$0();
                break;
            default:
                mediaPlayer.lambda$previous$3();
                break;
        }
    }
}
