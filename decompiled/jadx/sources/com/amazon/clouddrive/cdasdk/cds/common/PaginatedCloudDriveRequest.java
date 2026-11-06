package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PaginatedCloudDriveRequest extends CloudDriveRequest {

    @SerializedName("fieldList")
    @Expose
    private List<String> fieldList;

    @SerializedName("fields")
    @Expose
    private String fields;

    @SerializedName("filters")
    @Expose
    private String filters;

    @SerializedName("limit")
    @Expose
    private String limit;

    @SerializedName("lowResThumbnail")
    @Expose
    private Boolean lowResThumbnail;

    @SerializedName("offset")
    @Expose
    private Integer offset;

    @SerializedName("resourceVersion")
    @Expose
    private ResourceVersion resourceVersion;

    @SerializedName("sort")
    @Expose
    private String sort;

    @SerializedName("startToken")
    @Expose
    private String startToken;

    @Generated
    public PaginatedCloudDriveRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PaginatedCloudDriveRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaginatedCloudDriveRequest)) {
            return false;
        }
        PaginatedCloudDriveRequest paginatedCloudDriveRequest = (PaginatedCloudDriveRequest) obj;
        if (!paginatedCloudDriveRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer offset = getOffset();
        Integer offset2 = paginatedCloudDriveRequest.getOffset();
        if (offset != null ? !offset.equals(offset2) : offset2 != null) {
            return false;
        }
        Boolean lowResThumbnail = getLowResThumbnail();
        Boolean lowResThumbnail2 = paginatedCloudDriveRequest.getLowResThumbnail();
        if (lowResThumbnail != null ? !lowResThumbnail.equals(lowResThumbnail2) : lowResThumbnail2 != null) {
            return false;
        }
        String startToken = getStartToken();
        String startToken2 = paginatedCloudDriveRequest.getStartToken();
        if (startToken != null ? !startToken.equals(startToken2) : startToken2 != null) {
            return false;
        }
        String limit = getLimit();
        String limit2 = paginatedCloudDriveRequest.getLimit();
        if (limit != null ? !limit.equals(limit2) : limit2 != null) {
            return false;
        }
        String filters = getFilters();
        String filters2 = paginatedCloudDriveRequest.getFilters();
        if (filters != null ? !filters.equals(filters2) : filters2 != null) {
            return false;
        }
        String sort = getSort();
        String sort2 = paginatedCloudDriveRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String fields = getFields();
        String fields2 = paginatedCloudDriveRequest.getFields();
        if (fields != null ? !fields.equals(fields2) : fields2 != null) {
            return false;
        }
        List<String> fieldList = getFieldList();
        List<String> fieldList2 = paginatedCloudDriveRequest.getFieldList();
        if (fieldList != null ? !fieldList.equals(fieldList2) : fieldList2 != null) {
            return false;
        }
        ResourceVersion resourceVersion = getResourceVersion();
        ResourceVersion resourceVersion2 = paginatedCloudDriveRequest.getResourceVersion();
        return resourceVersion != null ? resourceVersion.equals(resourceVersion2) : resourceVersion2 == null;
    }

    @Generated
    public List<String> getFieldList() {
        return this.fieldList;
    }

    @Generated
    public String getFields() {
        return this.fields;
    }

    @Generated
    public String getFilters() {
        return this.filters;
    }

    @Generated
    public String getLimit() {
        return this.limit;
    }

    @Generated
    public Boolean getLowResThumbnail() {
        return this.lowResThumbnail;
    }

    @Generated
    public Integer getOffset() {
        return this.offset;
    }

    @Generated
    public ResourceVersion getResourceVersion() {
        return this.resourceVersion;
    }

    @Generated
    public String getSort() {
        return this.sort;
    }

    @Generated
    public String getStartToken() {
        return this.startToken;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer offset = getOffset();
        int hashCode2 = (hashCode * 59) + (offset == null ? 43 : offset.hashCode());
        Boolean lowResThumbnail = getLowResThumbnail();
        int hashCode3 = (hashCode2 * 59) + (lowResThumbnail == null ? 43 : lowResThumbnail.hashCode());
        String startToken = getStartToken();
        int hashCode4 = (hashCode3 * 59) + (startToken == null ? 43 : startToken.hashCode());
        String limit = getLimit();
        int hashCode5 = (hashCode4 * 59) + (limit == null ? 43 : limit.hashCode());
        String filters = getFilters();
        int hashCode6 = (hashCode5 * 59) + (filters == null ? 43 : filters.hashCode());
        String sort = getSort();
        int hashCode7 = (hashCode6 * 59) + (sort == null ? 43 : sort.hashCode());
        String fields = getFields();
        int hashCode8 = (hashCode7 * 59) + (fields == null ? 43 : fields.hashCode());
        List<String> fieldList = getFieldList();
        int i = hashCode8 * 59;
        int hashCode9 = fieldList == null ? 43 : fieldList.hashCode();
        ResourceVersion resourceVersion = getResourceVersion();
        return ((i + hashCode9) * 59) + (resourceVersion != null ? resourceVersion.hashCode() : 43);
    }

    @Generated
    public void setFieldList(List<String> list) {
        this.fieldList = list;
    }

    @Generated
    public void setFields(String str) {
        this.fields = str;
    }

    @Generated
    public void setFilters(String str) {
        this.filters = str;
    }

    @Generated
    public void setLimit(String str) {
        this.limit = str;
    }

    @Generated
    public void setLowResThumbnail(Boolean bool) {
        this.lowResThumbnail = bool;
    }

    @Generated
    public void setOffset(Integer num) {
        this.offset = num;
    }

    @Generated
    public void setResourceVersion(ResourceVersion resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Generated
    public void setSort(String str) {
        this.sort = str;
    }

    @Generated
    public void setStartToken(String str) {
        this.startToken = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "PaginatedCloudDriveRequest(startToken=" + getStartToken() + ", offset=" + getOffset() + ", limit=" + getLimit() + ", filters=" + getFilters() + ", sort=" + getSort() + ", fields=" + getFields() + ", fieldList=" + getFieldList() + ", resourceVersion=" + getResourceVersion() + ", lowResThumbnail=" + getLowResThumbnail() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
