package com.dee.app.contacts.interfaces.models.data.enums;

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
public enum EmailAddressType implements Parcelable {
    Home(1, "Home"),
    Work(2, "Work"),
    Mobile(4, "Mobile"),
    Other(3, ProfilerCategory.OTHER),
    Custom(0, "Custom");

    public static final Parcelable.Creator<EmailAddressType> CREATOR = new Parcelable.Creator<EmailAddressType>() { // from class: com.dee.app.contacts.interfaces.models.data.enums.EmailAddressType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmailAddressType createFromParcel(Parcel parcel) {
            return EmailAddressType.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmailAddressType[] newArray(int i) {
            return new EmailAddressType[i];
        }
    };
    private final String mAcmsType;
    private final int mAddressBookType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Deserializer extends JsonDeserializer<EmailAddressType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public EmailAddressType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return EmailAddressType.fromAcmsType(jsonParser.getValueAsString());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Serializer extends JsonSerializer<EmailAddressType> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(EmailAddressType emailAddressType, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
            jsonGenerator.writeString(emailAddressType.getAcmsType());
        }
    }

    EmailAddressType(int i, @NonNull String str) {
        this.mAddressBookType = i;
        this.mAcmsType = str;
    }

    @NonNull
    public static EmailAddressType fromAcmsType(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            for (EmailAddressType emailAddressType : values()) {
                if (emailAddressType.getAcmsType().equals(str)) {
                    return emailAddressType;
                }
            }
        }
        return Other;
    }

    @NonNull
    public static EmailAddressType fromAddressBookType(int i) {
        for (EmailAddressType emailAddressType : values()) {
            if (emailAddressType.getAddressBookType() == i) {
                return emailAddressType;
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
    public static EmailAddressType fromAddressBookType(String str) {
        for (EmailAddressType emailAddressType : values()) {
            if (emailAddressType.getAcmsType() == str) {
                return emailAddressType;
            }
        }
        return Other;
    }
}
