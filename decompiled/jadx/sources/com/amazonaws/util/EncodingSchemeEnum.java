package com.amazonaws.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum EncodingSchemeEnum implements EncodingScheme {
    BASE16 { // from class: com.amazonaws.util.EncodingSchemeEnum.1
        @Override // com.amazonaws.util.EncodingScheme
        public byte[] decode(String str) {
            return Base16.decode(str);
        }

        @Override // com.amazonaws.util.EncodingSchemeEnum, com.amazonaws.util.EncodingScheme
        public String encodeAsString(byte[] bArr) {
            return Base16.encodeAsString(bArr);
        }
    },
    BASE32 { // from class: com.amazonaws.util.EncodingSchemeEnum.2
        @Override // com.amazonaws.util.EncodingScheme
        public byte[] decode(String str) {
            return Base32.decode(str);
        }

        @Override // com.amazonaws.util.EncodingSchemeEnum, com.amazonaws.util.EncodingScheme
        public String encodeAsString(byte[] bArr) {
            return Base32.encodeAsString(bArr);
        }
    },
    BASE64 { // from class: com.amazonaws.util.EncodingSchemeEnum.3
        @Override // com.amazonaws.util.EncodingScheme
        public byte[] decode(String str) {
            return Base64.decode(str);
        }

        @Override // com.amazonaws.util.EncodingSchemeEnum, com.amazonaws.util.EncodingScheme
        public String encodeAsString(byte[] bArr) {
            return Base64.encodeAsString(bArr);
        }
    };

    @Override // com.amazonaws.util.EncodingScheme
    public abstract String encodeAsString(byte[] bArr);
}
