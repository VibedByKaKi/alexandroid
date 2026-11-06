package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class PEM {
    private static final String BEGIN_MARKER = "-----BEGIN ";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazonaws.mobileconnectors.iot.PEM$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobileconnectors$iot$PEMObjectType;

        static {
            int[] iArr = new int[PEMObjectType.values().length];
            $SwitchMap$com$amazonaws$mobileconnectors$iot$PEMObjectType = iArr;
            try {
                iArr[PEMObjectType.PRIVATE_KEY_PKCS1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private PEM() {
    }

    public static List<PEMObject> readPEMObjects(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StringUtils.UTF8));
        String str = null;
        boolean z = false;
        StringBuffer stringBuffer = null;
        String str2 = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return arrayList;
                }
                if (z) {
                    if (readLine.indexOf(str) != -1) {
                        arrayList.add(new PEMObject(str2, Base64.decode(stringBuffer.toString())));
                        z = false;
                    } else {
                        stringBuffer.append(readLine.trim());
                    }
                } else if (readLine.indexOf(BEGIN_MARKER) != -1) {
                    str2 = readLine.trim();
                    str = str2.replace("BEGIN", "END");
                    stringBuffer = new StringBuffer();
                    z = true;
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
    }

    public static PrivateKey readPrivateKey(InputStream inputStream) throws InvalidKeySpecException, IOException {
        for (PEMObject pEMObject : readPEMObjects(inputStream)) {
            if (AnonymousClass1.$SwitchMap$com$amazonaws$mobileconnectors$iot$PEMObjectType[pEMObject.getPEMObjectType().ordinal()] == 1) {
                return RSA.privateKeyFromPKCS1(pEMObject.getDerBytes());
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Found no private key");
        return null;
    }
}
