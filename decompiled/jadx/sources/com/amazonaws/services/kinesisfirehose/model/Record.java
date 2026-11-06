package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Record implements Serializable {
    private ByteBuffer data;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        if ((record.getData() == null) ^ (getData() == null)) {
            return false;
        }
        return record.getData() == null || record.getData().equals(getData());
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int hashCode() {
        return 31 + (getData() == null ? 0 : getData().hashCode());
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getData() != null) {
            sb.append("Data: " + getData());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Record withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }
}
