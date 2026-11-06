package expo.modules.keepawake;

import android.app.Activity;
import com.amazon.dee.app.ui.util.MissingBrowserDialog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ExpoKeepAwakeManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity f$0;

    public /* synthetic */ ExpoKeepAwakeManager$$ExternalSyntheticLambda0(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Activity activity = this.f$0;
        switch (i) {
            case 0:
                ExpoKeepAwakeManager.deactivate$lambda$1(activity);
                break;
            case 1:
                MissingBrowserDialog.lambda$show$1(activity);
                break;
            default:
                ExpoKeepAwakeManager.activate$lambda$0(activity);
                break;
        }
    }
}
