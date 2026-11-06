package com.amazon.alexa.voice.ui.onedesign.minicards;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardAction;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_NativeMiniCardAction extends NativeMiniCardAction {
    private final String payload;
    private final NativeMiniCardActionType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends NativeMiniCardAction.Builder {
        private String payload;
        private NativeMiniCardActionType type;

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardAction.Builder
        public NativeMiniCardAction build() {
            String str;
            NativeMiniCardActionType nativeMiniCardActionType = this.type;
            if (nativeMiniCardActionType != null && (str = this.payload) != null) {
                return new AutoValue_NativeMiniCardAction(nativeMiniCardActionType, str, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.payload == null) {
                sb.append(" payload");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardAction.Builder
        public NativeMiniCardAction.Builder payload(String str) {
            if (str != null) {
                this.payload = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null payload");
            return null;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardAction.Builder
        public NativeMiniCardAction.Builder type(NativeMiniCardActionType nativeMiniCardActionType) {
            if (nativeMiniCardActionType != null) {
                this.type = nativeMiniCardActionType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_NativeMiniCardAction(NativeMiniCardActionType nativeMiniCardActionType, String str) {
        this.type = nativeMiniCardActionType;
        this.payload = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeMiniCardAction) {
            NativeMiniCardAction nativeMiniCardAction = (NativeMiniCardAction) obj;
            if (this.type.equals(nativeMiniCardAction.getType()) && this.payload.equals(nativeMiniCardAction.getPayload())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardAction
    public String getPayload() {
        return this.payload;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardAction
    public NativeMiniCardActionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.payload.hashCode() ^ ((this.type.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeMiniCardAction{type=");
        sb.append(this.type);
        sb.append(", payload=");
        return a$$ExternalSyntheticOutline0.m(sb, this.payload, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_NativeMiniCardAction(NativeMiniCardActionType nativeMiniCardActionType, String str, int i) {
        this(nativeMiniCardActionType, str);
    }
}
