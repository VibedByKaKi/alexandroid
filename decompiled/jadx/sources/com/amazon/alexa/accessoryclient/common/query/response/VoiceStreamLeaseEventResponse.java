package com.amazon.alexa.accessoryclient.common.query.response;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.voicestreaming.VoiceStreamLeaseEvent;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/response/VoiceStreamLeaseEventResponse;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Response;", "event", "Lcom/amazon/alexa/accessory/repositories/voicestreaming/VoiceStreamLeaseEvent;", "(Lcom/amazon/alexa/accessory/repositories/voicestreaming/VoiceStreamLeaseEvent;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getEvent", "()Lcom/amazon/alexa/accessory/repositories/voicestreaming/VoiceStreamLeaseEvent;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VoiceStreamLeaseEventResponse implements Query.Response<VoiceStreamLeaseEventResponse> {

    @NotNull
    private final BundleTransformer<VoiceStreamLeaseEventResponse> bundleTransformer;

    @NotNull
    private final VoiceStreamLeaseEvent event;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/response/VoiceStreamLeaseEventResponse$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/response/VoiceStreamLeaseEventResponse;", "()V", "KEY_KIND", "", "KEY_LEASE_ID", "KEY_PRIORITY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<VoiceStreamLeaseEventResponse> {

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String KEY_KIND = "lease_event_kind";

        @NotNull
        private static final String KEY_LEASE_ID = "lease_event_lease_id";

        @NotNull
        private static final String KEY_PRIORITY = "lease_event_priority";

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VoiceStreamLeaseEvent.Kind.values().length];
                try {
                    iArr[VoiceStreamLeaseEvent.Kind.GRANTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VoiceStreamLeaseEvent.Kind.PREEMPTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public VoiceStreamLeaseEventResponse fromBundle2(@NotNull Bundle bundle) {
            Object m25294constructorimpl;
            VoiceStreamLeaseEvent granted;
            bundle.getClass();
            try {
                Result.Companion companion = Result.INSTANCE;
                String string = bundle.getString(KEY_KIND);
                if (string == null) {
                    string = "";
                }
                m25294constructorimpl = Result.m25294constructorimpl(VoiceStreamLeaseEvent.Kind.valueOf(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            VoiceStreamLeaseEvent.Kind kind = VoiceStreamLeaseEvent.Kind.PREEMPTED;
            if (Result.m25300isFailureimpl(m25294constructorimpl)) {
                m25294constructorimpl = kind;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[((VoiceStreamLeaseEvent.Kind) m25294constructorimpl).ordinal()];
            if (i == 1) {
                granted = VoiceStreamLeaseEvent.granted(bundle.getInt(KEY_LEASE_ID));
            } else {
                if (i != 2) {
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                granted = VoiceStreamLeaseEvent.preempted(bundle.getInt(KEY_PRIORITY));
            }
            granted.getClass();
            return new VoiceStreamLeaseEventResponse(granted);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull VoiceStreamLeaseEventResponse t) {
            t.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(KEY_KIND, t.getEvent().getKind().name());
            bundle.putInt(KEY_LEASE_ID, t.getEvent().getLeaseId());
            bundle.putInt(KEY_PRIORITY, t.getEvent().getWinningPriority());
            return bundle;
        }
    }

    public VoiceStreamLeaseEventResponse(@NotNull VoiceStreamLeaseEvent voiceStreamLeaseEvent) {
        voiceStreamLeaseEvent.getClass();
        this.event = voiceStreamLeaseEvent;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ VoiceStreamLeaseEventResponse copy$default(VoiceStreamLeaseEventResponse voiceStreamLeaseEventResponse, VoiceStreamLeaseEvent voiceStreamLeaseEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceStreamLeaseEvent = voiceStreamLeaseEventResponse.event;
        }
        return voiceStreamLeaseEventResponse.copy(voiceStreamLeaseEvent);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VoiceStreamLeaseEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final VoiceStreamLeaseEventResponse copy(@NotNull VoiceStreamLeaseEvent event) {
        event.getClass();
        return new VoiceStreamLeaseEventResponse(event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VoiceStreamLeaseEventResponse) && Intrinsics.areEqual(this.event, ((VoiceStreamLeaseEventResponse) other).event);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Response
    @NotNull
    public Bundle getBundle() {
        return Query.Response.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Response
    @NotNull
    public BundleTransformer<VoiceStreamLeaseEventResponse> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final VoiceStreamLeaseEvent getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    @NotNull
    public String toString() {
        return "VoiceStreamLeaseEventResponse(event=" + this.event + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
