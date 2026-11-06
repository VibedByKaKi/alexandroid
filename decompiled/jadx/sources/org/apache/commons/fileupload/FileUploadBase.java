package org.apache.commons.fileupload;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.commons.fileupload.util.Closeable;
import org.apache.commons.fileupload.util.FileItemHeadersImpl;
import org.apache.commons.fileupload.util.LimitedInputStream;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.io.IOUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class FileUploadBase {
    public static final String ATTACHMENT = "attachment";
    public static final String CONTENT_DISPOSITION = "Content-disposition";
    public static final String CONTENT_LENGTH = "Content-length";
    public static final String CONTENT_TYPE = "Content-type";
    public static final String FORM_DATA = "form-data";

    @Deprecated
    public static final int MAX_HEADER_SIZE = 1024;
    public static final String MULTIPART = "multipart/";
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
    public static final String MULTIPART_MIXED = "multipart/mixed";
    private String headerEncoding;
    private ProgressListener listener;
    private long sizeMax = -1;
    private long fileSizeMax = -1;
    private long fileCountMax = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class FileItemIteratorImpl implements FileItemIterator {
        private final byte[] boundary;
        private String currentFieldName;
        private FileItemStreamImpl currentItem;
        private boolean eof;
        private boolean itemValid;
        private final MultipartStream multi;
        private final MultipartStream.ProgressNotifier notifier;
        private boolean skipPreamble;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class FileItemStreamImpl implements FileItemStream {
            private final String contentType;
            private final String fieldName;
            private final boolean formField;
            private FileItemHeaders headers;
            private final String name;
            private boolean opened;
            private final InputStream stream;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v0, types: [org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl$FileItemStreamImpl$1] */
            public FileItemStreamImpl(String str, String str2, String str3, boolean z, long j) throws IOException {
                this.name = str;
                this.fieldName = str2;
                this.contentType = str3;
                this.formField = z;
                if (FileUploadBase.this.fileSizeMax == -1 || j == -1 || j <= FileUploadBase.this.fileSizeMax) {
                    final MultipartStream.ItemInputStream newInputStream = FileItemIteratorImpl.this.multi.newInputStream();
                    this.stream = FileUploadBase.this.fileSizeMax != -1 ? new LimitedInputStream(newInputStream, FileUploadBase.this.fileSizeMax) { // from class: org.apache.commons.fileupload.FileUploadBase.FileItemIteratorImpl.FileItemStreamImpl.1
                        @Override // org.apache.commons.fileupload.util.LimitedInputStream
                        public void raiseError(long j2, long j3) throws IOException {
                            newInputStream.close(true);
                            StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("The field ", FileItemStreamImpl.this.fieldName, " exceeds its maximum permitted size of ", j2);
                            m.append(" bytes.");
                            FileSizeLimitExceededException fileSizeLimitExceededException = new FileSizeLimitExceededException(m.toString(), j3, j2);
                            fileSizeLimitExceededException.setFieldName(FileItemStreamImpl.this.fieldName);
                            fileSizeLimitExceededException.setFileName(FileItemStreamImpl.this.name);
                            throw new FileUploadIOException(fileSizeLimitExceededException);
                        }
                    } : newInputStream;
                    return;
                }
                StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("The field ", str2, " exceeds its maximum permitted size of ", FileUploadBase.this.fileSizeMax);
                m.append(" bytes.");
                FileSizeLimitExceededException fileSizeLimitExceededException = new FileSizeLimitExceededException(m.toString(), j, FileUploadBase.this.fileSizeMax);
                fileSizeLimitExceededException.setFileName(str);
                fileSizeLimitExceededException.setFieldName(str2);
                throw new FileUploadIOException(fileSizeLimitExceededException);
            }

            public void close() throws IOException {
                this.stream.close();
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public String getContentType() {
                return this.contentType;
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public String getFieldName() {
                return this.fieldName;
            }

            @Override // org.apache.commons.fileupload.FileItemHeadersSupport
            public FileItemHeaders getHeaders() {
                return this.headers;
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public String getName() {
                return Streams.checkFileName(this.name);
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public boolean isFormField() {
                return this.formField;
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public InputStream openStream() throws IOException {
                if (this.opened) {
                    Single$$ExternalSyntheticBUOutline0.m$2("The stream was already opened.");
                    return null;
                }
                if (((Closeable) this.stream).isClosed()) {
                    throw new FileItemStream.ItemSkippedException();
                }
                return this.stream;
            }

            @Override // org.apache.commons.fileupload.FileItemHeadersSupport
            public void setHeaders(FileItemHeaders fileItemHeaders) {
                this.headers = fileItemHeaders;
            }
        }

        public FileItemIteratorImpl(RequestContext requestContext) throws FileUploadException, IOException {
            FileItemIteratorImpl fileItemIteratorImpl;
            final FileUploadBase fileUploadBase;
            InputStream inputStream;
            if (requestContext == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("ctx parameter");
                throw null;
            }
            String contentType = requestContext.getContentType();
            if (contentType == null || !contentType.toLowerCase(Locale.ENGLISH).startsWith(FileUploadBase.MULTIPART)) {
                throw new InvalidContentTypeException(a$$ExternalSyntheticOutline0.m("the request doesn't contain a multipart/form-data or multipart/mixed stream, content type header is ", contentType));
            }
            long contentLength = UploadContext.class.isAssignableFrom(requestContext.getClass()) ? ((UploadContext) requestContext).contentLength() : requestContext.getContentLength();
            if (FileUploadBase.this.sizeMax < 0) {
                fileItemIteratorImpl = this;
                fileUploadBase = FileUploadBase.this;
                inputStream = requestContext.getInputStream();
            } else {
                if (contentLength != -1 && contentLength > FileUploadBase.this.sizeMax) {
                    throw new SizeLimitExceededException(a$$ExternalSyntheticOutline0.m(FileUploadBase.this.sizeMax, MarkdownConstants.RIGHT_PARENTHESIS, a$$ExternalSyntheticOutline0.m("the request was rejected because its size (", contentLength, ") exceeds the configured maximum (")), contentLength, FileUploadBase.this.sizeMax);
                }
                fileItemIteratorImpl = this;
                fileUploadBase = FileUploadBase.this;
                inputStream = new LimitedInputStream(requestContext.getInputStream(), FileUploadBase.this.sizeMax) { // from class: org.apache.commons.fileupload.FileUploadBase.FileItemIteratorImpl.1
                    @Override // org.apache.commons.fileupload.util.LimitedInputStream
                    public void raiseError(long j, long j2) throws IOException {
                        throw new FileUploadIOException(new SizeLimitExceededException(a$$ExternalSyntheticOutline0.m(j, MarkdownConstants.RIGHT_PARENTHESIS, a$$ExternalSyntheticOutline0.m("the request was rejected because its size (", j2, ") exceeds the configured maximum (")), j2, j));
                    }
                };
            }
            String str = fileUploadBase.headerEncoding;
            str = str == null ? requestContext.getCharacterEncoding() : str;
            byte[] boundary = fileUploadBase.getBoundary(contentType);
            fileItemIteratorImpl.boundary = boundary;
            if (boundary == null) {
                IOUtils.closeQuietly(inputStream);
                throw new FileUploadException("the request was rejected because no multipart boundary was found");
            }
            MultipartStream.ProgressNotifier progressNotifier = new MultipartStream.ProgressNotifier(fileUploadBase.listener, contentLength);
            fileItemIteratorImpl.notifier = progressNotifier;
            try {
                MultipartStream multipartStream = new MultipartStream(inputStream, boundary, progressNotifier);
                fileItemIteratorImpl.multi = multipartStream;
                multipartStream.setHeaderEncoding(str);
                fileItemIteratorImpl.skipPreamble = true;
                fileItemIteratorImpl.findNextItem();
            } catch (IllegalArgumentException e) {
                IOUtils.closeQuietly(inputStream);
                throw new InvalidContentTypeException("The boundary specified in the Content-type header is too long", e);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        
            r0 = r10.this$0.getFileName(r9);
            r6 = r2;
            r4 = r9.getHeader(org.apache.commons.fileupload.FileUploadBase.CONTENT_TYPE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        
            r0 = new org.apache.commons.fileupload.FileUploadBase.FileItemIteratorImpl.FileItemStreamImpl(r10, r0, r3, r4, r5, getContentLength(r9));
            r10.currentItem = r0;
            r0.setHeaders(r9);
            r10.notifier.noteItem();
            r10.itemValid = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        
            r5 = r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean findNextItem() throws java.io.IOException {
            /*
                r10 = this;
                boolean r0 = r10.eof
                r2 = 0
                if (r0 == 0) goto L6
                return r2
            L6:
                org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl$FileItemStreamImpl r0 = r10.currentItem
                r3 = 0
                if (r0 == 0) goto L10
                r0.close()
                r10.currentItem = r3
            L10:
                boolean r0 = r10.skipPreamble
                org.apache.commons.fileupload.MultipartStream r4 = r10.multi
                if (r0 == 0) goto L1b
                boolean r0 = r4.skipPreamble()
                goto L1f
            L1b:
                boolean r0 = r4.readBoundary()
            L1f:
                r8 = 1
                if (r0 != 0) goto L33
                java.lang.String r0 = r10.currentFieldName
                if (r0 != 0) goto L29
                r10.eof = r8
                return r2
            L29:
                org.apache.commons.fileupload.MultipartStream r0 = r10.multi
                byte[] r4 = r10.boundary
                r0.setBoundary(r4)
                r10.currentFieldName = r3
                goto L10
            L33:
                org.apache.commons.fileupload.FileUploadBase r0 = org.apache.commons.fileupload.FileUploadBase.this
                org.apache.commons.fileupload.MultipartStream r4 = r10.multi
                java.lang.String r4 = r4.readHeaders()
                org.apache.commons.fileupload.FileItemHeaders r9 = r0.getParsedHeaders(r4)
                java.lang.String r0 = r10.currentFieldName
                org.apache.commons.fileupload.FileUploadBase r4 = org.apache.commons.fileupload.FileUploadBase.this
                java.lang.String r5 = "Content-type"
                if (r0 != 0) goto L9d
                r0 = r3
                java.lang.String r3 = r4.getFieldName(r9)
                if (r3 == 0) goto L9b
                java.lang.String r4 = r9.getHeader(r5)
                if (r4 == 0) goto L73
                java.util.Locale r6 = java.util.Locale.ENGLISH
                java.lang.String r6 = r4.toLowerCase(r6)
                java.lang.String r7 = "multipart/mixed"
                boolean r6 = r6.startsWith(r7)
                if (r6 == 0) goto L73
                r10.currentFieldName = r3
                org.apache.commons.fileupload.FileUploadBase r3 = org.apache.commons.fileupload.FileUploadBase.this
                byte[] r3 = r3.getBoundary(r4)
                org.apache.commons.fileupload.MultipartStream r4 = r10.multi
                r4.setBoundary(r3)
                r10.skipPreamble = r8
                r3 = r0
                goto L10
            L73:
                org.apache.commons.fileupload.FileUploadBase r0 = org.apache.commons.fileupload.FileUploadBase.this
                java.lang.String r0 = r0.getFileName(r9)
                r6 = r2
                r2 = r0
                org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl$FileItemStreamImpl r0 = new org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl$FileItemStreamImpl
                java.lang.String r4 = r9.getHeader(r5)
                if (r2 != 0) goto L85
                r5 = r8
                goto L86
            L85:
                r5 = r6
            L86:
                long r6 = r10.getContentLength(r9)
                r1 = r10
                r0.<init>(r2, r3, r4, r5, r6)
                r10.currentItem = r0
                r0.setHeaders(r9)
                org.apache.commons.fileupload.MultipartStream$ProgressNotifier r0 = r10.notifier
                r0.noteItem()
                r10.itemValid = r8
                return r8
            L9b:
                r6 = r2
                goto Lc3
            L9d:
                r6 = r2
                r0 = r3
                java.lang.String r2 = r4.getFileName(r9)
                if (r2 == 0) goto Lc3
                org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl$FileItemStreamImpl r0 = new org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl$FileItemStreamImpl
                java.lang.String r3 = r10.currentFieldName
                java.lang.String r4 = r9.getHeader(r5)
                r5 = 0
                long r6 = r10.getContentLength(r9)
                r1 = r10
                r0.<init>(r2, r3, r4, r5, r6)
                r10.currentItem = r0
                r0.setHeaders(r9)
                org.apache.commons.fileupload.MultipartStream$ProgressNotifier r0 = r10.notifier
                r0.noteItem()
                r10.itemValid = r8
                return r8
            Lc3:
                org.apache.commons.fileupload.MultipartStream r2 = r10.multi
                r2.discardBodyData()
                r3 = r0
                r2 = r6
                goto L10
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.fileupload.FileUploadBase.FileItemIteratorImpl.findNextItem():boolean");
        }

        private long getContentLength(FileItemHeaders fileItemHeaders) {
            try {
                return Long.parseLong(fileItemHeaders.getHeader(FileUploadBase.CONTENT_LENGTH));
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // org.apache.commons.fileupload.FileItemIterator
        public boolean hasNext() throws FileUploadException, IOException {
            if (this.eof) {
                return false;
            }
            if (this.itemValid) {
                return true;
            }
            try {
                return findNextItem();
            } catch (FileUploadIOException e) {
                throw ((FileUploadException) e.getCause());
            }
        }

        @Override // org.apache.commons.fileupload.FileItemIterator
        public FileItemStream next() throws FileUploadException, IOException {
            if (this.eof || !(this.itemValid || hasNext())) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.itemValid = false;
            return this.currentItem;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FileSizeLimitExceededException extends SizeException {
        private static final long serialVersionUID = 8150776562029630058L;
        private String fieldName;
        private String fileName;

        public FileSizeLimitExceededException(String str, long j, long j2) {
            super(str, j, j2);
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getActualSize() {
            return super.getActualSize();
        }

        public String getFieldName() {
            return this.fieldName;
        }

        public String getFileName() {
            return this.fileName;
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getPermittedSize() {
            return super.getPermittedSize();
        }

        public void setFieldName(String str) {
            this.fieldName = str;
        }

        public void setFileName(String str) {
            this.fileName = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FileUploadIOException extends IOException {
        private static final long serialVersionUID = -7047616958165584154L;
        private final FileUploadException cause;

        public FileUploadIOException(FileUploadException fileUploadException) {
            this.cause = fileUploadException;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class IOFileUploadException extends FileUploadException {
        private static final long serialVersionUID = 1749796615868477269L;
        private final IOException cause;

        public IOFileUploadException(String str, IOException iOException) {
            super(str);
            this.cause = iOException;
        }

        @Override // org.apache.commons.fileupload.FileUploadException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class SizeException extends FileUploadException {
        private static final long serialVersionUID = -8776225574705254126L;
        private final long actual;
        private final long permitted;

        public SizeException(String str, long j, long j2) {
            super(str);
            this.actual = j;
            this.permitted = j2;
        }

        public long getActualSize() {
            return this.actual;
        }

        public long getPermittedSize() {
            return this.permitted;
        }
    }

    private String getFieldName(String str) {
        if (str == null || !str.toLowerCase(Locale.ENGLISH).startsWith(FORM_DATA)) {
            return null;
        }
        ParameterParser parameterParser = new ParameterParser();
        parameterParser.setLowerCaseNames(true);
        String str2 = parameterParser.parse(str, ';').get("name");
        return str2 != null ? str2.trim() : str2;
    }

    private String getFileName(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.startsWith(FORM_DATA) && !lowerCase.startsWith(ATTACHMENT)) {
            return null;
        }
        ParameterParser parameterParser = new ParameterParser();
        parameterParser.setLowerCaseNames(true);
        Map<String, String> parse = parameterParser.parse(str, ';');
        if (!parse.containsKey("filename")) {
            return null;
        }
        String str2 = parse.get("filename");
        return str2 != null ? str2.trim() : "";
    }

    public static final boolean isMultipartContent(RequestContext requestContext) {
        String contentType = requestContext.getContentType();
        return contentType != null && contentType.toLowerCase(Locale.ENGLISH).startsWith(MULTIPART);
    }

    private int parseEndOfLine(String str, int i) {
        int indexOf;
        do {
            indexOf = str.indexOf(13, i);
            if (indexOf == -1 || (i = indexOf + 1) >= str.length()) {
                Single$$ExternalSyntheticBUOutline0.m$2("Expected headers to be terminated by an empty line.");
                return 0;
            }
        } while (str.charAt(i) != '\n');
        return indexOf;
    }

    private void parseHeaderLine(FileItemHeadersImpl fileItemHeadersImpl, String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return;
        }
        fileItemHeadersImpl.addHeader(str.substring(0, indexOf).trim(), str.substring(str.indexOf(58) + 1).trim());
    }

    @Deprecated
    public FileItem createItem(Map<String, String> map, boolean z) throws FileUploadException {
        return getFileItemFactory().createItem(getFieldName(map), getHeader(map, CONTENT_TYPE), z, getFileName(map));
    }

    public byte[] getBoundary(String str) {
        ParameterParser parameterParser = new ParameterParser();
        parameterParser.setLowerCaseNames(true);
        String str2 = parameterParser.parse(str, new char[]{';', AbstractJsonLexerKt.COMMA}).get("boundary");
        if (str2 == null) {
            return null;
        }
        try {
            return str2.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return str2.getBytes();
        }
    }

    public long getFileCountMax() {
        return this.fileCountMax;
    }

    public abstract FileItemFactory getFileItemFactory();

    public long getFileSizeMax() {
        return this.fileSizeMax;
    }

    @Deprecated
    public final String getHeader(Map<String, String> map, String str) {
        return map.get(str.toLowerCase(Locale.ENGLISH));
    }

    public String getHeaderEncoding() {
        return this.headerEncoding;
    }

    public FileItemIterator getItemIterator(RequestContext requestContext) throws FileUploadException, IOException {
        try {
            return new FileItemIteratorImpl(requestContext);
        } catch (FileUploadIOException e) {
            throw ((FileUploadException) e.getCause());
        }
    }

    public FileItemHeaders getParsedHeaders(String str) {
        int length = str.length();
        FileItemHeadersImpl newFileItemHeaders = newFileItemHeaders();
        int i = 0;
        while (true) {
            int parseEndOfLine = parseEndOfLine(str, i);
            if (i == parseEndOfLine) {
                return newFileItemHeaders;
            }
            StringBuilder sb = new StringBuilder(str.substring(i, parseEndOfLine));
            i = parseEndOfLine + 2;
            while (i < length) {
                int i2 = i;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt != ' ' && charAt != '\t') {
                        break;
                    }
                    i2++;
                }
                if (i2 == i) {
                    break;
                }
                int parseEndOfLine2 = parseEndOfLine(str, i2);
                sb.append(" ");
                sb.append(str.substring(i2, parseEndOfLine2));
                i = parseEndOfLine2 + 2;
            }
            parseHeaderLine(newFileItemHeaders, sb.toString());
        }
    }

    public ProgressListener getProgressListener() {
        return this.listener;
    }

    public long getSizeMax() {
        return this.sizeMax;
    }

    public FileItemHeadersImpl newFileItemHeaders() {
        return new FileItemHeadersImpl();
    }

    @Deprecated
    public Map<String, String> parseHeaders(String str) {
        FileItemHeaders parsedHeaders = getParsedHeaders(str);
        HashMap hashMap = new HashMap();
        Iterator<String> headerNames = parsedHeaders.getHeaderNames();
        while (headerNames.hasNext()) {
            String next = headerNames.next();
            Iterator<String> headers = parsedHeaders.getHeaders(next);
            StringBuilder sb = new StringBuilder(headers.next());
            while (headers.hasNext()) {
                sb.append(",");
                sb.append(headers.next());
            }
            hashMap.put(next, sb.toString());
        }
        return hashMap;
    }

    public Map<String, List<FileItem>> parseParameterMap(RequestContext requestContext) throws FileUploadException {
        List<FileItem> parseRequest = parseRequest(requestContext);
        HashMap hashMap = new HashMap(parseRequest.size());
        for (FileItem fileItem : parseRequest) {
            String fieldName = fileItem.getFieldName();
            List list = (List) hashMap.get(fieldName);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(fieldName, list);
            }
            list.add(fileItem);
        }
        return hashMap;
    }

    public List<FileItem> parseRequest(RequestContext requestContext) throws FileUploadException {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                FileItemIterator itemIterator = getItemIterator(requestContext);
                FileItemFactory fileItemFactory = getFileItemFactory();
                byte[] bArr = new byte[8192];
                if (fileItemFactory == null) {
                    throw new NullPointerException("No FileItemFactory has been set.");
                }
                while (itemIterator.hasNext()) {
                    if (arrayList.size() == this.fileCountMax) {
                        throw new FileCountLimitExceededException(ATTACHMENT, getFileCountMax());
                    }
                    FileItemStream next = itemIterator.next();
                    FileItem createItem = fileItemFactory.createItem(next.getFieldName(), next.getContentType(), next.isFormField(), ((FileItemIteratorImpl.FileItemStreamImpl) next).name);
                    arrayList.add(createItem);
                    try {
                        Streams.copy(next.openStream(), createItem.getOutputStream(), true, bArr);
                        createItem.setHeaders(next.getHeaders());
                    } catch (FileUploadIOException e) {
                        throw ((FileUploadException) e.getCause());
                    } catch (IOException e2) {
                        throw new IOFileUploadException("Processing of multipart/form-data request failed. " + e2.getMessage(), e2);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((FileItem) it2.next()).delete();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (FileUploadIOException e3) {
            throw ((FileUploadException) e3.getCause());
        } catch (IOException e4) {
            throw new FileUploadException(e4.getMessage(), e4);
        }
    }

    public void setFileCountMax(long j) {
        this.fileCountMax = j;
    }

    public abstract void setFileItemFactory(FileItemFactory fileItemFactory);

    public void setFileSizeMax(long j) {
        this.fileSizeMax = j;
    }

    public void setHeaderEncoding(String str) {
        this.headerEncoding = str;
    }

    public void setProgressListener(ProgressListener progressListener) {
        this.listener = progressListener;
    }

    public void setSizeMax(long j) {
        this.sizeMax = j;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidContentTypeException extends FileUploadException {
        private static final long serialVersionUID = -9073026332015646668L;

        public InvalidContentTypeException() {
        }

        public InvalidContentTypeException(String str) {
            super(str);
        }

        public InvalidContentTypeException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static class UnknownSizeException extends FileUploadException {
        private static final long serialVersionUID = 7062279004812015273L;

        public UnknownSizeException() {
        }

        public UnknownSizeException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SizeLimitExceededException extends SizeException {
        private static final long serialVersionUID = -2474893167098052828L;

        @Deprecated
        public SizeLimitExceededException() {
            this(null, 0L, 0L);
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getActualSize() {
            return super.getActualSize();
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getPermittedSize() {
            return super.getPermittedSize();
        }

        @Deprecated
        public SizeLimitExceededException(String str) {
            this(str, 0L, 0L);
        }

        public SizeLimitExceededException(String str, long j, long j2) {
            super(str, j, j2);
        }
    }

    @Deprecated
    public static boolean isMultipartContent(HttpServletRequest httpServletRequest) {
        return ServletFileUpload.isMultipartContent(httpServletRequest);
    }

    public String getFieldName(FileItemHeaders fileItemHeaders) {
        return getFieldName(fileItemHeaders.getHeader(CONTENT_DISPOSITION));
    }

    @Deprecated
    public String getFieldName(Map<String, String> map) {
        return getFieldName(getHeader(map, CONTENT_DISPOSITION));
    }

    public String getFileName(FileItemHeaders fileItemHeaders) {
        return getFileName(fileItemHeaders.getHeader(CONTENT_DISPOSITION));
    }

    @Deprecated
    public String getFileName(Map<String, String> map) {
        return getFileName(getHeader(map, CONTENT_DISPOSITION));
    }

    @Deprecated
    public List<FileItem> parseRequest(HttpServletRequest httpServletRequest) throws FileUploadException {
        return parseRequest(new ServletRequestContext(httpServletRequest));
    }
}
