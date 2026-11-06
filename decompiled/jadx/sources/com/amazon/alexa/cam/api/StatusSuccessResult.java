package com.amazon.alexa.cam.api;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/amazon/alexa/cam/api/StatusSuccessResult;", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "processor", "Lcom/amazon/alexa/cam/api/ProcessorInfo;", "status", "warnings", "", "Lcom/amazon/alexa/cam/api/Warning;", "errors", "Lcom/amazon/alexa/cam/api/Error;", "extractions", "Lcom/amazon/alexa/cam/api/Extraction;", "(Ljava/lang/String;Lcom/amazon/alexa/cam/api/ProcessorInfo;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "getExtractions", "getNodeId", "()Ljava/lang/String;", "getProcessor", "()Lcom/amazon/alexa/cam/api/ProcessorInfo;", "getStatus", "getWarnings", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StatusSuccessResult {

    @Nullable
    private final List<Error> errors;

    @Nullable
    private final List<Extraction> extractions;

    @NotNull
    private final String nodeId;

    @NotNull
    private final ProcessorInfo processor;

    @NotNull
    private final String status;

    @Nullable
    private final List<Warning> warnings;

    public StatusSuccessResult(@NotNull String str, @NotNull ProcessorInfo processorInfo, @NotNull String str2, @Nullable List<Warning> list, @Nullable List<Error> list2, @Nullable List<Extraction> list3) {
        str.getClass();
        processorInfo.getClass();
        str2.getClass();
        this.nodeId = str;
        this.processor = processorInfo;
        this.status = str2;
        this.warnings = list;
        this.errors = list2;
        this.extractions = list3;
    }

    public static /* synthetic */ StatusSuccessResult copy$default(StatusSuccessResult statusSuccessResult, String str, ProcessorInfo processorInfo, String str2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusSuccessResult.nodeId;
        }
        if ((i & 2) != 0) {
            processorInfo = statusSuccessResult.processor;
        }
        if ((i & 4) != 0) {
            str2 = statusSuccessResult.status;
        }
        if ((i & 8) != 0) {
            list = statusSuccessResult.warnings;
        }
        if ((i & 16) != 0) {
            list2 = statusSuccessResult.errors;
        }
        if ((i & 32) != 0) {
            list3 = statusSuccessResult.extractions;
        }
        List list4 = list2;
        List list5 = list3;
        return statusSuccessResult.copy(str, processorInfo, str2, list, list4, list5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ProcessorInfo getProcessor() {
        return this.processor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<Warning> component4() {
        return this.warnings;
    }

    @Nullable
    public final List<Error> component5() {
        return this.errors;
    }

    @Nullable
    public final List<Extraction> component6() {
        return this.extractions;
    }

    @NotNull
    public final StatusSuccessResult copy(@NotNull String nodeId, @NotNull ProcessorInfo processor, @NotNull String status, @Nullable List<Warning> warnings, @Nullable List<Error> errors, @Nullable List<Extraction> extractions) {
        nodeId.getClass();
        processor.getClass();
        status.getClass();
        return new StatusSuccessResult(nodeId, processor, status, warnings, errors, extractions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusSuccessResult)) {
            return false;
        }
        StatusSuccessResult statusSuccessResult = (StatusSuccessResult) other;
        return Intrinsics.areEqual(this.nodeId, statusSuccessResult.nodeId) && Intrinsics.areEqual(this.processor, statusSuccessResult.processor) && Intrinsics.areEqual(this.status, statusSuccessResult.status) && Intrinsics.areEqual(this.warnings, statusSuccessResult.warnings) && Intrinsics.areEqual(this.errors, statusSuccessResult.errors) && Intrinsics.areEqual(this.extractions, statusSuccessResult.extractions);
    }

    @Nullable
    public final List<Error> getErrors() {
        return this.errors;
    }

    @Nullable
    public final List<Extraction> getExtractions() {
        return this.extractions;
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    public final ProcessorInfo getProcessor() {
        return this.processor;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<Warning> getWarnings() {
        return this.warnings;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m((this.processor.hashCode() + (this.nodeId.hashCode() * 31)) * 31, 31, this.status);
        List<Warning> list = this.warnings;
        int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
        List<Error> list2 = this.errors;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Extraction> list3 = this.extractions;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StatusSuccessResult(nodeId=" + this.nodeId + ", processor=" + this.processor + ", status=" + this.status + ", warnings=" + this.warnings + ", errors=" + this.errors + ", extractions=" + this.extractions + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ StatusSuccessResult(String str, ProcessorInfo processorInfo, String str2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, processorInfo, str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3);
    }
}
