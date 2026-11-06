package com.amazonaws.services.kinesisfirehose.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordBatchRequest extends AmazonWebServiceRequest implements Serializable {
    private String deliveryStreamName;
    private List<Record> records;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordBatchRequest)) {
            return false;
        }
        PutRecordBatchRequest putRecordBatchRequest = (PutRecordBatchRequest) obj;
        if ((putRecordBatchRequest.getDeliveryStreamName() == null) ^ (getDeliveryStreamName() == null)) {
            return false;
        }
        if (putRecordBatchRequest.getDeliveryStreamName() != null && !putRecordBatchRequest.getDeliveryStreamName().equals(getDeliveryStreamName())) {
            return false;
        }
        if ((putRecordBatchRequest.getRecords() == null) ^ (getRecords() == null)) {
            return false;
        }
        return putRecordBatchRequest.getRecords() == null || putRecordBatchRequest.getRecords().equals(getRecords());
    }

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return (((getDeliveryStreamName() == null ? 0 : getDeliveryStreamName().hashCode()) + 31) * 31) + (getRecords() != null ? getRecords().hashCode() : 0);
    }

    public void setDeliveryStreamName(String str) {
        this.deliveryStreamName = str;
    }

    public void setRecords(Collection<Record> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDeliveryStreamName() != null) {
            sb.append("DeliveryStreamName: " + getDeliveryStreamName() + ",");
        }
        if (getRecords() != null) {
            sb.append("Records: " + getRecords());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordBatchRequest withDeliveryStreamName(String str) {
        this.deliveryStreamName = str;
        return this;
    }

    public PutRecordBatchRequest withRecords(Record... recordArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(recordArr.length);
        }
        for (Record record : recordArr) {
            this.records.add(record);
        }
        return this;
    }

    public PutRecordBatchRequest withRecords(Collection<Record> collection) {
        setRecords(collection);
        return this;
    }
}
