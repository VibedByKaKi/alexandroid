package com.amazon.comms.calling.domain.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallEvent;", "", "<init>", "()V", "HalloEvent", "CallTypeEvent", "Lcom/amazon/comms/calling/domain/model/InCallEvent$CallTypeEvent;", "Lcom/amazon/comms/calling/domain/model/InCallEvent$HalloEvent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class InCallEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallEvent$CallTypeEvent;", "Lcom/amazon/comms/calling/domain/model/InCallEvent;", "callId", "", "callFlags", "", "callExperienceType", "Lcom/amazon/comms/calling/domain/model/CallExperienceType;", "sipCallContext", "halloEventType", "Lcom/amazon/comms/calling/domain/model/HalloEventType;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/amazon/comms/calling/domain/model/CallExperienceType;Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/HalloEventType;)V", "getCallId", "()Ljava/lang/String;", "getCallFlags", "()Ljava/util/List;", "getCallExperienceType", "()Lcom/amazon/comms/calling/domain/model/CallExperienceType;", "getSipCallContext", "getHalloEventType", "()Lcom/amazon/comms/calling/domain/model/HalloEventType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CallTypeEvent extends InCallEvent {

        @SerializedName("callExperienceType")
        @NotNull
        private final CallExperienceType callExperienceType;

        @SerializedName("callFlags")
        @NotNull
        private final List<String> callFlags;

        @SerializedName("callId")
        @NotNull
        private final String callId;

        @SerializedName("halloEventType")
        @NotNull
        private final HalloEventType halloEventType;

        @SerializedName("sipCallContext")
        @NotNull
        private final String sipCallContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallTypeEvent(@NotNull String str, @NotNull List<String> list, @NotNull CallExperienceType callExperienceType, @NotNull String str2, @NotNull HalloEventType halloEventType) {
            super(null);
            str.getClass();
            list.getClass();
            callExperienceType.getClass();
            str2.getClass();
            halloEventType.getClass();
            this.callId = str;
            this.callFlags = list;
            this.callExperienceType = callExperienceType;
            this.sipCallContext = str2;
            this.halloEventType = halloEventType;
        }

        public static /* synthetic */ CallTypeEvent copy$default(CallTypeEvent callTypeEvent, String str, List list, CallExperienceType callExperienceType, String str2, HalloEventType halloEventType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callTypeEvent.callId;
            }
            if ((i & 2) != 0) {
                list = callTypeEvent.callFlags;
            }
            if ((i & 4) != 0) {
                callExperienceType = callTypeEvent.callExperienceType;
            }
            if ((i & 8) != 0) {
                str2 = callTypeEvent.sipCallContext;
            }
            if ((i & 16) != 0) {
                halloEventType = callTypeEvent.halloEventType;
            }
            HalloEventType halloEventType2 = halloEventType;
            CallExperienceType callExperienceType2 = callExperienceType;
            return callTypeEvent.copy(str, list, callExperienceType2, str2, halloEventType2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @NotNull
        public final List<String> component2() {
            return this.callFlags;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CallExperienceType getCallExperienceType() {
            return this.callExperienceType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getSipCallContext() {
            return this.sipCallContext;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final HalloEventType getHalloEventType() {
            return this.halloEventType;
        }

        @NotNull
        public final CallTypeEvent copy(@NotNull String callId, @NotNull List<String> callFlags, @NotNull CallExperienceType callExperienceType, @NotNull String sipCallContext, @NotNull HalloEventType halloEventType) {
            callId.getClass();
            callFlags.getClass();
            callExperienceType.getClass();
            sipCallContext.getClass();
            halloEventType.getClass();
            return new CallTypeEvent(callId, callFlags, callExperienceType, sipCallContext, halloEventType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallTypeEvent)) {
                return false;
            }
            CallTypeEvent callTypeEvent = (CallTypeEvent) other;
            return Intrinsics.areEqual(this.callId, callTypeEvent.callId) && Intrinsics.areEqual(this.callFlags, callTypeEvent.callFlags) && this.callExperienceType == callTypeEvent.callExperienceType && Intrinsics.areEqual(this.sipCallContext, callTypeEvent.sipCallContext) && this.halloEventType == callTypeEvent.halloEventType;
        }

        @NotNull
        public final CallExperienceType getCallExperienceType() {
            return this.callExperienceType;
        }

        @NotNull
        public final List<String> getCallFlags() {
            return this.callFlags;
        }

        @NotNull
        public final String getCallId() {
            return this.callId;
        }

        @NotNull
        public final HalloEventType getHalloEventType() {
            return this.halloEventType;
        }

        @NotNull
        public final String getSipCallContext() {
            return this.sipCallContext;
        }

        public int hashCode() {
            return this.halloEventType.hashCode() + b.a(this.sipCallContext, (this.callExperienceType.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.callFlags, this.callId.hashCode() * 31, 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.callId;
            List<String> list = this.callFlags;
            CallExperienceType callExperienceType = this.callExperienceType;
            String str2 = this.sipCallContext;
            HalloEventType halloEventType = this.halloEventType;
            StringBuilder m14724m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("CallTypeEvent(callId=", str, ", callFlags=", (List) list, ", callExperienceType=");
            m14724m.append(callExperienceType);
            m14724m.append(", sipCallContext=");
            m14724m.append(str2);
            m14724m.append(", halloEventType=");
            m14724m.append(halloEventType);
            m14724m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m14724m.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/InCallEvent$HalloEvent;", "Lcom/amazon/comms/calling/domain/model/InCallEvent;", "callId", "", "sipCallContext", "sipStatusCode", "halloEventType", "Lcom/amazon/comms/calling/domain/model/HalloEventType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/HalloEventType;)V", "getCallId", "()Ljava/lang/String;", "getSipCallContext", "getSipStatusCode", "getHalloEventType", "()Lcom/amazon/comms/calling/domain/model/HalloEventType;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HalloEvent extends InCallEvent {

        @SerializedName("callId")
        @NotNull
        private final String callId;

        @SerializedName("halloEventType")
        @NotNull
        private final HalloEventType halloEventType;

        @SerializedName("sipCallContext")
        @NotNull
        private final String sipCallContext;

        @SerializedName("sipStatusCode")
        @NotNull
        private final String sipStatusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HalloEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull HalloEventType halloEventType) {
            super(null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            halloEventType.getClass();
            this.callId = str;
            this.sipCallContext = str2;
            this.sipStatusCode = str3;
            this.halloEventType = halloEventType;
        }

        public static /* synthetic */ HalloEvent copy$default(HalloEvent halloEvent, String str, String str2, String str3, HalloEventType halloEventType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = halloEvent.callId;
            }
            if ((i & 2) != 0) {
                str2 = halloEvent.sipCallContext;
            }
            if ((i & 4) != 0) {
                str3 = halloEvent.sipStatusCode;
            }
            if ((i & 8) != 0) {
                halloEventType = halloEvent.halloEventType;
            }
            return halloEvent.copy(str, str2, str3, halloEventType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSipCallContext() {
            return this.sipCallContext;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSipStatusCode() {
            return this.sipStatusCode;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final HalloEventType getHalloEventType() {
            return this.halloEventType;
        }

        @NotNull
        public final HalloEvent copy(@NotNull String callId, @NotNull String sipCallContext, @NotNull String sipStatusCode, @NotNull HalloEventType halloEventType) {
            callId.getClass();
            sipCallContext.getClass();
            sipStatusCode.getClass();
            halloEventType.getClass();
            return new HalloEvent(callId, sipCallContext, sipStatusCode, halloEventType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HalloEvent)) {
                return false;
            }
            HalloEvent halloEvent = (HalloEvent) other;
            return Intrinsics.areEqual(this.callId, halloEvent.callId) && Intrinsics.areEqual(this.sipCallContext, halloEvent.sipCallContext) && Intrinsics.areEqual(this.sipStatusCode, halloEvent.sipStatusCode) && this.halloEventType == halloEvent.halloEventType;
        }

        @NotNull
        public final String getCallId() {
            return this.callId;
        }

        @NotNull
        public final HalloEventType getHalloEventType() {
            return this.halloEventType;
        }

        @NotNull
        public final String getSipCallContext() {
            return this.sipCallContext;
        }

        @NotNull
        public final String getSipStatusCode() {
            return this.sipStatusCode;
        }

        public int hashCode() {
            return this.halloEventType.hashCode() + b.a(this.sipStatusCode, b.a(this.sipCallContext, this.callId.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.callId;
            String str2 = this.sipCallContext;
            String str3 = this.sipStatusCode;
            HalloEventType halloEventType = this.halloEventType;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("HalloEvent(callId=", str, ", sipCallContext=", str2, ", sipStatusCode=");
            m.append(str3);
            m.append(", halloEventType=");
            m.append(halloEventType);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }
    }

    public /* synthetic */ InCallEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InCallEvent() {
    }
}
