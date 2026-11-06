package com.amazon.alexa.stayorganized.data.models;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/stayorganized/data/models/ShoppingListWidgetModel;", "", "shoppingListTopModel", "Lcom/amazon/alexa/stayorganized/data/models/ShoppingListTopModel;", "items", "", "Lcom/amazon/alexa/stayorganized/data/models/ShoppingListItemModel;", "(Lcom/amazon/alexa/stayorganized/data/models/ShoppingListTopModel;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getShoppingListTopModel", "()Lcom/amazon/alexa/stayorganized/data/models/ShoppingListTopModel;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ShoppingListWidgetModel {

    @NotNull
    private final List<ShoppingListItemModel> items;

    @NotNull
    private final ShoppingListTopModel shoppingListTopModel;

    public ShoppingListWidgetModel(@NotNull ShoppingListTopModel shoppingListTopModel, @NotNull List<ShoppingListItemModel> list) {
        shoppingListTopModel.getClass();
        list.getClass();
        this.shoppingListTopModel = shoppingListTopModel;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingListWidgetModel copy$default(ShoppingListWidgetModel shoppingListWidgetModel, ShoppingListTopModel shoppingListTopModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingListTopModel = shoppingListWidgetModel.shoppingListTopModel;
        }
        if ((i & 2) != 0) {
            list = shoppingListWidgetModel.items;
        }
        return shoppingListWidgetModel.copy(shoppingListTopModel, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ShoppingListTopModel getShoppingListTopModel() {
        return this.shoppingListTopModel;
    }

    @NotNull
    public final List<ShoppingListItemModel> component2() {
        return this.items;
    }

    @NotNull
    public final ShoppingListWidgetModel copy(@NotNull ShoppingListTopModel shoppingListTopModel, @NotNull List<ShoppingListItemModel> items) {
        shoppingListTopModel.getClass();
        items.getClass();
        return new ShoppingListWidgetModel(shoppingListTopModel, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListWidgetModel)) {
            return false;
        }
        ShoppingListWidgetModel shoppingListWidgetModel = (ShoppingListWidgetModel) other;
        return Intrinsics.areEqual(this.shoppingListTopModel, shoppingListWidgetModel.shoppingListTopModel) && Intrinsics.areEqual(this.items, shoppingListWidgetModel.items);
    }

    @NotNull
    public final List<ShoppingListItemModel> getItems() {
        return this.items;
    }

    @NotNull
    public final ShoppingListTopModel getShoppingListTopModel() {
        return this.shoppingListTopModel;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.shoppingListTopModel.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ShoppingListWidgetModel(shoppingListTopModel=" + this.shoppingListTopModel + ", items=" + this.items + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
