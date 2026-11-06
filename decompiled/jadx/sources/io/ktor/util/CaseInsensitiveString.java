package io.ktor.util;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/ktor/util/CaseInsensitiveString;", "", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "hash", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class CaseInsensitiveString {

    @NotNull
    private final String content;
    private final int hash;

    public CaseInsensitiveString(@NotNull String str) {
        str.getClass();
        this.content = str;
        if (str == null) {
            CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type java.lang.String");
            throw null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.hash = lowerCase.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        String str;
        if (!(other instanceof CaseInsensitiveString)) {
            other = null;
        }
        CaseInsensitiveString caseInsensitiveString = (CaseInsensitiveString) other;
        return (caseInsensitiveString == null || (str = caseInsensitiveString.content) == null || !StringsKt.equals(str, this.content, true)) ? false : true;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getHash() {
        return this.hash;
    }

    @NotNull
    public String toString() {
        return this.content;
    }
}
