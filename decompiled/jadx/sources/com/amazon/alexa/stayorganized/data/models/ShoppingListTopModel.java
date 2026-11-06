package com.amazon.alexa.stayorganized.data.models;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/stayorganized/data/models/ShoppingListTopModel;", "", "deepLinkBaseUri", "", "addItemRoute", "shoppingListRoute", "activeItemCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getActiveItemCount", "()I", "getAddItemRoute", "()Ljava/lang/String;", "getDeepLinkBaseUri", "getShoppingListRoute", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ShoppingListTopModel {
    private final int activeItemCount;

    @NotNull
    private final String addItemRoute;

    @NotNull
    private final String deepLinkBaseUri;

    @NotNull
    private final String shoppingListRoute;

    public ShoppingListTopModel(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.deepLinkBaseUri = str;
        this.addItemRoute = str2;
        this.shoppingListRoute = str3;
        this.activeItemCount = i;
    }

    public static /* synthetic */ ShoppingListTopModel copy$default(ShoppingListTopModel shoppingListTopModel, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingListTopModel.deepLinkBaseUri;
        }
        if ((i2 & 2) != 0) {
            str2 = shoppingListTopModel.addItemRoute;
        }
        if ((i2 & 4) != 0) {
            str3 = shoppingListTopModel.shoppingListRoute;
        }
        if ((i2 & 8) != 0) {
            i = shoppingListTopModel.activeItemCount;
        }
        return shoppingListTopModel.copy(str, str2, str3, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeepLinkBaseUri() {
        return this.deepLinkBaseUri;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAddItemRoute() {
        return this.addItemRoute;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getShoppingListRoute() {
        return this.shoppingListRoute;
    }

    /* renamed from: component4, reason: from getter */
    public final int getActiveItemCount() {
        return this.activeItemCount;
    }

    @NotNull
    public final ShoppingListTopModel copy(@NotNull String deepLinkBaseUri, @NotNull String addItemRoute, @NotNull String shoppingListRoute, int activeItemCount) {
        deepLinkBaseUri.getClass();
        addItemRoute.getClass();
        shoppingListRoute.getClass();
        return new ShoppingListTopModel(deepLinkBaseUri, addItemRoute, shoppingListRoute, activeItemCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListTopModel)) {
            return false;
        }
        ShoppingListTopModel shoppingListTopModel = (ShoppingListTopModel) other;
        return Intrinsics.areEqual(this.deepLinkBaseUri, shoppingListTopModel.deepLinkBaseUri) && Intrinsics.areEqual(this.addItemRoute, shoppingListTopModel.addItemRoute) && Intrinsics.areEqual(this.shoppingListRoute, shoppingListTopModel.shoppingListRoute) && this.activeItemCount == shoppingListTopModel.activeItemCount;
    }

    public final int getActiveItemCount() {
        return this.activeItemCount;
    }

    @NotNull
    public final String getAddItemRoute() {
        return this.addItemRoute;
    }

    @NotNull
    public final String getDeepLinkBaseUri() {
        return this.deepLinkBaseUri;
    }

    @NotNull
    public final String getShoppingListRoute() {
        return this.shoppingListRoute;
    }

    public int hashCode() {
        return Integer.hashCode(this.activeItemCount) + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.deepLinkBaseUri.hashCode() * 31, 31, this.addItemRoute), 31, this.shoppingListRoute);
    }

    @NotNull
    public String toString() {
        String str = this.deepLinkBaseUri;
        String str2 = this.addItemRoute;
        String str3 = this.shoppingListRoute;
        int i = this.activeItemCount;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ShoppingListTopModel(deepLinkBaseUri=", str, ", addItemRoute=", str2, ", shoppingListRoute=");
        m.append(str3);
        m.append(", activeItemCount=");
        m.append(i);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
