package com.amazonaws.services.s3.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetObjectTaggingResult {
    private List<Tag> tagSet;
    private String versionId;

    public GetObjectTaggingResult(List<Tag> list) {
        this.tagSet = list;
    }

    public List<Tag> getTagSet() {
        return this.tagSet;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setTagSet(List<Tag> list) {
        this.tagSet = list;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    public GetObjectTaggingResult withTagSet(List<Tag> list) {
        setTagSet(list);
        return this;
    }

    public GetObjectTaggingResult withVersionId(String str) {
        setVersionId(str);
        return this;
    }
}
