package androidx.media3.ui;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultTimeBar$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;

    public /* synthetic */ DefaultTimeBar$$ExternalSyntheticLambda0(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        View view = this.f$0;
        switch (i) {
            case 0:
                ((DefaultTimeBar) view).lambda$new$0();
                break;
            case 1:
                ((PlayerControlView) view).updateProgress();
                break;
            default:
                ((PlayerView) view).invalidate();
                break;
        }
    }
}
