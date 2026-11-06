package ai.onnxruntime;

import ai.onnxruntime.TensorInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class SequenceInfo implements ValueInfo {
    public final int length;
    public final MapInfo mapInfo;
    public final boolean sequenceOfMaps;
    public final OnnxJavaType sequenceType;

    public SequenceInfo(int i, int i2) {
        this.length = i;
        this.sequenceType = OnnxJavaType.mapFromOnnxTensorType(TensorInfo.OnnxTensorType.mapFromInt(i2));
        this.sequenceOfMaps = false;
        this.mapInfo = null;
    }

    public boolean isSequenceOfMaps() {
        return this.sequenceOfMaps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SequenceInfo(length=");
        int i = this.length;
        sb.append(i == -1 ? "UNKNOWN" : Integer.valueOf(i));
        String sb2 = sb.toString();
        if (this.sequenceOfMaps) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(sb2, ",type=");
            m1m.append(this.mapInfo.toString());
            m1m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m1m.toString();
        }
        StringBuilder m1m2 = a$$ExternalSyntheticOutline0.m1m(sb2, ",type=");
        m1m2.append(this.sequenceType.toString());
        m1m2.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m1m2.toString();
    }

    public SequenceInfo(int i, OnnxJavaType onnxJavaType) {
        this.length = i;
        this.sequenceType = onnxJavaType;
        this.sequenceOfMaps = false;
        this.mapInfo = null;
    }

    public SequenceInfo(int i, MapInfo mapInfo) {
        this.length = i;
        this.sequenceOfMaps = true;
        this.mapInfo = mapInfo;
        this.sequenceType = OnnxJavaType.UNKNOWN;
    }

    public SequenceInfo(int i, OnnxJavaType onnxJavaType, OnnxJavaType onnxJavaType2) {
        this.length = i;
        this.sequenceType = OnnxJavaType.UNKNOWN;
        this.sequenceOfMaps = true;
        this.mapInfo = new MapInfo(onnxJavaType, onnxJavaType2);
    }
}
