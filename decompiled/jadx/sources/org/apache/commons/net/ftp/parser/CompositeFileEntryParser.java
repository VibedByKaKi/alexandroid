package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParser;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CompositeFileEntryParser extends FTPFileEntryParserImpl {
    private FTPFileEntryParser cachedFtpFileEntryParser = null;
    private final FTPFileEntryParser[] ftpFileEntryParsers;

    public CompositeFileEntryParser(FTPFileEntryParser[] fTPFileEntryParserArr) {
        this.ftpFileEntryParsers = fTPFileEntryParserArr;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        FTPFileEntryParser fTPFileEntryParser = this.cachedFtpFileEntryParser;
        if (fTPFileEntryParser != null) {
            FTPFile parseFTPEntry = fTPFileEntryParser.parseFTPEntry(str);
            if (parseFTPEntry != null) {
                return parseFTPEntry;
            }
            return null;
        }
        for (FTPFileEntryParser fTPFileEntryParser2 : this.ftpFileEntryParsers) {
            FTPFile parseFTPEntry2 = fTPFileEntryParser2.parseFTPEntry(str);
            if (parseFTPEntry2 != null) {
                this.cachedFtpFileEntryParser = fTPFileEntryParser2;
                return parseFTPEntry2;
            }
        }
        return null;
    }
}
