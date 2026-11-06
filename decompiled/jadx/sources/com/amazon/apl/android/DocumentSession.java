package com.amazon.apl.android;

import android.os.Handler;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.common.BoundObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentSession extends BoundObject {
    private List<ISessionEndedCallback> mCallbacks = new ArrayList();
    private IAPLController mController;
    private Handler mCoreWorker;
    private DocumentHandle mHandle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ISessionEndedCallback {
        void onEnded(DocumentSession documentSession);
    }

    private DocumentSession() {
        bind(nCreate());
    }

    public static DocumentSession create() {
        return new DocumentSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$end$0() {
        nEnd(getNativeHandle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$end$1() {
        nEnd(getNativeHandle());
    }

    private native long nCreate();

    private native void nEnd(long j);

    private native String nGetId(long j);

    private native boolean nHasEnded(long j);

    public void bind(IAPLController iAPLController) {
        this.mController = iAPLController;
    }

    public void end() {
        Handler handler;
        if (hasEnded()) {
            return;
        }
        IAPLController iAPLController = this.mController;
        if (iAPLController != null) {
            final int i = 0;
            iAPLController.executeOnCoreThread(new Runnable(this) { // from class: com.amazon.apl.android.DocumentSession$$ExternalSyntheticLambda0
                public final /* synthetic */ DocumentSession f$0;

                {
                    this.f$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    DocumentSession documentSession = this.f$0;
                    switch (i2) {
                        case 0:
                            documentSession.lambda$end$0();
                            break;
                        default:
                            documentSession.lambda$end$1();
                            break;
                    }
                }
            });
        }
        if (this.mHandle != null && (handler = this.mCoreWorker) != null) {
            final int i2 = 1;
            handler.post(new Runnable(this) { // from class: com.amazon.apl.android.DocumentSession$$ExternalSyntheticLambda0
                public final /* synthetic */ DocumentSession f$0;

                {
                    this.f$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    DocumentSession documentSession = this.f$0;
                    switch (i22) {
                        case 0:
                            documentSession.lambda$end$0();
                            break;
                        default:
                            documentSession.lambda$end$1();
                            break;
                    }
                }
            });
        }
        Iterator<ISessionEndedCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onEnded(this);
        }
    }

    public String getId() {
        return nGetId(getNativeHandle());
    }

    public boolean hasEnded() {
        return nHasEnded(getNativeHandle());
    }

    public void onSessionEnded(ISessionEndedCallback iSessionEndedCallback) {
        this.mCallbacks.add(iSessionEndedCallback);
    }

    public void setCoreWorker(Handler handler) {
        this.mCoreWorker = handler;
    }

    public void bind(DocumentHandle documentHandle) {
        this.mHandle = documentHandle;
    }
}
