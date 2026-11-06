package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class ExoSoSource extends UnpackingSoSource {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ExoUnpacker extends UnpackingSoSource.Unpacker {
        private final FileDso[] mDsos;

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r12 + com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants.RIGHT_BRACKET);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ExoUnpacker(com.facebook.soloader.UnpackingSoSource r20) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.ExoSoSource.ExoUnpacker.<init>(com.facebook.soloader.ExoSoSource, com.facebook.soloader.UnpackingSoSource):void");
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.Dso[] getDsos() throws IOException {
            return this.mDsos;
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public void unpack(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (FileDso fileDso : this.mDsos) {
                FileInputStream fileInputStream = new FileInputStream(fileDso.backingFile);
                try {
                    UnpackingSoSource.InputDso inputDso = new UnpackingSoSource.InputDso(fileDso, fileInputStream);
                    fileInputStream = null;
                    try {
                        extractDso(inputDso, bArr, file);
                        inputDso.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FileDso extends UnpackingSoSource.Dso {
        final File backingFile;

        public FileDso(String str, String str2, File file) {
            super(str, str2);
            this.backingFile = file;
        }
    }

    public ExoSoSource(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public MessageDigest getHashingAlgorithm() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-1");
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String getName() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ExoUnpacker(this, this);
    }
}
