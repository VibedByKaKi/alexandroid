package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Relation;", "", "relationType", "Lcom/amazon/alexa/ra/core/data/fragments/RelationshipType;", Relation.ORDER, "", "uri", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/RelationshipType;ILjava/lang/String;)V", "getRelationType", "()Lcom/amazon/alexa/ra/core/data/fragments/RelationshipType;", "getOrder", "()I", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Relation {
    public static final int $stable = 0;

    @NotNull
    public static final String FRAGMENT_URI = "fragmentURI";

    @NotNull
    public static final String ORDER = "order";

    @NotNull
    public static final String TYPE = "type";
    private final int order;

    @NotNull
    private final RelationshipType relationType;

    @NotNull
    private final String uri;

    public /* synthetic */ Relation(RelationshipType relationshipType, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? RelationshipType.NONE : relationshipType, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? "" : str);
    }

    public static /* synthetic */ Relation copy$default(Relation relation, RelationshipType relationshipType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            relationshipType = relation.relationType;
        }
        if ((i2 & 2) != 0) {
            i = relation.order;
        }
        if ((i2 & 4) != 0) {
            str = relation.uri;
        }
        return relation.copy(relationshipType, i, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RelationshipType getRelationType() {
        return this.relationType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    public final Relation copy(@NotNull RelationshipType relationType, int order, @NotNull String uri) {
        relationType.getClass();
        uri.getClass();
        return new Relation(relationType, order, uri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Relation)) {
            return false;
        }
        Relation relation = (Relation) other;
        return this.relationType == relation.relationType && this.order == relation.order && Intrinsics.areEqual(this.uri, relation.uri);
    }

    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final RelationshipType getRelationType() {
        return this.relationType;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.order, this.relationType.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        RelationshipType relationshipType = this.relationType;
        int i = this.order;
        String str = this.uri;
        StringBuilder sb = new StringBuilder("Relation(relationType=");
        sb.append(relationshipType);
        sb.append(", order=");
        sb.append(i);
        sb.append(", uri=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Relation(@NotNull RelationshipType relationshipType, int i, @NotNull String str) {
        relationshipType.getClass();
        str.getClass();
        this.relationType = relationshipType;
        this.order = i;
        this.uri = str;
    }

    public Relation() {
        this(null, 0, null, 7, null);
    }
}
