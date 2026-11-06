package com.amazon.alexa.matter.client.credentiallockerservice.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class WepKeyConfiguration {
    private final int keyIndex;
    private final List<String> wepKeyList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class WepKeyConfigurationBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int keyIndex;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<String> wepKeyList;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WepKeyConfigurationBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WepKeyConfiguration build() {
            return new WepKeyConfiguration(this.keyIndex, this.wepKeyList);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WepKeyConfigurationBuilder keyIndex(int i) {
            this.keyIndex = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("WepKeyConfiguration.WepKeyConfigurationBuilder(keyIndex=");
            sb.append(this.keyIndex);
            sb.append(", wepKeyList=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.wepKeyList, sb);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WepKeyConfigurationBuilder wepKeyList(List<String> list) {
            this.wepKeyList = list;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private WepKeyConfiguration() {
        this.keyIndex = 0;
        this.wepKeyList = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static WepKeyConfigurationBuilder builder() {
        return new WepKeyConfigurationBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WepKeyConfiguration)) {
            return false;
        }
        WepKeyConfiguration wepKeyConfiguration = (WepKeyConfiguration) obj;
        if (getKeyIndex() != wepKeyConfiguration.getKeyIndex()) {
            return false;
        }
        List<String> wepKeyList = getWepKeyList();
        List<String> wepKeyList2 = wepKeyConfiguration.getWepKeyList();
        return wepKeyList != null ? wepKeyList.equals(wepKeyList2) : wepKeyList2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getKeyIndex() {
        return this.keyIndex;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<String> getWepKeyList() {
        return this.wepKeyList;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int keyIndex = getKeyIndex() + 59;
        List<String> wepKeyList = getWepKeyList();
        return (keyIndex * 59) + (wepKeyList == null ? 43 : wepKeyList.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WepKeyConfiguration(keyIndex=" + getKeyIndex() + ", wepKeyList=" + getWepKeyList() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WepKeyConfiguration withKeyIndex(int i) {
        return this.keyIndex == i ? this : new WepKeyConfiguration(i, this.wepKeyList);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WepKeyConfiguration withWepKeyList(List<String> list) {
        return this.wepKeyList == list ? this : new WepKeyConfiguration(this.keyIndex, list);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WepKeyConfiguration(int i, List<String> list) {
        this.keyIndex = i;
        this.wepKeyList = list;
    }
}
