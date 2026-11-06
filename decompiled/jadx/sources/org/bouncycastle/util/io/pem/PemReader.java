package org.bouncycastle.util.io.pem;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes11.dex */
public class PemReader extends BufferedReader {
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) throws IOException {
        String readLine;
        String m = a$$ExternalSyntheticOutline0.m(END, str);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(58);
            if (indexOf >= 0) {
                arrayList.add(new PemHeader(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else {
                if (readLine.indexOf(m) != -1) {
                    break;
                }
                stringBuffer.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new PemObject(str, arrayList, Base64.decode(stringBuffer.toString()));
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(m.concat(" not found"));
        return null;
    }

    public PemObject readPemObject() throws IOException {
        String readLine;
        String substring;
        int indexOf;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith(BEGIN));
        if (readLine == null || (indexOf = (substring = readLine.substring(11)).indexOf(45)) <= 0 || !substring.endsWith("-----") || substring.length() - indexOf != 5) {
            return null;
        }
        return loadObject(substring.substring(0, indexOf));
    }
}
