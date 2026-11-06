package ai.onnxruntime;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface OnnxValue extends AutoCloseable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OnnxValueType {
        ONNX_TYPE_UNKNOWN(0),
        ONNX_TYPE_TENSOR(1),
        ONNX_TYPE_SEQUENCE(2),
        ONNX_TYPE_MAP(3),
        ONNX_TYPE_OPAQUE(4),
        ONNX_TYPE_SPARSETENSOR(5),
        ONNX_TYPE_OPTIONAL(6);

        public final int value;

        OnnxValueType(int i) {
            this.value = i;
        }
    }

    static void close(Map<String, ? extends OnnxValue> map) {
        Iterator<? extends OnnxValue> it2 = map.values().iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    ValueInfo getInfo();

    OnnxValueType getType();

    Object getValue() throws OrtException;

    boolean isClosed();

    static void close(Iterable<? extends OnnxValue> iterable) {
        Iterator<? extends OnnxValue> it2 = iterable.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
    }
}
