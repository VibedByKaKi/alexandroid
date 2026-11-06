package com.amazon.alexa.ra.core.data.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Provenance;", "", Reference.ICON_URL, "", "id", "name", "type", "Lcom/amazon/alexa/ra/core/data/fragments/ProvenanceType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/ProvenanceType;)V", "getIconUrl", "()Ljava/lang/String;", "getId", "getName", "getType", "()Lcom/amazon/alexa/ra/core/data/fragments/ProvenanceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Provenance {
    public static final int $stable = 0;

    @NotNull
    public static final String ICON_URL = "iconURL";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String TYPE = "type";

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String id;

    @Nullable
    private final String name;

    @NotNull
    private final ProvenanceType type;

    public /* synthetic */ Provenance(String str, String str2, String str3, ProvenanceType provenanceType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, provenanceType);
    }

    public static /* synthetic */ Provenance copy$default(Provenance provenance, String str, String str2, String str3, ProvenanceType provenanceType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provenance.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = provenance.id;
        }
        if ((i & 4) != 0) {
            str3 = provenance.name;
        }
        if ((i & 8) != 0) {
            provenanceType = provenance.type;
        }
        return provenance.copy(str, str2, str3, provenanceType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProvenanceType getType() {
        return this.type;
    }

    @NotNull
    public final Provenance copy(@Nullable String iconUrl, @Nullable String id, @Nullable String name, @NotNull ProvenanceType type) {
        type.getClass();
        return new Provenance(iconUrl, id, name, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Provenance)) {
            return false;
        }
        Provenance provenance = (Provenance) other;
        return Intrinsics.areEqual(this.iconUrl, provenance.iconUrl) && Intrinsics.areEqual(this.id, provenance.id) && Intrinsics.areEqual(this.name, provenance.name) && this.type == provenance.type;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ProvenanceType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return this.type.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.iconUrl;
        String str2 = this.id;
        String str3 = this.name;
        ProvenanceType provenanceType = this.type;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Provenance(iconUrl=", str, ", id=", str2, ", name=");
        m.append(str3);
        m.append(", type=");
        m.append(provenanceType);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public Provenance(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ProvenanceType provenanceType) {
        provenanceType.getClass();
        this.iconUrl = str;
        this.id = str2;
        this.name = str3;
        this.type = provenanceType;
    }
}
