package com.amazon.clouddrive.internal;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.clouddrive.model.PaginatedCloudDriveRequest;
import com.amazon.deecomms.common.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.text.Typography;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class QueryPathBuilder {
    private final StringBuilder mStringBuilder = new StringBuilder();

    public void addParameter(String str, String str2) {
        if (str2 != null) {
            try {
                StringBuilder sb = this.mStringBuilder;
                sb.append(sb.length() == 0 ? Constants.DEFAULT_IMAGE_CHAR : Typography.amp);
                StringBuilder sb2 = this.mStringBuilder;
                sb2.append(str);
                sb2.append('=');
                sb2.append(URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                Single$$ExternalSyntheticBUOutline0.m("Failed to encode ".concat(str2), e);
            }
        }
    }

    public String addQueryToPath(String str) {
        if (this.mStringBuilder.length() == 0) {
            return str;
        }
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        m.append(this.mStringBuilder.toString());
        return m.toString();
    }

    public void addRequestParameters(PaginatedCloudDriveRequest paginatedCloudDriveRequest) {
        addParameter("filters", paginatedCloudDriveRequest.getFilters());
        addParameter("fields", paginatedCloudDriveRequest.getFields());
        addParameter("startToken", paginatedCloudDriveRequest.getStartToken());
        addParameter("limit", paginatedCloudDriveRequest.getLimit());
        addParameter("sort", paginatedCloudDriveRequest.getSort());
        addParameter("offset", paginatedCloudDriveRequest.getOffset());
    }

    public void addUTF8Parameter(String str, String str2) {
        if (str2 != null) {
            StringBuilder sb = this.mStringBuilder;
            sb.append(sb.length() == 0 ? Constants.DEFAULT_IMAGE_CHAR : Typography.amp);
            StringBuilder sb2 = this.mStringBuilder;
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
        }
    }

    public void addParameter(String str, Integer num) {
        if (num != null) {
            addParameter(str, num.toString());
        }
    }

    public void addParameter(String str, Boolean bool) {
        if (bool != null) {
            addParameter(str, bool.toString());
        }
    }
}
