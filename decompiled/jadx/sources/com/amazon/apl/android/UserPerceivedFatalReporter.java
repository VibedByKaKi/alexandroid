package com.amazon.apl.android;

import android.util.Log;
import com.amazon.apl.android.dependencies.IUserPerceivedFatalCallback;
import com.amazon.apl.android.dependencies.impl.NoOpUserPerceivedFatalCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UserPerceivedFatalReporter {
    private static final String TAG = "APLController";
    private final AtomicBoolean mIsUpfAlreadyReported;
    private IUserPerceivedFatalCallback mUserPerceivedFatalCallback;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UpfReason {
        BACK_EXTENSION_FAILURE("APL_FATAL.BackExtensionFailed"),
        APL_INITIALIZATION_FAILURE("APL_FATAL.AplInitializationFailed"),
        REQUIRED_EXTENSION_LOADING_FAILURE("APL_FATAL.RequiredExtensionLoadingFailed"),
        ROOT_CONTEXT_CREATION_FAILURE("APL_FATAL.RootContextCreationFailed"),
        CONTENT_CREATION_FAILURE("APL_FATAL.ContentCreationFailed"),
        CONTENT_RESOLUTION_FAILURE("APL_FATAL.ContentResolutionFailed");

        private final String mUpfError;

        UpfReason(String str) {
            this.mUpfError = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mUpfError;
        }
    }

    public UserPerceivedFatalReporter(IUserPerceivedFatalCallback iUserPerceivedFatalCallback) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsUpfAlreadyReported = atomicBoolean;
        this.mUserPerceivedFatalCallback = iUserPerceivedFatalCallback;
        atomicBoolean.set(false);
    }

    public void reportFatal(UpfReason upfReason) {
        if (this.mIsUpfAlreadyReported.get()) {
            Log.w(TAG, "Attempt to report UPF fatal ignored, since UPF status has already been reported for this interaction.");
        } else {
            this.mUserPerceivedFatalCallback.onFatalError(upfReason.toString());
            this.mIsUpfAlreadyReported.set(true);
        }
    }

    public void reportSuccess() {
        if (this.mIsUpfAlreadyReported.get()) {
            Log.w(TAG, "Attempt to report UPF success ignored, since UPF status has already been reported for this interaction.");
        } else {
            this.mUserPerceivedFatalCallback.onSuccess();
            this.mIsUpfAlreadyReported.set(true);
        }
    }

    public UserPerceivedFatalReporter() {
        this(new NoOpUserPerceivedFatalCallback());
    }
}
