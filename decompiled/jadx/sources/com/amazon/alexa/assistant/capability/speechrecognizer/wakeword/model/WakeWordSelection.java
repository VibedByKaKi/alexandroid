package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", "", "<init>", "()V", "All", AlexaMetricsConstants.DriveModeMetrics.NAVIGATE_TO_LINK_POSTFIX, "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection$All;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection$Selected;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class WakeWordSelection {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection$All;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class All extends WakeWordSelection {

        @NotNull
        public static final All INSTANCE = new All();

        private All() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection$Selected;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordSelection;", SystemModelI18nConfigTransformer.KEY_WAKEWORDS, "", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "<init>", "(Ljava/util/Set;)V", "getWakeWords", "()Ljava/util/Set;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Selected extends WakeWordSelection {

        @NotNull
        private final Set<WakeWord> wakeWords;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selected(@NotNull Set<WakeWord> set) {
            super(null);
            set.getClass();
            this.wakeWords = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Selected copy$default(Selected selected, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = selected.wakeWords;
            }
            return selected.copy(set);
        }

        @NotNull
        public final Set<WakeWord> component1() {
            return this.wakeWords;
        }

        @NotNull
        public final Selected copy(@NotNull Set<WakeWord> wakeWords) {
            wakeWords.getClass();
            return new Selected(wakeWords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Selected) && Intrinsics.areEqual(this.wakeWords, ((Selected) other).wakeWords);
        }

        @NotNull
        public final Set<WakeWord> getWakeWords() {
            return this.wakeWords;
        }

        public int hashCode() {
            return this.wakeWords.hashCode();
        }

        @NotNull
        public String toString() {
            return "Selected(wakeWords=" + this.wakeWords + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ WakeWordSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WakeWordSelection() {
    }
}
