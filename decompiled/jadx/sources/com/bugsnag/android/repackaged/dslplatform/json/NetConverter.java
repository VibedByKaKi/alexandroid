package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class NetConverter {
    static final JsonReader.ReadObject<URI> UriReader = new JsonReader.ReadObject<URI>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public URI read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NetConverter.deserializeUri(jsonReader);
        }
    };
    static final JsonWriter.WriteObject<URI> UriWriter = new JsonWriter.WriteObject<URI>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable URI uri) {
            NetConverter.serializeNullable(uri, jsonWriter);
        }
    };
    static final JsonReader.ReadObject<InetAddress> AddressReader = new JsonReader.ReadObject<InetAddress>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public InetAddress read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NetConverter.deserializeIp(jsonReader);
        }
    };
    static final JsonWriter.WriteObject<InetAddress> AddressWriter = new JsonWriter.WriteObject<InetAddress>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable InetAddress inetAddress) {
            NetConverter.serializeNullable(inetAddress, jsonWriter);
        }
    };

    public static InetAddress deserializeIp(JsonReader jsonReader) throws IOException {
        return InetAddress.getByName(jsonReader.readSimpleString());
    }

    public static ArrayList<InetAddress> deserializeIpCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(AddressReader);
    }

    public static ArrayList<InetAddress> deserializeIpNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(AddressReader);
    }

    public static URI deserializeUri(JsonReader jsonReader) throws IOException {
        return URI.create(jsonReader.readString());
    }

    public static ArrayList<URI> deserializeUriCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(UriReader);
    }

    public static ArrayList<URI> deserializeUriNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(UriReader);
    }

    public static void serialize(InetAddress inetAddress, JsonWriter jsonWriter) {
        jsonWriter.writeByte((byte) 34);
        jsonWriter.writeAscii(inetAddress.getHostAddress());
        jsonWriter.writeByte((byte) 34);
    }

    public static void serializeNullable(@Nullable URI uri, JsonWriter jsonWriter) {
        if (uri == null) {
            jsonWriter.writeNull();
        } else {
            serialize(uri, jsonWriter);
        }
    }

    public static void deserializeIpCollection(JsonReader jsonReader, Collection<InetAddress> collection) throws IOException {
        jsonReader.deserializeCollection(AddressReader, collection);
    }

    public static void deserializeIpNullableCollection(JsonReader jsonReader, Collection<InetAddress> collection) throws IOException {
        jsonReader.deserializeNullableCollection(AddressReader, collection);
    }

    public static void deserializeUriCollection(JsonReader jsonReader, Collection<URI> collection) throws IOException {
        jsonReader.deserializeCollection(UriReader, collection);
    }

    public static void deserializeUriNullableCollection(JsonReader jsonReader, Collection<URI> collection) throws IOException {
        jsonReader.deserializeNullableCollection(UriReader, collection);
    }

    public static void serializeNullable(@Nullable InetAddress inetAddress, JsonWriter jsonWriter) {
        if (inetAddress == null) {
            jsonWriter.writeNull();
        } else {
            serialize(inetAddress, jsonWriter);
        }
    }

    public static void serialize(URI uri, JsonWriter jsonWriter) {
        StringConverter.serializeShort(uri.toString(), jsonWriter);
    }
}
