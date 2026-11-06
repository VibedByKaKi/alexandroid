package com.amazon.tarazed.webrtc.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/tarazed/webrtc/android/MediaProjectionResultReceiver;", "Landroid/os/ResultReceiver;", "continuation", "Lkotlin/coroutines/Continuation;", "Landroid/content/Intent;", "(Lkotlin/coroutines/Continuation;)V", "getGenericResultReceiver", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class MediaProjectionResultReceiver extends ResultReceiver {

    @NotNull
    public static final String BUNDLE_KEY_MEDIA_PROJECTION_INTENT = "com.amazon.tarazed.MEDIA_PROJECTION_INTENT";
    public static final int RESULT_FAIL = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_USER_REJECTION = 2;

    @NotNull
    private final Continuation<Intent> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaProjectionResultReceiver(@NotNull Continuation<? super Intent> continuation) {
        super(null);
        continuation.getClass();
        this.continuation = continuation;
    }

    @NotNull
    public final ResultReceiver getGenericResultReceiver() {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        resultReceiver.getClass();
        return resultReceiver;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, @NotNull Bundle resultData) {
        resultData.getClass();
        if (resultCode == 0) {
            Intent intent = (Intent) resultData.getParcelable(BUNDLE_KEY_MEDIA_PROJECTION_INTENT);
            Continuation<Intent> continuation = this.continuation;
            if (intent != null) {
                continuation.resumeWith(Result.m25294constructorimpl(intent));
                return;
            } else {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(new TarazedMediaProjectionException("MediaProjection Intent was null", resultCode))));
                return;
            }
        }
        if (2 == resultCode) {
            Continuation<Intent> continuation2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            continuation2.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(new TarazedMediaProjectionException("MediaProjection Rejected by customer", resultCode))));
            return;
        }
        Continuation<Intent> continuation3 = this.continuation;
        if (1 == resultCode) {
            Result.Companion companion3 = Result.INSTANCE;
            continuation3.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(new TarazedMediaProjectionException("MediaProjection result sender indicated failure", resultCode))));
        } else {
            Result.Companion companion4 = Result.INSTANCE;
            continuation3.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(new TarazedMediaProjectionException(a$$ExternalSyntheticOutline0.m(resultCode, "Unknown result code: "), resultCode))));
        }
    }
}
