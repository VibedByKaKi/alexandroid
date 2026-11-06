package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FTPFileFilters {
    public static final FTPFileFilter ALL = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters.1
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public boolean accept(FTPFile fTPFile) {
            return true;
        }
    };
    public static final FTPFileFilter NON_NULL = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters.2
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public boolean accept(FTPFile fTPFile) {
            return fTPFile != null;
        }
    };
    public static final FTPFileFilter DIRECTORIES = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters.3
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public boolean accept(FTPFile fTPFile) {
            return fTPFile != null && fTPFile.isDirectory();
        }
    };
}
