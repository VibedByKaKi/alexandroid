package com.amazon.alexa.voice.ui.onedesign.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ShoppingCard implements ShoppingCardModel {
    public static final Parcelable.Creator<ShoppingCard> CREATOR = new Parcelable.Creator<ShoppingCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShoppingCard createFromParcel(Parcel parcel) {
            return new ShoppingCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShoppingCard[] newArray(int i) {
            return new ShoppingCard[i];
        }
    };
    private final List<? extends ProductModel> productList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        List<? extends ProductModel> productList = new ArrayList();

        public ShoppingCard build() {
            if (this.productList != null) {
                return new ShoppingCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("productList == null");
            return null;
        }

        public Builder productList(@NonNull List<? extends ProductModel> list) {
            this.productList = list;
            return this;
        }
    }

    public ShoppingCard(Parcel parcel) {
        this.productList = parcel.createTypedArrayList(Product.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ShoppingCard.class == obj.getClass() && this.productList.equals(((ShoppingCard) obj).productList);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingCardModel
    public List<? extends ProductModel> getProductList() {
        return this.productList;
    }

    public int hashCode() {
        return this.productList.hashCode() + JfifUtil.MARKER_EOI;
    }

    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(new StringBuilder("ShoppingCard{productList="), this.productList, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.productList);
    }

    public ShoppingCard(Builder builder) {
        this.productList = builder.productList;
    }
}
