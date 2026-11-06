package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.infrastructure.RingtoneType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/domain/model/RingtoneParams;", "", "isDropIn", "", "ringtoneType", "Lcom/amazon/comms/calling/infrastructure/RingtoneType;", "<init>", "(ZLcom/amazon/comms/calling/infrastructure/RingtoneType;)V", "()Z", "getRingtoneType", "()Lcom/amazon/comms/calling/infrastructure/RingtoneType;", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RingtoneParams {
    private final boolean isDropIn;

    @NotNull
    private final RingtoneType ringtoneType;

    public RingtoneParams(boolean z, @NotNull RingtoneType ringtoneType) {
        ringtoneType.getClass();
        this.isDropIn = z;
        this.ringtoneType = ringtoneType;
    }

    public static /* synthetic */ RingtoneParams copy$default(RingtoneParams ringtoneParams, boolean z, RingtoneType ringtoneType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ringtoneParams.isDropIn;
        }
        if ((i & 2) != 0) {
            ringtoneType = ringtoneParams.ringtoneType;
        }
        return ringtoneParams.copy(z, ringtoneType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDropIn() {
        return this.isDropIn;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RingtoneType getRingtoneType() {
        return this.ringtoneType;
    }

    @NotNull
    public final RingtoneParams copy(boolean isDropIn, @NotNull RingtoneType ringtoneType) {
        ringtoneType.getClass();
        return new RingtoneParams(isDropIn, ringtoneType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RingtoneParams)) {
            return false;
        }
        RingtoneParams ringtoneParams = (RingtoneParams) other;
        return this.isDropIn == ringtoneParams.isDropIn && this.ringtoneType == ringtoneParams.ringtoneType;
    }

    @NotNull
    public final RingtoneType getRingtoneType() {
        return this.ringtoneType;
    }

    public int hashCode() {
        return this.ringtoneType.hashCode() + (Boolean.hashCode(this.isDropIn) * 31);
    }

    public final boolean isDropIn() {
        return this.isDropIn;
    }

    @NotNull
    public String toString() {
        return "RingtoneParams(isDropIn=" + this.isDropIn + ", ringtoneType=" + this.ringtoneType + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ RingtoneParams(boolean z, RingtoneType ringtoneType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, ringtoneType);
    }
}
