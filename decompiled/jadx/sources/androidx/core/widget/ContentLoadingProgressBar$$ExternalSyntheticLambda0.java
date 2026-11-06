package androidx.core.widget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ContentLoadingProgressBar$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContentLoadingProgressBar f$0;

    public /* synthetic */ ContentLoadingProgressBar$$ExternalSyntheticLambda0(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.$r8$classId = i;
        this.f$0 = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ContentLoadingProgressBar contentLoadingProgressBar = this.f$0;
        switch (i) {
            case 0:
                contentLoadingProgressBar.lambda$new$0();
                break;
            case 1:
                contentLoadingProgressBar.lambda$new$1();
                break;
            case 2:
                contentLoadingProgressBar.showOnUiThread();
                break;
            default:
                contentLoadingProgressBar.hideOnUiThread();
                break;
        }
    }
}
