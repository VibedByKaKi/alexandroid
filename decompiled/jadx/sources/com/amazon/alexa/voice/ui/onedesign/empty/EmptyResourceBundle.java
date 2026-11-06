package com.amazon.alexa.voice.ui.onedesign.empty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class EmptyResourceBundle implements EmptyResourceBundleModel {
    public static final Parcelable.Creator<EmptyResourceBundle> CREATOR = new Parcelable.Creator<EmptyResourceBundle>() { // from class: com.amazon.alexa.voice.ui.onedesign.empty.EmptyResourceBundle.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmptyResourceBundle createFromParcel(Parcel parcel) {
            return new EmptyResourceBundle(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmptyResourceBundle[] newArray(int i) {
            return new EmptyResourceBundle[i];
        }
    };
    private final int contentResourceId;
    private final int iconResourceId;
    private final int titleResourceId;
    private final int userHintResourceId;

    public EmptyResourceBundle(Parcel parcel) {
        this.titleResourceId = parcel.readInt();
        this.iconResourceId = parcel.readInt();
        this.contentResourceId = parcel.readInt();
        this.userHintResourceId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EmptyResourceBundle.class != obj.getClass()) {
            return false;
        }
        EmptyResourceBundle emptyResourceBundle = (EmptyResourceBundle) obj;
        return this.titleResourceId == emptyResourceBundle.titleResourceId && this.iconResourceId == emptyResourceBundle.iconResourceId && this.contentResourceId == emptyResourceBundle.contentResourceId && this.userHintResourceId == emptyResourceBundle.userHintResourceId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyResourceBundleModel
    public int getContentResourceId() {
        return this.contentResourceId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyResourceBundleModel
    public int getIconResourceId() {
        return this.iconResourceId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyResourceBundleModel
    public int getTitleResourceId() {
        return this.titleResourceId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyResourceBundleModel
    public int getUserHintResourceId() {
        return this.userHintResourceId;
    }

    public int hashCode() {
        return ((((((JfifUtil.MARKER_EOI + this.titleResourceId) * 31) + this.iconResourceId) * 31) + this.contentResourceId) * 31) + this.userHintResourceId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmptyResourceBundle{titleResourceId=");
        sb.append(this.titleResourceId);
        sb.append(", iconResourceId=");
        sb.append(this.iconResourceId);
        sb.append(", contentResourceId=");
        sb.append(this.contentResourceId);
        sb.append(", userHintResourceId=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.userHintResourceId, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.titleResourceId);
        parcel.writeInt(this.iconResourceId);
        parcel.writeInt(this.contentResourceId);
        parcel.writeInt(this.userHintResourceId);
    }

    public EmptyResourceBundle(int i, int i2, int i3, int i4) {
        this.titleResourceId = i;
        this.iconResourceId = i2;
        this.contentResourceId = i3;
        this.userHintResourceId = i4;
    }
}
