package com.amazon.alexa.voice.ui.onedesign.shopping.item;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.shopping.ProductModel;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ShoppingItem implements ShoppingItemModel {
    private final CharSequence legalText;
    private final ProductModel product;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence legalText;
        ProductModel product;

        public ShoppingItem build() {
            if (this.product != null) {
                return new ShoppingItem(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("product == null");
            return null;
        }

        public Builder legalText(CharSequence charSequence) {
            this.legalText = charSequence;
            return this;
        }

        public Builder product(@NonNull ProductModel productModel) {
            this.product = productModel;
            return this;
        }
    }

    public ShoppingItem(Builder builder) {
        this.product = builder.product;
        this.legalText = builder.legalText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ShoppingItem.class != obj.getClass()) {
            return false;
        }
        ShoppingItem shoppingItem = (ShoppingItem) obj;
        if (!this.product.equals(shoppingItem.product)) {
            return false;
        }
        CharSequence charSequence = this.legalText;
        CharSequence charSequence2 = shoppingItem.legalText;
        return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemModel
    public CharSequence getLegalText() {
        return this.legalText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemModel
    public ProductModel getProduct() {
        return this.product;
    }

    public int hashCode() {
        int hashCode = (this.product.hashCode() + JfifUtil.MARKER_EOI) * 31;
        CharSequence charSequence = this.legalText;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public String toString() {
        return "ShoppingItem{product=" + this.product + ", legalText=" + ((Object) this.legalText) + AbstractJsonLexerKt.END_OBJ;
    }
}
