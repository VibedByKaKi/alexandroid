package org.webrtc;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb.append(obj);
                return;
            }
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            appendValue(sb, objArr[i]);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    @CalledByNative
    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("{ timestampUs: ");
        m.append(this.timestampUs);
        m.append(", type: ");
        m.append(this.type);
        m.append(", id: ");
        m.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            m.append(", ");
            m.append(entry.getKey());
            m.append(": ");
            appendValue(m, entry.getValue());
        }
        m.append(" }");
        return m.toString();
    }
}
