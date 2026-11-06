package org.openjdk.tools.sjavac.server.log;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.openjdk.tools.sjavac.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class LoggingOutputStream extends FilterOutputStream {
    private static final byte[] LINE_SEP = System.lineSeparator().getBytes();
    private EolTrackingByteArrayOutputStream buf;
    private final Log.Level level;
    private final String linePrefix;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EolTrackingByteArrayOutputStream extends ByteArrayOutputStream {
        private static final byte[] EOL = System.lineSeparator().getBytes();

        private EolTrackingByteArrayOutputStream() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isLineComplete() {
            if (((ByteArrayOutputStream) this).count < EOL.length) {
                return false;
            }
            int i = 0;
            while (true) {
                byte[] bArr = EOL;
                if (i >= bArr.length) {
                    return true;
                }
                if (((ByteArrayOutputStream) this).buf[(((ByteArrayOutputStream) this).count - bArr.length) + i] != bArr[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public LoggingOutputStream(OutputStream outputStream, Log.Level level, String str) {
        super(outputStream);
        this.buf = new EolTrackingByteArrayOutputStream();
        this.level = level;
        this.linePrefix = str;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        super.write(i);
        this.buf.write(i);
        if (this.buf.isLineComplete()) {
            String str = new String(this.buf.toByteArray(), 0, this.buf.size() - LINE_SEP.length);
            Log.log(this.level, this.linePrefix + str);
            this.buf = new EolTrackingByteArrayOutputStream();
        }
    }
}
