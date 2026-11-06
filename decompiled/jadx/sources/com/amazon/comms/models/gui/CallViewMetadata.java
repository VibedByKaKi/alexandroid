package com.amazon.comms.models.gui;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CallViewMetadata {
    private String callId;
    private List<IdentityMetadata> peersInfo;
    private Setting setting;
    private IdentityMetadata userInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallViewMetadataBuilder {
        private String callId;
        private List<IdentityMetadata> peersInfo;
        private Setting setting;
        private IdentityMetadata userInfo;

        public CallViewMetadata build() {
            return new CallViewMetadata(this.callId, this.userInfo, this.peersInfo, this.setting, 0);
        }

        public CallViewMetadataBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public CallViewMetadataBuilder peersInfo(List<IdentityMetadata> list) {
            this.peersInfo = list;
            return this;
        }

        public CallViewMetadataBuilder setting(Setting setting) {
            this.setting = setting;
            return this;
        }

        public String toString() {
            String str = this.callId;
            String valueOf = String.valueOf(this.userInfo);
            return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("CallViewMetadata.CallViewMetadataBuilder(callId=", str, ", userInfo=", valueOf, ", peersInfo="), String.valueOf(this.peersInfo), ", setting=", String.valueOf(this.setting), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public CallViewMetadataBuilder userInfo(IdentityMetadata identityMetadata) {
            this.userInfo = identityMetadata;
            return this;
        }
    }

    private CallViewMetadata(String str, IdentityMetadata identityMetadata, List<IdentityMetadata> list, Setting setting) {
        this.callId = str;
        this.userInfo = identityMetadata;
        this.peersInfo = list;
        this.setting = setting;
    }

    public static CallViewMetadataBuilder builder() {
        return new CallViewMetadataBuilder();
    }

    public String getCallId() {
        return this.callId;
    }

    public List<IdentityMetadata> getPeersInfo() {
        return this.peersInfo;
    }

    public Setting getSetting() {
        return this.setting;
    }

    public IdentityMetadata getUserInfo() {
        return this.userInfo;
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setPeersInfo(List<IdentityMetadata> list) {
        this.peersInfo = list;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public void setUserInfo(IdentityMetadata identityMetadata) {
        this.userInfo = identityMetadata;
    }

    public CallViewMetadata() {
    }

    public /* synthetic */ CallViewMetadata(String str, IdentityMetadata identityMetadata, List list, Setting setting, int i) {
        this(str, identityMetadata, list, setting);
    }
}
