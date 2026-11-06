package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0006H\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "requirePrecondition", "throwIllegalArgumentException", "message", "throwIllegalStateException", "throwIndexOutOfBoundsException", "throwNoSuchElementException", "throwNoSuchElementExceptionForInline", "", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z, @NotNull Function0<String> function0) {
        function0.getClass();
        if (z) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final void requirePrecondition(boolean z, @NotNull Function0<String> function0) {
        function0.getClass();
        if (z) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }

    public static final void throwIllegalArgumentException(@NotNull String str) {
        str.getClass();
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(@NotNull String str) {
        str.getClass();
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(@NotNull String str) {
        str.getClass();
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(@NotNull String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }

    @PublishedApi
    @NotNull
    public static final Void throwNoSuchElementExceptionForInline(@NotNull String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }
}
