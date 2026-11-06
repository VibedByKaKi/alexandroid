package com.amazon.alexa.accessoryclient.common.api;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.repositories.fitness.FitnessSession;
import com.amazon.alexa.accessory.repositories.fitness.FitnessSessionUpdate;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/api/FitnessSessionUpdateMetadata;", "", "origin", "Lcom/amazon/alexa/accessory/repositories/fitness/FitnessSessionUpdate$Origin;", "fitnessSession", "Lcom/amazon/alexa/accessory/repositories/fitness/FitnessSession;", "metadataUuid", "", "(Lcom/amazon/alexa/accessory/repositories/fitness/FitnessSessionUpdate$Origin;Lcom/amazon/alexa/accessory/repositories/fitness/FitnessSession;Ljava/lang/String;)V", "getFitnessSession", "()Lcom/amazon/alexa/accessory/repositories/fitness/FitnessSession;", "getMetadataUuid", "()Ljava/lang/String;", "getOrigin", "()Lcom/amazon/alexa/accessory/repositories/fitness/FitnessSessionUpdate$Origin;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FitnessSessionUpdateMetadata {

    @NotNull
    private final FitnessSession fitnessSession;

    @NotNull
    private final String metadataUuid;

    @NotNull
    private final FitnessSessionUpdate.Origin origin;

    public FitnessSessionUpdateMetadata(@NotNull FitnessSessionUpdate.Origin origin, @NotNull FitnessSession fitnessSession, @NotNull String str) {
        origin.getClass();
        fitnessSession.getClass();
        str.getClass();
        this.origin = origin;
        this.fitnessSession = fitnessSession;
        this.metadataUuid = str;
    }

    public static /* synthetic */ FitnessSessionUpdateMetadata copy$default(FitnessSessionUpdateMetadata fitnessSessionUpdateMetadata, FitnessSessionUpdate.Origin origin, FitnessSession fitnessSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            origin = fitnessSessionUpdateMetadata.origin;
        }
        if ((i & 2) != 0) {
            fitnessSession = fitnessSessionUpdateMetadata.fitnessSession;
        }
        if ((i & 4) != 0) {
            str = fitnessSessionUpdateMetadata.metadataUuid;
        }
        return fitnessSessionUpdateMetadata.copy(origin, fitnessSession, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FitnessSessionUpdate.Origin getOrigin() {
        return this.origin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FitnessSession getFitnessSession() {
        return this.fitnessSession;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMetadataUuid() {
        return this.metadataUuid;
    }

    @NotNull
    public final FitnessSessionUpdateMetadata copy(@NotNull FitnessSessionUpdate.Origin origin, @NotNull FitnessSession fitnessSession, @NotNull String metadataUuid) {
        origin.getClass();
        fitnessSession.getClass();
        metadataUuid.getClass();
        return new FitnessSessionUpdateMetadata(origin, fitnessSession, metadataUuid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessSessionUpdateMetadata)) {
            return false;
        }
        FitnessSessionUpdateMetadata fitnessSessionUpdateMetadata = (FitnessSessionUpdateMetadata) other;
        return this.origin == fitnessSessionUpdateMetadata.origin && Intrinsics.areEqual(this.fitnessSession, fitnessSessionUpdateMetadata.fitnessSession) && Intrinsics.areEqual(this.metadataUuid, fitnessSessionUpdateMetadata.metadataUuid);
    }

    @NotNull
    public final FitnessSession getFitnessSession() {
        return this.fitnessSession;
    }

    @NotNull
    public final String getMetadataUuid() {
        return this.metadataUuid;
    }

    @NotNull
    public final FitnessSessionUpdate.Origin getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return this.metadataUuid.hashCode() + ((this.fitnessSession.hashCode() + (this.origin.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        FitnessSessionUpdate.Origin origin = this.origin;
        FitnessSession fitnessSession = this.fitnessSession;
        String str = this.metadataUuid;
        StringBuilder sb = new StringBuilder("FitnessSessionUpdateMetadata(origin=");
        sb.append(origin);
        sb.append(", fitnessSession=");
        sb.append(fitnessSession);
        sb.append(", metadataUuid=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ FitnessSessionUpdateMetadata(FitnessSessionUpdate.Origin origin, FitnessSession fitnessSession, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(origin, fitnessSession, (i & 4) != 0 ? TableInfo$$ExternalSyntheticOutline0.m() : str);
    }
}
