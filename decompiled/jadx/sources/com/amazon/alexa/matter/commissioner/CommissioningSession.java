package com.amazon.alexa.matter.commissioner;

import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.CommissioningSessionState;
import com.amazon.alexa.matter.eventbus.schema.Credentials;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface CommissioningSession {
    @NonNull
    @AnyThread
    @CheckResult
    Completable bypassSoftAttestationFailure();

    @NonNull
    @AnyThread
    Completable close();

    @NonNull
    @AnyThread
    Completable finalizeCommissioning();

    @NonNull
    @AnyThread
    String getID();

    @NonNull
    @AnyThread
    @CheckResult
    Single<CommissioningSessionState> getState();

    @NonNull
    @AnyThread
    @CheckResult
    Observable<CommissioningSessionState> getStates();

    @NonNull
    @AnyThread
    @CheckResult
    Completable setNetworkCredentials(@NonNull Credentials credentials);

    @NonNull
    @AnyThread
    @CheckResult
    Completable startCommissioning();
}
