package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EncryptedInitiateMultipartUploadRequest extends InitiateMultipartUploadRequest implements MaterialsDescriptionProvider, Serializable {
    private boolean createEncryptionMaterial;
    private Map<String, String> materialsDescription;

    public EncryptedInitiateMultipartUploadRequest(String str, String str2) {
        super(str, str2);
        this.createEncryptionMaterial = true;
    }

    @Override // com.amazonaws.services.s3.model.MaterialsDescriptionProvider
    public Map<String, String> getMaterialsDescription() {
        return this.materialsDescription;
    }

    public boolean isCreateEncryptionMaterial() {
        return this.createEncryptionMaterial;
    }

    public void setCreateEncryptionMaterial(boolean z) {
        this.createEncryptionMaterial = z;
    }

    public void setMaterialsDescription(Map<String, String> map) {
        this.materialsDescription = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
    }

    public EncryptedInitiateMultipartUploadRequest withCreateEncryptionMaterial(boolean z) {
        this.createEncryptionMaterial = z;
        return this;
    }

    public EncryptedInitiateMultipartUploadRequest withMaterialsDescription(Map<String, String> map) {
        setMaterialsDescription(map);
        return this;
    }

    public EncryptedInitiateMultipartUploadRequest(String str, String str2, ObjectMetadata objectMetadata) {
        super(str, str2, objectMetadata);
        this.createEncryptionMaterial = true;
    }
}
