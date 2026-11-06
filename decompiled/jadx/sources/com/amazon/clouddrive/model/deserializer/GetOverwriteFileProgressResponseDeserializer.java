package com.amazon.clouddrive.model.deserializer;

import com.amazon.clouddrive.model.GetOverwriteFileProgressResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetOverwriteFileProgressResponseDeserializer extends GetFileProgressResponseDeserializer<GetOverwriteFileProgressResponse> {
    public static final GetOverwriteFileProgressResponseDeserializer INSTANCE = new GetOverwriteFileProgressResponseDeserializer();

    private GetOverwriteFileProgressResponseDeserializer() {
    }

    @Override // com.amazon.clouddrive.model.deserializer.GetFileProgressResponseDeserializer
    public GetOverwriteFileProgressResponse newResponseInstance() {
        return new GetOverwriteFileProgressResponse();
    }
}
