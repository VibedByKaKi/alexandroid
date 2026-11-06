package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.VideoProperties;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoPropertiesSerializer implements JsonSerializer<VideoProperties> {
    public static final JsonSerializer<VideoProperties> INSTANCE = new VideoPropertiesSerializer();
    private final VideoPropertiesFieldSerializer mFieldSerializer = new VideoPropertiesFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class VideoPropertiesFieldSerializer implements JsonFieldSerializer<VideoProperties> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends VideoProperties> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("title");
            SimpleSerializers.serializeString(u.getTitle(), jsonGenerator);
            jsonGenerator.writeFieldName("bitrate");
            SimpleSerializers.serializeDouble(u.getBitrate(), jsonGenerator);
            jsonGenerator.writeFieldName("videoFrameRate");
            SimpleSerializers.serializeDouble(u.getVideoFrameRate(), jsonGenerator);
            jsonGenerator.writeFieldName("creationDate");
            SimpleSerializers.serializeString(u.getCreationDate(), jsonGenerator);
            jsonGenerator.writeFieldName("model");
            SimpleSerializers.serializeString(u.getModel(), jsonGenerator);
            jsonGenerator.writeFieldName("videoBitrate");
            SimpleSerializers.serializeDouble(u.getVideoBitrate(), jsonGenerator);
            jsonGenerator.writeFieldName("audioCodec");
            SimpleSerializers.serializeString(u.getAudioCodec(), jsonGenerator);
            jsonGenerator.writeFieldName("rotate");
            SimpleSerializers.serializeInteger(u.getRotate(), jsonGenerator);
            jsonGenerator.writeFieldName("duration");
            SimpleSerializers.serializeDouble(u.getDuration(), jsonGenerator);
            jsonGenerator.writeFieldName("encoder");
            SimpleSerializers.serializeString(u.getEncoder(), jsonGenerator);
            jsonGenerator.writeFieldName("location");
            SimpleSerializers.serializeString(u.getLocation(), jsonGenerator);
            jsonGenerator.writeFieldName("audioBitrate");
            SimpleSerializers.serializeDouble(u.getAudioBitrate(), jsonGenerator);
            jsonGenerator.writeFieldName("audioSampleRate");
            SimpleSerializers.serializeDouble(u.getAudioSampleRate(), jsonGenerator);
            jsonGenerator.writeFieldName("make");
            SimpleSerializers.serializeString(u.getMake(), jsonGenerator);
            jsonGenerator.writeFieldName("videoCodec");
            SimpleSerializers.serializeString(u.getVideoCodec(), jsonGenerator);
            jsonGenerator.writeFieldName("height");
            SimpleSerializers.serializeInteger(u.getHeight(), jsonGenerator);
            jsonGenerator.writeFieldName("audioChannels");
            SimpleSerializers.serializeInteger(u.getAudioChannels(), jsonGenerator);
            jsonGenerator.writeFieldName("width");
            SimpleSerializers.serializeInteger(u.getWidth(), jsonGenerator);
            jsonGenerator.writeFieldName("audioChannelLayout");
            SimpleSerializers.serializeString(u.getAudioChannelLayout(), jsonGenerator);
        }
    }

    private VideoPropertiesSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(VideoProperties videoProperties, JsonGenerator jsonGenerator) throws IOException {
        if (videoProperties == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((VideoPropertiesFieldSerializer) videoProperties, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
