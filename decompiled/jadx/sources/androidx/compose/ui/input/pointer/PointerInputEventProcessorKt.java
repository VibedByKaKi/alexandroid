package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0003H\u0082\b¨\u0006\t"}, d2 = {"ProcessResult", "Landroidx/compose/ui/input/pointer/ProcessResult;", "dispatchedToAPointerInputModifier", "", "anyMovementConsumed", "anyChangeConsumed", "(ZZZ)I", "toInt", "", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n1#1,288:1\n287#1:289\n287#1:290\n287#1:291\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n281#1:289\n282#1:290\n283#1:291\n*E\n"})
/* loaded from: classes13.dex */
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z, boolean z2, boolean z3) {
        return ProcessResult.m6026constructorimpl((z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2));
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
