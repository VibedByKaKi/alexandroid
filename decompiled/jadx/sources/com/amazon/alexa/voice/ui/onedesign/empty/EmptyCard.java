package com.amazon.alexa.voice.ui.onedesign.empty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class EmptyCard implements EmptyCardModel {
    public static final Parcelable.Creator<EmptyCard> CREATOR = new Parcelable.Creator<EmptyCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.empty.EmptyCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmptyCard createFromParcel(Parcel parcel) {
            return new EmptyCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmptyCard[] newArray(int i) {
            return new EmptyCard[i];
        }
    };
    private final String manageButtonDestination;
    private final CharSequence title;
    private final String type;

    public EmptyCard(Parcel parcel) {
        this.type = parcel.readString();
        this.title = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.manageButtonDestination = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EmptyCard.class != obj.getClass()) {
            return false;
        }
        EmptyCard emptyCard = (EmptyCard) obj;
        if (!this.type.equals(emptyCard.type)) {
            return false;
        }
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = emptyCard.title;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        String str = this.manageButtonDestination;
        String str2 = emptyCard.manageButtonDestination;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyCardModel
    public String getManageButtonDestination() {
        return this.manageButtonDestination;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyCardModel
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(JfifUtil.MARKER_EOI, 31, this.type);
        CharSequence charSequence = this.title;
        int hashCode = (m + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        String str = this.manageButtonDestination;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmptyCard{type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append((Object) this.title);
        sb.append(", manageButtonDestination=");
        return ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_OBJ, this.manageButtonDestination, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        TextUtils.writeToParcel(this.title, parcel, i);
        parcel.writeString(this.manageButtonDestination);
    }

    public EmptyCard(@NonNull String str, CharSequence charSequence, String str2) {
        this.type = str;
        this.title = charSequence;
        this.manageButtonDestination = str2;
    }
}
