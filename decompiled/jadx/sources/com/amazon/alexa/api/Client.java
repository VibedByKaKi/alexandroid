package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.amazon.alexa.utils.validation.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class Client implements Parcelable {
    public static final Parcelable.Creator<Client> CREATOR = new Parcelable.Creator<Client>() { // from class: com.amazon.alexa.api.Client.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Client createFromParcel(Parcel parcel) {
            return new Client(ClientRole.CREATOR.createFromParcel(parcel), parcel.readString(), AlexaApiVersion.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Client[] newArray(int i) {
            return new Client[i];
        }
    };
    private final ClientRole clientRole;
    private final String id;
    private final AlexaApiVersion version;

    public Client(ClientRole clientRole, String str, AlexaApiVersion alexaApiVersion) {
        Preconditions.notNull(clientRole, "Client role is not defined");
        Preconditions.notNull(str, "id is not defined");
        Preconditions.notNull(alexaApiVersion, "version is not defined");
        this.id = str;
        this.clientRole = clientRole;
        this.version = alexaApiVersion;
    }

    private static String generateId(String str) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "-");
        m1m.append(new ParcelUuid(UUID.randomUUID()));
        return m1m.toString();
    }

    public static Client overrideVersion(Client client, AlexaApiVersion alexaApiVersion) {
        return new Client(client.clientRole, client.id, alexaApiVersion);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.id, ((Client) obj).id);
    }

    public ClientRole getClientRole() {
        return this.clientRole;
    }

    public String getId() {
        return this.id;
    }

    public AlexaApiVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.clientRole.writeToParcel(parcel, i);
        this.version.writeToParcel(parcel, i);
    }

    public Client(String str, ClientRole clientRole) {
        this(clientRole, generateId(str), Versions.CURRENT_API_VERSION);
    }

    public Client(String str) {
        this(generateId(str), ClientRole.USER);
    }
}
