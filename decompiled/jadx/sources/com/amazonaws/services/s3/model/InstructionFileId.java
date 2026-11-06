package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class InstructionFileId extends S3ObjectId {
    public static final String DEFAULT_INSTRUCTION_FILE_SUFFIX = "instruction";

    @Deprecated
    public static final String DEFAULT_INSTURCTION_FILE_SUFFIX = "instruction";
    public static final String DOT = ".";

    public InstructionFileId(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.amazonaws.services.s3.model.S3ObjectId
    public InstructionFileId instructionFileId() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.services.s3.model.S3ObjectId
    public InstructionFileId instructionFileId(String str) {
        throw new UnsupportedOperationException();
    }
}
