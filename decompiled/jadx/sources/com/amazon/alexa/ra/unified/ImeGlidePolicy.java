package com.amazon.alexa.ra.unified;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.voice.ui.ra.RaConversationHost;
import com.amazon.alexa.voice.ui.ra.RaConversationState;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u000fJ\b\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/unified/ImeGlidePolicy;", "", "<init>", "()V", "armed", "", "restorePending", "imeVisible", "imeAnimating", "armedHost", "Lcom/amazon/alexa/voice/ui/ra/RaConversationHost;", "onImeVisibilityRead", "", ViewProps.VISIBLE, "onConversationHosted", "Lcom/amazon/alexa/ra/unified/ImeGlidePolicy$Action;", "host", "onConversationGone", "onImeAnimationStarted", "onImeAnimationEnded", "reset", "maybeRestore", "Companion", "Action", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ImeGlidePolicy {
    private boolean armed;

    @Nullable
    private RaConversationHost armedHost;
    private boolean imeAnimating;
    private boolean imeVisible;
    private boolean restorePending;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/unified/ImeGlidePolicy$Action;", "", "<init>", "(Ljava/lang/String;I)V", "ARM", "RESTORE", "NONE", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ARM = new Action("ARM", 0);
        public static final Action RESTORE = new Action("RESTORE", 1);
        public static final Action NONE = new Action("NONE", 2);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ARM, RESTORE, NONE};
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

    private final Action maybeRestore() {
        if (!this.armed || !this.restorePending || this.imeVisible || this.imeAnimating) {
            return Action.NONE;
        }
        this.armed = false;
        this.restorePending = false;
        this.armedHost = null;
        return Action.RESTORE;
    }

    @NotNull
    public final Action onConversationGone(@NotNull RaConversationHost host) {
        host.getClass();
        if (!this.armed || host != this.armedHost) {
            return Action.NONE;
        }
        this.restorePending = true;
        return maybeRestore();
    }

    @NotNull
    public final Action onConversationHosted(@NotNull RaConversationHost host) {
        host.getClass();
        this.armedHost = host;
        this.restorePending = false;
        if (this.armed) {
            return Action.NONE;
        }
        this.armed = true;
        return Action.ARM;
    }

    @NotNull
    public final Action onImeAnimationEnded(boolean visible) {
        this.imeAnimating = false;
        this.imeVisible = visible;
        return maybeRestore();
    }

    public final void onImeAnimationStarted() {
        this.imeAnimating = true;
    }

    public final void onImeVisibilityRead(boolean visible) {
        this.imeVisible = visible;
    }

    @NotNull
    public final Action reset() {
        boolean z = this.armed;
        this.armed = false;
        this.restorePending = false;
        this.armedHost = null;
        return z ? Action.RESTORE : Action.NONE;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/unified/ImeGlidePolicy$Companion;", "", "<init>", "()V", "shouldArmAtInstall", "", "state", "Lcom/amazon/alexa/voice/ui/ra/RaConversationState;", "host", "Lcom/amazon/alexa/voice/ui/ra/RaConversationHost;", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldArmAtInstall(@NotNull RaConversationState state, @Nullable RaConversationHost host) {
            state.getClass();
            return state == RaConversationState.ACTIVE && host != null;
        }

        private Companion() {
        }
    }
}
