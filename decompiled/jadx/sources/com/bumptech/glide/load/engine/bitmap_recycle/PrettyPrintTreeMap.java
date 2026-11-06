package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            m.append(AbstractJsonLexerKt.BEGIN_OBJ);
            m.append(entry.getKey());
            m.append(AbstractJsonLexerKt.COLON);
            m.append(entry.getValue());
            m.append("}, ");
        }
        if (!isEmpty()) {
            m.replace(m.length() - 2, m.length(), "");
        }
        m.append(" )");
        return m.toString();
    }
}
