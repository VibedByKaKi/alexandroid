package com.amazon.whisperjoin.softap.pojos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class ProvisioningData {

    @SerializedName("countryCode")
    private String countryCode;

    @SerializedName("marketplace")
    private String marketplace;

    @SerializedName("utcTime")
    private String utcTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ProvisioningDataBuilder {
        private String countryCode;
        private String marketplace;
        private String utcTime;

        public ProvisioningData build() {
            return new ProvisioningData(this.utcTime, this.marketplace, this.countryCode);
        }

        public ProvisioningDataBuilder countryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public ProvisioningDataBuilder marketplace(String str) {
            this.marketplace = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ProvisioningData.ProvisioningDataBuilder(utcTime=");
            sb.append(this.utcTime);
            sb.append(", marketplace=");
            sb.append(this.marketplace);
            sb.append(", countryCode=");
            return a$$ExternalSyntheticOutline0.m(sb, this.countryCode, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public ProvisioningDataBuilder utcTime(String str) {
            this.utcTime = str;
            return this;
        }
    }

    public ProvisioningData(String str, String str2, String str3) {
        this.utcTime = str;
        this.marketplace = str2;
        this.countryCode = str3;
    }

    public static ProvisioningDataBuilder builder() {
        return new ProvisioningDataBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ProvisioningData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvisioningData)) {
            return false;
        }
        ProvisioningData provisioningData = (ProvisioningData) obj;
        if (!provisioningData.canEqual(this)) {
            return false;
        }
        String utcTime = getUtcTime();
        String utcTime2 = provisioningData.getUtcTime();
        if (utcTime != null ? !utcTime.equals(utcTime2) : utcTime2 != null) {
            return false;
        }
        String marketplace = getMarketplace();
        String marketplace2 = provisioningData.getMarketplace();
        if (marketplace != null ? !marketplace.equals(marketplace2) : marketplace2 != null) {
            return false;
        }
        String countryCode = getCountryCode();
        String countryCode2 = provisioningData.getCountryCode();
        return countryCode != null ? countryCode.equals(countryCode2) : countryCode2 == null;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getMarketplace() {
        return this.marketplace;
    }

    public String getUtcTime() {
        return this.utcTime;
    }

    public int hashCode() {
        String utcTime = getUtcTime();
        int hashCode = utcTime == null ? 43 : utcTime.hashCode();
        String marketplace = getMarketplace();
        int i = (hashCode + 59) * 59;
        int hashCode2 = marketplace == null ? 43 : marketplace.hashCode();
        String countryCode = getCountryCode();
        return ((i + hashCode2) * 59) + (countryCode != null ? countryCode.hashCode() : 43);
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setMarketplace(String str) {
        this.marketplace = str;
    }

    public void setUtcTime(String str) {
        this.utcTime = str;
    }

    public String toString() {
        return "ProvisioningData(utcTime=" + getUtcTime() + ", marketplace=" + getMarketplace() + ", countryCode=" + getCountryCode() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
