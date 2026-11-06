package com.amazon.alexa.voice.ui.onedesign.tta;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SearchResultItem extends SearchResultItem {
    private final String id;
    private final ItemRoute itemRoute;
    private final String itemText;
    private final int type;

    public AutoValue_SearchResultItem(String str, int i, String str2, @Nullable ItemRoute itemRoute) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null id");
            throw null;
        }
        this.id = str;
        this.type = i;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null itemText");
            throw null;
        }
        this.itemText = str2;
        this.itemRoute = itemRoute;
    }

    public boolean equals(Object obj) {
        ItemRoute itemRoute;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchResultItem) {
            SearchResultItem searchResultItem = (SearchResultItem) obj;
            if (this.id.equals(searchResultItem.getId()) && this.type == searchResultItem.getType() && this.itemText.equals(searchResultItem.getItemText()) && ((itemRoute = this.itemRoute) != null ? itemRoute.equals(searchResultItem.getItemRoute()) : searchResultItem.getItemRoute() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.SearchResultItem, com.amazon.alexa.voice.ui.tta.search.ResultItem
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.SearchResultItem
    @Nullable
    public ItemRoute getItemRoute() {
        return this.itemRoute;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.SearchResultItem
    public String getItemText() {
        return this.itemText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.SearchResultItem, com.amazon.alexa.voice.ui.tta.search.ResultItem
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.itemText.hashCode()) * 1000003;
        ItemRoute itemRoute = this.itemRoute;
        return (itemRoute == null ? 0 : itemRoute.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "SearchResultItem{id=" + this.id + ", type=" + this.type + ", itemText=" + this.itemText + ", itemRoute=" + this.itemRoute + StringSubstitutor.DEFAULT_VAR_END;
    }
}
