package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_InvokeExtensionAction extends InvokeExtensionAction {
    private final Map<String, Object> data;
    private final boolean fastMode;
    private final String name;
    private final String uri;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends InvokeExtensionAction.Builder {
        private Map<String, Object> data;
        private boolean fastMode;
        private String name;
        private byte set$0;
        private String uri;

        @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction.Builder
        public InvokeExtensionAction build() {
            String str;
            String str2;
            if (this.set$0 == 1 && (str = this.uri) != null && (str2 = this.name) != null) {
                return new AutoValue_InvokeExtensionAction(str, str2, this.data, this.fastMode, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.uri == null) {
                sb.append(" uri");
            }
            if (this.name == null) {
                sb.append(" name");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" fastMode");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction.Builder
        public InvokeExtensionAction.Builder data(Map<String, Object> map) {
            this.data = map;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction.Builder
        public InvokeExtensionAction.Builder fastMode(boolean z) {
            this.fastMode = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction.Builder
        public InvokeExtensionAction.Builder name(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction.Builder
        public InvokeExtensionAction.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null uri");
            return null;
        }
    }

    private AutoValue_InvokeExtensionAction(String str, String str2, @Nullable Map<String, Object> map, boolean z) {
        this.uri = str;
        this.name = str2;
        this.data = map;
        this.fastMode = z;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction
    @Nullable
    public Map<String, Object> data() {
        return this.data;
    }

    public boolean equals(Object obj) {
        Map<String, Object> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InvokeExtensionAction) {
            InvokeExtensionAction invokeExtensionAction = (InvokeExtensionAction) obj;
            if (this.uri.equals(invokeExtensionAction.uri()) && this.name.equals(invokeExtensionAction.name()) && ((map = this.data) != null ? map.equals(invokeExtensionAction.data()) : invokeExtensionAction.data() == null) && this.fastMode == invokeExtensionAction.fastMode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction
    public boolean fastMode() {
        return this.fastMode;
    }

    public int hashCode() {
        int hashCode = (((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        Map<String, Object> map = this.data;
        return (this.fastMode ? 1231 : 1237) ^ ((hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003);
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction
    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvokeExtensionAction{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", fastMode=");
        return a$$ExternalSyntheticOutline0.m(sb, this.fastMode, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction
    public String uri() {
        return this.uri;
    }

    public /* synthetic */ AutoValue_InvokeExtensionAction(String str, String str2, Map map, boolean z, int i) {
        this(str, str2, map, z);
    }
}
