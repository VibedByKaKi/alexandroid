package androidx.savedstate.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"synchronized", ExifInterface.GPS_DIRECTION_TRUE, JoinPoint.SYNCHRONIZATION_LOCK, "Landroidx/savedstate/internal/SynchronizedObject;", "action", "Lkotlin/Function0;", "(Landroidx/savedstate/internal/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/savedstate/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/savedstate/internal/SynchronizedObject_jvmKt\n*L\n1#1,61:1\n23#2:62\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/savedstate/internal/SynchronizedObjectKt\n*L\n41#1:62\n*E\n"})
/* loaded from: classes14.dex */
public final class SynchronizedObjectKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m8240synchronized(@NotNull SynchronizedObject synchronizedObject, @NotNull Function0<? extends T> function0) {
        T invoke;
        synchronizedObject.getClass();
        function0.getClass();
        synchronized (synchronizedObject) {
            try {
                invoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return invoke;
    }
}
