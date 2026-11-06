package com.amazon.coral.util;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PathSequence extends TextSequence {
    private static final CharSequenceComparator comparator = CharSequenceComparator.CASE_SENSITIVE_ORDER;
    private final TextSequence normalized;

    private PathSequence(CharSequence charSequence) {
        this.normalized = TextSequence.newInstance(normalizePath(charSequence));
    }

    public static PathSequence newInstance(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence instanceof PathSequence ? (PathSequence) charSequence : new PathSequence(charSequence);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private static CharSequence normalizePath(CharSequence charSequence) {
        if (charSequence.length() < 1) {
            return "/";
        }
        if ((charSequence.length() == 1 && charSequence.charAt(0) == '.') || comparator.compare(charSequence, (CharSequence) "/.") == 0) {
            return "/";
        }
        StringBuilder sb = new StringBuilder(charSequence);
        if (sb.charAt(0) != '/') {
            sb.insert(0, '/');
        }
        if (sb.charAt(sb.length() - 1) != '/') {
            sb.append('/');
        }
        while (true) {
            int indexOf = sb.indexOf("//");
            if (indexOf < 0) {
                break;
            }
            sb.delete(indexOf, indexOf + 1);
        }
        while (true) {
            int indexOf2 = sb.indexOf("/./");
            if (indexOf2 < 0) {
                break;
            }
            sb.delete(indexOf2, indexOf2 + 2);
        }
        while (true) {
            int indexOf3 = sb.indexOf("/../");
            if (indexOf3 < 0) {
                while (true) {
                    int length = sb.length();
                    int i = length - 1;
                    if (i != 0 && sb.charAt(i) == '/') {
                        sb.delete(i, length);
                    }
                }
                return sb;
            }
            int lastIndexOf = sb.lastIndexOf("/", indexOf3 - 1);
            if (lastIndexOf < 1) {
                return "/";
            }
            sb.delete(lastIndexOf, indexOf3 + 3);
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.normalized.charAt(i);
    }

    @Override // com.amazon.coral.util.TextSequence
    public boolean equals(Object obj) {
        return this.normalized.equals(obj);
    }

    @Override // com.amazon.coral.util.TextSequence
    public int hashCode() {
        return this.normalized.hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.normalized.length();
    }

    @Override // com.amazon.coral.util.TextSequence
    public CharSequence[] segments() {
        return this.normalized.segments();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.normalized.subSequence(i, i2);
    }
}
