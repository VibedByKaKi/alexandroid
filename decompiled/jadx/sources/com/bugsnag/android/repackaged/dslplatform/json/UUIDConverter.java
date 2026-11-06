package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class UUIDConverter {
    public static final UUID MIN_UUID = new UUID(0, 0);
    public static final JsonReader.ReadObject<UUID> READER = new JsonReader.ReadObject<UUID>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.UUIDConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public UUID read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return UUIDConverter.deserialize(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<UUID> WRITER = new JsonWriter.WriteObject<UUID>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.UUIDConverter.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable UUID uuid) {
            UUIDConverter.serializeNullable(uuid, jsonWriter);
        }
    };
    private static final char[] Lookup = new char[256];
    private static final byte[] Values = new byte[55];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = (i >> 4) & 15;
            int i3 = i & 15;
            Lookup[i] = (char) (((i2 < 10 ? i2 + 48 : i2 + 87) << 8) + (i3 < 10 ? i3 + 48 : i3 + 87));
        }
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            int i4 = c - '0';
            Values[i4] = (byte) i4;
        }
        for (char c2 = 'a'; c2 <= 'f'; c2 = (char) (c2 + 1)) {
            Values[c2 - '0'] = (byte) (c2 - 'W');
        }
        for (char c3 = 'A'; c3 <= 'F'; c3 = (char) (c3 + 1)) {
            Values[c3 - '0'] = (byte) (c3 - '7');
        }
    }

    public static UUID deserialize(JsonReader jsonReader) throws IOException {
        int i;
        char[] readSimpleQuote = jsonReader.readSimpleQuote();
        int currentIndex = jsonReader.getCurrentIndex() - jsonReader.getTokenStart();
        long j = 0;
        if (currentIndex != 37 || readSimpleQuote[8] != '-' || readSimpleQuote[13] != '-' || readSimpleQuote[18] != '-' || readSimpleQuote[23] != '-') {
            if (currentIndex != 33) {
                return UUID.fromString(new String(readSimpleQuote, 0, currentIndex - 1));
            }
            long j2 = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    break;
                }
                try {
                    j2 = (j2 << 4) + Values[readSimpleQuote[i2] - '0'];
                    i2++;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return UUID.fromString(new String(readSimpleQuote, 0, 32));
                }
                return UUID.fromString(new String(readSimpleQuote, 0, 32));
            }
            for (i = 16; i < 32; i++) {
                j = (j << 4) + Values[readSimpleQuote[i] - '0'];
            }
            return new UUID(j2, j);
        }
        long j3 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            try {
                j3 = (j3 << 4) + Values[readSimpleQuote[i3] - '0'];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return UUID.fromString(new String(readSimpleQuote, 0, 36));
            }
        }
        for (int i4 = 9; i4 < 13; i4++) {
            j3 = (j3 << 4) + Values[readSimpleQuote[i4] - '0'];
        }
        for (int i5 = 14; i5 < 18; i5++) {
            j3 = (j3 << 4) + Values[readSimpleQuote[i5] - '0'];
        }
        for (int i6 = 19; i6 < 23; i6++) {
            j = (j << 4) + Values[readSimpleQuote[i6] - '0'];
        }
        for (int i7 = 24; i7 < 36; i7++) {
            j = (j << 4) + Values[readSimpleQuote[i7] - '0'];
        }
        return new UUID(j3, j);
    }

    public static ArrayList<UUID> deserializeCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(READER);
    }

    public static ArrayList<UUID> deserializeNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(READER);
    }

    public static void serialize(long j, long j2, JsonWriter jsonWriter) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        byte[] ensureCapacity = jsonWriter.ensureCapacity(38);
        int size = jsonWriter.size();
        ensureCapacity[size] = 34;
        char[] cArr = Lookup;
        char c = cArr[(i >> 24) & 255];
        ensureCapacity[size + 1] = (byte) (c >> '\b');
        ensureCapacity[size + 2] = (byte) c;
        char c2 = cArr[(i >> 16) & 255];
        ensureCapacity[size + 3] = (byte) (c2 >> '\b');
        ensureCapacity[size + 4] = (byte) c2;
        char c3 = cArr[(i >> 8) & 255];
        ensureCapacity[size + 5] = (byte) (c3 >> '\b');
        ensureCapacity[size + 6] = (byte) c3;
        char c4 = cArr[i & 255];
        ensureCapacity[size + 7] = (byte) (c4 >> '\b');
        ensureCapacity[size + 8] = (byte) c4;
        ensureCapacity[size + 9] = 45;
        char c5 = cArr[(i2 >> 24) & 255];
        ensureCapacity[size + 10] = (byte) (c5 >> '\b');
        ensureCapacity[size + 11] = (byte) c5;
        char c6 = cArr[(i2 >> 16) & 255];
        ensureCapacity[size + 12] = (byte) (c6 >> '\b');
        ensureCapacity[size + 13] = (byte) c6;
        ensureCapacity[size + 14] = 45;
        char c7 = cArr[(i2 >> 8) & 255];
        ensureCapacity[size + 15] = (byte) (c7 >> '\b');
        ensureCapacity[size + 16] = (byte) c7;
        char c8 = cArr[i2 & 255];
        ensureCapacity[size + 17] = (byte) (c8 >> '\b');
        ensureCapacity[size + 18] = (byte) c8;
        ensureCapacity[size + 19] = 45;
        char c9 = cArr[(i3 >> 24) & 255];
        ensureCapacity[size + 20] = (byte) (c9 >> '\b');
        ensureCapacity[size + 21] = (byte) c9;
        char c10 = cArr[(i3 >> 16) & 255];
        ensureCapacity[size + 22] = (byte) (c10 >> '\b');
        ensureCapacity[size + 23] = (byte) c10;
        ensureCapacity[size + 24] = 45;
        char c11 = cArr[(i3 >> 8) & 255];
        ensureCapacity[size + 25] = (byte) (c11 >> '\b');
        ensureCapacity[size + 26] = (byte) c11;
        char c12 = cArr[i3 & 255];
        ensureCapacity[size + 27] = (byte) (c12 >> '\b');
        ensureCapacity[size + 28] = (byte) c12;
        char c13 = cArr[(i4 >> 24) & 255];
        ensureCapacity[size + 29] = (byte) (c13 >> '\b');
        ensureCapacity[size + 30] = (byte) c13;
        char c14 = cArr[(i4 >> 16) & 255];
        ensureCapacity[size + 31] = (byte) (c14 >> '\b');
        ensureCapacity[size + 32] = (byte) c14;
        char c15 = cArr[(i4 >> 8) & 255];
        ensureCapacity[size + 33] = (byte) (c15 >> '\b');
        ensureCapacity[size + 34] = (byte) c15;
        char c16 = cArr[i4 & 255];
        ensureCapacity[size + 35] = (byte) (c16 >> '\b');
        ensureCapacity[size + 36] = (byte) c16;
        ensureCapacity[size + 37] = 34;
        jsonWriter.advance(38);
    }

    public static void serializeNullable(@Nullable UUID uuid, JsonWriter jsonWriter) {
        if (uuid == null) {
            jsonWriter.writeNull();
        } else {
            serialize(uuid, jsonWriter);
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<UUID> collection) throws IOException {
        jsonReader.deserializeCollection(READER, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<UUID> collection) throws IOException {
        jsonReader.deserializeNullableCollection(READER, collection);
    }

    public static void serialize(UUID uuid, JsonWriter jsonWriter) {
        serialize(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits(), jsonWriter);
    }
}
