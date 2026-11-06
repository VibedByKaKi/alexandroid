package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.coral.profiler.ProfilerCategory;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0005\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "", "<init>", "()V", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "toString", "CloseTalk", "NearField", "FarField", ProfilerCategory.OTHER, "Companion", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$CloseTalk;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$FarField;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$NearField;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$Other;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = SpeechRecognitionProfileSerializer.class)
/* loaded from: classes15.dex */
public abstract class SpeechRecognitionProfile {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$CloseTalk;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "<init>", "()V", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseTalk extends SpeechRecognitionProfile {

        @NotNull
        public static final CloseTalk INSTANCE = new CloseTalk();

        @NotNull
        private static final String rawValue = "CLOSE_TALK";

        private CloseTalk() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CloseTalk);
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String getRawValue() {
            return rawValue;
        }

        public int hashCode() {
            return 469826358;
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String toString() {
            return "CloseTalk";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$FarField;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "<init>", "()V", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FarField extends SpeechRecognitionProfile {

        @NotNull
        public static final FarField INSTANCE = new FarField();

        @NotNull
        private static final String rawValue = "FAR_FIELD";

        private FarField() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FarField);
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String getRawValue() {
            return rawValue;
        }

        public int hashCode() {
            return -733710991;
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String toString() {
            return "FarField";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$NearField;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "<init>", "()V", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NearField extends SpeechRecognitionProfile {

        @NotNull
        public static final NearField INSTANCE = new NearField();

        @NotNull
        private static final String rawValue = "NEAR_FIELD";

        private NearField() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NearField);
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String getRawValue() {
            return rawValue;
        }

        public int hashCode() {
            return -1143852508;
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String toString() {
            return "NearField";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$Other;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "customValue", "", "<init>", "(Ljava/lang/String;)V", "getCustomValue", "()Ljava/lang/String;", "rawValue", "getRawValue", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Other extends SpeechRecognitionProfile {

        @NotNull
        private final String customValue;

        @NotNull
        private final String rawValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(@NotNull String str) {
            super(null);
            str.getClass();
            this.customValue = str;
            this.rawValue = str;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.customValue;
            }
            return other.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCustomValue() {
            return this.customValue;
        }

        @NotNull
        public final Other copy(@NotNull String customValue) {
            customValue.getClass();
            return new Other(customValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && Intrinsics.areEqual(this.customValue, ((Other) other).customValue);
        }

        @NotNull
        public final String getCustomValue() {
            return this.customValue;
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String getRawValue() {
            return this.rawValue;
        }

        public int hashCode() {
            return this.customValue.hashCode();
        }

        @Override // com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechRecognitionProfile
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Other(customValue=", this.customValue, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ SpeechRecognitionProfile(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getRawValue();

    @NotNull
    public String toString() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile$Companion;", "", "<init>", "()V", "fromRawValue", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpeechRecognitionProfile fromRawValue(@NotNull String value) {
            value.getClass();
            int hashCode = value.hashCode();
            if (hashCode != -2101688942) {
                if (hashCode != -1546918221) {
                    if (hashCode == 1557581315 && value.equals("NEAR_FIELD")) {
                        return NearField.INSTANCE;
                    }
                } else if (value.equals("CLOSE_TALK")) {
                    return CloseTalk.INSTANCE;
                }
            } else if (value.equals("FAR_FIELD")) {
                return FarField.INSTANCE;
            }
            return new Other(value);
        }

        @NotNull
        public final KSerializer<SpeechRecognitionProfile> serializer() {
            return SpeechRecognitionProfileSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private SpeechRecognitionProfile() {
    }
}
