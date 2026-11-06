package com.amazon.deecomms.common.controller;

import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsDisposableManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsDisposableManager.class);
    private static CompositeDisposable compositeDisposable;

    public CommsDisposableManager() {
        compositeDisposable = new CompositeDisposable();
    }

    public void add(@NonNull Disposable disposable) {
        LOG.i("Added a new disposable");
        compositeDisposable.add(disposable);
    }

    public void dispose() {
        LOG.i("Clearing off controller subscriptions");
        compositeDisposable.clear();
    }
}
