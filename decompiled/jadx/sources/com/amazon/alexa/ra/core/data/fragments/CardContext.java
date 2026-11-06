package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/CardContext;", "", CardContext.ACTIONS, "", "Lcom/amazon/alexa/ra/core/data/fragments/CardContextActions;", CardContext.ENTITIES, "Lorg/json/JSONArray;", "<init>", "(Ljava/util/List;Lorg/json/JSONArray;)V", "getActions", "()Ljava/util/List;", "getEntities", "()Lorg/json/JSONArray;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CardContext {

    @NotNull
    public static final String ACTIONS = "actions";

    @NotNull
    public static final String ENTITIES = "entities";

    @Nullable
    private final List<CardContextActions> actions;

    @Nullable
    private final JSONArray entities;
    public static final int $stable = 8;

    public /* synthetic */ CardContext(List list, JSONArray jSONArray, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardContext copy$default(CardContext cardContext, List list, JSONArray jSONArray, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardContext.actions;
        }
        if ((i & 2) != 0) {
            jSONArray = cardContext.entities;
        }
        return cardContext.copy(list, jSONArray);
    }

    @Nullable
    public final List<CardContextActions> component1() {
        return this.actions;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final JSONArray getEntities() {
        return this.entities;
    }

    @NotNull
    public final CardContext copy(@Nullable List<CardContextActions> actions, @Nullable JSONArray entities) {
        return new CardContext(actions, entities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardContext)) {
            return false;
        }
        CardContext cardContext = (CardContext) other;
        return Intrinsics.areEqual(this.actions, cardContext.actions) && Intrinsics.areEqual(this.entities, cardContext.entities);
    }

    @Nullable
    public final List<CardContextActions> getActions() {
        return this.actions;
    }

    @Nullable
    public final JSONArray getEntities() {
        return this.entities;
    }

    public int hashCode() {
        List<CardContextActions> list = this.actions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        JSONArray jSONArray = this.entities;
        return hashCode + (jSONArray != null ? jSONArray.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardContext(actions=" + this.actions + ", entities=" + this.entities + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CardContext(@Nullable List<CardContextActions> list, @Nullable JSONArray jSONArray) {
        this.actions = list;
        this.entities = jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
