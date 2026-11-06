package com.amazon.alexa.stayorganized.data.models;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/amazon/alexa/stayorganized/data/models/ShoppingListItemModel;", "", "title", "", "timestamp", "", "isComplete", "", "listItemId", "version", "", "(Ljava/lang/String;JZLjava/lang/String;I)V", "()Z", "setComplete", "(Z)V", "getListItemId", "()Ljava/lang/String;", "getTimestamp", "()J", "getTitle", "getVersion", "()I", "setVersion", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ShoppingListItemModel {
    private boolean isComplete;

    @NotNull
    private final String listItemId;
    private final long timestamp;

    @NotNull
    private final String title;
    private int version;

    public ShoppingListItemModel(@NotNull String str, long j, boolean z, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.timestamp = j;
        this.isComplete = z;
        this.listItemId = str2;
        this.version = i;
    }

    public static /* synthetic */ ShoppingListItemModel copy$default(ShoppingListItemModel shoppingListItemModel, String str, long j, boolean z, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingListItemModel.title;
        }
        if ((i2 & 2) != 0) {
            j = shoppingListItemModel.timestamp;
        }
        if ((i2 & 4) != 0) {
            z = shoppingListItemModel.isComplete;
        }
        if ((i2 & 8) != 0) {
            str2 = shoppingListItemModel.listItemId;
        }
        if ((i2 & 16) != 0) {
            i = shoppingListItemModel.version;
        }
        int i3 = i;
        boolean z2 = z;
        return shoppingListItemModel.copy(str, j, z2, str2, i3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getListItemId() {
        return this.listItemId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final ShoppingListItemModel copy(@NotNull String title, long timestamp, boolean isComplete, @NotNull String listItemId, int version) {
        title.getClass();
        listItemId.getClass();
        return new ShoppingListItemModel(title, timestamp, isComplete, listItemId, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListItemModel)) {
            return false;
        }
        ShoppingListItemModel shoppingListItemModel = (ShoppingListItemModel) other;
        return Intrinsics.areEqual(this.title, shoppingListItemModel.title) && this.timestamp == shoppingListItemModel.timestamp && this.isComplete == shoppingListItemModel.isComplete && Intrinsics.areEqual(this.listItemId, shoppingListItemModel.listItemId) && this.version == shoppingListItemModel.version;
    }

    @NotNull
    public final String getListItemId() {
        return this.listItemId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.timestamp, this.title.hashCode() * 31, 31);
        boolean z = this.isComplete;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.version) + ArcMode$$ExternalSyntheticOutline0.m((m + i) * 31, 31, this.listItemId);
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        long j = this.timestamp;
        boolean z = this.isComplete;
        String str2 = this.listItemId;
        int i = this.version;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("ShoppingListItemModel(title=", str, ", timestamp=", j);
        m.append(", isComplete=");
        m.append(z);
        m.append(", listItemId=");
        m.append(str2);
        m.append(", version=");
        m.append(i);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
