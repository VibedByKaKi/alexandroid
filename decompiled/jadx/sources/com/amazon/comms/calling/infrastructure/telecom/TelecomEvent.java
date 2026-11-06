package com.amazon.comms.calling.infrastructure.telecom;

import android.telecom.CallAudioState;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "", "<init>", "()V", "OnInitiated", "OnShowIncomingCallUi", "OnAnswer", "OnReject", "OnSilence", "OnDisconnect", "OnStateChanged", "OnCallAudioStateChanged", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnAnswer;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnCallAudioStateChanged;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnDisconnect;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnInitiated;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnReject;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnShowIncomingCallUi;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnSilence;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnStateChanged;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class TelecomEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnAnswer;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAnswer extends TelecomEvent {

        @NotNull
        public static final OnAnswer INSTANCE = new OnAnswer();

        private OnAnswer() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnCallAudioStateChanged;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "state", "Landroid/telecom/CallAudioState;", "<init>", "(Landroid/telecom/CallAudioState;)V", "getState", "()Landroid/telecom/CallAudioState;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCallAudioStateChanged extends TelecomEvent {

        @NotNull
        private final CallAudioState state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCallAudioStateChanged(@NotNull CallAudioState callAudioState) {
            super(null);
            callAudioState.getClass();
            this.state = callAudioState;
        }

        public static /* synthetic */ OnCallAudioStateChanged copy$default(OnCallAudioStateChanged onCallAudioStateChanged, CallAudioState callAudioState, int i, Object obj) {
            if ((i & 1) != 0) {
                callAudioState = onCallAudioStateChanged.state;
            }
            return onCallAudioStateChanged.copy(callAudioState);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallAudioState getState() {
            return this.state;
        }

        @NotNull
        public final OnCallAudioStateChanged copy(@NotNull CallAudioState state) {
            state.getClass();
            return new OnCallAudioStateChanged(state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCallAudioStateChanged) && Intrinsics.areEqual(this.state, ((OnCallAudioStateChanged) other).state);
        }

        @NotNull
        public final CallAudioState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnCallAudioStateChanged(state=" + this.state + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnDisconnect;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDisconnect extends TelecomEvent {

        @NotNull
        public static final OnDisconnect INSTANCE = new OnDisconnect();

        private OnDisconnect() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnInitiated;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInitiated extends TelecomEvent {

        @NotNull
        public static final OnInitiated INSTANCE = new OnInitiated();

        private OnInitiated() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnReject;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReject extends TelecomEvent {

        @NotNull
        public static final OnReject INSTANCE = new OnReject();

        private OnReject() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnShowIncomingCallUi;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShowIncomingCallUi extends TelecomEvent {

        @NotNull
        public static final OnShowIncomingCallUi INSTANCE = new OnShowIncomingCallUi();

        private OnShowIncomingCallUi() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnSilence;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSilence extends TelecomEvent {

        @NotNull
        public static final OnSilence INSTANCE = new OnSilence();

        private OnSilence() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent$OnStateChanged;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "state", "", "<init>", "(I)V", "getState", "()I", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStateChanged extends TelecomEvent {
        private final int state;

        public OnStateChanged(int i) {
            super(null);
            this.state = i;
        }

        public static /* synthetic */ OnStateChanged copy$default(OnStateChanged onStateChanged, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onStateChanged.state;
            }
            return onStateChanged.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getState() {
            return this.state;
        }

        @NotNull
        public final OnStateChanged copy(int state) {
            return new OnStateChanged(state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStateChanged) && this.state == ((OnStateChanged) other).state;
        }

        public final int getState() {
            return this.state;
        }

        public int hashCode() {
            return Integer.hashCode(this.state);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(this.state, "OnStateChanged(state=", MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ TelecomEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TelecomEvent() {
    }
}
