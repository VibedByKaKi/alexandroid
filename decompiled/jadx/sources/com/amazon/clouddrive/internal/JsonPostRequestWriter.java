package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.exceptions.CloudDriveException;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.net.HttpURLConnection;
import okhttp3.Request;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class JsonPostRequestWriter<Request> extends SinglePartPostRequestWriter<Request> {
    private static final String CONTENT_TYPE = "application/json";

    public JsonPostRequestWriter(Request request, JsonSerializer<Request> jsonSerializer) {
        super(request, jsonSerializer);
    }

    @Override // com.amazon.clouddrive.internal.SinglePartPostRequestWriter, com.amazon.clouddrive.internal.RequestPropertyWriter
    @Deprecated
    public void writeHeaders(HttpURLConnection httpURLConnection) throws CloudDriveException {
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
    }

    @Override // com.amazon.clouddrive.internal.SinglePartPostRequestWriter, com.amazon.clouddrive.internal.RequestPropertyWriter
    public void writeHeaders(Request.Builder builder) throws CloudDriveException {
        builder.header("Content-Type", "application/json");
    }
}
