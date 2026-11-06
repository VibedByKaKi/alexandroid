package com.mapbox.maps;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CumulativeRenderingStatistics implements Serializable {

    @Nullable
    private final Long drawCalls;

    @Nullable
    private final Long fboSwitchCount;

    @Nullable
    private final Long graphicsPrograms;

    @Nullable
    private final Double graphicsProgramsCreationTimeMillis;

    @Nullable
    private final Long textureBytes;

    @Nullable
    private final Long vertexBytes;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CumulativeRenderingStatistics(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Double d, @Nullable Long l5) {
        this.drawCalls = l;
        this.textureBytes = l2;
        this.vertexBytes = l3;
        this.graphicsPrograms = l4;
        this.graphicsProgramsCreationTimeMillis = d;
        this.fboSwitchCount = l5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CumulativeRenderingStatistics.class != obj.getClass()) {
            return false;
        }
        CumulativeRenderingStatistics cumulativeRenderingStatistics = (CumulativeRenderingStatistics) obj;
        return Objects.equals(this.drawCalls, cumulativeRenderingStatistics.drawCalls) && Objects.equals(this.textureBytes, cumulativeRenderingStatistics.textureBytes) && Objects.equals(this.vertexBytes, cumulativeRenderingStatistics.vertexBytes) && Objects.equals(this.graphicsPrograms, cumulativeRenderingStatistics.graphicsPrograms) && Objects.equals(this.graphicsProgramsCreationTimeMillis, cumulativeRenderingStatistics.graphicsProgramsCreationTimeMillis) && Objects.equals(this.fboSwitchCount, cumulativeRenderingStatistics.fboSwitchCount);
    }

    @Nullable
    public Long getDrawCalls() {
        return this.drawCalls;
    }

    @Nullable
    public Long getFboSwitchCount() {
        return this.fboSwitchCount;
    }

    @Nullable
    public Long getGraphicsPrograms() {
        return this.graphicsPrograms;
    }

    @Nullable
    public Double getGraphicsProgramsCreationTimeMillis() {
        return this.graphicsProgramsCreationTimeMillis;
    }

    @Nullable
    public Long getTextureBytes() {
        return this.textureBytes;
    }

    @Nullable
    public Long getVertexBytes() {
        return this.vertexBytes;
    }

    public int hashCode() {
        return Objects.hash(this.drawCalls, this.textureBytes, this.vertexBytes, this.graphicsPrograms, this.graphicsProgramsCreationTimeMillis, this.fboSwitchCount);
    }

    public String toString() {
        return "[drawCalls: " + RecordUtils.fieldToString(this.drawCalls) + ", textureBytes: " + RecordUtils.fieldToString(this.textureBytes) + ", vertexBytes: " + RecordUtils.fieldToString(this.vertexBytes) + ", graphicsPrograms: " + RecordUtils.fieldToString(this.graphicsPrograms) + ", graphicsProgramsCreationTimeMillis: " + RecordUtils.fieldToString(this.graphicsProgramsCreationTimeMillis) + ", fboSwitchCount: " + RecordUtils.fieldToString(this.fboSwitchCount) + MarkdownConstants.RIGHT_BRACKET;
    }
}
