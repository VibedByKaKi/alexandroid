package com.amazon.alexa.voice.ui.onedesign.local;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalCard implements LocalCardModel {
    public static final Parcelable.Creator<LocalCard> CREATOR = new Parcelable.Creator<LocalCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.local.LocalCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocalCard createFromParcel(Parcel parcel) {
            return new LocalCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocalCard[] newArray(int i) {
            return new LocalCard[i];
        }
    };
    private final List<? extends LocalCardModel.BusinessModel> businessList;
    private final String sortKey;
    private final CharSequence title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        List<? extends LocalCardModel.BusinessModel> businessList = new ArrayList();
        String sortKey;
        CharSequence title;

        public LocalCard build() {
            if (this.title == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("title == null");
                return null;
            }
            if (this.sortKey == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("sortKey == null");
                return null;
            }
            if (this.businessList != null) {
                return new LocalCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("businessList == null");
            return null;
        }

        public Builder businessList(@NonNull List<? extends LocalCardModel.BusinessModel> list) {
            this.businessList = list;
            return this;
        }

        public Builder sortKey(@NonNull String str) {
            this.sortKey = str;
            return this;
        }

        public Builder title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public LocalCard(Parcel parcel) {
        this.title = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.sortKey = parcel.readString();
        this.businessList = parcel.createTypedArrayList(Business.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocalCard.class != obj.getClass()) {
            return false;
        }
        LocalCard localCard = (LocalCard) obj;
        return this.title.equals(localCard.title) && this.sortKey.equals(localCard.sortKey) && this.businessList.equals(localCard.businessList);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel
    public List<? extends LocalCardModel.BusinessModel> getBusinessList() {
        return this.businessList;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel
    public String getSortKey() {
        return this.sortKey;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.businessList.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31), 31, this.sortKey);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocalCard{title=");
        sb.append((Object) this.title);
        sb.append(", sortKey=");
        sb.append(this.sortKey);
        sb.append(", businessList=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.businessList, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        parcel.writeString(this.sortKey);
        parcel.writeTypedList(this.businessList);
    }

    public LocalCard(Builder builder) {
        this.title = builder.title;
        this.sortKey = builder.sortKey;
        this.businessList = builder.businessList;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Business implements LocalCardModel.BusinessModel {
        public static final Parcelable.Creator<Business> CREATOR = new Parcelable.Creator<Business>() { // from class: com.amazon.alexa.voice.ui.onedesign.local.LocalCard.Business.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Business createFromParcel(Parcel parcel) {
                return new Business(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Business[] newArray(int i) {
                return new Business[i];
            }
        };
        private final String accessRestriction;
        private final CharSequence address;
        private final List<CharSequence> categories;
        private final String dataSource;
        private final CharSequence distanceUnit;
        private final float distanceValue;
        private final List<CharSequence> electricVehicleChargers;
        private final CharSequence geoLocation;
        private final String goToActionText;
        private final String goToActionUrl;
        private final String imageUrl;
        private final String linkUrl;
        private final String mergedProviderInfo;
        private final CharSequence name;
        private final List<CharSequence> openingHours;
        private final String parkingType;
        private final CharSequence phoneNumber;
        private final String providerLogoUrl;
        private final float rating;
        private final int reviewCount;
        private final String specialBusinessHoursDisplayMessage;
        private final String specialBusinessHoursDisplayType;
        private final CharSequence spendiness;
        private final String starRatingUrl;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            String accessRestriction;
            CharSequence address;
            String dataSource;
            CharSequence distanceUnit;
            float distanceValue;
            List<CharSequence> electricVehicleChargers;
            CharSequence geoLocation;
            String goToActionText;
            String goToActionUrl;
            String imageUrl;
            String linkUrl;
            String mergedProviderInfo;
            CharSequence name;
            String parkingType;
            CharSequence phoneNumber;
            String providerLogoUrl;
            float rating;
            int reviewCount;
            String specialBusinessHoursDisplayMessage;
            String specialBusinessHoursDisplayType;
            CharSequence spendiness;
            String starRatingUrl;
            List<CharSequence> categories = new ArrayList();
            List<CharSequence> openingHours = new ArrayList();

            public Builder accessRestriction(String str) {
                this.accessRestriction = str;
                return this;
            }

            public Builder address(@NonNull CharSequence charSequence) {
                this.address = charSequence;
                return this;
            }

            public Business build() {
                if (this.name == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("name == null");
                    return null;
                }
                if (this.distanceUnit == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("distanceUnit == null");
                    return null;
                }
                if (this.imageUrl == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("imageUrl == null");
                    return null;
                }
                if (this.providerLogoUrl == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("providerLogoUrl == null");
                    return null;
                }
                if (this.starRatingUrl == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("starRatingUrl == null");
                    return null;
                }
                if (this.categories == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("categories == null");
                    return null;
                }
                if (this.address == null) {
                    Single$$ExternalSyntheticBUOutline0.m$3("address == null");
                    return null;
                }
                if (this.openingHours != null) {
                    return new Business(this);
                }
                Single$$ExternalSyntheticBUOutline0.m$3("openingHours == null");
                return null;
            }

            public Builder categories(@NonNull List<CharSequence> list) {
                this.categories = list;
                return this;
            }

            public Builder dataSource(String str) {
                this.dataSource = str;
                return this;
            }

            public Builder distanceUnit(@NonNull CharSequence charSequence) {
                this.distanceUnit = charSequence;
                return this;
            }

            public Builder distanceValue(float f) {
                this.distanceValue = f;
                return this;
            }

            public Builder electricVehicleChargers(List<CharSequence> list) {
                this.electricVehicleChargers = list;
                return this;
            }

            public Builder geoLocation(CharSequence charSequence) {
                this.geoLocation = charSequence;
                return this;
            }

            public Builder goToActionText(String str) {
                this.goToActionText = str;
                return this;
            }

            public Builder goToActionUrl(String str) {
                this.goToActionUrl = str;
                return this;
            }

            public Builder imageUrl(@NonNull String str) {
                this.imageUrl = str;
                return this;
            }

            public Builder linkUrl(String str) {
                this.linkUrl = str;
                return this;
            }

            public Builder mergedProviderInfo(String str) {
                this.mergedProviderInfo = str;
                return this;
            }

            public Builder name(@NonNull CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }

            public Builder openingHours(@NonNull List<CharSequence> list) {
                this.openingHours = list;
                return this;
            }

            public Builder parkingType(String str) {
                this.parkingType = str;
                return this;
            }

            public Builder phoneNumber(CharSequence charSequence) {
                this.phoneNumber = charSequence;
                return this;
            }

            public Builder providerLogoUrl(@NonNull String str) {
                this.providerLogoUrl = str;
                return this;
            }

            public Builder rating(float f) {
                this.rating = f;
                return this;
            }

            public Builder reviewCount(int i) {
                this.reviewCount = i;
                return this;
            }

            public Builder specialBusinessHoursDisplayMessage(String str) {
                this.specialBusinessHoursDisplayMessage = str;
                return this;
            }

            public Builder specialBusinessHoursDisplayType(String str) {
                this.specialBusinessHoursDisplayType = str;
                return this;
            }

            public Builder spendiness(CharSequence charSequence) {
                this.spendiness = charSequence;
                return this;
            }

            public Builder starRatingUrl(@NonNull String str) {
                this.starRatingUrl = str;
                return this;
            }
        }

        public Business(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.name = (CharSequence) creator.createFromParcel(parcel);
            this.dataSource = parcel.readString();
            this.reviewCount = parcel.readInt();
            this.distanceValue = parcel.readFloat();
            this.distanceUnit = (CharSequence) creator.createFromParcel(parcel);
            this.spendiness = (CharSequence) creator.createFromParcel(parcel);
            this.imageUrl = parcel.readString();
            this.providerLogoUrl = parcel.readString();
            this.mergedProviderInfo = parcel.readString();
            this.rating = parcel.readFloat();
            this.starRatingUrl = parcel.readString();
            int readInt = parcel.readInt();
            this.categories = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                this.categories.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
            Parcelable.Creator creator2 = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.address = (CharSequence) creator2.createFromParcel(parcel);
            this.geoLocation = (CharSequence) creator2.createFromParcel(parcel);
            this.phoneNumber = (CharSequence) creator2.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            this.openingHours = new ArrayList(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.openingHours.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
            this.linkUrl = parcel.readString();
            this.goToActionText = parcel.readString();
            this.goToActionUrl = parcel.readString();
            this.specialBusinessHoursDisplayMessage = parcel.readString();
            this.specialBusinessHoursDisplayType = parcel.readString();
            this.accessRestriction = parcel.readString();
            this.parkingType = parcel.readString();
            int readInt3 = parcel.readInt();
            this.electricVehicleChargers = new ArrayList(readInt3);
            for (int i3 = 0; i3 < readInt3; i3++) {
                this.electricVehicleChargers.add((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Business.class != obj.getClass()) {
                return false;
            }
            Business business = (Business) obj;
            if (!this.name.equals(business.name)) {
                return false;
            }
            String str = this.dataSource;
            String str2 = business.dataSource;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (this.reviewCount != business.reviewCount || Float.compare(this.distanceValue, business.distanceValue) != 0 || !this.distanceUnit.equals(business.distanceUnit)) {
                return false;
            }
            CharSequence charSequence = this.spendiness;
            CharSequence charSequence2 = business.spendiness;
            if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
                return false;
            }
            if (!this.imageUrl.equals(business.imageUrl) || !this.providerLogoUrl.equals(business.providerLogoUrl)) {
                return false;
            }
            String str3 = this.mergedProviderInfo;
            String str4 = business.mergedProviderInfo;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            if (Float.compare(this.rating, business.rating) != 0 || !this.starRatingUrl.equals(business.starRatingUrl) || !this.categories.equals(business.categories) || !this.address.equals(business.address)) {
                return false;
            }
            CharSequence charSequence3 = this.geoLocation;
            CharSequence charSequence4 = business.geoLocation;
            if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
                return false;
            }
            CharSequence charSequence5 = this.phoneNumber;
            CharSequence charSequence6 = business.phoneNumber;
            if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
                return false;
            }
            if (!this.openingHours.equals(business.openingHours)) {
                return false;
            }
            String str5 = this.linkUrl;
            String str6 = business.linkUrl;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.goToActionText;
            String str8 = business.goToActionText;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            String str9 = this.goToActionUrl;
            String str10 = business.goToActionUrl;
            if (str9 == null ? str10 != null : !str9.equals(str10)) {
                return false;
            }
            String str11 = this.specialBusinessHoursDisplayMessage;
            String str12 = business.specialBusinessHoursDisplayMessage;
            if (str11 == null ? str12 != null : !str11.equals(str12)) {
                return false;
            }
            String str13 = this.specialBusinessHoursDisplayType;
            String str14 = business.specialBusinessHoursDisplayType;
            if (str13 == null ? str14 != null : !str13.equals(str14)) {
                return false;
            }
            String str15 = this.accessRestriction;
            String str16 = business.accessRestriction;
            if (str15 == null ? str16 != null : !str15.equals(str16)) {
                return false;
            }
            String str17 = this.parkingType;
            String str18 = business.parkingType;
            if (str17 == null ? str18 != null : !str17.equals(str18)) {
                return false;
            }
            List<CharSequence> list = this.electricVehicleChargers;
            List<CharSequence> list2 = business.electricVehicleChargers;
            return list == null ? list2 == null : list.equals(list2);
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public CharSequence getAddress() {
            return this.address;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public List<CharSequence> getCategories() {
            return this.categories;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getDataSource() {
            return this.dataSource;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public CharSequence getDistanceUnit() {
            return this.distanceUnit;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public float getDistanceValue() {
            return this.distanceValue;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public List<CharSequence> getElectricVehicleChargers() {
            return this.electricVehicleChargers;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public CharSequence getGeoLocation() {
            return this.geoLocation;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getImageUrl() {
            return this.imageUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getLinkUrl() {
            return this.linkUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getMergedProviderInfo() {
            return this.mergedProviderInfo;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public CharSequence getName() {
            return this.name;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public List<CharSequence> getOpeningHours() {
            return this.openingHours;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getParkingType() {
            return this.parkingType;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public CharSequence getPhoneNumber() {
            return this.phoneNumber;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getProviderLogoUrl() {
            return this.providerLogoUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public float getRating() {
            return this.rating;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public int getReviewCount() {
            return this.reviewCount;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getSpecialBusinessHoursDisplayMessage() {
            return this.specialBusinessHoursDisplayMessage;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getSpecialBusinessHoursDisplayType() {
            return this.specialBusinessHoursDisplayType;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public CharSequence getSpendiness() {
            return this.spendiness;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String getStarRatingUrl() {
            return this.starRatingUrl;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String goToActionText() {
            return this.goToActionText;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel.BusinessModel
        public String goToActionUrl() {
            return this.goToActionUrl;
        }

        public int hashCode() {
            int m = ChatData$$ExternalSyntheticOutline0.m(this.name, JfifUtil.MARKER_EOI, 31);
            String str = this.dataSource;
            int hashCode = (((m + (str != null ? str.hashCode() : 0)) * 31) + this.reviewCount) * 31;
            float f = this.distanceValue;
            int m2 = ChatData$$ExternalSyntheticOutline0.m(this.distanceUnit, (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31, 31);
            CharSequence charSequence = this.spendiness;
            int m3 = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((m2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.imageUrl), 31, this.providerLogoUrl);
            String str2 = this.mergedProviderInfo;
            int hashCode2 = (m3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            float f2 = this.rating;
            int m4 = ChatData$$ExternalSyntheticOutline0.m(this.address, (this.categories.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((hashCode2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31, 31, this.starRatingUrl)) * 31, 31);
            CharSequence charSequence2 = this.geoLocation;
            int hashCode3 = (m4 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
            CharSequence charSequence3 = this.phoneNumber;
            int hashCode4 = (this.openingHours.hashCode() + ((hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31)) * 31;
            String str3 = this.linkUrl;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.goToActionText;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.goToActionUrl;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.specialBusinessHoursDisplayMessage;
            int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.specialBusinessHoursDisplayType;
            int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.accessRestriction;
            int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.parkingType;
            int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
            List<CharSequence> list = this.electricVehicleChargers;
            return hashCode11 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Business{name=");
            sb.append((Object) this.name);
            sb.append(", dataSource=");
            sb.append(this.dataSource);
            sb.append(", reviewCount=");
            sb.append(this.reviewCount);
            sb.append(", distanceValue=");
            sb.append(this.distanceValue);
            sb.append(", distanceUnit=");
            sb.append((Object) this.distanceUnit);
            sb.append(", spendiness=");
            sb.append((Object) this.spendiness);
            sb.append(", imageUrl=");
            sb.append(this.imageUrl);
            sb.append(", providerLogoUrl=");
            sb.append(this.providerLogoUrl);
            sb.append(", mergedProviderInfo=");
            sb.append(this.mergedProviderInfo);
            sb.append(", rating=");
            sb.append(this.rating);
            sb.append(", starRatingUrl=");
            sb.append(this.starRatingUrl);
            sb.append(", categories=");
            sb.append(this.categories);
            sb.append(", address=");
            sb.append((Object) this.address);
            sb.append(", geoLocation=");
            sb.append((Object) this.geoLocation);
            sb.append(", phoneNumber=");
            sb.append((Object) this.phoneNumber);
            sb.append(", openingHours=");
            sb.append(this.openingHours);
            sb.append(", linkUrl=");
            sb.append(this.linkUrl);
            sb.append(", goToActionText=");
            sb.append(this.goToActionText);
            sb.append(", goToActionUrl=");
            sb.append(this.goToActionUrl);
            sb.append(", specialBusinessHoursDisplayMessage=");
            sb.append(this.specialBusinessHoursDisplayMessage);
            sb.append(", specialBusinessHoursDisplayType=");
            sb.append(this.specialBusinessHoursDisplayType);
            sb.append(", accessRestriction=");
            sb.append(this.accessRestriction);
            sb.append(", parkingType=");
            sb.append(this.parkingType);
            sb.append(", electricVehicleChargers=");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.electricVehicleChargers, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.name, parcel, i);
            parcel.writeString(this.dataSource);
            parcel.writeInt(this.reviewCount);
            parcel.writeFloat(this.distanceValue);
            TextUtils.writeToParcel(this.distanceUnit, parcel, i);
            TextUtils.writeToParcel(this.spendiness, parcel, i);
            parcel.writeString(this.imageUrl);
            parcel.writeString(this.providerLogoUrl);
            parcel.writeString(this.mergedProviderInfo);
            parcel.writeFloat(this.rating);
            parcel.writeString(this.starRatingUrl);
            List<CharSequence> list = this.categories;
            if (list != null) {
                parcel.writeInt(list.size());
                Iterator<CharSequence> it2 = this.categories.iterator();
                while (it2.hasNext()) {
                    TextUtils.writeToParcel(it2.next(), parcel, i);
                }
            } else {
                parcel.writeInt(0);
            }
            TextUtils.writeToParcel(this.address, parcel, i);
            TextUtils.writeToParcel(this.geoLocation, parcel, i);
            TextUtils.writeToParcel(this.phoneNumber, parcel, i);
            List<CharSequence> list2 = this.openingHours;
            if (list2 != null) {
                parcel.writeInt(list2.size());
                Iterator<CharSequence> it3 = this.openingHours.iterator();
                while (it3.hasNext()) {
                    TextUtils.writeToParcel(it3.next(), parcel, i);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.linkUrl);
            parcel.writeString(this.goToActionText);
            parcel.writeString(this.goToActionUrl);
            parcel.writeString(this.specialBusinessHoursDisplayMessage);
            parcel.writeString(this.specialBusinessHoursDisplayType);
            parcel.writeString(this.accessRestriction);
            parcel.writeString(this.parkingType);
            List<CharSequence> list3 = this.electricVehicleChargers;
            if (list3 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(list3.size());
            Iterator<CharSequence> it4 = this.electricVehicleChargers.iterator();
            while (it4.hasNext()) {
                TextUtils.writeToParcel(it4.next(), parcel, i);
            }
        }

        public Business(Builder builder) {
            this.name = builder.name;
            this.dataSource = builder.dataSource;
            this.reviewCount = builder.reviewCount;
            this.distanceValue = builder.distanceValue;
            this.distanceUnit = builder.distanceUnit;
            this.spendiness = builder.spendiness;
            this.imageUrl = builder.imageUrl;
            this.providerLogoUrl = builder.providerLogoUrl;
            this.mergedProviderInfo = builder.mergedProviderInfo;
            this.rating = builder.rating;
            this.starRatingUrl = builder.starRatingUrl;
            this.categories = builder.categories;
            this.address = builder.address;
            this.geoLocation = builder.geoLocation;
            this.phoneNumber = builder.phoneNumber;
            this.openingHours = builder.openingHours;
            this.linkUrl = builder.linkUrl;
            this.goToActionText = builder.goToActionText;
            this.goToActionUrl = builder.goToActionUrl;
            this.specialBusinessHoursDisplayMessage = builder.specialBusinessHoursDisplayMessage;
            this.specialBusinessHoursDisplayType = builder.specialBusinessHoursDisplayType;
            this.accessRestriction = builder.accessRestriction;
            this.parkingType = builder.parkingType;
            this.electricVehicleChargers = builder.electricVehicleChargers;
        }
    }
}
