package com.amazon.alexa.assistant.ui.conversation.view.ftux;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/ftux/PermissionRequestState;", "", "isSettingsHint", "", "requestPermission", "Lkotlin/Function0;", "", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "getRequestPermission", "()Lkotlin/jvm/functions/Function0;", "<set-?>", "()Z", "setSettingsHint$ui_release", "(Z)V", "isSettingsHint$delegate", "Landroidx/compose/runtime/MutableState;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionRequestState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionRequestState.kt\ncom/amazon/alexa/assistant/ui/conversation/view/ftux/PermissionRequestState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,160:1\n81#2:161\n107#2,2:162\n*S KotlinDebug\n*F\n+ 1 PermissionRequestState.kt\ncom/amazon/alexa/assistant/ui/conversation/view/ftux/PermissionRequestState\n*L\n43#1:161\n43#1:162,2\n*E\n"})
/* loaded from: classes17.dex */
public final class PermissionRequestState {
    public static final int $stable = 0;

    /* renamed from: isSettingsHint$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isSettingsHint;

    @NotNull
    private final Function0<Unit> requestPermission;

    public PermissionRequestState(boolean z, @NotNull Function0<Unit> function0) {
        function0.getClass();
        this.requestPermission = function0;
        this.isSettingsHint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @NotNull
    public final Function0<Unit> getRequestPermission() {
        return this.requestPermission;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSettingsHint() {
        return ((Boolean) this.isSettingsHint.getValue()).booleanValue();
    }

    public final void setSettingsHint$ui_release(boolean z) {
        this.isSettingsHint.setValue(Boolean.valueOf(z));
    }
}
