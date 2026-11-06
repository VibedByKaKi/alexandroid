package com.amazon.whispercloak.keygen;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whispercloak.keygen.provider.EcdhKeyFactoryProvider;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.bouncycastle.util.io.pem.PemWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PemPublicKeyCoder {
    private KeyFactory mKeyFactory;

    public PemPublicKeyCoder() {
        this(new EcdhKeyFactoryProvider().getKeyFactory());
    }

    private void closeQuitely(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public PublicKey decode(String str) throws InvalidKeySpecException {
        Closeable closeable;
        IOException e;
        StringReader stringReader;
        Closeable closeable2 = null;
        try {
            try {
                stringReader = new StringReader(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            closeQuitely(closeable2, closeable);
            throw th;
        }
        try {
            PemReader pemReader = new PemReader(stringReader);
            try {
                PemObject readPemObject = pemReader.readPemObject();
                if (readPemObject == null) {
                    throw new InvalidKeySpecException("Key decode error. Not a valid PEM-coded key");
                }
                PublicKey generatePublic = this.mKeyFactory.generatePublic(new X509EncodedKeySpec(readPemObject.getContent()));
                closeQuitely(stringReader, pemReader);
                return generatePublic;
            } catch (IOException e3) {
                e = e3;
                throw new InvalidKeySpecException("Failed to read encoded key (" + str + MarkdownConstants.RIGHT_PARENTHESIS, e);
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            closeable2 = stringReader;
            closeQuitely(closeable2, closeable);
            throw th;
        }
    }

    public String encode(PublicKey publicKey) {
        PemWriter pemWriter;
        StringWriter stringWriter;
        Closeable closeable = null;
        try {
            stringWriter = new StringWriter();
            try {
                pemWriter = new PemWriter(stringWriter);
            } catch (IOException e) {
                e = e;
                pemWriter = null;
            } catch (Throwable th) {
                th = th;
                pemWriter = null;
            }
        } catch (IOException e2) {
            e = e2;
            pemWriter = null;
        } catch (Throwable th2) {
            th = th2;
            pemWriter = null;
        }
        try {
            pemWriter.writeObject(new PemObject("PUBLIC KEY", publicKey.getEncoded()));
            pemWriter.flush();
            String stringWriter2 = stringWriter.toString();
            closeQuitely(stringWriter, pemWriter);
            return stringWriter2;
        } catch (IOException e3) {
            e = e3;
            closeable = stringWriter;
            try {
                throw new RuntimeException("Can not PEM-encode Public key", e);
            } catch (Throwable th3) {
                th = th3;
                closeQuitely(closeable, pemWriter);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = stringWriter;
            closeQuitely(closeable, pemWriter);
            throw th;
        }
    }

    public PemPublicKeyCoder(KeyFactory keyFactory) {
        this.mKeyFactory = keyFactory;
    }
}
