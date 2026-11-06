package com.amazon.alexa.accessory.repositories.transfer;

import com.amazon.alexa.accessory.protocol.Assettransfer;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AssetTransferProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetAssetInfo(Assettransfer.AssetType assetType, Producer.Result<Assettransfer.AssetInfo> result);

        void handleNotifyAssetAvailable(Assettransfer.AssetInfo assetInfo, Producer.Result<Common.ErrorCode> result);

        void handleNotifyTransferState(String str, Assettransfer.AssetType assetType, Assettransfer.AssetTransferStateInfo assetTransferStateInfo, Producer.Result<Common.ErrorCode> result);

        void handleRemoveAssets(Assettransfer.RemoveAssets removeAssets, Producer.Result<Assettransfer.RemoveAssetsResponse> result);

        void handleStartAssetTransferSession(String str, Assettransfer.AssetType assetType, Assettransfer.AssetTransferSessionConfiguration assetTransferSessionConfiguration, Producer.Result<Common.ErrorCode> result);
    }
}
