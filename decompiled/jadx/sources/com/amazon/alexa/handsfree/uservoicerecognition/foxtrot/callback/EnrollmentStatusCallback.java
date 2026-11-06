package com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.callback;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.fva.IResultCallback;
import com.amazon.alexa.fva.IResultCallback.Stub;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.provider.EnrollmentStateProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentStatusCallback<T extends IResultCallback.Stub> extends IResultCallback.Stub {
    private static final String TAG = "EnrollmentStatusCallback";
    private final boolean mEnrollmentState;
    private final EnrollmentStateProvider mEnrollmentStateProvider;
    private final T mFoxtrotCallback;

    public EnrollmentStatusCallback(@NonNull T t, @Nullable EnrollmentStateProvider enrollmentStateProvider, boolean z) {
        this.mFoxtrotCallback = t;
        this.mEnrollmentStateProvider = enrollmentStateProvider;
        this.mEnrollmentState = z;
    }

    @VisibleForTesting
    public boolean getEnrollmentState() {
        return this.mEnrollmentState;
    }

    @VisibleForTesting
    public EnrollmentStateProvider getEnrollmentStateProvider() {
        return this.mEnrollmentStateProvider;
    }

    @VisibleForTesting
    public T getFoxtrotCallbackCallback() {
        return this.mFoxtrotCallback;
    }

    @Override // com.amazon.alexa.fva.IResultCallback
    public void onFailure(@NonNull Bundle bundle) throws RemoteException {
        this.mFoxtrotCallback.onFailure(bundle);
    }

    @Override // com.amazon.alexa.fva.IResultCallback
    public void onSuccess(@NonNull Bundle bundle) throws RemoteException {
        EnrollmentStateProvider enrollmentStateProvider = this.mEnrollmentStateProvider;
        if (enrollmentStateProvider != null) {
            enrollmentStateProvider.setEnrollmentState(this.mEnrollmentState);
        } else {
            Log.e(TAG, "Enrollment state provider unavailable");
        }
        this.mFoxtrotCallback.onSuccess(bundle);
    }
}
