package com.amazon.alexa.assistant.ui.conversation.view.ftux;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/ftux/PermissionStateMachine;", "", "isSettingsHint", "", "<init>", "(Z)V", "value", "()Z", "awaitingSettingsReturn", "getAwaitingSettingsReturn", "leftForSettings", "onPermissionResult", "Lcom/amazon/alexa/assistant/ui/conversation/view/ftux/PermissionStateMachine$Action;", "granted", "canShowRationale", "onSettingsRequested", "", "onPause", "onResume", "isGranted", "Action", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PermissionStateMachine {
    public static final int $stable = 8;
    private boolean awaitingSettingsReturn;
    private boolean isSettingsHint;
    private boolean leftForSettings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/ftux/PermissionStateMachine$Action;", "", "<init>", "(Ljava/lang/String;I)V", "GRANTED", "DENIED", "DENIED_PERMANENTLY", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action GRANTED = new Action("GRANTED", 0);
        public static final Action DENIED = new Action("DENIED", 1);
        public static final Action DENIED_PERMANENTLY = new Action("DENIED_PERMANENTLY", 2);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{GRANTED, DENIED, DENIED_PERMANENTLY};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Action(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PermissionStateMachine(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getAwaitingSettingsReturn() {
        return this.awaitingSettingsReturn;
    }

    /* renamed from: isSettingsHint, reason: from getter */
    public final boolean getIsSettingsHint() {
        return this.isSettingsHint;
    }

    public final void onPause() {
        if (this.awaitingSettingsReturn) {
            this.leftForSettings = true;
        }
    }

    @NotNull
    public final Action onPermissionResult(boolean granted, boolean canShowRationale) {
        if (granted) {
            return Action.GRANTED;
        }
        if (canShowRationale) {
            return Action.DENIED;
        }
        this.isSettingsHint = true;
        return Action.DENIED_PERMANENTLY;
    }

    @Nullable
    public final Action onResume(boolean isGranted) {
        if (!this.awaitingSettingsReturn || !this.leftForSettings) {
            return null;
        }
        this.awaitingSettingsReturn = false;
        this.leftForSettings = false;
        if (isGranted) {
            return Action.GRANTED;
        }
        return null;
    }

    public final void onSettingsRequested() {
        this.awaitingSettingsReturn = true;
        this.leftForSettings = false;
    }

    public PermissionStateMachine(boolean z) {
        this.isSettingsHint = z;
    }

    public PermissionStateMachine() {
        this(false, 1, null);
    }
}
