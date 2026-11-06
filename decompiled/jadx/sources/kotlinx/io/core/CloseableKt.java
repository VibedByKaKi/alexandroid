package kotlinx.io.core;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u0004\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"use", "R", "C", "Ljava/io/Closeable;", "Lkotlinx/io/core/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class CloseableKt {
    public static final <C extends Closeable, R> R use(@NotNull C c, @NotNull Function1<? super C, ? extends R> function1) {
        c.getClass();
        function1.getClass();
        try {
            R invoke = function1.invoke(c);
            InlineMarker.finallyStart(1);
            c.close();
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }
}
