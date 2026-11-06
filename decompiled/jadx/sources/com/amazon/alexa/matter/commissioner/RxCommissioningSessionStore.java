package com.amazon.alexa.matter.commissioner;

import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class RxCommissioningSessionStore {

    @NonNull
    private final CommissioningSessionStore mCommissioningSessionStore;

    @Inject
    public RxCommissioningSessionStore(@NonNull CommissioningSessionStore commissioningSessionStore) {
        this.mCommissioningSessionStore = commissioningSessionStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$get$0(String str, MaybeEmitter maybeEmitter) throws Throwable {
        CommissioningSession commissioningSession = this.mCommissioningSessionStore.get(str);
        if (commissioningSession == null) {
            maybeEmitter.onComplete();
        } else {
            maybeEmitter.onSuccess(commissioningSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$put$1(CommissioningSession commissioningSession, CompletableEmitter completableEmitter) throws Throwable {
        this.mCommissioningSessionStore.put(commissioningSession);
        completableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$remove$2(String str, CompletableEmitter completableEmitter) throws Throwable {
        this.mCommissioningSessionStore.remove(str);
        completableEmitter.onComplete();
    }

    @NonNull
    @AnyThread
    @CheckResult
    public Maybe<CommissioningSession> get(@NonNull String str) {
        return Maybe.create(new RxCommissioningSessionStore$$ExternalSyntheticLambda1(this, str));
    }

    @NonNull
    @AnyThread
    @CheckResult
    public Completable put(@NonNull CommissioningSession commissioningSession) {
        return Completable.create(new MatterSDKCommissioner$$ExternalSyntheticLambda3(this, commissioningSession, 3));
    }

    @NonNull
    @AnyThread
    @CheckResult
    public Completable remove(@NonNull String str) {
        return Completable.create(new RxCommissioningSessionStore$$ExternalSyntheticLambda1(this, str));
    }
}
