package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaCodecDecoderException(java.lang.Throwable r4, @androidx.annotation.Nullable androidx.media3.exoplayer.mediacodec.MediaCodecInfo r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r5 != 0) goto Lc
            r2 = r1
            goto Le
        Lc:
            java.lang.String r2 = r5.name
        Le:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.codecInfo = r5
            boolean r5 = r4 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L25
            r5 = r4
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            java.lang.String r1 = r5.getDiagnosticInfo()
        L25:
            r3.diagnosticInfo = r1
            int r5 = androidx.media3.common.util.Util.SDK_INT
            r0 = 23
            if (r5 < r0) goto L32
            int r4 = getErrorCodeV23(r4)
            goto L36
        L32:
            int r4 = androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(r1)
        L36:
            r3.errorCode = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, androidx.media3.exoplayer.mediacodec.MediaCodecInfo):void");
    }

    @RequiresApi(23)
    private static int getErrorCodeV23(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
