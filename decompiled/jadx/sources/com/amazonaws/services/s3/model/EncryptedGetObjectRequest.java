package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EncryptedGetObjectRequest extends GetObjectRequest implements Serializable {
    private String instructionFileSuffix;
    private boolean keyWrapExpected;
    private ExtraMaterialsDescription supplemental;

    public EncryptedGetObjectRequest(String str, String str2, String str3) {
        super(str, str2, str3);
        this.supplemental = ExtraMaterialsDescription.NONE;
        setKey(str2);
        setVersionId(str3);
    }

    public ExtraMaterialsDescription getExtraMaterialDescription() {
        return this.supplemental;
    }

    public String getInstructionFileSuffix() {
        return this.instructionFileSuffix;
    }

    public boolean isKeyWrapExpected() {
        return this.keyWrapExpected;
    }

    public void setExtraMaterialDescription(ExtraMaterialsDescription extraMaterialsDescription) {
        if (extraMaterialsDescription == null) {
            extraMaterialsDescription = ExtraMaterialsDescription.NONE;
        }
        this.supplemental = extraMaterialsDescription;
    }

    public void setInstructionFileSuffix(String str) {
        this.instructionFileSuffix = str;
    }

    public void setKeyWrapExpected(boolean z) {
        this.keyWrapExpected = z;
    }

    public EncryptedGetObjectRequest withExtraMaterialsDescription(Map<String, String> map) {
        setExtraMaterialDescription(map == null ? null : new ExtraMaterialsDescription(map));
        return this;
    }

    public EncryptedGetObjectRequest withInstructionFileSuffix(String str) {
        this.instructionFileSuffix = str;
        return this;
    }

    public EncryptedGetObjectRequest withKeyWrapExpected(boolean z) {
        this.keyWrapExpected = z;
        return this;
    }

    public EncryptedGetObjectRequest(String str, String str2) {
        this(str, str2, (String) null);
    }

    public EncryptedGetObjectRequest withExtraMaterialsDescription(ExtraMaterialsDescription extraMaterialsDescription) {
        setExtraMaterialDescription(extraMaterialsDescription);
        return this;
    }

    public EncryptedGetObjectRequest(S3ObjectId s3ObjectId) {
        super(s3ObjectId);
        this.supplemental = ExtraMaterialsDescription.NONE;
    }

    public EncryptedGetObjectRequest(String str, String str2, boolean z) {
        super(str, str2, z);
        this.supplemental = ExtraMaterialsDescription.NONE;
    }
}
