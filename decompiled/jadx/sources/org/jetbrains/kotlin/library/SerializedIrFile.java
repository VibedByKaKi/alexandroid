package org.jetbrains.kotlin.library;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lorg/jetbrains/kotlin/library/SerializedIrFile;", "", "fileData", "", "fqName", "", "path", "types", "signatures", "strings", "bodies", "declarations", "debugInfo", "backendSpecificMetadata", "([BLjava/lang/String;Ljava/lang/String;[B[B[B[B[B[B[B)V", "getBackendSpecificMetadata", "()[B", "getBodies", "getDebugInfo", "getDeclarations", "getFileData", "getFqName", "()Ljava/lang/String;", "getPath", "getSignatures", "getStrings", "getTypes", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class SerializedIrFile {

    @Nullable
    private final byte[] backendSpecificMetadata;

    @NotNull
    private final byte[] bodies;

    @Nullable
    private final byte[] debugInfo;

    @NotNull
    private final byte[] declarations;

    @NotNull
    private final byte[] fileData;

    @NotNull
    private final String fqName;

    @NotNull
    private final String path;

    @NotNull
    private final byte[] signatures;

    @NotNull
    private final byte[] strings;

    @NotNull
    private final byte[] types;

    public SerializedIrFile(@NotNull byte[] bArr, @NotNull String str, @NotNull String str2, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4, @NotNull byte[] bArr5, @NotNull byte[] bArr6, @Nullable byte[] bArr7, @Nullable byte[] bArr8) {
        bArr.getClass();
        str.getClass();
        str2.getClass();
        bArr2.getClass();
        bArr3.getClass();
        bArr4.getClass();
        bArr5.getClass();
        bArr6.getClass();
        this.fileData = bArr;
        this.fqName = str;
        this.path = str2;
        this.types = bArr2;
        this.signatures = bArr3;
        this.strings = bArr4;
        this.bodies = bArr5;
        this.declarations = bArr6;
        this.debugInfo = bArr7;
        this.backendSpecificMetadata = bArr8;
    }

    @Nullable
    public final byte[] getBackendSpecificMetadata() {
        return this.backendSpecificMetadata;
    }

    @NotNull
    public final byte[] getBodies() {
        return this.bodies;
    }

    @Nullable
    public final byte[] getDebugInfo() {
        return this.debugInfo;
    }

    @NotNull
    public final byte[] getDeclarations() {
        return this.declarations;
    }

    @NotNull
    public final byte[] getFileData() {
        return this.fileData;
    }

    @NotNull
    public final String getFqName() {
        return this.fqName;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final byte[] getSignatures() {
        return this.signatures;
    }

    @NotNull
    public final byte[] getStrings() {
        return this.strings;
    }

    @NotNull
    public final byte[] getTypes() {
        return this.types;
    }
}
