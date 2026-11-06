package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CopyPartResult extends SSEResultBase implements Serializable {
    private String etag;
    private Date lastModifiedDate;
    private int partNumber;
    private String versionId;

    public String getETag() {
        return this.etag;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public PartETag getPartETag() {
        return new PartETag(this.partNumber, this.etag);
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setETag(String str) {
        this.etag = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setPartNumber(int i) {
        this.partNumber = i;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
