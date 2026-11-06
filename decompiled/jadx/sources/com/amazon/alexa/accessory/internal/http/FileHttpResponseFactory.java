package com.amazon.alexa.accessory.internal.http;

import com.amazon.alexa.accessory.internal.http.HttpResponse;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.io.OutputStreamSink;
import com.amazon.alexa.accessory.io.Source;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class FileHttpResponseFactory implements HttpResponse.Factory<File> {
    private final File file;

    public FileHttpResponseFactory(File file) {
        this.file = file;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessory.internal.http.HttpResponse.Factory
    public File create(Source source) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        try {
            IOUtils.transfer(source, new OutputStreamSink(fileOutputStream));
            fileOutputStream.close();
            return this.file;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
