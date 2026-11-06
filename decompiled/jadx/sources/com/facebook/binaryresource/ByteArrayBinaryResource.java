package com.facebook.binaryresource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/binaryresource/ByteArrayBinaryResource;", "Lcom/facebook/binaryresource/BinaryResource;", "bytes", "", "<init>", "([B)V", "size", "", "openStream", "Ljava/io/InputStream;", "read", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteArrayBinaryResource implements BinaryResource {

    @NotNull
    private final byte[] bytes;

    public ByteArrayBinaryResource(@NotNull byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // com.facebook.binaryresource.BinaryResource
    @NotNull
    public InputStream openStream() throws IOException {
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // com.facebook.binaryresource.BinaryResource
    @NotNull
    /* renamed from: read, reason: from getter */
    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public long size() {
        return this.bytes.length;
    }
}
