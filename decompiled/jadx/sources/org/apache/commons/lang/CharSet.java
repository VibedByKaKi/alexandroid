package org.apache.commons.lang;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CharSet implements Serializable {
    public static final CharSet ASCII_ALPHA;
    public static final CharSet ASCII_ALPHA_LOWER;
    public static final CharSet ASCII_ALPHA_UPPER;
    public static final CharSet ASCII_NUMERIC;
    protected static final Map COMMON;
    public static final CharSet EMPTY;
    private static final long serialVersionUID = 5947847346149275958L;
    private final Set set = a$$ExternalSyntheticOutline0.m();

    static {
        CharSet charSet = new CharSet((String) null);
        EMPTY = charSet;
        CharSet charSet2 = new CharSet("a-zA-Z");
        ASCII_ALPHA = charSet2;
        CharSet charSet3 = new CharSet("a-z");
        ASCII_ALPHA_LOWER = charSet3;
        CharSet charSet4 = new CharSet("A-Z");
        ASCII_ALPHA_UPPER = charSet4;
        CharSet charSet5 = new CharSet("0-9");
        ASCII_NUMERIC = charSet5;
        Map m = ParcelCompat$$ExternalSyntheticOutline0.m();
        COMMON = m;
        m.put(null, charSet);
        m.put("", charSet);
        m.put("a-zA-Z", charSet2);
        m.put("A-Za-z", charSet2);
        m.put("a-z", charSet3);
        m.put("A-Z", charSet4);
        m.put("0-9", charSet5);
    }

    public CharSet(String[] strArr) {
        for (String str : strArr) {
            add(str);
        }
    }

    public static CharSet getInstance(String str) {
        Object obj = COMMON.get(str);
        return obj != null ? (CharSet) obj : new CharSet(str);
    }

    public void add(String str) {
        if (str == null) {
            return;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = length - i;
            if (i2 >= 4 && str.charAt(i) == '^' && str.charAt(i + 2) == '-') {
                this.set.add(CharRange.isNotIn(str.charAt(i + 1), str.charAt(i + 3)));
                i += 4;
            } else if (i2 >= 3 && str.charAt(i + 1) == '-') {
                this.set.add(CharRange.isIn(str.charAt(i), str.charAt(i + 2)));
                i += 3;
            } else if (i2 < 2 || str.charAt(i) != '^') {
                this.set.add(CharRange.is(str.charAt(i)));
                i++;
            } else {
                this.set.add(CharRange.isNot(str.charAt(i + 1)));
                i += 2;
            }
        }
    }

    public boolean contains(char c) {
        Iterator it2 = this.set.iterator();
        while (it2.hasNext()) {
            if (((CharRange) it2.next()).contains(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CharSet) {
            return this.set.equals(((CharSet) obj).set);
        }
        return false;
    }

    public CharRange[] getCharRanges() {
        Set set = this.set;
        return (CharRange[]) set.toArray(new CharRange[set.size()]);
    }

    public int hashCode() {
        return this.set.hashCode() + 89;
    }

    public String toString() {
        return this.set.toString();
    }

    public static CharSet getInstance(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return new CharSet(strArr);
    }

    public CharSet(String str) {
        add(str);
    }
}
