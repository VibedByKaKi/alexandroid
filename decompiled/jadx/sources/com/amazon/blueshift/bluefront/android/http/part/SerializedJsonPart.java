package com.amazon.blueshift.bluefront.android.http.part;

import com.google.common.base.Charsets;
import com.google.common.net.MediaType;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SerializedJsonPart extends Part {
    private static final MediaType CONTENT_TYPE = MediaType.parse("application/json");
    private final String mShape;

    public SerializedJsonPart(String str, String str2) {
        super(str2, CONTENT_TYPE);
        this.mShape = str;
    }

    @Override // com.amazon.blueshift.bluefront.android.http.part.Part
    public void writeBody(OutputStream outputStream) throws Exception {
        outputStream.write(this.mShape.getBytes(Charsets.UTF_8.displayName()));
    }
}
