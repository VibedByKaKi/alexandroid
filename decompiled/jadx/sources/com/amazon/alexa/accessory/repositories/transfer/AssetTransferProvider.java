package com.amazon.alexa.accessory.repositories.transfer;

import com.amazon.alexa.accessory.protocol.Assettransfer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AssetTransferProvider {
    void provideAssetAvailable(Assettransfer.NotifyAssetAvailable notifyAssetAvailable);

    void provideNotifyAssetTransferSession(Assettransfer.NotifyAssetTransferSession notifyAssetTransferSession);

    void provideStartAssetTransferSession(Assettransfer.StartAssetTransferSession startAssetTransferSession);

    void provideTransferState(Assettransfer.NotifyTransferState notifyTransferState);
}
