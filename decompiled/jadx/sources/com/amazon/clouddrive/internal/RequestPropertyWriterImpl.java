package com.amazon.clouddrive.internal;

import androidx.collection.SieveCacheKt;
import com.amazon.clouddrive.exceptions.CloudDriveException;
import com.amazon.clouddrive.exceptions.InvalidParameter;
import com.amazon.clouddrive.internal.utils.ThreadUtil;
import java.net.HttpURLConnection;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Request;
import org.apache.http.protocol.HTTP;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class RequestPropertyWriterImpl implements RequestPropertyWriter {
    private final Set<Property> mRequestProperties = new LinkedHashSet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Property {
        final String field;
        final String value;

        public Property(String str, String str2) {
            this.field = str;
            this.value = str2;
        }
    }

    public final void setRequestProperty(String str, String str2) {
        this.mRequestProperties.add(new Property(str, str2));
    }

    public final void setStreamingMode(HttpURLConnection httpURLConnection, boolean z, int i, long j) throws InvalidParameter {
        if (z) {
            httpURLConnection.setChunkedStreamingMode(i);
            httpURLConnection.setRequestProperty("Transfer-Encoding", HTTP.CHUNK_CODING);
        } else {
            if (j > SieveCacheKt.NodeLinkMask) {
                throw new InvalidParameter("The file is too large to be uploaded through the fixed length streaming mode. Use the chunked mode instead.", InvalidParameter.FILE_TOO_LARGE, getClass().getSimpleName());
            }
            httpURLConnection.setFixedLengthStreamingMode((int) j);
        }
    }

    @Override // com.amazon.clouddrive.internal.RequestPropertyWriter
    @Deprecated
    public void writeHeaders(HttpURLConnection httpURLConnection) throws CloudDriveException, InterruptedException {
        for (Property property : this.mRequestProperties) {
            ThreadUtil.checkIfInterrupted();
            httpURLConnection.setRequestProperty(property.field, property.value);
        }
    }

    @Override // com.amazon.clouddrive.internal.RequestPropertyWriter
    public void writeHeaders(Request.Builder builder) throws CloudDriveException, InterruptedException {
        for (Property property : this.mRequestProperties) {
            ThreadUtil.checkIfInterrupted();
            builder.header(property.field, property.value);
        }
    }
}
