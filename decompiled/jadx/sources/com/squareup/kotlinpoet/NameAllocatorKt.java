package com.squareup.kotlinpoet;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0003"}, d2 = {"toJavaIdentifier", "", "suggestion", "kotlinpoet"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NameAllocatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toJavaIdentifier(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (i == 0 && !Character.isJavaIdentifierStart(codePointAt) && Character.isJavaIdentifierPart(codePointAt)) {
                sb.append("_");
            }
            sb.appendCodePoint(Character.isJavaIdentifierPart(codePointAt) ? codePointAt : 95);
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }
}
