package com.amazon.apl.android.scenegraph.text;

import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.scenegraph.text.StyledText;
import com.amazon.apl.enums.SpanAttributeName;
import com.amazon.apl.enums.SpanType;
import com.amazon.apl.enums.TokenType;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_StyledText_SpanTransition extends StyledText.SpanTransition {
    private final Map<SpanAttributeName, Object> attributes;
    private final SpanType spanType;
    private final String string;
    private final TokenType tokenType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends StyledText.SpanTransition.Builder {
        private Map<SpanAttributeName, Object> attributes;
        private SpanType spanType;
        private String string;
        private TokenType tokenType;

        @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition.Builder
        public StyledText.SpanTransition build() {
            String str = this.tokenType == null ? " tokenType" : "";
            if (str.isEmpty()) {
                return new AutoValue_StyledText_SpanTransition(this.tokenType, this.string, this.spanType, this.attributes);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition.Builder
        public StyledText.SpanTransition.Builder setAttributes(Map<SpanAttributeName, Object> map) {
            this.attributes = map;
            return this;
        }

        @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition.Builder
        public StyledText.SpanTransition.Builder setSpanType(SpanType spanType) {
            this.spanType = spanType;
            return this;
        }

        @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition.Builder
        public StyledText.SpanTransition.Builder setString(String str) {
            this.string = str;
            return this;
        }

        @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition.Builder
        public StyledText.SpanTransition.Builder setTokenType(TokenType tokenType) {
            if (tokenType != null) {
                this.tokenType = tokenType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null tokenType");
            return null;
        }
    }

    private AutoValue_StyledText_SpanTransition(TokenType tokenType, @Nullable String str, @Nullable SpanType spanType, @Nullable Map<SpanAttributeName, Object> map) {
        this.tokenType = tokenType;
        this.string = str;
        this.spanType = spanType;
        this.attributes = map;
    }

    public boolean equals(Object obj) {
        String str;
        SpanType spanType;
        Map<SpanAttributeName, Object> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StyledText.SpanTransition) {
            StyledText.SpanTransition spanTransition = (StyledText.SpanTransition) obj;
            if (this.tokenType.equals(spanTransition.getTokenType()) && ((str = this.string) != null ? str.equals(spanTransition.getString()) : spanTransition.getString() == null) && ((spanType = this.spanType) != null ? spanType.equals(spanTransition.getSpanType()) : spanTransition.getSpanType() == null) && ((map = this.attributes) != null ? map.equals(spanTransition.getAttributes()) : spanTransition.getAttributes() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition
    @Nullable
    public Map<SpanAttributeName, Object> getAttributes() {
        return this.attributes;
    }

    @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition
    @Nullable
    public SpanType getSpanType() {
        return this.spanType;
    }

    @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition
    @Nullable
    public String getString() {
        return this.string;
    }

    @Override // com.amazon.apl.android.scenegraph.text.StyledText.SpanTransition
    public TokenType getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int hashCode = (this.tokenType.hashCode() ^ 1000003) * 1000003;
        String str = this.string;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        SpanType spanType = this.spanType;
        int hashCode3 = (hashCode2 ^ (spanType == null ? 0 : spanType.hashCode())) * 1000003;
        Map<SpanAttributeName, Object> map = this.attributes;
        return hashCode3 ^ (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SpanTransition{tokenType=");
        sb.append(this.tokenType);
        sb.append(", string=");
        sb.append(this.string);
        sb.append(", spanType=");
        sb.append(this.spanType);
        sb.append(", attributes=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.attributes, StringSubstitutor.DEFAULT_VAR_END);
    }
}
