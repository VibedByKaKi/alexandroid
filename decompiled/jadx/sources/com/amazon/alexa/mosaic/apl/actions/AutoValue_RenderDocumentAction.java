package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_RenderDocumentAction extends RenderDocumentAction {
    private final JSONObject data;
    private final String document;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends RenderDocumentAction.Builder {
        private JSONObject data;
        private String document;

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction.Builder
        public RenderDocumentAction build() {
            JSONObject jSONObject;
            String str = this.document;
            if (str != null && (jSONObject = this.data) != null) {
                return new AutoValue_RenderDocumentAction(str, jSONObject, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.document == null) {
                sb.append(" document");
            }
            if (this.data == null) {
                sb.append(" data");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction.Builder
        public RenderDocumentAction.Builder data(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.data = jSONObject;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null data");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction.Builder
        public RenderDocumentAction.Builder document(String str) {
            if (str != null) {
                this.document = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null document");
            return null;
        }
    }

    private AutoValue_RenderDocumentAction(String str, JSONObject jSONObject) {
        this.document = str;
        this.data = jSONObject;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction
    public JSONObject data() {
        return this.data;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction
    public String document() {
        return this.document;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RenderDocumentAction) {
            RenderDocumentAction renderDocumentAction = (RenderDocumentAction) obj;
            if (this.document.equals(renderDocumentAction.document()) && this.data.equals(renderDocumentAction.data())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.data.hashCode() ^ ((this.document.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "RenderDocumentAction{document=" + this.document + ", data=" + this.data + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_RenderDocumentAction(String str, JSONObject jSONObject, int i) {
        this(str, jSONObject);
    }
}
