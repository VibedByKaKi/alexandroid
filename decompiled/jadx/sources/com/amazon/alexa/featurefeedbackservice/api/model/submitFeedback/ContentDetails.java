package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.google.common.collect.ImmutableList;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ContentDetails {
    private static final int DEFAULT_POSITION = 0;
    private String contentContextString;
    private String contentId;
    private ContentType contentType;
    private String impressionId;
    private String jobId;
    private int position;
    private String providerId;
    private String slotId;
    private String source;
    private List<String> topicIdList;

    public ContentDetails(@NonNull String str, ContentType contentType, String str2, List<String> list, int i, String str3, String str4, String str5, String str6, String str7) {
        Utils.validateNonEmptyString("contentId", str);
        setContentId(str);
        setContentType(contentType);
        setSlotId(str2);
        setTopicIds(list);
        setPosition(i);
        setProviderId(str3);
        setImpressionId(str4);
        setJobId(str5);
        setSource(str6);
        setContentContextString(str7);
    }

    public static ContentDetails deepCopy(ContentDetails contentDetails) {
        if (contentDetails == null) {
            return null;
        }
        return new ContentDetails(contentDetails.getContentId(), contentDetails.getContentType(), contentDetails.getSlotId(), contentDetails.getTopicIds(), contentDetails.getPosition(), contentDetails.getProviderId(), contentDetails.getImpressionId(), contentDetails.getJobId(), contentDetails.getSource(), contentDetails.getContentContextString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ContentDetails)) {
            ContentDetails contentDetails = (ContentDetails) obj;
            if (this.contentType == contentDetails.contentType && Utils.areStringsEqual(this.contentId, contentDetails.contentId) && Utils.areStringsEqual(this.slotId, contentDetails.slotId) && Utils.areListsEqual(this.topicIdList, contentDetails.topicIdList) && this.position == contentDetails.position && Utils.areStringsEqual(this.providerId, contentDetails.providerId) && Utils.areStringsEqual(this.impressionId, contentDetails.impressionId) && Utils.areStringsEqual(this.jobId, contentDetails.jobId) && Utils.areStringsEqual(this.source, contentDetails.source) && Utils.areStringsEqual(this.contentContextString, contentDetails.contentContextString)) {
                return true;
            }
        }
        return false;
    }

    public String getContentContextString() {
        return this.contentContextString;
    }

    public String getContentId() {
        return this.contentId;
    }

    public ContentType getContentType() {
        return this.contentType;
    }

    public String getImpressionId() {
        return this.impressionId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public int getPosition() {
        return this.position;
    }

    public String getProviderId() {
        return this.providerId;
    }

    public String getSlotId() {
        return this.slotId;
    }

    public String getSource() {
        return this.source;
    }

    public List<String> getTopicIds() {
        return ImmutableList.copyOf((Collection) this.topicIdList);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public void setContentContextString(String str) {
        this.contentContextString = str;
    }

    public void setContentId(@NonNull String str) {
        Utils.validateNonEmptyString("contentId", str);
        this.contentId = str;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public void setImpressionId(String str) {
        this.impressionId = str;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setProviderId(String str) {
        this.providerId = str;
    }

    public void setSlotId(String str) {
        this.slotId = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTopicIds(List<String> list) {
        this.topicIdList = list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentDetails{contentId='");
        sb.append(this.contentId);
        sb.append("', contentType='");
        sb.append(this.contentType);
        sb.append("', slotId='");
        sb.append(this.slotId);
        sb.append("', topicIdList='");
        sb.append(this.topicIdList.size());
        sb.append("', position='");
        sb.append(this.position);
        sb.append("', providerId='");
        sb.append(this.providerId);
        sb.append("', impressionId='");
        sb.append(this.impressionId);
        sb.append("', jobId='");
        sb.append(this.jobId);
        sb.append("', source='");
        sb.append(this.source);
        sb.append("', contentContextString='");
        return a$$ExternalSyntheticOutline0.m(sb, this.contentContextString, "'}");
    }

    public ContentDetails(@NonNull String str, ContentType contentType) {
        this(str, contentType, null, null, 0, null, null, null, null, null);
    }
}
