package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "", "<init>", "()V", "canTransitionTo", "", "target", VoiceChatContract.COLUMN_IS_ACTIVE, "isError", "isInactive", "Inactive", "Starting", "Active", "Detected", "Error", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Active;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Detected;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Error;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Inactive;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Starting;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class WakeWordRecognizerState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Active;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "<init>", "()V", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Active extends WakeWordRecognizerState {

        @NotNull
        public static final Active INSTANCE = new Active();

        private Active() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "WakeWordRecognizerState.Active";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Detected;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "detection", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;)V", "getDetection", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", "toString", "", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Detected extends WakeWordRecognizerState {

        @NotNull
        private final WakeWordDetectionResult detection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Detected(@NotNull WakeWordDetectionResult wakeWordDetectionResult) {
            super(null);
            wakeWordDetectionResult.getClass();
            this.detection = wakeWordDetectionResult;
        }

        public static /* synthetic */ Detected copy$default(Detected detected, WakeWordDetectionResult wakeWordDetectionResult, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWordDetectionResult = detected.detection;
            }
            return detected.copy(wakeWordDetectionResult);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final WakeWordDetectionResult getDetection() {
            return this.detection;
        }

        @NotNull
        public final Detected copy(@NotNull WakeWordDetectionResult detection) {
            detection.getClass();
            return new Detected(detection);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Detected) && Intrinsics.areEqual(this.detection, ((Detected) other).detection);
        }

        @NotNull
        public final WakeWordDetectionResult getDetection() {
            return this.detection;
        }

        public int hashCode() {
            return this.detection.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("WakeWordRecognizerState.Detected(", this.detection.getWakeWord().getIdentifier(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Error;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "error", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;)V", "getError", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "toString", "", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends WakeWordRecognizerState {

        @NotNull
        private final WakeWordRecognizerError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull WakeWordRecognizerError wakeWordRecognizerError) {
            super(null);
            wakeWordRecognizerError.getClass();
            this.error = wakeWordRecognizerError;
        }

        public static /* synthetic */ Error copy$default(Error error, WakeWordRecognizerError wakeWordRecognizerError, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWordRecognizerError = error.error;
            }
            return error.copy(wakeWordRecognizerError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final WakeWordRecognizerError getError() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull WakeWordRecognizerError error) {
            error.getClass();
            return new Error(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        @NotNull
        public final WakeWordRecognizerError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("WakeWordRecognizerState.Error(", this.error.getClass().getSimpleName(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Inactive;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "<init>", "()V", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Inactive extends WakeWordRecognizerState {

        @NotNull
        public static final Inactive INSTANCE = new Inactive();

        private Inactive() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "WakeWordRecognizerState.Inactive";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState$Starting;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "<init>", "()V", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Starting extends WakeWordRecognizerState {

        @NotNull
        public static final Starting INSTANCE = new Starting();

        private Starting() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "WakeWordRecognizerState.Starting";
        }
    }

    public /* synthetic */ WakeWordRecognizerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean canTransitionTo(@NotNull WakeWordRecognizerState target) {
        target.getClass();
        if (this instanceof Inactive) {
            return target instanceof Starting;
        }
        if (this instanceof Starting) {
            return (target instanceof Active) || (target instanceof Error);
        }
        if (this instanceof Active) {
            return (target instanceof Detected) || (target instanceof Error) || (target instanceof Inactive);
        }
        if (this instanceof Detected) {
            return (target instanceof Active) || (target instanceof Inactive);
        }
        if (this instanceof Error) {
            return target instanceof Inactive;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return false;
    }

    public final boolean isActive() {
        return (this instanceof Active) || (this instanceof Detected);
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isInactive() {
        return this instanceof Inactive;
    }

    private WakeWordRecognizerState() {
    }
}
