package com.amazon.alexa.biloba.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PersonIdentitySetupRequestMetadata {

    @SerializedName("client")
    PersonIdentityClient client;

    @SerializedName("locale")
    String locale;

    @SerializedName("platform")
    PersonIdentityClientPlatformEnum platform;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum PersonIdentityClientPlatformEnum {
        IOS("IOS"),
        ANDROID("ANDROID"),
        MACOS("MACOS"),
        WINDOWS("WINDOWS"),
        WEB("WEB");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<PersonIdentityClientPlatformEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public PersonIdentityClientPlatformEnum read(JsonReader jsonReader) throws IOException {
                return PersonIdentityClientPlatformEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, PersonIdentityClientPlatformEnum personIdentityClientPlatformEnum) throws IOException {
                jsonWriter.value(personIdentityClientPlatformEnum.getValue());
            }
        }

        PersonIdentityClientPlatformEnum(String str) {
            this.value = str;
        }

        public static PersonIdentityClientPlatformEnum fromValue(String str) {
            for (PersonIdentityClientPlatformEnum personIdentityClientPlatformEnum : values()) {
                if (String.valueOf(personIdentityClientPlatformEnum.value).equals(str)) {
                    return personIdentityClientPlatformEnum;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    public PersonIdentitySetupRequestMetadata(String str, PersonIdentityClientPlatformEnum personIdentityClientPlatformEnum, PersonIdentityClient personIdentityClient) {
        this.locale = str;
        this.platform = personIdentityClientPlatformEnum;
        this.client = personIdentityClient;
    }

    public String toString() {
        return "PersonIdentitySetupRequest{locale='" + this.locale + "', platform=" + this.platform + ", client=" + this.client + AbstractJsonLexerKt.END_OBJ;
    }
}
