package com.amazon.alexa.accessory.kota;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BinaryMetadata implements JsonObjectSerializable {
    private static final String FILE_SIZE = "file_size";
    private static final String JSON_BINARY_TYPE = "binaryType";
    private static final String JSON_FILE_HASH = "file_hash";
    private static final String JSON_MD5_SUM = "md5Sum";
    private static final String JSON_METADATA_HASH = "metadata_hash";
    private static final String JSON_METADATA_OFFSET = "payload_offset";
    private static final String JSON_METADATA_SIZE = "metadata_size";
    private static final String JSON_REMOTE_FILE_SIZE = "remoteFileSize";
    private final String binaryType;
    private final String fileHash;
    private final long fileSize;
    private final String md5Sum;
    private final String metadataHash;
    private final long metadataOffset;
    private final long metadataSize;
    private final long remoteFileSize;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String binaryType;
        String fileHash;
        String md5Sum;
        String metadataHash;
        long fileSize = -1;
        long remoteFileSize = -1;
        long metadataSize = -1;
        long metadataOffset = -1;

        public Builder binaryType(String str) {
            this.binaryType = str;
            return this;
        }

        public BinaryMetadata build() {
            Preconditions.notNull(this.binaryType, BinaryMetadata.JSON_BINARY_TYPE);
            Preconditions.notNull(this.md5Sum, BinaryMetadata.JSON_MD5_SUM);
            return new BinaryMetadata(this);
        }

        public Builder fileHash(String str) {
            this.fileHash = str;
            return this;
        }

        public Builder fileSize(long j) {
            this.fileSize = j;
            return this;
        }

        public Builder md5Sum(String str) {
            this.md5Sum = str;
            return this;
        }

        public Builder metadataHash(String str) {
            this.metadataHash = str;
            return this;
        }

        public Builder metadataOffset(long j) {
            this.metadataOffset = j;
            return this;
        }

        public Builder metadataSize(long j) {
            this.metadataSize = j;
            return this;
        }

        public Builder remoteFileSize(long j) {
            this.remoteFileSize = j;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JsonFactory implements JsonObjectSerializable.Factory<BinaryMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public BinaryMetadata create(JSONObject jSONObject) throws JSONException {
            Builder md5Sum = new Builder().binaryType(jSONObject.getString(BinaryMetadata.JSON_BINARY_TYPE)).md5Sum(jSONObject.getString(BinaryMetadata.JSON_MD5_SUM));
            if (jSONObject.has(BinaryMetadata.JSON_FILE_HASH)) {
                md5Sum.fileHash(jSONObject.getString(BinaryMetadata.JSON_FILE_HASH));
            }
            if (jSONObject.has(BinaryMetadata.JSON_METADATA_HASH)) {
                md5Sum.metadataHash(jSONObject.getString(BinaryMetadata.JSON_METADATA_HASH));
            }
            if (jSONObject.has(BinaryMetadata.FILE_SIZE)) {
                md5Sum.fileSize(jSONObject.getLong(BinaryMetadata.FILE_SIZE));
            }
            if (jSONObject.has(BinaryMetadata.JSON_REMOTE_FILE_SIZE)) {
                md5Sum.remoteFileSize(jSONObject.getLong(BinaryMetadata.JSON_REMOTE_FILE_SIZE));
            }
            if (jSONObject.has(BinaryMetadata.JSON_METADATA_SIZE)) {
                md5Sum.metadataSize(jSONObject.getLong(BinaryMetadata.JSON_METADATA_SIZE));
            }
            if (jSONObject.has(BinaryMetadata.JSON_METADATA_OFFSET)) {
                md5Sum.metadataOffset(jSONObject.getLong(BinaryMetadata.JSON_METADATA_OFFSET));
            }
            return md5Sum.build();
        }
    }

    public BinaryMetadata(Builder builder) {
        this.binaryType = builder.binaryType;
        this.md5Sum = builder.md5Sum;
        this.fileHash = builder.fileHash;
        this.metadataHash = builder.metadataHash;
        this.fileSize = builder.fileSize;
        this.remoteFileSize = builder.remoteFileSize;
        this.metadataSize = builder.metadataSize;
        this.metadataOffset = builder.metadataOffset;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryMetadata.class == obj.getClass()) {
            BinaryMetadata binaryMetadata = (BinaryMetadata) obj;
            if (this.fileSize != binaryMetadata.fileSize || this.remoteFileSize != binaryMetadata.remoteFileSize || this.metadataSize != binaryMetadata.metadataSize || this.metadataOffset != binaryMetadata.metadataOffset || !this.binaryType.equals(binaryMetadata.binaryType) || !this.md5Sum.equals(binaryMetadata.md5Sum)) {
                return false;
            }
            String str = this.fileHash;
            String str2 = binaryMetadata.fileHash;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.metadataHash;
            String str4 = binaryMetadata.metadataHash;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public String getBinaryType() {
        return this.binaryType;
    }

    public long getExpectedDownloadFileSize() {
        long j = this.remoteFileSize;
        return j >= 0 ? j : this.fileSize;
    }

    public String getFileHash() {
        return this.fileHash;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getMd5Sum() {
        return this.md5Sum;
    }

    public String getMetadataHash() {
        return this.metadataHash;
    }

    public long getMetadataOffset() {
        return this.metadataOffset;
    }

    public long getMetadataSize() {
        return this.metadataSize;
    }

    public long getRemoteFileSize() {
        return this.remoteFileSize;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.binaryType.hashCode() * 31, 31, this.md5Sum);
        String str = this.fileHash;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.metadataHash;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.fileSize;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.remoteFileSize;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.metadataSize;
        long j4 = this.metadataOffset;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        JSONObject put = new JSONObject().put(JSON_BINARY_TYPE, this.binaryType).put(JSON_MD5_SUM, this.md5Sum);
        String str = this.fileHash;
        if (str != null) {
            put.put(JSON_FILE_HASH, str);
        }
        String str2 = this.metadataHash;
        if (str2 != null) {
            put.put(JSON_METADATA_HASH, str2);
        }
        long j = this.fileSize;
        if (j >= 0) {
            put.put(FILE_SIZE, j);
        }
        long j2 = this.remoteFileSize;
        if (j2 >= 0) {
            put.put(JSON_REMOTE_FILE_SIZE, j2);
        }
        long j3 = this.metadataSize;
        if (j3 >= 0) {
            put.put(JSON_METADATA_SIZE, j3);
        }
        long j4 = this.metadataOffset;
        if (j4 >= 0) {
            put.put(JSON_METADATA_OFFSET, j4);
        }
        return put;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BinaryMetadata{binaryType='");
        sb.append(this.binaryType);
        sb.append("', md5Sum='");
        sb.append(this.md5Sum);
        sb.append("', fileHash='");
        sb.append(this.fileHash);
        sb.append("', metadataHash='");
        sb.append(this.metadataHash);
        sb.append("', fileSize=");
        sb.append(this.fileSize);
        sb.append(", remoteFileSize=");
        sb.append(this.remoteFileSize);
        sb.append(", metadataSize=");
        sb.append(this.metadataSize);
        sb.append(", metadataOffset=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.metadataOffset, AbstractJsonLexerKt.END_OBJ);
    }
}
