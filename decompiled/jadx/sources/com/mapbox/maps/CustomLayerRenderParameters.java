package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.ArrayUtils;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CustomLayerRenderParameters implements Serializable {
    private final double bearing;

    @NonNull
    private final DepthRange depthRange;

    @Nullable
    private final ElevationData elevationData;
    private final double fieldOfView;
    private final double height;
    private final double latitude;
    private final double longitude;
    private final double pitch;

    @NonNull
    private final CustomLayerMapProjection projection;

    @NonNull
    private final double[] projectionMatrixArray;

    @Nullable
    private final List<CanonicalTileID> renderToTilesIDs;
    private final double width;
    private final double zoom;

    private CustomLayerRenderParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, @NonNull double[] dArr, @NonNull DepthRange depthRange, @Nullable ElevationData elevationData, @Nullable List<CanonicalTileID> list, @NonNull CustomLayerMapProjection customLayerMapProjection) {
        this.width = d;
        this.height = d2;
        this.latitude = d3;
        this.longitude = d4;
        this.zoom = d5;
        this.bearing = d6;
        this.pitch = d7;
        this.fieldOfView = d8;
        this.projectionMatrixArray = dArr;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = list;
        this.projection = customLayerMapProjection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderParameters.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderParameters customLayerRenderParameters = (CustomLayerRenderParameters) obj;
        return Double.compare(this.width, customLayerRenderParameters.width) == 0 && Double.compare(this.height, customLayerRenderParameters.height) == 0 && Double.compare(this.latitude, customLayerRenderParameters.latitude) == 0 && Double.compare(this.longitude, customLayerRenderParameters.longitude) == 0 && Double.compare(this.zoom, customLayerRenderParameters.zoom) == 0 && Double.compare(this.bearing, customLayerRenderParameters.bearing) == 0 && Double.compare(this.pitch, customLayerRenderParameters.pitch) == 0 && Double.compare(this.fieldOfView, customLayerRenderParameters.fieldOfView) == 0 && Arrays.equals(this.projectionMatrixArray, customLayerRenderParameters.projectionMatrixArray) && Objects.equals(this.depthRange, customLayerRenderParameters.depthRange) && Objects.equals(this.elevationData, customLayerRenderParameters.elevationData) && Objects.equals(this.renderToTilesIDs, customLayerRenderParameters.renderToTilesIDs) && Objects.equals(this.projection, customLayerRenderParameters.projection);
    }

    public double getBearing() {
        return this.bearing;
    }

    @NonNull
    public DepthRange getDepthRange() {
        return this.depthRange;
    }

    @Nullable
    public ElevationData getElevationData() {
        return this.elevationData;
    }

    public double getFieldOfView() {
        return this.fieldOfView;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getPitch() {
        return this.pitch;
    }

    @NonNull
    public CustomLayerMapProjection getProjection() {
        return this.projection;
    }

    @NonNull
    @Deprecated
    public List<Double> getProjectionMatrix() {
        return ArrayUtils.convert(this.projectionMatrixArray);
    }

    @NonNull
    public double[] getProjectionMatrixArray() {
        return this.projectionMatrixArray;
    }

    @Nullable
    public List<CanonicalTileID> getRenderToTilesIDs() {
        return this.renderToTilesIDs;
    }

    public double getWidth() {
        return this.width;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.latitude), Double.valueOf(this.longitude), Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch), Double.valueOf(this.fieldOfView), Integer.valueOf(Arrays.hashCode(this.projectionMatrixArray)), this.depthRange, this.elevationData, this.renderToTilesIDs, this.projection);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[width: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.width, ", height: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.height, ", latitude: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.latitude, ", longitude: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.longitude, ", zoom: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.zoom, ", bearing: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.bearing, ", pitch: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.pitch, ", fieldOfView: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.fieldOfView, ", projectionMatrix: ", sb);
        sb.append(Arrays.toString(this.projectionMatrixArray));
        sb.append(", depthRange: ");
        sb.append(RecordUtils.fieldToString(this.depthRange));
        sb.append(", elevationData: ");
        sb.append(RecordUtils.fieldToString(this.elevationData));
        sb.append(", renderToTilesIDs: ");
        sb.append(RecordUtils.fieldToString(this.renderToTilesIDs));
        sb.append(", projection: ");
        sb.append(RecordUtils.fieldToString(this.projection));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    @Deprecated
    public CustomLayerRenderParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, @NonNull List<Double> list, @NonNull DepthRange depthRange, @Nullable ElevationData elevationData, @NonNull CustomLayerMapProjection customLayerMapProjection) {
        this(d, d2, d3, d4, d5, d6, d7, d8, ArrayUtils.toDoubleArray(list), depthRange, elevationData, null, customLayerMapProjection);
    }
}
