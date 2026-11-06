package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListSourcesResponse extends CloudDriveResponse {

    @SerializedName(NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR)
    @Expose
    private List<SourceInfo> sources;

    @Generated
    public ListSourcesResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListSourcesResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListSourcesResponse)) {
            return false;
        }
        ListSourcesResponse listSourcesResponse = (ListSourcesResponse) obj;
        if (!listSourcesResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<SourceInfo> sources = getSources();
        List<SourceInfo> sources2 = listSourcesResponse.getSources();
        return sources != null ? sources.equals(sources2) : sources2 == null;
    }

    @Generated
    public List<SourceInfo> getSources() {
        return this.sources;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        List<SourceInfo> sources = getSources();
        return (hashCode * 59) + (sources == null ? 43 : sources.hashCode());
    }

    @Generated
    public void setSources(List<SourceInfo> list) {
        this.sources = list;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "ListSourcesResponse(sources=" + getSources() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
