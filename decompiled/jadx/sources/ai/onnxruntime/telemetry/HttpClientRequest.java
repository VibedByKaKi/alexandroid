package ai.onnxruntime.telemetry;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface HttpClientRequest extends Runnable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class AndroidUrlConnection implements Factory {
            @Override // ai.onnxruntime.telemetry.HttpClientRequest.Factory
            public HttpClientRequest create(@NonNull HttpClient httpClient, String str, String str2, byte[] bArr, String str3, @NonNull Headers headers) throws IOException {
                return new Request(httpClient, str, str2, bArr, str3, headers);
            }
        }

        HttpClientRequest create(@NonNull HttpClient httpClient, String str, String str2, byte[] bArr, String str3, @NonNull Headers headers) throws IOException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class HeaderEntry {
        public final String key;
        public final String value;

        public HeaderEntry(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Headers implements Iterator<HeaderEntry> {
        private final byte[] buffer;
        private final int[] header_lengths;
        public final int length;
        private int current = 0;
        private int offset = 0;

        public Headers(int[] iArr, byte[] bArr) {
            this.length = iArr.length;
            this.header_lengths = iArr;
            this.buffer = bArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current + 2 <= this.length;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public HeaderEntry next() {
            byte[] bArr = this.buffer;
            int i = this.offset;
            int i2 = this.header_lengths[this.current];
            Charset charset = StandardCharsets.UTF_8;
            String str = new String(bArr, i, i2, charset);
            int i3 = this.offset;
            int[] iArr = this.header_lengths;
            int i4 = this.current;
            int i5 = i3 + iArr[i4];
            this.offset = i5;
            String str2 = new String(this.buffer, i5, iArr[i4 + 1], charset);
            int i6 = this.offset;
            int[] iArr2 = this.header_lengths;
            int i7 = this.current;
            this.offset = i6 + iArr2[i7 + 1];
            this.current = i7 + 2;
            return new HeaderEntry(str, str2);
        }
    }
}
