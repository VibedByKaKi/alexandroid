package com.amazon.alexa.voice.ui.onedesign.list;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.list.ListCardModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ListCard implements ListCardModel {
    public static final Parcelable.Creator<ListCard> CREATOR = new Parcelable.Creator<ListCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.list.ListCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ListCard createFromParcel(Parcel parcel) {
            return new ListCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ListCard[] newArray(int i) {
            return new ListCard[i];
        }
    };
    private final List<? extends ListCardModel.ItemModel> itemList;
    private final String listType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        List<? extends ListCardModel.ItemModel> itemList = new ArrayList();
        String listType;

        public ListCard build() {
            if (this.listType == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("listType == null");
                return null;
            }
            if (this.itemList != null) {
                return new ListCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("itemList == null");
            return null;
        }

        public Builder itemList(@NonNull List<? extends ListCardModel.ItemModel> list) {
            this.itemList = list;
            return this;
        }

        public Builder listType(@NonNull String str) {
            this.listType = str;
            return this;
        }
    }

    public ListCard(Parcel parcel) {
        this.listType = parcel.readString();
        this.itemList = parcel.createTypedArrayList(Item.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ListCard.class != obj.getClass()) {
            return false;
        }
        ListCard listCard = (ListCard) obj;
        return this.listType.equals(listCard.listType) && this.itemList.equals(listCard.itemList);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.list.ListCardModel
    public List<? extends ListCardModel.ItemModel> getItemList() {
        return this.itemList;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.list.ListCardModel
    public String getListType() {
        return this.listType;
    }

    public int hashCode() {
        return this.itemList.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(JfifUtil.MARKER_EOI, 31, this.listType);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListCard{listType=");
        sb.append(this.listType);
        sb.append(", itemList=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.itemList, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.listType);
        parcel.writeTypedList(this.itemList);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Item implements ListCardModel.ItemModel {
        public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() { // from class: com.amazon.alexa.voice.ui.onedesign.list.ListCard.Item.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Item createFromParcel(Parcel parcel) {
                return new Item(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Item[] newArray(int i) {
                return new Item[i];
            }
        };
        private final CharSequence name;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            CharSequence name;

            public Item build() {
                if (this.name != null) {
                    return new Item(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("name == null");
                return null;
            }

            public Builder name(@NonNull CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }
        }

        public Item(Parcel parcel) {
            this.name = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && Item.class == obj.getClass() && this.name.equals(((Item) obj).name);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.list.ListCardModel.ItemModel
        public CharSequence getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + JfifUtil.MARKER_EOI;
        }

        public String toString() {
            return "Item{name=" + ((Object) this.name) + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.name, parcel, i);
        }

        public Item(Builder builder) {
            this.name = builder.name;
        }
    }

    public ListCard(Builder builder) {
        this.listType = builder.listType;
        this.itemList = builder.itemList;
    }
}
