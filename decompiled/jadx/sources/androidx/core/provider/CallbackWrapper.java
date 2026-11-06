package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
class CallbackWrapper {
    private final FontsContractCompat.FontRequestCallback mCallback;
    private final Executor mExecutor;

    public CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this(fontRequestCallback, RequestExecutor.createHandlerExecutor(CalleeHandler.create()));
    }

    private void onTypefaceRequestFailed(final int i) {
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.mCallback;
        this.mExecutor.execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(i);
            }
        });
    }

    private void onTypefaceRetrieved(final Typeface typeface) {
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.mCallback;
        this.mExecutor.execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRetrieved(typeface);
            }
        });
    }

    public void onTypefaceResult(FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.isSuccess()) {
            onTypefaceRetrieved(typefaceResult.mTypeface);
        } else {
            onTypefaceRequestFailed(typefaceResult.mResult);
        }
    }

    public CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback, Executor executor) {
        this.mCallback = fontRequestCallback;
        this.mExecutor = executor;
    }
}
