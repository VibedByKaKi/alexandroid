package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.operation;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.Action;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.result.WJResult;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class DeviceOperation<TAction extends Action> implements ObservableTransformer<TAction, WJResult> {
}
