package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TopicConfiguration extends NotificationConfiguration implements Serializable {
    private String topicARN;

    public TopicConfiguration(String str, EnumSet<S3Event> enumSet) {
        super(enumSet);
        this.topicARN = str;
    }

    public String getTopicARN() {
        return this.topicARN;
    }

    public void setTopicARN(String str) {
        this.topicARN = str;
    }

    public TopicConfiguration withTopicARN(String str) {
        setTopicARN(str);
        return this;
    }

    public TopicConfiguration() {
    }

    public TopicConfiguration(String str, String... strArr) {
        super(strArr);
        this.topicARN = str;
    }
}
