package com.amazon.deecomms.api;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MarketplaceInfo {
    private boolean isPFMset;
    private String marketplaceId;
    private String marketplaceIdCode;
    private String pfmCode;

    public MarketplaceInfo(String str, String str2, String str3, boolean z) {
        this.marketplaceId = str;
        this.marketplaceIdCode = str2;
        this.pfmCode = str3;
        this.isPFMset = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MarketplaceInfo marketplaceInfo = (MarketplaceInfo) obj;
            if (Objects.equals(this.marketplaceId, marketplaceInfo.marketplaceId) && Objects.equals(this.marketplaceIdCode, marketplaceInfo.marketplaceIdCode) && Objects.equals(this.pfmCode, marketplaceInfo.pfmCode) && this.isPFMset == marketplaceInfo.isPFMset) {
                return true;
            }
        }
        return false;
    }

    public String getMarketplaceId() {
        return this.marketplaceId;
    }

    public String getMarketplaceIdCode() {
        return this.marketplaceIdCode;
    }

    public String getPfmCode() {
        return this.pfmCode;
    }

    public int hashCode() {
        return Objects.hash(this.marketplaceId, this.marketplaceIdCode, this.pfmCode, Boolean.valueOf(this.isPFMset));
    }

    public boolean isPFMset() {
        return this.isPFMset;
    }

    public void setMarketplaceId(String str) {
        this.marketplaceId = str;
    }

    public void setMarketplaceIdCode(String str) {
        this.marketplaceIdCode = str;
    }

    public void setPfmCode(String str) {
        this.pfmCode = str;
    }

    public MarketplaceInfo() {
        this.isPFMset = false;
    }
}
