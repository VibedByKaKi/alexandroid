package com.amazon.commscore.api.identity;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MarketplaceInfo {
    private String marketPlaceCountryCode;
    private String marketPlaceId;
    private String pfmCode;

    @Nullable
    public String getMarketPlaceCountryCode() {
        return this.marketPlaceCountryCode;
    }

    @Nullable
    public String getMarketPlaceId() {
        return this.marketPlaceId;
    }

    @Nullable
    public String getPfmCode() {
        return this.pfmCode;
    }

    public void setMarketPlaceCountryCode(String str) {
        this.marketPlaceCountryCode = str;
    }

    public void setMarketPlaceId(String str) {
        this.marketPlaceId = str;
    }

    public void setPfmCode(String str) {
        this.pfmCode = str;
    }
}
