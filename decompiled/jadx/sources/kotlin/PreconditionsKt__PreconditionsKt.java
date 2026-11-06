package kotlin;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"require", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "requireNotNull", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "check", "checkNotNull", "error", "", "message", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/PreconditionsKt")
@SourceDebugExtension({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: classes10.dex */
class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    private static final void check(boolean z, Function0<? extends Object> function0) {
        function0.getClass();
        if (z) {
            return;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(function0.invoke());
    }

    @InlineOnly
    private static final <T> T checkNotNull(T t, Function0<? extends Object> function0) {
        function0.getClass();
        if (t != null) {
            return t;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(function0.invoke());
        return null;
    }

    @InlineOnly
    private static final Void error(Object obj) {
        obj.getClass();
        throw new IllegalStateException(obj.toString());
    }

    @InlineOnly
    private static final void require(boolean z, Function0<? extends Object> function0) {
        function0.getClass();
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m(function0.invoke());
    }

    @InlineOnly
    private static final <T> T requireNotNull(T t, Function0<? extends Object> function0) {
        function0.getClass();
        if (t != null) {
            return t;
        }
        Path$$ExternalSyntheticBUOutline0.m(function0.invoke());
        return null;
    }

    @InlineOnly
    private static final void check(boolean z) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
    }

    @InlineOnly
    private static final void require(boolean z) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
    }

    @InlineOnly
    private static final <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
        return null;
    }

    @InlineOnly
    private static final <T> T requireNotNull(T t) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }
}
