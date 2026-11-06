package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"charCount", "", "codePoint", "codePointAt", "", "index", "codePointBefore", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CodepointHelpers_jvmKt {
    public static final int charCount(int i) {
        return Character.charCount(i);
    }

    public static final int codePointAt(@NotNull CharSequence charSequence, int i) {
        return Character.codePointAt(charSequence, i);
    }

    public static final int codePointBefore(@NotNull CharSequence charSequence, int i) {
        return Character.codePointBefore(charSequence, i);
    }
}
