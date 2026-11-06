package ai.onnxruntime;

import ai.onnxruntime.TensorInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MapInfo implements ValueInfo {
    public final OnnxJavaType keyType;
    public final int size;
    public final OnnxJavaType valueType;

    public MapInfo(int i, int i2, int i3) {
        this.size = i;
        this.keyType = OnnxJavaType.mapFromOnnxTensorType(TensorInfo.OnnxTensorType.mapFromInt(i2));
        this.valueType = OnnxJavaType.mapFromOnnxTensorType(TensorInfo.OnnxTensorType.mapFromInt(i3));
    }

    public String toString() {
        String str;
        if (this.size == -1) {
            str = "MapInfo(size=UNKNOWN";
        } else {
            str = "MapInfo(size=" + this.size;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ",keyType=");
        m1m.append(this.keyType.toString());
        m1m.append(",valueType=");
        m1m.append(this.valueType.toString());
        m1m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m1m.toString();
    }

    public MapInfo(int i, OnnxJavaType onnxJavaType, OnnxJavaType onnxJavaType2) {
        this.size = i;
        this.keyType = onnxJavaType;
        this.valueType = onnxJavaType2;
    }

    public MapInfo(OnnxJavaType onnxJavaType, OnnxJavaType onnxJavaType2) {
        this.size = -1;
        this.keyType = onnxJavaType;
        this.valueType = onnxJavaType2;
    }
}
