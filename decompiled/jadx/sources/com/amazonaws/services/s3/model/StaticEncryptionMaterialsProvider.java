package com.amazonaws.services.s3.model;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StaticEncryptionMaterialsProvider implements EncryptionMaterialsProvider {
    private final EncryptionMaterials materials;

    public StaticEncryptionMaterialsProvider(EncryptionMaterials encryptionMaterials) {
        this.materials = encryptionMaterials;
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterialsAccessor
    public EncryptionMaterials getEncryptionMaterials(Map<String, String> map) {
        EncryptionMaterials encryptionMaterials;
        Map<String, String> materialsDescription = this.materials.getMaterialsDescription();
        if (map != null && map.equals(materialsDescription)) {
            return this.materials;
        }
        EncryptionMaterialsAccessor accessor = this.materials.getAccessor();
        if (accessor != null && (encryptionMaterials = accessor.getEncryptionMaterials(map)) != null) {
            return encryptionMaterials;
        }
        boolean z = true;
        boolean z2 = map == null || map.size() == 0;
        if (materialsDescription != null && materialsDescription.size() != 0) {
            z = false;
        }
        if (z2 && z) {
            return this.materials;
        }
        return null;
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterialsProvider
    public void refresh() {
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterialsProvider
    public EncryptionMaterials getEncryptionMaterials() {
        return this.materials;
    }
}
