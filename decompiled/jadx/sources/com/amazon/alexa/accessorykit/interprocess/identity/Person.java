package com.amazon.alexa.accessorykit.interprocess.identity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.JsonUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class Person implements JsonObjectSerializable {
    private static final String ABSENT_PERSON_ID_VALUE = "";
    private static final String HASHED_COMMS_ID_KEY = "hashedCommsId";
    private static final String HOUSEHOLD_COMMS_ID_KEY = "householdCommsId";
    private static final String PERSON_ID_KEY = "personId";
    public final String hashedCommsId;
    public final String househouldCommsId;
    public final String personId;
    public static final Person ABSENT = new Person();
    public static final JsonObjectSerializable.Factory<Person> FACTORY = new Factory(0);

    public Person(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Preconditions.notNull(str, "personId");
        Preconditions.precondition(!str.isEmpty(), "personId cannot be empty");
        this.personId = str;
        this.hashedCommsId = str2;
        this.househouldCommsId = str3;
    }

    public boolean equals(Object obj) {
        return true;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("personId", this.personId).put("hashedCommsId", this.hashedCommsId).put(HOUSEHOLD_COMMS_ID_KEY, this.househouldCommsId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Person{personId='");
        sb.append(this.personId);
        sb.append("', hashedCommsId='");
        sb.append(this.hashedCommsId);
        sb.append("', househouldCommsId='");
        return a$$ExternalSyntheticOutline0.m(sb, this.househouldCommsId, "'}");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<Person> {
        public /* synthetic */ Factory(int i) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public Person create(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("personId");
            return string.equals("") ? Person.ABSENT : new Person(string, JsonUtils.getStringOrNull(jSONObject, "hashedCommsId"), JsonUtils.getStringOrNull(jSONObject, Person.HOUSEHOLD_COMMS_ID_KEY));
        }

        private Factory() {
        }
    }

    private Person() {
        this.personId = "";
        this.hashedCommsId = null;
        this.househouldCommsId = null;
    }
}
