package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.exceptions.ActionRequiredException;
import com.amazon.clouddrive.exceptions.CloudDriveException;
import com.amazon.clouddrive.exceptions.RebuildRequestException;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class CloudDriveObjectMapper {
    public static <T> T readStream(InputStream inputStream, JsonDeserializer<T> jsonDeserializer) throws CloudDriveException, InterruptedException {
        JsonParser jsonParser = null;
        try {
            try {
                jsonParser = new JsonFactory().createJsonParser(inputStream);
                jsonParser.nextToken();
                T deserialize = jsonDeserializer.deserialize(jsonParser);
                try {
                    jsonParser.close();
                } catch (IOException unused) {
                }
                return deserialize;
            } catch (Throwable th) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (InterruptedIOException unused3) {
            throw new InterruptedException();
        } catch (IOException e) {
            throw new ActionRequiredException("Failed to read stream from the service.", e);
        }
    }

    public static <T> void writeStream(OutputStream outputStream, T t, JsonSerializer<T> jsonSerializer) throws CloudDriveException, InterruptedException {
        JsonGenerator jsonGenerator = null;
        try {
            try {
                jsonGenerator = new JsonFactory().createJsonGenerator(outputStream, JsonEncoding.UTF8);
                jsonSerializer.serialize(t, jsonGenerator);
                if (jsonGenerator != null) {
                    try {
                        jsonGenerator.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                if (jsonGenerator != null) {
                    try {
                        jsonGenerator.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (InterruptedIOException unused3) {
            throw new InterruptedException();
        } catch (IOException e) {
            throw new RebuildRequestException("Failed to write request to the service.", e);
        }
    }
}
