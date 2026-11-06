package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "", "<init>", "()V", "RTTSetting", "OnSepiaDataChanged", "OnCallCaptioningAvailable", "OnCallCaptioningApplied", "OnCallCaptioningRemoved", "OnStopped", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnCallCaptioningApplied;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnCallCaptioningAvailable;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnCallCaptioningRemoved;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnSepiaDataChanged;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnStopped;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$RTTSetting;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class InCallExperienceEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnCallCaptioningApplied;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "isApplied", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCallCaptioningApplied extends InCallExperienceEvent {
        private final boolean isApplied;

        public OnCallCaptioningApplied(boolean z) {
            super(null);
            this.isApplied = z;
        }

        public static /* synthetic */ OnCallCaptioningApplied copy$default(OnCallCaptioningApplied onCallCaptioningApplied, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onCallCaptioningApplied.isApplied;
            }
            return onCallCaptioningApplied.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsApplied() {
            return this.isApplied;
        }

        @NotNull
        public final OnCallCaptioningApplied copy(boolean isApplied) {
            return new OnCallCaptioningApplied(isApplied);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCallCaptioningApplied) && this.isApplied == ((OnCallCaptioningApplied) other).isApplied;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isApplied);
        }

        public final boolean isApplied() {
            return this.isApplied;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("OnCallCaptioningApplied(isApplied=", MarkdownConstants.RIGHT_PARENTHESIS, this.isApplied);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnCallCaptioningAvailable;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "isAvailable", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCallCaptioningAvailable extends InCallExperienceEvent {
        private final boolean isAvailable;

        public OnCallCaptioningAvailable(boolean z) {
            super(null);
            this.isAvailable = z;
        }

        public static /* synthetic */ OnCallCaptioningAvailable copy$default(OnCallCaptioningAvailable onCallCaptioningAvailable, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onCallCaptioningAvailable.isAvailable;
            }
            return onCallCaptioningAvailable.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAvailable() {
            return this.isAvailable;
        }

        @NotNull
        public final OnCallCaptioningAvailable copy(boolean isAvailable) {
            return new OnCallCaptioningAvailable(isAvailable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCallCaptioningAvailable) && this.isAvailable == ((OnCallCaptioningAvailable) other).isAvailable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAvailable);
        }

        public final boolean isAvailable() {
            return this.isAvailable;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("OnCallCaptioningAvailable(isAvailable=", MarkdownConstants.RIGHT_PARENTHESIS, this.isAvailable);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnCallCaptioningRemoved;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "isRemoved", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCallCaptioningRemoved extends InCallExperienceEvent {
        private final boolean isRemoved;

        public OnCallCaptioningRemoved(boolean z) {
            super(null);
            this.isRemoved = z;
        }

        public static /* synthetic */ OnCallCaptioningRemoved copy$default(OnCallCaptioningRemoved onCallCaptioningRemoved, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onCallCaptioningRemoved.isRemoved;
            }
            return onCallCaptioningRemoved.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRemoved() {
            return this.isRemoved;
        }

        @NotNull
        public final OnCallCaptioningRemoved copy(boolean isRemoved) {
            return new OnCallCaptioningRemoved(isRemoved);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCallCaptioningRemoved) && this.isRemoved == ((OnCallCaptioningRemoved) other).isRemoved;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRemoved);
        }

        public final boolean isRemoved() {
            return this.isRemoved;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("OnCallCaptioningRemoved(isRemoved=", MarkdownConstants.RIGHT_PARENTHESIS, this.isRemoved);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnSepiaDataChanged;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "sepiaData", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;", "<init>", "(Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;)V", "getSepiaData", "()Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSepiaDataChanged extends InCallExperienceEvent {

        @NotNull
        private final SepiaData sepiaData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSepiaDataChanged(@NotNull SepiaData sepiaData) {
            super(null);
            sepiaData.getClass();
            this.sepiaData = sepiaData;
        }

        public static /* synthetic */ OnSepiaDataChanged copy$default(OnSepiaDataChanged onSepiaDataChanged, SepiaData sepiaData, int i, Object obj) {
            if ((i & 1) != 0) {
                sepiaData = onSepiaDataChanged.sepiaData;
            }
            return onSepiaDataChanged.copy(sepiaData);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SepiaData getSepiaData() {
            return this.sepiaData;
        }

        @NotNull
        public final OnSepiaDataChanged copy(@NotNull SepiaData sepiaData) {
            sepiaData.getClass();
            return new OnSepiaDataChanged(sepiaData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSepiaDataChanged) && Intrinsics.areEqual(this.sepiaData, ((OnSepiaDataChanged) other).sepiaData);
        }

        @NotNull
        public final SepiaData getSepiaData() {
            return this.sepiaData;
        }

        public int hashCode() {
            return this.sepiaData.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnSepiaDataChanged(sepiaData=" + this.sepiaData + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$OnStopped;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnStopped extends InCallExperienceEvent {

        @NotNull
        public static final OnStopped INSTANCE = new OnStopped();

        private OnStopped() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent$RTTSetting;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "isEnabled", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RTTSetting extends InCallExperienceEvent {
        private final boolean isEnabled;

        public RTTSetting(boolean z) {
            super(null);
            this.isEnabled = z;
        }

        public static /* synthetic */ RTTSetting copy$default(RTTSetting rTTSetting, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rTTSetting.isEnabled;
            }
            return rTTSetting.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public final RTTSetting copy(boolean isEnabled) {
            return new RTTSetting(isEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RTTSetting) && this.isEnabled == ((RTTSetting) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("RTTSetting(isEnabled=", MarkdownConstants.RIGHT_PARENTHESIS, this.isEnabled);
        }
    }

    public /* synthetic */ InCallExperienceEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InCallExperienceEvent() {
    }
}
