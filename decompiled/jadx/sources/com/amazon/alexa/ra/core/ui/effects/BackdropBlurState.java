package com.amazon.alexa.ra.core.ui.effects;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/effects/BackdropBlurState;", "", "<init>", "()V", "<set-?>", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "sourceLayer", "getSourceLayer$ui_core_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setSourceLayer$ui_core_release", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "sourceLayer$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/geometry/Offset;", "sourceTopLeftInWindow", "getSourceTopLeftInWindow-F1C5BW0$ui_core_release", "()J", "setSourceTopLeftInWindow-k-4lQ0M$ui_core_release", "(J)V", "sourceTopLeftInWindow$delegate", "foregroundTopLeftInWindow", "getForegroundTopLeftInWindow-F1C5BW0$ui_core_release", "setForegroundTopLeftInWindow-k-4lQ0M$ui_core_release", "foregroundTopLeftInWindow$delegate", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackdropBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropBlur.kt\ncom/amazon/alexa/ra/core/ui/effects/BackdropBlurState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,183:1\n81#2:184\n107#2,2:185\n81#2:187\n107#2,2:188\n81#2:190\n107#2,2:191\n*S KotlinDebug\n*F\n+ 1 BackdropBlur.kt\ncom/amazon/alexa/ra/core/ui/effects/BackdropBlurState\n*L\n75#1:184\n75#1:185,2\n76#1:187\n76#1:188,2\n77#1:190\n77#1:191,2\n*E\n"})
/* loaded from: classes18.dex */
public final class BackdropBlurState {
    public static final int $stable = 0;

    /* renamed from: foregroundTopLeftInWindow$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState foregroundTopLeftInWindow;

    /* renamed from: sourceLayer$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sourceLayer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: sourceTopLeftInWindow$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sourceTopLeftInWindow;

    public BackdropBlurState() {
        Offset.Companion companion = Offset.INSTANCE;
        this.sourceTopLeftInWindow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4389boximpl(companion.m4416getZeroF1C5BW0()), null, 2, null);
        this.foregroundTopLeftInWindow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4389boximpl(companion.m4416getZeroF1C5BW0()), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getForegroundTopLeftInWindow-F1C5BW0$ui_core_release, reason: not valid java name */
    public final long m18883getForegroundTopLeftInWindowF1C5BW0$ui_core_release() {
        return ((Offset) this.foregroundTopLeftInWindow.getValue()).m4410unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final GraphicsLayer getSourceLayer$ui_core_release() {
        return (GraphicsLayer) this.sourceLayer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSourceTopLeftInWindow-F1C5BW0$ui_core_release, reason: not valid java name */
    public final long m18884getSourceTopLeftInWindowF1C5BW0$ui_core_release() {
        return ((Offset) this.sourceTopLeftInWindow.getValue()).m4410unboximpl();
    }

    /* renamed from: setForegroundTopLeftInWindow-k-4lQ0M$ui_core_release, reason: not valid java name */
    public final void m18885setForegroundTopLeftInWindowk4lQ0M$ui_core_release(long j) {
        this.foregroundTopLeftInWindow.setValue(Offset.m4389boximpl(j));
    }

    public final void setSourceLayer$ui_core_release(@Nullable GraphicsLayer graphicsLayer) {
        this.sourceLayer.setValue(graphicsLayer);
    }

    /* renamed from: setSourceTopLeftInWindow-k-4lQ0M$ui_core_release, reason: not valid java name */
    public final void m18886setSourceTopLeftInWindowk4lQ0M$ui_core_release(long j) {
        this.sourceTopLeftInWindow.setValue(Offset.m4389boximpl(j));
    }
}
