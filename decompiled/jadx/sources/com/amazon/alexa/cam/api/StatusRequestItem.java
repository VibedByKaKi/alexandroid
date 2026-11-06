package com.amazon.alexa.cam.api;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/cam/api/StatusRequestItem;", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "processorId", "(Ljava/lang/String;Ljava/lang/String;)V", "getNodeId", "()Ljava/lang/String;", "getProcessorId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StatusRequestItem {

    @NotNull
    private final String nodeId;

    @NotNull
    private final String processorId;

    public StatusRequestItem(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.nodeId = str;
        this.processorId = str2;
    }

    public static /* synthetic */ StatusRequestItem copy$default(StatusRequestItem statusRequestItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusRequestItem.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = statusRequestItem.processorId;
        }
        return statusRequestItem.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProcessorId() {
        return this.processorId;
    }

    @NotNull
    public final StatusRequestItem copy(@NotNull String nodeId, @NotNull String processorId) {
        nodeId.getClass();
        processorId.getClass();
        return new StatusRequestItem(nodeId, processorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusRequestItem)) {
            return false;
        }
        StatusRequestItem statusRequestItem = (StatusRequestItem) other;
        return Intrinsics.areEqual(this.nodeId, statusRequestItem.nodeId) && Intrinsics.areEqual(this.processorId, statusRequestItem.processorId);
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    public final String getProcessorId() {
        return this.processorId;
    }

    public int hashCode() {
        return this.processorId.hashCode() + (this.nodeId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("StatusRequestItem(nodeId=", this.nodeId, ", processorId=", this.processorId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
