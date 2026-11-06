package com.amazon.alexa.matter.client.gordonservice.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class UserInputInfo {
    private final List<ThreadNetwork> threadNetworks;
    private final String type;
    private final List<WifiNetwork> wifiNetworks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class UserInputInfoBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<ThreadNetwork> threadNetworks;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<WifiNetwork> wifiNetworks;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public UserInputInfoBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public UserInputInfo build() {
            return new UserInputInfo(this.type, this.wifiNetworks, this.threadNetworks);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public UserInputInfoBuilder threadNetworks(List<ThreadNetwork> list) {
            this.threadNetworks = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("UserInputInfo.UserInputInfoBuilder(type=");
            sb.append(this.type);
            sb.append(", wifiNetworks=");
            sb.append(this.wifiNetworks);
            sb.append(", threadNetworks=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.threadNetworks, sb);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public UserInputInfoBuilder type(String str) {
            this.type = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public UserInputInfoBuilder wifiNetworks(List<WifiNetwork> list) {
            this.wifiNetworks = list;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private UserInputInfo() {
        this.type = null;
        this.wifiNetworks = null;
        this.threadNetworks = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static UserInputInfoBuilder builder() {
        return new UserInputInfoBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserInputInfo)) {
            return false;
        }
        UserInputInfo userInputInfo = (UserInputInfo) obj;
        String type = getType();
        String type2 = userInputInfo.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        List<WifiNetwork> wifiNetworks = getWifiNetworks();
        List<WifiNetwork> wifiNetworks2 = userInputInfo.getWifiNetworks();
        if (wifiNetworks != null ? !wifiNetworks.equals(wifiNetworks2) : wifiNetworks2 != null) {
            return false;
        }
        List<ThreadNetwork> threadNetworks = getThreadNetworks();
        List<ThreadNetwork> threadNetworks2 = userInputInfo.getThreadNetworks();
        return threadNetworks != null ? threadNetworks.equals(threadNetworks2) : threadNetworks2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<ThreadNetwork> getThreadNetworks() {
        return this.threadNetworks;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<WifiNetwork> getWifiNetworks() {
        return this.wifiNetworks;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        List<WifiNetwork> wifiNetworks = getWifiNetworks();
        int i = (hashCode + 59) * 59;
        int hashCode2 = wifiNetworks == null ? 43 : wifiNetworks.hashCode();
        List<ThreadNetwork> threadNetworks = getThreadNetworks();
        return ((i + hashCode2) * 59) + (threadNetworks != null ? threadNetworks.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "UserInputInfo(type=" + getType() + ", wifiNetworks=" + getWifiNetworks() + ", threadNetworks=" + getThreadNetworks() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public UserInputInfo withThreadNetworks(List<ThreadNetwork> list) {
        return this.threadNetworks == list ? this : new UserInputInfo(this.type, this.wifiNetworks, list);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public UserInputInfo withType(String str) {
        return this.type == str ? this : new UserInputInfo(str, this.wifiNetworks, this.threadNetworks);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public UserInputInfo withWifiNetworks(List<WifiNetwork> list) {
        return this.wifiNetworks == list ? this : new UserInputInfo(this.type, list, this.threadNetworks);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public UserInputInfo(String str, List<WifiNetwork> list, List<ThreadNetwork> list2) {
        this.type = str;
        this.wifiNetworks = list;
        this.threadNetworks = list2;
    }
}
