package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class QueueConfiguration extends NotificationConfiguration implements Serializable {
    private String queueARN;

    public QueueConfiguration(String str, EnumSet<S3Event> enumSet) {
        super(enumSet);
        this.queueARN = str;
    }

    public String getQueueARN() {
        return this.queueARN;
    }

    public void setQueueARN(String str) {
        this.queueARN = str;
    }

    public QueueConfiguration withQueueARN(String str) {
        setQueueARN(str);
        return this;
    }

    public QueueConfiguration() {
    }

    public QueueConfiguration(String str, String... strArr) {
        super(strArr);
        this.queueARN = str;
    }
}
