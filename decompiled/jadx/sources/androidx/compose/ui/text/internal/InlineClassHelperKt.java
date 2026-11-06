package androidx.compose.ui.text.internal;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a4\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0080\b\u0082\u0002\u0012\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001aG\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u0001H\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0080\b\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\u0010\u001a4\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0080\b\u0082\u0002\u0012\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001aG\u0010\u0012\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u0001H\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0080\b\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"throwIllegalStateException", "", "message", "", "throwIllegalStateExceptionForNullCheck", "", "throwIllegalArgumentException", "throwIllegalArgumentExceptionForNullCheck", "checkPrecondition", "value", "", "lazyMessage", "Lkotlin/Function0;", "checkPreconditionNotNull", ExifInterface.GPS_DIRECTION_TRUE, "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requirePrecondition", "requirePreconditionNotNull", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z, @NotNull Function0<String> function0) {
        if (z) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    @NotNull
    public static final <T> T checkPreconditionNotNull(@Nullable T t, @NotNull Function0<String> function0) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck(function0.invoke());
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public static final void requirePrecondition(boolean z, @NotNull Function0<String> function0) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }

    @NotNull
    public static final <T> T requirePreconditionNotNull(@Nullable T t, @NotNull Function0<String> function0) {
        if (t != null) {
            return t;
        }
        throwIllegalArgumentExceptionForNullCheck(function0.invoke());
        PathKt$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public static final void throwIllegalArgumentException(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    @NotNull
    public static final Void throwIllegalArgumentExceptionForNullCheck(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void throwIllegalStateExceptionForNullCheck(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
