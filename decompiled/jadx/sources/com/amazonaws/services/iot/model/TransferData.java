package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TransferData implements Serializable {
    private Date acceptDate;
    private Date rejectDate;
    private String rejectReason;
    private Date transferDate;
    private String transferMessage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) obj;
        if ((transferData.getTransferMessage() == null) ^ (getTransferMessage() == null)) {
            return false;
        }
        if (transferData.getTransferMessage() != null && !transferData.getTransferMessage().equals(getTransferMessage())) {
            return false;
        }
        if ((transferData.getRejectReason() == null) ^ (getRejectReason() == null)) {
            return false;
        }
        if (transferData.getRejectReason() != null && !transferData.getRejectReason().equals(getRejectReason())) {
            return false;
        }
        if ((transferData.getTransferDate() == null) ^ (getTransferDate() == null)) {
            return false;
        }
        if (transferData.getTransferDate() != null && !transferData.getTransferDate().equals(getTransferDate())) {
            return false;
        }
        if ((transferData.getAcceptDate() == null) ^ (getAcceptDate() == null)) {
            return false;
        }
        if (transferData.getAcceptDate() != null && !transferData.getAcceptDate().equals(getAcceptDate())) {
            return false;
        }
        if ((transferData.getRejectDate() == null) ^ (getRejectDate() == null)) {
            return false;
        }
        return transferData.getRejectDate() == null || transferData.getRejectDate().equals(getRejectDate());
    }

    public Date getAcceptDate() {
        return this.acceptDate;
    }

    public Date getRejectDate() {
        return this.rejectDate;
    }

    public String getRejectReason() {
        return this.rejectReason;
    }

    public Date getTransferDate() {
        return this.transferDate;
    }

    public String getTransferMessage() {
        return this.transferMessage;
    }

    public int hashCode() {
        return (((((((((getTransferMessage() == null ? 0 : getTransferMessage().hashCode()) + 31) * 31) + (getRejectReason() == null ? 0 : getRejectReason().hashCode())) * 31) + (getTransferDate() == null ? 0 : getTransferDate().hashCode())) * 31) + (getAcceptDate() == null ? 0 : getAcceptDate().hashCode())) * 31) + (getRejectDate() != null ? getRejectDate().hashCode() : 0);
    }

    public void setAcceptDate(Date date) {
        this.acceptDate = date;
    }

    public void setRejectDate(Date date) {
        this.rejectDate = date;
    }

    public void setRejectReason(String str) {
        this.rejectReason = str;
    }

    public void setTransferDate(Date date) {
        this.transferDate = date;
    }

    public void setTransferMessage(String str) {
        this.transferMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTransferMessage() != null) {
            sb.append("transferMessage: " + getTransferMessage() + ",");
        }
        if (getRejectReason() != null) {
            sb.append("rejectReason: " + getRejectReason() + ",");
        }
        if (getTransferDate() != null) {
            sb.append("transferDate: " + getTransferDate() + ",");
        }
        if (getAcceptDate() != null) {
            sb.append("acceptDate: " + getAcceptDate() + ",");
        }
        if (getRejectDate() != null) {
            sb.append("rejectDate: " + getRejectDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TransferData withAcceptDate(Date date) {
        this.acceptDate = date;
        return this;
    }

    public TransferData withRejectDate(Date date) {
        this.rejectDate = date;
        return this;
    }

    public TransferData withRejectReason(String str) {
        this.rejectReason = str;
        return this;
    }

    public TransferData withTransferDate(Date date) {
        this.transferDate = date;
        return this;
    }

    public TransferData withTransferMessage(String str) {
        this.transferMessage = str;
        return this;
    }
}
