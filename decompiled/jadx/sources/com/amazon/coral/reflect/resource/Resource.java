package com.amazon.coral.reflect.resource;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLStreamHandler;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Resource implements Comparable<Resource>, Serializable {
    private final long date;
    private volatile File file;
    private volatile String path;
    private final long size;
    private final URI uri;
    private volatile transient URL url;
    private static final URI STDIN_URI = newStdinURI();
    private static final URI MALFORMED_URI = newMalformedURI();
    private static final File MALFORMED_FILE = newMalformedFile();

    public Resource(String str, long j, long j2) {
        URI uri;
        if (str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        String replace = replace(str, " ", "%20");
        try {
            uri = new URI(replace);
            if (j < 0 || j2 < 0) {
                long[] info = getInfo(uri);
                j = j < 0 ? info[0] : j;
                if (j2 < 0) {
                    j2 = info[1];
                }
            }
            if ("-".equals(replace)) {
                uri = STDIN_URI;
            }
        } catch (URISyntaxException unused) {
            uri = MALFORMED_URI;
        }
        this.uri = uri.normalize();
        this.date = j;
        this.size = j2;
    }

    private static long[] getInfo(URI uri) {
        long j;
        long j2;
        long j3 = -1;
        if ("file".equals(uri.getScheme())) {
            try {
                File canonicalFile = new File(URLDecoder.decode(uri.getSchemeSpecificPart(), "UTF-8")).getCanonicalFile();
                j = canonicalFile.lastModified();
                try {
                    j3 = canonicalFile.length();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                j = -1;
            }
            long j4 = j;
            j2 = j3;
            j3 = j4;
        } else {
            j2 = -1;
        }
        return new long[]{j3, j2};
    }

    private static File newMalformedFile() {
        return new File(File.separator);
    }

    private static URI newMalformedURI() {
        try {
            return new URI("malformed:*");
        } catch (URISyntaxException e) {
            throw new Error("Could not initialize Resource class", e);
        }
    }

    private static URI newStdinURI() {
        try {
            return new URI("stdin:-");
        } catch (URISyntaxException e) {
            throw new Error("Could not initialize Resource class", e);
        }
    }

    private URL newURL(URI uri) {
        try {
            return new URL(new URL("file:"), uri.toString(), new URLStreamHandler() { // from class: com.amazon.coral.reflect.resource.Resource.1
                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url) throws IOException {
                    return Resource.this.openConnection(url);
                }
            });
        } catch (MalformedURLException e) {
            throw new Error("Could not initialize Resource class", e);
        }
    }

    private static String replace(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        if (str2 == null || str3 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int indexOf = str.indexOf(str2);
        int length = str2.length();
        int i = 0;
        while (indexOf >= 0) {
            sb.append(str.substring(i, indexOf));
            sb.append(str3);
            i = indexOf + length;
            indexOf = str.indexOf(str2, i);
        }
        return a$$ExternalSyntheticOutline0.m(str, i, sb);
    }

    private static String toString(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private static URI toURI(File file) {
        if (file != null) {
            return file.toURI();
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(Resource resource) {
        return getDate() < resource.getDate() ? -((int) getDate()) : getDate() > resource.getDate() ? (int) getDate() : getSize() < resource.getSize() ? -((int) getSize()) : getSize() > resource.getSize() ? (int) getSize() : toURI().compareTo(resource.toURI());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Resource) && compareTo((Resource) obj) == 0;
    }

    public long getDate() {
        return this.date;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        return toURI().hashCode();
    }

    public boolean isMalformed() {
        return toURI() == MALFORMED_URI;
    }

    public URLConnection openConnection(URL url) throws IOException {
        throw new UnsupportedOperationException(url.getProtocol() + " has no stream support");
    }

    public InputStream openStream() throws IOException {
        if (toURI().equals(STDIN_URI)) {
            return System.in;
        }
        try {
            return toURI().toURL().openStream();
        } catch (IOException e) {
            throw new IOException("Can't open " + this.toString(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r0 = com.amazon.coral.reflect.resource.Resource.MALFORMED_FILE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r5.file = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File toFile() {
        /*
            r5 = this;
            java.io.File r0 = r5.file
            r1 = 0
            if (r0 != 0) goto L56
            java.net.URI r2 = r5.toURI()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "file:"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            if (r3 == 0) goto L1b
            r3 = 5
            java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            goto L33
        L1b:
            java.lang.String r3 = "jar:file:"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            if (r3 == 0) goto L32
            java.lang.String r3 = "!/"
            int r3 = r2.indexOf(r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            if (r3 <= 0) goto L32
            r4 = 9
            java.lang.String r2 = r2.substring(r4, r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            goto L33
        L32:
            r2 = r1
        L33:
            if (r2 == 0) goto L44
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            java.lang.String r4 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r4)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            java.io.File r0 = r3.getCanonicalFile()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
        L44:
            if (r0 != 0) goto L4e
        L46:
            java.io.File r0 = com.amazon.coral.reflect.resource.Resource.MALFORMED_FILE
            goto L4e
        L49:
            r5 = move-exception
            throw r5
        L4b:
            if (r0 != 0) goto L4e
            goto L46
        L4e:
            monitor-enter(r5)
            r5.file = r0     // Catch: java.lang.Throwable -> L53
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
            goto L56
        L53:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
            throw r0
        L56:
            java.io.File r5 = com.amazon.coral.reflect.resource.Resource.MALFORMED_FILE
            if (r0 != r5) goto L5b
            goto L5c
        L5b:
            r1 = r0
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.reflect.resource.Resource.toFile():java.io.File");
    }

    public String toPath() {
        int i;
        String str = this.path;
        if (str != null) {
            return str;
        }
        String resource = toString();
        int length = resource.length();
        if (resource.startsWith("file:")) {
            i = 5;
            if (resource.endsWith(".jar") || resource.endsWith("zip")) {
                i = Math.max(resource.lastIndexOf(47) + 1, 5);
            }
        } else if (!resource.startsWith("jar:file:")) {
            i = -1;
        } else if (resource.endsWith("!/")) {
            int length2 = resource.length();
            i = Math.max(resource.lastIndexOf(47, length2 - 3) + 1, 9);
            length = length2 - 2;
        } else {
            i = resource.indexOf("!/") + 2;
        }
        if (i < 0) {
            return resource;
        }
        if (i < length && resource.charAt(i) == '/') {
            i++;
        }
        String substring = resource.substring(i, length);
        synchronized (this) {
            this.path = onPath(substring);
        }
        return substring;
    }

    public URL toURL() {
        URL url = this.url;
        if (url != null) {
            return url;
        }
        URL newURL = newURL(toURI());
        synchronized (this) {
            try {
                if (this.url != null) {
                    this.url = newURL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return newURL;
    }

    public String toString() {
        return toURI().toString();
    }

    public URI toURI() {
        return this.uri;
    }

    public String onPath(String str) {
        return str;
    }

    public Resource(URI uri) {
        this(toString(uri));
    }

    public Resource(URL url) {
        this(toString(url));
    }

    public Resource(URL url, long j, long j2) {
        this(toString(url), j, j2);
    }

    public Resource(String str) {
        this(str, -1L, -1L);
    }

    public Resource(File file) {
        this(toString(toURI(file)), file.lastModified(), file.length());
    }
}
