package com.dee.app.contacts.interfaces.models.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.coral.profiler.ProfilerCategory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(using = Deserializer.class)
@JsonSerialize(using = Serializer.class)
/* loaded from: classes6.dex */
public enum PhoneNumberType implements Parcelable {
    Home(1, "Home"),
    Work(3, "Work"),
    Mobile(2, "Mobile"),
    HomeFax(5, "Home Fax"),
    Radio(14, "Radio"),
    WorkFax(4, "Work Fax"),
    Main(12, "Main"),
    Pager(6, "Pager"),
    Assistant(19, "Assistant"),
    CompanyMain(10, "Company Main"),
    Car(9, "Car"),
    Other(7, ProfilerCategory.OTHER),
    Custom(0, "Custom"),
    Alexa(0, "Alexa"),
    iPhone(0, "IPhone"),
    Cell(0, "Cell");

    public static final Parcelable.Creator<PhoneNumberType> CREATOR = new Parcelable.Creator<PhoneNumberType>() { // from class: com.dee.app.contacts.interfaces.models.data.PhoneNumberType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PhoneNumberType createFromParcel(Parcel parcel) {
            return PhoneNumberType.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PhoneNumberType[] newArray(int i) {
            return new PhoneNumberType[i];
        }
    };
    private final String mAcmsType;
    private final int mAddressBookType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Deserializer extends JsonDeserializer<PhoneNumberType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public PhoneNumberType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return PhoneNumberType.fromAcmsType(jsonParser.getValueAsString());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Serializer extends JsonSerializer<PhoneNumberType> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(PhoneNumberType phoneNumberType, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
            jsonGenerator.writeString(phoneNumberType.getAcmsType());
        }
    }

    PhoneNumberType(int i, @NonNull String str) {
        this.mAddressBookType = i;
        this.mAcmsType = str;
    }

    @NonNull
    public static PhoneNumberType fromAcmsType(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            for (PhoneNumberType phoneNumberType : values()) {
                if (phoneNumberType.getAcmsType().equals(str)) {
                    return phoneNumberType;
                }
            }
        }
        return Other;
    }

    @NonNull
    public static PhoneNumberType fromAddressBookType(int i) {
        for (PhoneNumberType phoneNumberType : values()) {
            if (phoneNumberType.getAddressBookType() == i) {
                return phoneNumberType;
            }
        }
        return Other;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String getAcmsType() {
        return this.mAcmsType;
    }

    public int getAddressBookType() {
        return this.mAddressBookType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }

    @NonNull
    public static PhoneNumberType fromAddressBookType(String str) {
        for (PhoneNumberType phoneNumberType : values()) {
            if (phoneNumberType.getAcmsType() == str) {
                return phoneNumberType;
            }
        }
        return Other;
    }
}
