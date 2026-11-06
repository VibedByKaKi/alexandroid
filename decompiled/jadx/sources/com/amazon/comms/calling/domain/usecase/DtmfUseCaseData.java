package com.amazon.comms.calling.domain.usecase;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData;", "", "<init>", "()V", "StopDtmf", "PlayDtmf", "Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData$PlayDtmf;", "Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData$StopDtmf;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class DtmfUseCaseData {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData$PlayDtmf;", "Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData;", "tone", "", "<init>", "(Ljava/lang/String;)V", "getTone", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PlayDtmf extends DtmfUseCaseData {

        @NotNull
        private final String tone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayDtmf(@NotNull String str) {
            super(null);
            str.getClass();
            this.tone = str;
        }

        public static /* synthetic */ PlayDtmf copy$default(PlayDtmf playDtmf, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = playDtmf.tone;
            }
            return playDtmf.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTone() {
            return this.tone;
        }

        @NotNull
        public final PlayDtmf copy(@NotNull String tone) {
            tone.getClass();
            return new PlayDtmf(tone);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlayDtmf) && Intrinsics.areEqual(this.tone, ((PlayDtmf) other).tone);
        }

        @NotNull
        public final String getTone() {
            return this.tone;
        }

        public int hashCode() {
            return this.tone.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("PlayDtmf(tone=", this.tone, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData$StopDtmf;", "Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StopDtmf extends DtmfUseCaseData {

        @NotNull
        public static final StopDtmf INSTANCE = new StopDtmf();

        private StopDtmf() {
            super(null);
        }
    }

    public /* synthetic */ DtmfUseCaseData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DtmfUseCaseData() {
    }
}
