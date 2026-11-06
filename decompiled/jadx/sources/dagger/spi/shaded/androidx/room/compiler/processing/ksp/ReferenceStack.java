package dagger.spi.shaded.androidx.room.compiler.processing.ksp;

import androidx.exifinterface.media.ExifInterface;
import com.google.devtools.ksp.symbol.KSType;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J/\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000b\u001a\u00020\u00052\u000e\b\u0004\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/ksp/ReferenceStack;", "", "()V", "_queue", "Lkotlin/collections/ArrayDeque;", "Lcom/google/devtools/ksp/symbol/KSType;", "get_queue$annotations", "get_queue", "()Lkotlin/collections/ArrayDeque;", "contains", "", "ksType", "withReference", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lcom/google/devtools/ksp/symbol/KSType;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
final class ReferenceStack {

    @NotNull
    private final ArrayDeque<KSType> _queue = new ArrayDeque<>();

    public final boolean contains(@NotNull KSType ksType) {
        ksType.getClass();
        return this._queue.contains(ksType);
    }

    @NotNull
    public final ArrayDeque<KSType> get_queue() {
        return this._queue;
    }

    public final <T> T withReference(@NotNull KSType ksType, @NotNull Function0<? extends T> block) {
        ksType.getClass();
        block.getClass();
        try {
            get_queue().addLast(ksType);
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            get_queue().removeLast();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void get_queue$annotations() {
    }
}
