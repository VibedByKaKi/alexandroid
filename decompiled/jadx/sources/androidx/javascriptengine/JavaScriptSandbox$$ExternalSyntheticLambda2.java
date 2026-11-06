package androidx.javascriptengine;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.core.util.Consumer;
import androidx.javascriptengine.IsolateUsableState;
import androidx.javascriptengine.JavaScriptSandbox;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class JavaScriptSandbox$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ JavaScriptSandbox$$ExternalSyntheticLambda2(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Context) this.f$0).unbindService((JavaScriptSandbox.ConnectionSetup) this.f$1);
                break;
            case 1:
                ((EnvironmentDeadState) this.f$0).lambda$addOnTerminatedCallback$0((Consumer) this.f$1);
                break;
            case 2:
                ((Consumer) this.f$0).accept((TerminationInfo) this.f$1);
                break;
            case 3:
                IsolateUsableState.AnonymousClass1.lambda$onString$0((MessagePortClient) this.f$0, (String) this.f$1);
                break;
            case 4:
                IsolateUsableState.AnonymousClass1.lambda$onArrayBuffer$1((MessagePortClient) this.f$0, (byte[]) this.f$1);
                break;
            default:
                ((IsolateUsableState.IJsSandboxIsolateSyncCallbackStubWrapper) this.f$0).lambda$reportResultWithFd$0((AssetFileDescriptor) this.f$1);
                break;
        }
    }
}
