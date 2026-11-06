package com.amazon.alexa.ra.core.features.dictation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect;", "", "ShowError", "RequestMicPermission", "Haptic", "RaiseKeyboard", "MicTapped", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$Haptic;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$MicTapped;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$RaiseKeyboard;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$RequestMicPermission;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$ShowError;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface DictationEffect {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$Haptic;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lcom/amazon/alexa/ra/core/features/dictation/HapticKind;", "<init>", "(Lcom/amazon/alexa/ra/core/features/dictation/HapticKind;)V", "getKind", "()Lcom/amazon/alexa/ra/core/features/dictation/HapticKind;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Haptic implements DictationEffect {
        public static final int $stable = 0;

        @NotNull
        private final HapticKind kind;

        public Haptic(@NotNull HapticKind hapticKind) {
            hapticKind.getClass();
            this.kind = hapticKind;
        }

        public static /* synthetic */ Haptic copy$default(Haptic haptic, HapticKind hapticKind, int i, Object obj) {
            if ((i & 1) != 0) {
                hapticKind = haptic.kind;
            }
            return haptic.copy(hapticKind);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final HapticKind getKind() {
            return this.kind;
        }

        @NotNull
        public final Haptic copy(@NotNull HapticKind kind) {
            kind.getClass();
            return new Haptic(kind);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Haptic) && this.kind == ((Haptic) other).kind;
        }

        @NotNull
        public final HapticKind getKind() {
            return this.kind;
        }

        public int hashCode() {
            return this.kind.hashCode();
        }

        @NotNull
        public String toString() {
            return "Haptic(kind=" + this.kind + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$MicTapped;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MicTapped implements DictationEffect {
        public static final int $stable = 0;

        @NotNull
        public static final MicTapped INSTANCE = new MicTapped();

        private MicTapped() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$RaiseKeyboard;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RaiseKeyboard implements DictationEffect {
        public static final int $stable = 0;

        @NotNull
        public static final RaiseKeyboard INSTANCE = new RaiseKeyboard();

        private RaiseKeyboard() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$RequestMicPermission;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestMicPermission implements DictationEffect {
        public static final int $stable = 0;

        @NotNull
        public static final RequestMicPermission INSTANCE = new RequestMicPermission();

        private RequestMicPermission() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect$ShowError;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowError implements DictationEffect {
        public static final int $stable = 0;

        @NotNull
        public static final ShowError INSTANCE = new ShowError();

        private ShowError() {
        }
    }
}
