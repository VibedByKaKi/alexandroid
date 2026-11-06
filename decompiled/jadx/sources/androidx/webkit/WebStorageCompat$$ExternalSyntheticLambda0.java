package androidx.webkit;

import androidx.arch.core.executor.ArchTaskExecutor;
import com.amazon.alexa.mobile.assistant.client.apis.speechprovider.SdkDialogTurnAdapter;
import com.amazon.alexa.ra.android.smartfragment.bridge.BridgeServices;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WebStorageCompat$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WebStorageCompat$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                WebStorageCompat.lambda$deleteBrowsingDataForSite$1(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 2:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                WebStorageCompat.lambda$deleteBrowsingData$0(runnable);
                break;
            case 5:
                SdkDialogTurnAdapter.DAEMON_PUMP_EXECUTOR$lambda$5(runnable);
                break;
            case 6:
                BridgeServices.Companion.default$lambda$0(runnable);
                break;
            case 7:
                runnable.run();
                break;
            default:
                ReactInstanceManagerInspectorTarget.mHybridData$lambda$0(runnable);
                break;
        }
    }
}
