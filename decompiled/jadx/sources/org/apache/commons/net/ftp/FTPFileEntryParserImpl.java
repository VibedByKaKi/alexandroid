package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class FTPFileEntryParserImpl implements FTPFileEntryParser {
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public String readNextEntry(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine();
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        return list;
    }
}
