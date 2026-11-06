package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaEventName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/ApplyCallCaptioningUseCaseParams;", "", "captionsLanguage", "", "event", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaEventName;", "<init>", "(Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaEventName;)V", "getCaptionsLanguage", "()Ljava/lang/String;", "getEvent", "()Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaEventName;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ApplyCallCaptioningUseCaseParams {

    @Nullable
    private final String captionsLanguage;

    @NotNull
    private final SepiaEventName event;

    public ApplyCallCaptioningUseCaseParams(@Nullable String str, @NotNull SepiaEventName sepiaEventName) {
        sepiaEventName.getClass();
        this.captionsLanguage = str;
        this.event = sepiaEventName;
    }

    public static /* synthetic */ ApplyCallCaptioningUseCaseParams copy$default(ApplyCallCaptioningUseCaseParams applyCallCaptioningUseCaseParams, String str, SepiaEventName sepiaEventName, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyCallCaptioningUseCaseParams.captionsLanguage;
        }
        if ((i & 2) != 0) {
            sepiaEventName = applyCallCaptioningUseCaseParams.event;
        }
        return applyCallCaptioningUseCaseParams.copy(str, sepiaEventName);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCaptionsLanguage() {
        return this.captionsLanguage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SepiaEventName getEvent() {
        return this.event;
    }

    @NotNull
    public final ApplyCallCaptioningUseCaseParams copy(@Nullable String captionsLanguage, @NotNull SepiaEventName event) {
        event.getClass();
        return new ApplyCallCaptioningUseCaseParams(captionsLanguage, event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyCallCaptioningUseCaseParams)) {
            return false;
        }
        ApplyCallCaptioningUseCaseParams applyCallCaptioningUseCaseParams = (ApplyCallCaptioningUseCaseParams) other;
        return Intrinsics.areEqual(this.captionsLanguage, applyCallCaptioningUseCaseParams.captionsLanguage) && this.event == applyCallCaptioningUseCaseParams.event;
    }

    @Nullable
    public final String getCaptionsLanguage() {
        return this.captionsLanguage;
    }

    @NotNull
    public final SepiaEventName getEvent() {
        return this.event;
    }

    public int hashCode() {
        String str = this.captionsLanguage;
        return this.event.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ApplyCallCaptioningUseCaseParams(captionsLanguage=" + this.captionsLanguage + ", event=" + this.event + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
