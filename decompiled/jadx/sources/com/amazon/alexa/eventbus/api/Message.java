package com.amazon.alexa.eventbus.api;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>() { // from class: com.amazon.alexa.eventbus.api.Message.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Message createFromParcel(Parcel parcel) {
            return new Message(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Message[] newArray(int i) {
            return new Message[i];
        }
    };
    private static final String JSON_FIELD_DATE = "date";
    private static final String JSON_FIELD_EVENT_TYPE = "eventType";
    private static final String JSON_FIELD_PAYLOAD = "payload";
    private static final String JSON_FIELD_PAYLOAD_TYPE = "payloadType";
    private static final String JSON_FIELD_SOURCE = "source";
    private static final String JSON_FIELD_TTL = "ttl";
    private static final String JSON_FIELD_UUID = "uuid";
    private final long date;
    private final String eventType;
    private final byte[] payload;
    private final PayloadType payloadType;
    private final Source source;
    private final long ttl;
    private final UUID uuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.eventbus.api.Message$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$eventbus$api$Message$PayloadType;

        static {
            int[] iArr = new int[PayloadType.values().length];
            $SwitchMap$com$amazon$alexa$eventbus$api$Message$PayloadType = iArr;
            try {
                iArr[PayloadType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$eventbus$api$Message$PayloadType[PayloadType.Binary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PayloadType {
        String,
        Binary;

        private static final String BINARY = "binary";
        private static final String STRING = "string";

        public static PayloadType fromString(@Nullable String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(BINARY)) {
                return Binary;
            }
            if (str.equals("string")) {
                return String;
            }
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return super.toString().toLowerCase(Locale.US);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Source {
        Local,
        TComm;

        private static final String LOCAL = "Local";
        private static final String TCOMM = "TComm";

        public static Source fromString(@Nullable String str) {
            return str == null ? Local : !str.equals(LOCAL) ? !str.equals(TCOMM) ? Local : TComm : Local;
        }
    }

    private Message(Parcel parcel) {
        this.uuid = ((ParcelUuid) parcel.readParcelable(Message.class.getClassLoader())).getUuid();
        this.source = (Source) parcel.readSerializable();
        this.eventType = parcel.readString();
        this.date = parcel.readLong();
        this.ttl = parcel.readLong();
        this.payloadType = (PayloadType) parcel.readSerializable();
        int readInt = parcel.readInt();
        if (readInt <= 0) {
            this.payload = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        this.payload = bArr;
        parcel.readByteArray(bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        if (r3.equals("ttl") == false) goto L7;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.alexa.eventbus.api.Message fromJSON(@androidx.annotation.NonNull android.util.JsonReader r9) throws java.lang.Exception {
        /*
            com.amazon.alexa.eventbus.api.Message$Builder r0 = new com.amazon.alexa.eventbus.api.Message$Builder
            r0.<init>()
            r9.beginObject()
            r1 = 0
            r2 = r1
        La:
            boolean r3 = r9.hasNext()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto Lc7
            java.lang.String r3 = r9.nextName()
            r3.getClass()
            int r7 = r3.hashCode()
            r8 = -1
            switch(r7) {
                case -896505829: goto L68;
                case -786701938: goto L5c;
                case 115180: goto L52;
                case 3076014: goto L47;
                case 3601339: goto L3b;
                case 31430900: goto L30;
                case 909929960: goto L24;
                default: goto L22;
            }
        L22:
            r4 = r8
            goto L73
        L24:
            java.lang.String r4 = "payloadType"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2e
            goto L22
        L2e:
            r4 = 6
            goto L73
        L30:
            java.lang.String r4 = "eventType"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L39
            goto L22
        L39:
            r4 = 5
            goto L73
        L3b:
            java.lang.String r4 = "uuid"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L45
            goto L22
        L45:
            r4 = 4
            goto L73
        L47:
            java.lang.String r4 = "date"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L50
            goto L22
        L50:
            r4 = 3
            goto L73
        L52:
            java.lang.String r5 = "ttl"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L73
            goto L22
        L5c:
            java.lang.String r4 = "payload"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L66
            goto L22
        L66:
            r4 = r5
            goto L73
        L68:
            java.lang.String r4 = "source"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L72
            goto L22
        L72:
            r4 = r6
        L73:
            switch(r4) {
                case 0: goto Lba;
                case 1: goto Laf;
                case 2: goto La6;
                case 3: goto L9d;
                case 4: goto L90;
                case 5: goto L87;
                case 6: goto L7a;
                default: goto L76;
            }
        L76:
            r9.skipValue()
            goto La
        L7a:
            java.lang.String r3 = r9.nextString()     // Catch: java.lang.IllegalStateException -> L83
            com.amazon.alexa.eventbus.api.Message$PayloadType r1 = com.amazon.alexa.eventbus.api.Message.PayloadType.fromString(r3)     // Catch: java.lang.IllegalStateException -> L83
            goto La
        L83:
            r9.skipValue()
            goto La
        L87:
            java.lang.String r3 = r9.nextString()
            r0.setEventType(r3)
            goto La
        L90:
            java.lang.String r3 = r9.nextString()
            java.util.UUID r3 = java.util.UUID.fromString(r3)
            com.amazon.alexa.eventbus.api.Message.Builder.m16112$$Nest$msetUUID(r0, r3)
            goto La
        L9d:
            long r3 = r9.nextLong()
            r0.setDate(r3)
            goto La
        La6:
            long r3 = r9.nextLong()
            r0.setTTL(r3)
            goto La
        Laf:
            java.lang.String r2 = r9.nextString()     // Catch: java.lang.IllegalStateException -> Lb5
            goto La
        Lb5:
            r9.skipValue()
            goto La
        Lba:
            java.lang.String r3 = r9.nextString()
            com.amazon.alexa.eventbus.api.Message$Source r3 = com.amazon.alexa.eventbus.api.Message.Source.fromString(r3)
            r0.setSource(r3)
            goto La
        Lc7:
            r9.endObject()
            if (r1 == 0) goto Le4
            int[] r9 = com.amazon.alexa.eventbus.api.Message.AnonymousClass2.$SwitchMap$com$amazon$alexa$eventbus$api$Message$PayloadType
            int r1 = r1.ordinal()
            r9 = r9[r1]
            if (r9 == r5) goto Le1
            if (r9 == r4) goto Ld9
            goto Le4
        Ld9:
            byte[] r9 = android.util.Base64.decode(r2, r6)
            r0.setPayload(r9)
            goto Le4
        Le1:
            r0.setPayload(r2)
        Le4:
            com.amazon.alexa.eventbus.api.Message r9 = r0.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.eventbus.api.Message.fromJSON(android.util.JsonReader):com.amazon.alexa.eventbus.api.Message");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Message.class != obj.getClass()) {
            return false;
        }
        return this.uuid.equals(((Message) obj).uuid);
    }

    public long getDate() {
        return this.date;
    }

    public String getEventType() {
        return this.eventType;
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPayloadAsString() {
        return this.payloadType == PayloadType.String ? new String(this.payload, StandardCharsets.UTF_8) : "";
    }

    public PayloadType getPayloadType() {
        return this.payloadType;
    }

    public Source getSource() {
        return this.source;
    }

    public long getTTL() {
        return this.ttl;
    }

    @NonNull
    public UUID getUUID() {
        return this.uuid;
    }

    public int hashCode() {
        return Objects.hash(this.uuid);
    }

    public void writeToJSON(@NonNull JsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject().name("uuid").value(this.uuid.toString()).name("source").value(this.source.toString()).name(JSON_FIELD_EVENT_TYPE).value(this.eventType).name("date").value(this.date).name("ttl").value(this.ttl);
        if (this.payloadType == null) {
            jsonWriter.name(JSON_FIELD_PAYLOAD_TYPE).nullValue().name("payload").nullValue();
        } else {
            jsonWriter.name(JSON_FIELD_PAYLOAD_TYPE).value(this.payloadType.toString());
            int i = AnonymousClass2.$SwitchMap$com$amazon$alexa$eventbus$api$Message$PayloadType[this.payloadType.ordinal()];
            if (i == 1) {
                jsonWriter.name("payload").value(new String(this.payload, StandardCharsets.UTF_8));
            } else if (i != 2) {
                jsonWriter.name("payload").nullValue();
            } else {
                jsonWriter.name("payload").value(Base64.encodeToString(this.payload, 0));
            }
        }
        jsonWriter.endObject();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ParcelUuid(this.uuid), i);
        parcel.writeSerializable(this.source);
        parcel.writeString(this.eventType);
        parcel.writeLong(this.date);
        parcel.writeLong(this.ttl);
        parcel.writeSerializable(this.payloadType);
        byte[] bArr = this.payload;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.payload);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String eventType;
        private byte[] payload;
        private PayloadType payloadType;
        private Source source;
        private UUID uuid;
        private long date = System.currentTimeMillis();
        private long ttl = 0;

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public Builder setUUID(@NonNull UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        @NonNull
        public Message build() {
            return new Message(this.source, this.eventType, this.date, this.ttl, this.payloadType, this.payload, this.uuid, 0);
        }

        @NonNull
        public Builder setDate(long j) {
            this.date = j;
            return this;
        }

        @NonNull
        public Builder setEventType(String str) {
            this.eventType = str;
            return this;
        }

        public Builder setPayload(String str) {
            this.payload = str.getBytes(StandardCharsets.UTF_8);
            this.payloadType = PayloadType.String;
            return this;
        }

        @NonNull
        public Builder setSource(@NonNull Source source) {
            this.source = source;
            return this;
        }

        @NonNull
        public Builder setTTL(long j) {
            this.ttl = j;
            return this;
        }

        @NonNull
        public Builder setPayload(byte[] bArr) {
            this.payload = Arrays.copyOf(bArr, bArr.length);
            this.payloadType = PayloadType.Binary;
            return this;
        }
    }

    public /* synthetic */ Message(Source source, String str, long j, long j2, PayloadType payloadType, byte[] bArr, UUID uuid, int i) {
        this(source, str, j, j2, payloadType, bArr, uuid);
    }

    private Message(Source source, String str, long j, long j2, PayloadType payloadType, byte[] bArr, @Nullable UUID uuid) {
        this.uuid = uuid == null ? UUID.randomUUID() : uuid;
        this.source = source == null ? Source.Local : source;
        this.eventType = str;
        this.date = j;
        this.ttl = j2;
        this.payloadType = payloadType;
        this.payload = bArr;
    }

    public /* synthetic */ Message(Parcel parcel, int i) {
        this(parcel);
    }
}
