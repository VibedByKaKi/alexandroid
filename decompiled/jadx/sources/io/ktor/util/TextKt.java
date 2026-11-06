package io.ktor.util;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a;\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u0007H\u0086\b\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0002¨\u0006\t"}, d2 = {"caseInsensitive", "Lio/ktor/util/CaseInsensitiveString;", "", "chomp", "Lkotlin/Pair;", "separator", "onMissingDelimiter", "Lkotlin/Function0;", "escapeHTML", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class TextKt {
    @NotNull
    public static final CaseInsensitiveString caseInsensitive(@NotNull String str) {
        str.getClass();
        return new CaseInsensitiveString(str);
    }

    @NotNull
    public static final Pair<String, String> chomp(@NotNull String str, @NotNull String str2, @NotNull Function0<Pair<String, String>> function0) {
        int indexOf$default;
        str.getClass();
        str2.getClass();
        function0.getClass();
        indexOf$default = StringsKt__StringsKt.indexOf$default(str, str2, 0, false, 6, (Object) null);
        return indexOf$default != -1 ? TuplesKt.to(str.substring(0, indexOf$default), str.substring(indexOf$default + 1)) : function0.invoke();
    }

    @NotNull
    public static final String escapeHTML(@NotNull String str) {
        str.getClass();
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt != '\'') {
                sb.append(charAt);
            } else {
                sb.append("&#x27;");
            }
        }
        return sb.toString();
    }
}
