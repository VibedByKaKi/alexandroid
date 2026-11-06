package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;", "", "<init>", "()V", "Enable", "Disable", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction$Disable;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction$Enable;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class WakeWordAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction$Disable;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;", "selection", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;)V", "getSelection", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disable extends WakeWordAction {

        @NotNull
        private final WakeWordSelection selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disable(@NotNull WakeWordSelection wakeWordSelection) {
            super(null);
            wakeWordSelection.getClass();
            this.selection = wakeWordSelection;
        }

        public static /* synthetic */ Disable copy$default(Disable disable, WakeWordSelection wakeWordSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWordSelection = disable.selection;
            }
            return disable.copy(wakeWordSelection);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final WakeWordSelection getSelection() {
            return this.selection;
        }

        @NotNull
        public final Disable copy(@NotNull WakeWordSelection selection) {
            selection.getClass();
            return new Disable(selection);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disable) && Intrinsics.areEqual(this.selection, ((Disable) other).selection);
        }

        @NotNull
        public final WakeWordSelection getSelection() {
            return this.selection;
        }

        public int hashCode() {
            return this.selection.hashCode();
        }

        @NotNull
        public String toString() {
            return "Disable(selection=" + this.selection + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction$Enable;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;", "selection", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;)V", "getSelection", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Enable extends WakeWordAction {

        @NotNull
        private final WakeWordSelection selection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enable(@NotNull WakeWordSelection wakeWordSelection) {
            super(null);
            wakeWordSelection.getClass();
            this.selection = wakeWordSelection;
        }

        public static /* synthetic */ Enable copy$default(Enable enable, WakeWordSelection wakeWordSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWordSelection = enable.selection;
            }
            return enable.copy(wakeWordSelection);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final WakeWordSelection getSelection() {
            return this.selection;
        }

        @NotNull
        public final Enable copy(@NotNull WakeWordSelection selection) {
            selection.getClass();
            return new Enable(selection);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enable) && Intrinsics.areEqual(this.selection, ((Enable) other).selection);
        }

        @NotNull
        public final WakeWordSelection getSelection() {
            return this.selection;
        }

        public int hashCode() {
            return this.selection.hashCode();
        }

        @NotNull
        public String toString() {
            return "Enable(selection=" + this.selection + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ WakeWordAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WakeWordAction() {
    }
}
