package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LookupTranslator extends CharSequenceTranslator {
    private final int longest;
    private final Map<String, String> lookupMap;
    private final BitSet prefixSet;
    private final int shortest;

    public LookupTranslator(Map<CharSequence, CharSequence> map) {
        Objects.requireNonNull(map, "lookupMap");
        this.lookupMap = new HashMap();
        this.prefixSet = new BitSet();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.lookupMap.put(entry.getKey().toString(), entry.getValue().toString());
            this.prefixSet.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.shortest = i;
        this.longest = i2;
    }

    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (this.prefixSet.get(charSequence.charAt(i))) {
            int i2 = this.longest;
            if (i + i2 > charSequence.length()) {
                i2 = charSequence.length() - i;
            }
            while (i2 >= this.shortest) {
                CharSequence subSequence = charSequence.subSequence(i, i + i2);
                String str = this.lookupMap.get(subSequence.toString());
                if (str != null) {
                    writer.write(str);
                    return Character.codePointCount(subSequence, 0, subSequence.length());
                }
                i2--;
            }
        }
        return 0;
    }
}
