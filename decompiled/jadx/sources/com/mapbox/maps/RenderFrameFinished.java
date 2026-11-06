package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RenderFrameFinished implements Serializable {
    private final boolean needsRepaint;
    private final boolean placementChanged;

    @NonNull
    private final RenderModeType renderMode;

    @NonNull
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RenderFrameFinished(@NonNull RenderModeType renderModeType, boolean z, boolean z2, @NonNull EventTimeInterval eventTimeInterval) {
        this.renderMode = renderModeType;
        this.needsRepaint = z;
        this.placementChanged = z2;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RenderFrameFinished.class != obj.getClass()) {
            return false;
        }
        RenderFrameFinished renderFrameFinished = (RenderFrameFinished) obj;
        return Objects.equals(this.renderMode, renderFrameFinished.renderMode) && this.needsRepaint == renderFrameFinished.needsRepaint && this.placementChanged == renderFrameFinished.placementChanged && Objects.equals(this.timeInterval, renderFrameFinished.timeInterval);
    }

    public boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    public boolean getPlacementChanged() {
        return this.placementChanged;
    }

    @NonNull
    public RenderModeType getRenderMode() {
        return this.renderMode;
    }

    @NonNull
    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.renderMode, Boolean.valueOf(this.needsRepaint), Boolean.valueOf(this.placementChanged), this.timeInterval);
    }

    public String toString() {
        return "[renderMode: " + RecordUtils.fieldToString(this.renderMode) + ", needsRepaint: " + RecordUtils.fieldToString(Boolean.valueOf(this.needsRepaint)) + ", placementChanged: " + RecordUtils.fieldToString(Boolean.valueOf(this.placementChanged)) + ", timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + MarkdownConstants.RIGHT_BRACKET;
    }
}
