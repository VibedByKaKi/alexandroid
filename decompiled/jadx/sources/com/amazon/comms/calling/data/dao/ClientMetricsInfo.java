package com.amazon.comms.calling.data.dao;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/data/dao/ClientMetricsInfo;", "", "callInitiationTime", "", "<init>", "(Ljava/lang/String;)V", "getCallInitiationTime", "()Ljava/lang/String;", "setCallInitiationTime", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ClientMetricsInfo {

    @SerializedName("callInitiationTime")
    @NotNull
    private String callInitiationTime;

    public ClientMetricsInfo(@NotNull String str) {
        str.getClass();
        this.callInitiationTime = str;
    }

    public static /* synthetic */ ClientMetricsInfo copy$default(ClientMetricsInfo clientMetricsInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientMetricsInfo.callInitiationTime;
        }
        return clientMetricsInfo.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCallInitiationTime() {
        return this.callInitiationTime;
    }

    @NotNull
    public final ClientMetricsInfo copy(@NotNull String callInitiationTime) {
        callInitiationTime.getClass();
        return new ClientMetricsInfo(callInitiationTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClientMetricsInfo) && Intrinsics.areEqual(this.callInitiationTime, ((ClientMetricsInfo) other).callInitiationTime);
    }

    @NotNull
    public final String getCallInitiationTime() {
        return this.callInitiationTime;
    }

    public int hashCode() {
        return this.callInitiationTime.hashCode();
    }

    public final void setCallInitiationTime(@NotNull String str) {
        str.getClass();
        this.callInitiationTime = str;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ClientMetricsInfo(callInitiationTime=", this.callInitiationTime, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
