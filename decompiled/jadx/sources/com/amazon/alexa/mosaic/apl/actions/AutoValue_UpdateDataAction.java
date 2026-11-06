package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.actions.UpdateDataAction;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_UpdateDataAction extends UpdateDataAction {
    private final String data;
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends UpdateDataAction.Builder {
        private String data;
        private String type;

        @Override // com.amazon.alexa.mosaic.apl.actions.UpdateDataAction.Builder
        public UpdateDataAction build() {
            String str;
            String str2 = this.type;
            if (str2 != null && (str = this.data) != null) {
                return new AutoValue_UpdateDataAction(str2, str, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.data == null) {
                sb.append(" data");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.UpdateDataAction.Builder
        public UpdateDataAction.Builder data(String str) {
            if (str != null) {
                this.data = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null data");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.UpdateDataAction.Builder
        public UpdateDataAction.Builder type(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_UpdateDataAction(String str, String str2) {
        this.type = str;
        this.data = str2;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.UpdateDataAction
    public String data() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateDataAction) {
            UpdateDataAction updateDataAction = (UpdateDataAction) obj;
            if (this.type.equals(updateDataAction.type()) && this.data.equals(updateDataAction.data())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.data.hashCode() ^ ((this.type.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateDataAction{type=");
        sb.append(this.type);
        sb.append(", data=");
        return a$$ExternalSyntheticOutline0.m(sb, this.data, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.UpdateDataAction
    public String type() {
        return this.type;
    }

    public /* synthetic */ AutoValue_UpdateDataAction(String str, String str2, int i) {
        this(str, str2);
    }
}
