package com.amazon.alexa.accessory.repositories.firmware;

import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.io.InputStreamSource;
import com.amazon.alexa.accessory.io.RangeSource;
import com.amazon.alexa.accessory.io.Source;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class ZipEntrySource implements Source {
    private final Source source;
    private final ZipFile zipFile;

    public ZipEntrySource(File file, String str, int i, int i2) throws IOException {
        ZipFile zipFile = new ZipFile(file, 1);
        this.zipFile = zipFile;
        this.source = new RangeSource(new InputStreamSource(zipFile.getInputStream(getEntry(zipFile, str))), i, i2);
    }

    private static ZipEntry getEntry(ZipFile zipFile, String str) throws IOException {
        ZipEntry entry = zipFile.getEntry(str);
        if (entry != null) {
            return entry;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Entry with a name `", str, "` does not exist!"));
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.closeQuietly(this.source);
        IOUtils.closeQuietly(this.zipFile);
    }

    @Override // com.amazon.alexa.accessory.io.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.source.read(bArr, i, i2);
    }

    public ZipEntrySource(File file, String str) throws IOException {
        ZipFile zipFile = new ZipFile(file, 1);
        this.zipFile = zipFile;
        this.source = new InputStreamSource(zipFile.getInputStream(getEntry(zipFile, str)));
    }
}
