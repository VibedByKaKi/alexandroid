package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BasePresenter<V> implements BasePresenterAction<V> {
    protected V mView;

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.BasePresenterAction, com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.AutoDiscoveryPresenterContract.Action
    public void attachView(@NonNull V v) {
        if (this.mView == null) {
            this.mView = v;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("View already attached!");
        }
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.BasePresenterAction, com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.AutoDiscoveryPresenterContract.Action
    public void detachView() {
        if (this.mView != null) {
            this.mView = null;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("No view attached!");
        }
    }
}
