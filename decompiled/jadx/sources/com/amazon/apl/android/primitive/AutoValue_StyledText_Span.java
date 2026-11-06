package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.StyledText;
import com.amazon.apl.enums.SpanType;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_StyledText_Span extends StyledText.Span {
    private final int end;
    private final int start;
    private final SpanType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends StyledText.Span.Builder {
        private Integer end;
        private Integer start;
        private SpanType type;

        @Override // com.amazon.apl.android.primitive.StyledText.Span.Builder
        public StyledText.Span build() {
            String str = this.type == null ? " type" : "";
            if (this.start == null) {
                str = str.concat(" start");
            }
            if (this.end == null) {
                str = str.concat(" end");
            }
            if (str.isEmpty()) {
                return new AutoValue_StyledText_Span(this.type, this.start.intValue(), this.end.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.StyledText.Span.Builder
        public StyledText.Span.Builder end(int i) {
            this.end = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.StyledText.Span.Builder
        public StyledText.Span.Builder start(int i) {
            this.start = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.StyledText.Span.Builder
        public StyledText.Span.Builder type(SpanType spanType) {
            if (spanType != null) {
                this.type = spanType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_StyledText_Span(SpanType spanType, int i, int i2) {
        this.type = spanType;
        this.start = i;
        this.end = i2;
    }

    @Override // com.amazon.apl.android.primitive.StyledText.Span
    public int end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StyledText.Span) {
            StyledText.Span span = (StyledText.Span) obj;
            if (this.type.equals(span.type()) && this.start == span.start() && this.end == span.end()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.end ^ ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.start) * 1000003);
    }

    @Override // com.amazon.apl.android.primitive.StyledText.Span
    public int start() {
        return this.start;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Span{type=");
        sb.append(this.type);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        return a$$ExternalSyntheticOutline0.m(sb, this.end, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.primitive.StyledText.Span
    public SpanType type() {
        return this.type;
    }
}
