package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.security.KeyPair;
import javax.crypto.SecretKey;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class KMSEncryptionMaterials extends EncryptionMaterials implements Serializable {
    public static final String CUSTOMER_MASTER_KEY_ID = "kms_cmk_id";

    public KMSEncryptionMaterials(String str) {
        super(null, null);
        if (str == null || str.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("The default customer master key id must be specified");
            throw null;
        }
        addDescription(CUSTOMER_MASTER_KEY_ID, str);
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterials
    public String getCustomerMasterKeyId() {
        return getDescription(CUSTOMER_MASTER_KEY_ID);
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterials
    public final KeyPair getKeyPair() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterials
    public final SecretKey getSymmetricKey() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterials
    public final boolean isKMSEnabled() {
        return true;
    }

    public String toString() {
        return String.valueOf(getMaterialsDescription());
    }
}
