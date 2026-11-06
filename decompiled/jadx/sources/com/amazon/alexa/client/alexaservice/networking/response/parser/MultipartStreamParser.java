package com.amazon.alexa.client.alexaservice.networking.response.parser;

import com.amazon.alexa.client.alexaservice.networking.response.parser.AlexaMultipartStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.MultipartStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MultipartStreamParser {
    private final AlexaMultipartStream multipartStream;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Part {
        private final AlexaMultipartStream stream;

        public Part(AlexaMultipartStream alexaMultipartStream) {
            this.stream = alexaMultipartStream;
        }

        public String getHeaders() throws AlexaMultipartStream.MalformedStreamException, FileUploadBase.FileUploadIOException {
            return this.stream.readHeaders();
        }

        public String getPartBodyAsString() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.stream.readBodyData(byteArrayOutputStream);
            return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
        }

        public void writePartBodyIntoOutputStream(OutputStream outputStream) throws IOException {
            this.stream.readBodyData(outputStream);
        }
    }

    public MultipartStreamParser(InputStream inputStream, String str) {
        this.multipartStream = new AlexaMultipartStream(inputStream, str.getBytes());
    }

    public Part getPart() {
        return new Part(this.multipartStream);
    }

    public boolean hasNextPart() throws MultipartStream.MalformedStreamException, FileUploadBase.FileUploadIOException, SocketTimeoutException {
        return this.multipartStream.readBoundary();
    }

    public boolean initializeToFirstPart() throws IOException {
        return this.multipartStream.skipPreamble();
    }
}
