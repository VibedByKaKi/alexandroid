package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BufferedAudioStream$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BufferedAudioStream f$0;

    public /* synthetic */ BufferedAudioStream$$ExternalSyntheticLambda0(BufferedAudioStream bufferedAudioStream, int i) {
        this.$r8$classId = i;
        this.f$0 = bufferedAudioStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BufferedAudioStream bufferedAudioStream = this.f$0;
        switch (i) {
            case 0:
                bufferedAudioStream.lambda$stop$1();
                break;
            case 1:
                bufferedAudioStream.lambda$start$0();
                break;
            case 2:
                bufferedAudioStream.collectAudioData();
                break;
            default:
                bufferedAudioStream.lambda$release$2();
                break;
        }
    }
}
