package com.reactnativedocumentpicker;

import android.util.Log;
import com.amazon.alexa.presence.utils.MetricsUtil;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013J\u0012\u0010\u000f\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013J\u0006\u0010\u0014\u001a\u00020\rJ(\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013J\b\u0010\u0016\u001a\u00020\rH\u0002J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/reactnativedocumentpicker/PromiseWrapper;", "", "MODULE_NAME", "", "<init>", "(Ljava/lang/String;)V", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "nameOfCallInProgress", "trySetPromiseRejectingIncoming", "", "fromCallsite", MetricsUtil.MetricsId.RESOLVE, "", "value", "reject", "code", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "rejectAsUserCancelledOperation", "message", "resetMembers", "rejectNewPromiseBecauseOldOneIsInProgress", "requestedOperation", "Companion", "react-native-documents_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PromiseWrapper {

    @NotNull
    public static final String ASYNC_OP_IN_PROGRESS = "ASYNC_OP_IN_PROGRESS";

    @NotNull
    public static final String E_DOCUMENT_PICKER_CANCELED = "OPERATION_CANCELED";

    @NotNull
    private final String MODULE_NAME;

    @Nullable
    private String nameOfCallInProgress;

    @Nullable
    private Promise promise;

    public PromiseWrapper(@NotNull String str) {
        str.getClass();
        this.MODULE_NAME = str;
    }

    public static /* synthetic */ void reject$default(PromiseWrapper promiseWrapper, String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        promiseWrapper.reject(str, str2, exc);
    }

    private final void rejectNewPromiseBecauseOldOneIsInProgress(Promise promise, String requestedOperation) {
        promise.reject(ASYNC_OP_IN_PROGRESS, a$$ExternalSyntheticOutline0.m("Warning: previous promise did not settle and you attempted to overwrite it. You've called \"", requestedOperation, "\" while \"", this.nameOfCallInProgress, "\" was already in progress and has not completed yet."));
    }

    private final void resetMembers() {
        this.nameOfCallInProgress = null;
        this.promise = null;
    }

    public final void reject(@NotNull Exception e) {
        e.getClass();
        String localizedMessage = e.getLocalizedMessage();
        if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
            localizedMessage = "unknown error";
        }
        String str = this.nameOfCallInProgress;
        if (str == null) {
            str = "unknown call in progress";
        }
        reject(str, localizedMessage, e);
    }

    public final void rejectAsUserCancelledOperation() {
        reject$default(this, E_DOCUMENT_PICKER_CANCELED, "user canceled the document picker", null, 4, null);
    }

    public final void resolve(@Nullable Object value) {
        Promise promise = this.promise;
        if (promise == null) {
            Log.e(this.MODULE_NAME, "cannot resolve promise because it's null");
        } else {
            resetMembers();
            promise.resolve(value);
        }
    }

    public final boolean trySetPromiseRejectingIncoming(@NotNull Promise promise, @NotNull String fromCallsite) {
        promise.getClass();
        fromCallsite.getClass();
        if (this.promise != null) {
            rejectNewPromiseBecauseOldOneIsInProgress(promise, fromCallsite);
            return false;
        }
        this.promise = promise;
        this.nameOfCallInProgress = fromCallsite;
        return true;
    }

    public final void reject(@NotNull String code, @NotNull Exception e) {
        code.getClass();
        e.getClass();
        String localizedMessage = e.getLocalizedMessage();
        if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
            localizedMessage = "unknown error";
        }
        reject(code, localizedMessage, e);
    }

    public final void reject(@NotNull String code, @NotNull String message, @Nullable Exception e) {
        code.getClass();
        message.getClass();
        Promise promise = this.promise;
        if (promise == null) {
            Log.e(this.MODULE_NAME, "cannot reject promise because it's null");
        } else {
            resetMembers();
            promise.reject(code, message, e);
        }
    }
}
