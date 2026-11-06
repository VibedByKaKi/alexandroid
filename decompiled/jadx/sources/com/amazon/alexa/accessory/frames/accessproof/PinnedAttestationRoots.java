package com.amazon.alexa.accessory.frames.accessproof;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.whispercloak.KeyUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PinnedAttestationRoots {
    private static final String BEGIN = "-----BEGIN CERTIFICATE-----";
    private static final String END = "-----END CERTIFICATE-----";

    @VisibleForTesting
    static final int MAX_ROOTS = 8;

    @VisibleForTesting
    static final String ROOTS_ASSET = "accessproof/google_hardware_attestation_roots.pem";
    private static final String TAG = "PinnedAttestationRoots";

    private PinnedAttestationRoots() {
        throw new IllegalStateException("No instances!");
    }

    public static List<X509Certificate> fromAssets(Context context) {
        if (context == null) {
            Log.w(TAG, "no context; no roots pinned, so all attestation chains will be denied");
            return Collections.EMPTY_LIST;
        }
        try {
            InputStream open = context.getAssets().open(ROOTS_ASSET);
            try {
                List<X509Certificate> parse = parse(readAll(open));
                if (parse.isEmpty()) {
                    Log.w(TAG, "%s contained no certificates; all attestation chains will be denied", ROOTS_ASSET);
                } else {
                    Log.i(TAG, "pinned %d attestation root(s)", Integer.valueOf(parse.size()));
                }
                if (open == null) {
                    return parse;
                }
                open.close();
                return parse;
            } catch (Throwable th) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            Log.w(TAG, "%s is not present or not readable (%s); all attestation chains will be denied", ROOTS_ASSET, e.getMessage());
            return Collections.EMPTY_LIST;
        } catch (RuntimeException e2) {
            Log.e(TAG, "failed to load %s; all attestation chains will be denied", ROOTS_ASSET, e2);
            return Collections.EMPTY_LIST;
        }
    }

    @VisibleForTesting
    public static List<X509Certificate> parse(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(KeyUtils.X509_CERITIFATE_FACTORY);
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(BEGIN, i);
                if (indexOf < 0) {
                    return Collections.unmodifiableList(arrayList);
                }
                int indexOf2 = str.indexOf(END, indexOf);
                if (indexOf2 < 0) {
                    Log.e(TAG, "unterminated PEM block in %s", ROOTS_ASSET);
                    return Collections.EMPTY_LIST;
                }
                if (arrayList.size() >= 8) {
                    Log.e(TAG, "%s holds more than %d certificates", ROOTS_ASSET, 8);
                    return Collections.EMPTY_LIST;
                }
                arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.getDecoder().decode(str.substring(indexOf + 27, indexOf2).replaceAll("\\s", "")))));
                i = indexOf2 + 25;
            }
        } catch (Exception e) {
            Log.e(TAG, "malformed certificate in %s: %s", ROOTS_ASSET, e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    private static String readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.US_ASCII);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
