package com.amazon.clouddrive.model.deserializer;

import com.amazon.clouddrive.model.GetUploadFileProgressResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetUploadFileProgressResponseDeserializer extends GetFileProgressResponseDeserializer<GetUploadFileProgressResponse> {
    public static final GetUploadFileProgressResponseDeserializer INSTANCE = new GetUploadFileProgressResponseDeserializer();

    private GetUploadFileProgressResponseDeserializer() {
    }

    @Override // com.amazon.clouddrive.model.deserializer.GetFileProgressResponseDeserializer
    public GetUploadFileProgressResponse newResponseInstance() {
        return new GetUploadFileProgressResponse();
    }
}
