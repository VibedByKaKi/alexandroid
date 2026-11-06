package org.apache.commons.io.input;

import com.amazonaws.services.s3.util.Mimetypes;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class XmlStreamReader extends Reader {
    private static final String HTTP_EX_1 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String HTTP_EX_2 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String HTTP_EX_3 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String RAW_EX_2 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String US_ASCII = "US-ASCII";
    private static final String UTF_16 = "UTF-16";
    private static final String UTF_16BE = "UTF-16BE";
    private static final String UTF_16LE = "UTF-16LE";
    private static final String UTF_32 = "UTF-32";
    private static final String UTF_8 = "UTF-8";
    private final String defaultEncoding;
    private final String encoding;
    private final Reader reader;
    private static final ByteOrderMark[] BOMS = {ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE};
    private static final String UTF_32BE = "UTF-32BE";
    private static final String UTF_32LE = "UTF-32LE";
    private static final String EBCDIC = "CP1047";
    private static final ByteOrderMark[] XML_GUESS_BYTES = {new ByteOrderMark("UTF-8", 60, 63, 120, 109), new ByteOrderMark("UTF-16BE", 0, 60, 0, 63), new ByteOrderMark("UTF-16LE", 60, 0, 63, 0), new ByteOrderMark(UTF_32BE, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new ByteOrderMark(UTF_32LE, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new ByteOrderMark(EBCDIC, 76, 111, 167, 148)};
    private static final Pattern CHARSET_PATTERN = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    public XmlStreamReader(URLConnection uRLConnection, String str) throws IOException {
        Objects.requireNonNull(uRLConnection, "conn");
        this.defaultEncoding = str;
        String contentType = uRLConnection.getContentType();
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(uRLConnection.getInputStream(), 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        if ((uRLConnection instanceof HttpURLConnection) || contentType != null) {
            this.encoding = processHttpStream(bOMInputStream, bOMInputStream2, contentType, true);
        } else {
            this.encoding = doRawStream(bOMInputStream, bOMInputStream2, true);
        }
        this.reader = new InputStreamReader(bOMInputStream2, this.encoding);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String doLenientDetection(java.lang.String r8, org.apache.commons.io.input.XmlStreamReaderException r9) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto L30
            java.lang.String r0 = "text/html"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L30
            r0 = 9
            java.lang.String r8 = r8.substring(r0)
            java.lang.String r0 = "text/xml"
            java.lang.String r2 = r0.concat(r8)
            java.lang.String r3 = r9.getBomEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L2d
            java.lang.String r4 = r9.getXmlGuessEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L2d
            java.lang.String r5 = r9.getXmlEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L2d
            r6 = 1
            r1 = r7
            java.lang.String r7 = r1.calculateHttpEncoding(r2, r3, r4, r5, r6)     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L29
            return r7
        L29:
            r0 = move-exception
        L2a:
            r7 = r0
            r9 = r7
            goto L31
        L2d:
            r0 = move-exception
            r1 = r7
            goto L2a
        L30:
            r1 = r7
        L31:
            java.lang.String r7 = r9.getXmlEncoding()
            if (r7 != 0) goto L3b
            java.lang.String r7 = r9.getContentTypeEncoding()
        L3b:
            if (r7 != 0) goto L43
            java.lang.String r7 = r1.defaultEncoding
            if (r7 != 0) goto L43
            java.lang.String r7 = "UTF-8"
        L43:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.doLenientDetection(java.lang.String, org.apache.commons.io.input.XmlStreamReaderException):java.lang.String");
    }

    private String doRawStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z) throws IOException {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return calculateRawEncoding(bOMCharsetName, bOMCharsetName2, getXmlProlog(bOMInputStream2, bOMCharsetName2));
        } catch (XmlStreamReaderException e) {
            if (z) {
                return this.doLenientDetection(null, e);
            }
            throw e;
        }
    }

    public static String getContentTypeEncoding(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(";")) > -1) {
            Matcher matcher = CHARSET_PATTERN.matcher(str.substring(indexOf + 1));
            String group = matcher.find() ? matcher.group(1) : null;
            if (group != null) {
                return group.toUpperCase(Locale.ROOT);
            }
        }
        return null;
    }

    public static String getContentTypeMime(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(";");
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        okio.Buffer$$ExternalSyntheticBUOutline0.m$2("Unexpected end of XML stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        okio.Buffer$$ExternalSyntheticBUOutline0.m$2(defpackage.a$$ExternalSyntheticOutline0.m(r7, "XML prolog or ROOT element not found on first ", " bytes"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r3 != (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getXmlProlog(java.io.InputStream r9, java.lang.String r10) throws java.io.IOException {
        /*
            if (r10 == 0) goto L85
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray()
            r1 = 8192(0x2000, float:1.148E-41)
            r9.mark(r1)
            r2 = 0
            int r3 = r9.read(r0, r2, r1)
            r4 = -1
            java.lang.String r5 = ""
            r8 = r1
            r7 = r2
            r6 = r4
        L16:
            if (r3 == r4) goto L2e
            if (r6 != r4) goto L2e
            if (r7 >= r1) goto L2e
            int r7 = r7 + r3
            int r8 = r8 - r3
            int r3 = r9.read(r0, r7, r8)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2, r7, r10)
            r6 = 62
            int r6 = r5.indexOf(r6)
            goto L16
        L2e:
            if (r6 != r4) goto L46
            if (r3 != r4) goto L39
            java.lang.String r9 = "Unexpected end of XML stream"
            okio.Buffer$$ExternalSyntheticBUOutline0.m$2(r9)
            r9 = 0
            return r9
        L39:
            java.lang.String r9 = "XML prolog or ROOT element not found on first "
            java.lang.String r10 = " bytes"
            java.lang.String r9 = defpackage.a$$ExternalSyntheticOutline0.m(r7, r9, r10)
            okio.Buffer$$ExternalSyntheticBUOutline0.m$2(r9)
            r9 = 0
            return r9
        L46:
            if (r7 <= 0) goto L85
            r9.reset()
            java.io.BufferedReader r9 = new java.io.BufferedReader
            java.io.StringReader r10 = new java.io.StringReader
            r0 = 1
            int r6 = r6 + r0
            java.lang.String r1 = r5.substring(r2, r6)
            r10.<init>(r1)
            r9.<init>(r10)
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
        L60:
            java.lang.String r1 = r9.readLine()
            if (r1 == 0) goto L6a
            r10.append(r1)
            goto L60
        L6a:
            java.util.regex.Pattern r9 = org.apache.commons.io.input.XmlStreamReader.ENCODING_PATTERN
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r10 = r9.find()
            if (r10 == 0) goto L85
            java.lang.String r9 = r9.group(r0)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r10)
            java.lang.String r9 = androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0.m(r0, r0, r9)
            return r9
        L85:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.getXmlProlog(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static boolean isAppXml(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals(Mimetypes.MIMETYPE_XML) || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity")) {
            return true;
        }
        return str.startsWith("application/") && str.endsWith("+xml");
    }

    public static boolean isTextXml(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity")) {
            return true;
        }
        return str.startsWith("text/") && str.endsWith("+xml");
    }

    private String processHttpStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, String str, boolean z) throws IOException {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return calculateHttpEncoding(str, bOMCharsetName, bOMCharsetName2, getXmlProlog(bOMInputStream2, bOMCharsetName2), z);
        } catch (XmlStreamReaderException e) {
            if (z) {
                return doLenientDetection(str, e);
            }
            throw e;
        }
    }

    public String calculateHttpEncoding(String str, String str2, String str3, String str4, boolean z) throws IOException {
        if (z && str4 != null) {
            return str4;
        }
        String contentTypeMime = getContentTypeMime(str);
        String contentTypeEncoding = getContentTypeEncoding(str);
        boolean isAppXml = isAppXml(contentTypeMime);
        boolean isTextXml = isTextXml(contentTypeMime);
        if (!isAppXml && !isTextXml) {
            throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_3, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
        }
        if (contentTypeEncoding == null) {
            if (isAppXml) {
                return calculateRawEncoding(str2, str3, str4);
            }
            String str5 = this.defaultEncoding;
            return str5 == null ? "US-ASCII" : str5;
        }
        if (contentTypeEncoding.equals("UTF-16BE") || contentTypeEncoding.equals("UTF-16LE")) {
            if (str2 != null) {
                throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_1, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
            }
        } else {
            if (contentTypeEncoding.equals("UTF-16")) {
                if (str2 == null || !str2.startsWith("UTF-16")) {
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_2, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
                }
                return str2;
            }
            if (contentTypeEncoding.equals(UTF_32BE) || contentTypeEncoding.equals(UTF_32LE)) {
                if (str2 != null) {
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_1, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
                }
            } else if (contentTypeEncoding.equals(UTF_32)) {
                if (str2 == null || !str2.startsWith(UTF_32)) {
                    throw new XmlStreamReaderException(MessageFormat.format(HTTP_EX_2, contentTypeMime, contentTypeEncoding, str2, str3, str4), contentTypeMime, contentTypeEncoding, str2, str3, str4);
                }
                return str2;
            }
        }
        return contentTypeEncoding;
    }

    public String calculateRawEncoding(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (str3.equals("UTF-16") && (str2.equals("UTF-16BE") || str2.equals("UTF-16LE"))) ? str2 : str3;
            }
            String str4 = this.defaultEncoding;
            return str4 == null ? "UTF-8" : str4;
        }
        if (str.equals("UTF-8")) {
            if (str2 != null && !str2.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        } else if (str.equals("UTF-16BE") || str.equals("UTF-16LE")) {
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-16") && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        } else {
            if (!str.equals(UTF_32BE) && !str.equals(UTF_32LE)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_2, str, str2, str3), str, str2, str3);
            }
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(UTF_32) && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format(RAW_EX_1, str, str2, str3), str, str2, str3);
            }
        }
        return str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    public String getDefaultEncoding() {
        return this.defaultEncoding;
    }

    public String getEncoding() {
        return this.encoding;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return this.reader.read(cArr, i, i2);
    }

    public XmlStreamReader(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public XmlStreamReader(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, (String) null);
    }

    public XmlStreamReader(InputStream inputStream, boolean z, String str) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        this.defaultEncoding = str;
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        String doRawStream = doRawStream(bOMInputStream, bOMInputStream2, z);
        this.encoding = doRawStream;
        this.reader = new InputStreamReader(bOMInputStream2, doRawStream);
    }

    public XmlStreamReader(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true);
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z) throws IOException {
        this(inputStream, str, z, null);
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z, String str2) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        this.defaultEncoding = str2;
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, BOMS);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, XML_GUESS_BYTES);
        String processHttpStream = processHttpStream(bOMInputStream, bOMInputStream2, str, z);
        this.encoding = processHttpStream;
        this.reader = new InputStreamReader(bOMInputStream2, processHttpStream);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(Path path) throws IOException {
        this(Files.newInputStream(path, new OpenOption[0]));
        Objects.requireNonNull(path, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(URL url) throws IOException {
        this(url.openConnection(), (String) null);
        Objects.requireNonNull(url, "url");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(File file) throws IOException {
        this(file.toPath());
        Objects.requireNonNull(file, "file");
    }
}
