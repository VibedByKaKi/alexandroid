package com.mapbox.geojson;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes8.dex */
public class FlattenListOfPoints implements Serializable {

    @Nullable
    private final double[] altitudes;

    @Nullable
    private BoundingBox[] boundingBoxes;

    @NonNull
    private final double[] flattenLngLatPoints;

    public FlattenListOfPoints(@NonNull List<Point> list) {
        double[] dArr = null;
        if (list.isEmpty()) {
            this.flattenLngLatPoints = new double[0];
            this.altitudes = null;
            this.boundingBoxes = null;
            return;
        }
        double[] dArr2 = new double[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            Point point = list.get(i);
            int i2 = i * 2;
            dArr2[i2] = point.longitude();
            dArr2[i2 + 1] = point.latitude();
            if (point.hasAltitude()) {
                if (dArr == null) {
                    dArr = new double[list.size()];
                    for (int i3 = 0; i3 < i; i3++) {
                        dArr[i3] = Double.NaN;
                    }
                }
                dArr[i] = point.altitude();
            } else if (dArr != null) {
                dArr[i] = Double.NaN;
            }
            if (point.bbox() != null) {
                if (this.boundingBoxes == null) {
                    this.boundingBoxes = new BoundingBox[list.size()];
                }
                this.boundingBoxes[i] = point.bbox();
            }
        }
        this.flattenLngLatPoints = dArr2;
        this.altitudes = dArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FlattenListOfPoints)) {
            return false;
        }
        FlattenListOfPoints flattenListOfPoints = (FlattenListOfPoints) obj;
        return Objects.deepEquals(this.flattenLngLatPoints, flattenListOfPoints.flattenLngLatPoints) && Objects.deepEquals(this.altitudes, flattenListOfPoints.altitudes) && Objects.deepEquals(this.boundingBoxes, flattenListOfPoints.boundingBoxes);
    }

    @Nullable
    public double[] getAltitudes() {
        return this.altitudes;
    }

    @NonNull
    public double[] getFlattenLngLatArray() {
        return this.flattenLngLatPoints;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.flattenLngLatPoints)), Integer.valueOf(Arrays.hashCode(this.altitudes)), Integer.valueOf(Arrays.hashCode(this.boundingBoxes)));
    }

    @NonNull
    public List<Point> points() {
        double[] dArr;
        if (this.flattenLngLatPoints.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.flattenLngLatPoints.length / 2);
        for (int i = 0; i < this.flattenLngLatPoints.length / 2; i++) {
            double[] dArr2 = this.altitudes;
            if (dArr2 == null || Double.isNaN(dArr2[i])) {
                double[] dArr3 = this.flattenLngLatPoints;
                int i2 = i * 2;
                dArr = new double[]{dArr3[i2], dArr3[i2 + 1]};
            } else {
                double[] dArr4 = this.flattenLngLatPoints;
                int i3 = i * 2;
                dArr = new double[]{dArr4[i3], dArr4[i3 + 1], this.altitudes[i]};
            }
            BoundingBox[] boundingBoxArr = this.boundingBoxes;
            arrayList.add(new Point("Point", boundingBoxArr != null ? boundingBoxArr[i] : null, dArr));
        }
        return arrayList;
    }

    public int size() {
        return this.flattenLngLatPoints.length / 2;
    }

    public String toString() {
        int length = (this.flattenLngLatPoints.length / 2) - 1;
        if (length == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        int i = 0;
        while (true) {
            sb.append("Point{type=Point, bbox=");
            BoundingBox[] boundingBoxArr = this.boundingBoxes;
            if (boundingBoxArr != null) {
                sb.append(boundingBoxArr[i]);
            } else {
                sb.append("null");
            }
            sb.append(", coordinates=[");
            int i2 = i * 2;
            sb.append(this.flattenLngLatPoints[i2]);
            sb.append(", ");
            sb.append(this.flattenLngLatPoints[i2 + 1]);
            double[] dArr = this.altitudes;
            if (dArr != null && !Double.isNaN(dArr[i])) {
                sb.append(", ");
                sb.append(this.altitudes[i]);
            }
            sb.append("]}");
            if (i == length) {
                sb.append(MarkdownConstants.RIGHT_BRACKET);
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public FlattenListOfPoints(@NonNull double[] dArr, @Nullable double[] dArr2) {
        this.flattenLngLatPoints = dArr;
        this.altitudes = dArr2;
    }
}
