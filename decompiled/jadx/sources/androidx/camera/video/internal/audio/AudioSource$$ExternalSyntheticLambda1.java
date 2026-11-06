package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class AudioSource$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AudioSource f$0;

    public /* synthetic */ AudioSource$$ExternalSyntheticLambda1(AudioSource audioSource, int i) {
        this.$r8$classId = i;
        this.f$0 = audioSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AudioSource audioSource = this.f$0;
        switch (i) {
            case 0:
                audioSource.lambda$stop$3();
                break;
            default:
                audioSource.lambda$start$1();
                break;
        }
    }
}
