package com.amazon.comms.calling.data.network;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.dataChannel.DataChannelEventModel;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent;", "", "<init>", "()V", "OnMessageReceived", "OnRealTimeTextReceived", "Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent$OnMessageReceived;", "Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent$OnRealTimeTextReceived;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class CallingDataChannelEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent$OnMessageReceived;", "Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent;", "dataChannelEventModel", "Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelEventModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelEventModel;)V", "getDataChannelEventModel", "()Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelEventModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMessageReceived extends CallingDataChannelEvent {

        @Nullable
        private final DataChannelEventModel dataChannelEventModel;

        public OnMessageReceived(@Nullable DataChannelEventModel dataChannelEventModel) {
            super(null);
            this.dataChannelEventModel = dataChannelEventModel;
        }

        public static /* synthetic */ OnMessageReceived copy$default(OnMessageReceived onMessageReceived, DataChannelEventModel dataChannelEventModel, int i, Object obj) {
            if ((i & 1) != 0) {
                dataChannelEventModel = onMessageReceived.dataChannelEventModel;
            }
            return onMessageReceived.copy(dataChannelEventModel);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final DataChannelEventModel getDataChannelEventModel() {
            return this.dataChannelEventModel;
        }

        @NotNull
        public final OnMessageReceived copy(@Nullable DataChannelEventModel dataChannelEventModel) {
            return new OnMessageReceived(dataChannelEventModel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnMessageReceived) && Intrinsics.areEqual(this.dataChannelEventModel, ((OnMessageReceived) other).dataChannelEventModel);
        }

        @Nullable
        public final DataChannelEventModel getDataChannelEventModel() {
            return this.dataChannelEventModel;
        }

        public int hashCode() {
            DataChannelEventModel dataChannelEventModel = this.dataChannelEventModel;
            if (dataChannelEventModel == null) {
                return 0;
            }
            return dataChannelEventModel.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnMessageReceived(dataChannelEventModel=" + this.dataChannelEventModel + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent$OnRealTimeTextReceived;", "Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent;", "messageReceived", "", "<init>", "(Ljava/lang/String;)V", "getMessageReceived", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRealTimeTextReceived extends CallingDataChannelEvent {

        @NotNull
        private final String messageReceived;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRealTimeTextReceived(@NotNull String str) {
            super(null);
            str.getClass();
            this.messageReceived = str;
        }

        public static /* synthetic */ OnRealTimeTextReceived copy$default(OnRealTimeTextReceived onRealTimeTextReceived, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onRealTimeTextReceived.messageReceived;
            }
            return onRealTimeTextReceived.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessageReceived() {
            return this.messageReceived;
        }

        @NotNull
        public final OnRealTimeTextReceived copy(@NotNull String messageReceived) {
            messageReceived.getClass();
            return new OnRealTimeTextReceived(messageReceived);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRealTimeTextReceived) && Intrinsics.areEqual(this.messageReceived, ((OnRealTimeTextReceived) other).messageReceived);
        }

        @NotNull
        public final String getMessageReceived() {
            return this.messageReceived;
        }

        public int hashCode() {
            return this.messageReceived.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("OnRealTimeTextReceived(messageReceived=", this.messageReceived, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ CallingDataChannelEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CallingDataChannelEvent() {
    }
}
