package com.amazon.dee.app.elements.bridges;

import com.amazon.alexa.assetManagementService.api.AssetManagementService;
import com.amazon.alexa.elements.turbomodules.asseturl.MosaicAssetUrlAPI;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class MosaicAssetUrlDelegate implements MosaicAssetUrlAPI {
    private static final String TAG = "MosaicAssetUrlDelegate";
    Lazy<AssetManagementService> assetManagementService;

    public MosaicAssetUrlDelegate(Lazy<AssetManagementService> lazy) {
        this.assetManagementService = lazy;
    }

    @Override // com.amazon.alexa.elements.turbomodules.asseturl.MosaicAssetUrlAPI
    public String getAssetUrl(String str, String str2) {
        if (this.assetManagementService.get() != null) {
            return this.assetManagementService.get().getAssetURL(str2, str);
        }
        return null;
    }
}
