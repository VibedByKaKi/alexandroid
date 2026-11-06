package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface INode extends IEditableNode {
    List<String> getAccessRuleIds();

    List<Node> getAssets();

    String getCreatedBy();

    String getCreatedDate();

    String getETagRequest();

    String getETagResponse();

    String getModifiedDate();

    String getTempLink();

    long getVersion();

    Boolean isExclusivelyTrashed();

    Boolean isProtectedFolder();

    Boolean isRecursivelyTrashed();

    Boolean isRoot();

    Boolean isShared();

    void setAccessRuleIds(List<String> list);

    void setAssets(List<Node> list);

    void setCreatedBy(String str);

    void setCreatedDate(String str);

    void setETagRequest(String str);

    void setETagResponse(String str);

    void setExclusivelyTrashed(Boolean bool);

    void setIsProtectedFolder(Boolean bool);

    void setIsRoot(Boolean bool);

    void setIsShared(Boolean bool);

    void setModifiedDate(String str);

    void setRecursivelyTrashed(Boolean bool);

    void setTempLink(String str);

    void setVersion(long j);
}
