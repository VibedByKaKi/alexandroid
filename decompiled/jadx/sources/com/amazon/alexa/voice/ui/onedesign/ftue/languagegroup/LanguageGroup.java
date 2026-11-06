package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.voice.ui.onedesign.ftue.language.Language;
import com.amazon.regulator.internal.Preconditions;
import com.facebook.imageutils.JfifUtil;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LanguageGroup implements Parcelable {
    public static final Parcelable.Creator<LanguageGroup> CREATOR = new Parcelable.Creator<LanguageGroup>() { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageGroup.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LanguageGroup createFromParcel(Parcel parcel) {
            return new LanguageGroup(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LanguageGroup[] newArray(int i) {
            return new LanguageGroup[i];
        }
    };
    private List<Language> languages;

    public LanguageGroup(Parcel parcel) {
        Preconditions.nonNull(parcel, "Parameter in is null.");
        this.languages = parcel.readArrayList(Language.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.languages.equals(((LanguageGroup) obj).languages);
    }

    public List<Language> getLanguages() {
        return this.languages;
    }

    public Language getPrimaryLanguage() {
        return this.languages.get(0);
    }

    public int hashCode() {
        return this.languages.hashCode() + JfifUtil.MARKER_EOI;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.languages);
    }

    public LanguageGroup(List<Language> list) {
        Preconditions.nonNull(list, "Parameter languages is null.");
        this.languages = list;
    }
}
