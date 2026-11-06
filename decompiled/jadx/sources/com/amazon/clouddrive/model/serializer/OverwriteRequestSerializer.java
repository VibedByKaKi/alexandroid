package com.amazon.clouddrive.model.serializer;

import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.clouddrive.model.OverwriteFileRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OverwriteRequestSerializer implements JsonSerializer<OverwriteFileRequest> {
    public static final JsonSerializer<OverwriteFileRequest> INSTANCE = new OverwriteRequestSerializer();
    private final PostNodeRequestFieldSerializer mFieldSerializer = new PostNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PostNodeRequestFieldSerializer implements JsonFieldSerializer<OverwriteFileRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends OverwriteFileRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            String md5 = u.getMD5();
            if (md5 != null) {
                jsonGenerator.writeFieldName(SierraContentProviderContract.MD5_VALUE);
                SimpleSerializers.serializeString(md5, jsonGenerator);
            }
            jsonGenerator.writeFieldName("size");
            SimpleSerializers.serializePrimitiveLong(u.getContentLength(), jsonGenerator);
        }
    }

    private OverwriteRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(OverwriteFileRequest overwriteFileRequest, JsonGenerator jsonGenerator) throws IOException {
        if (overwriteFileRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((PostNodeRequestFieldSerializer) overwriteFileRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
