package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_RenderDocumentViewport extends RenderDocumentViewport {
    private final Integer maxHeight;
    private final Integer maxWidth;
    private final Integer minHeight;
    private final Integer minWidth;
    private final Integer nominalHeight;
    private final Integer nominalWidth;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends RenderDocumentViewport.Builder {
        private Integer maxHeight;
        private Integer maxWidth;
        private Integer minHeight;
        private Integer minWidth;
        private Integer nominalHeight;
        private Integer nominalWidth;

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport build() {
            return new AutoValue_RenderDocumentViewport(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.nominalWidth, this.nominalHeight, 0);
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport.Builder maxHeight(Integer num) {
            this.maxHeight = num;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport.Builder maxWidth(Integer num) {
            this.maxWidth = num;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport.Builder minHeight(Integer num) {
            this.minHeight = num;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport.Builder minWidth(Integer num) {
            this.minWidth = num;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport.Builder nominalHeight(Integer num) {
            this.nominalHeight = num;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport.Builder
        public RenderDocumentViewport.Builder nominalWidth(Integer num) {
            this.nominalWidth = num;
            return this;
        }
    }

    private AutoValue_RenderDocumentViewport(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        this.minWidth = num;
        this.minHeight = num2;
        this.maxWidth = num3;
        this.maxHeight = num4;
        this.nominalWidth = num5;
        this.nominalHeight = num6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RenderDocumentViewport) {
            RenderDocumentViewport renderDocumentViewport = (RenderDocumentViewport) obj;
            Integer num = this.minWidth;
            if (num != null ? num.equals(renderDocumentViewport.minWidth()) : renderDocumentViewport.minWidth() == null) {
                Integer num2 = this.minHeight;
                if (num2 != null ? num2.equals(renderDocumentViewport.minHeight()) : renderDocumentViewport.minHeight() == null) {
                    Integer num3 = this.maxWidth;
                    if (num3 != null ? num3.equals(renderDocumentViewport.maxWidth()) : renderDocumentViewport.maxWidth() == null) {
                        Integer num4 = this.maxHeight;
                        if (num4 != null ? num4.equals(renderDocumentViewport.maxHeight()) : renderDocumentViewport.maxHeight() == null) {
                            Integer num5 = this.nominalWidth;
                            if (num5 != null ? num5.equals(renderDocumentViewport.nominalWidth()) : renderDocumentViewport.nominalWidth() == null) {
                                Integer num6 = this.nominalHeight;
                                if (num6 != null ? num6.equals(renderDocumentViewport.nominalHeight()) : renderDocumentViewport.nominalHeight() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.minWidth;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Integer num2 = this.minHeight;
        int hashCode2 = (hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.maxWidth;
        int hashCode3 = (hashCode2 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.maxHeight;
        int hashCode4 = (hashCode3 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Integer num5 = this.nominalWidth;
        int hashCode5 = (hashCode4 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
        Integer num6 = this.nominalHeight;
        return hashCode5 ^ (num6 != null ? num6.hashCode() : 0);
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport
    @Nullable
    public Integer maxHeight() {
        return this.maxHeight;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport
    @Nullable
    public Integer maxWidth() {
        return this.maxWidth;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport
    @Nullable
    public Integer minHeight() {
        return this.minHeight;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport
    @Nullable
    public Integer minWidth() {
        return this.minWidth;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport
    @Nullable
    public Integer nominalHeight() {
        return this.nominalHeight;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RenderDocumentViewport
    @Nullable
    public Integer nominalWidth() {
        return this.nominalWidth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RenderDocumentViewport{minWidth=");
        sb.append(this.minWidth);
        sb.append(", minHeight=");
        sb.append(this.minHeight);
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(", maxHeight=");
        sb.append(this.maxHeight);
        sb.append(", nominalWidth=");
        sb.append(this.nominalWidth);
        sb.append(", nominalHeight=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.nominalHeight, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_RenderDocumentViewport(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i) {
        this(num, num2, num3, num4, num5, num6);
    }
}
