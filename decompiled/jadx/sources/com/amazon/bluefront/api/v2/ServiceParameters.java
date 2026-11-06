package com.amazon.bluefront.api.v2;

import com.amazon.bluefront.api.common.Customer;
import com.amazon.bluefront.api.common.Device;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ServiceParameters implements Comparable<ServiceParameters> {
    private Customer customer;
    private Device device;
    private Map<String, String> metadata;
    private String requestId;
    private boolean saveRecords;

    private static int compareObjects(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        if (obj instanceof Comparable) {
            int compareTo = ((Comparable) obj).compareTo(obj2);
            if (compareTo != 0) {
                return compareTo;
            }
            return 0;
        }
        if (obj.equals(obj2)) {
            return 0;
        }
        int hashCode = obj.hashCode();
        int hashCode2 = obj2.hashCode();
        if (hashCode < hashCode2) {
            return -1;
        }
        return hashCode > hashCode2 ? 1 : 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(ServiceParameters serviceParameters) {
        if (serviceParameters == null) {
            return -1;
        }
        if (serviceParameters == this) {
            return 0;
        }
        int compareObjects = compareObjects(getRequestId(), serviceParameters.getRequestId());
        if (compareObjects != 0) {
            return compareObjects;
        }
        int compareObjects2 = compareObjects(getMetadata(), serviceParameters.getMetadata());
        if (compareObjects2 != 0) {
            return compareObjects2;
        }
        int compareObjects3 = compareObjects(getDevice(), serviceParameters.getDevice());
        if (compareObjects3 != 0) {
            return compareObjects3;
        }
        int compareObjects4 = compareObjects(getCustomer(), serviceParameters.getCustomer());
        if (compareObjects4 != 0) {
            return compareObjects4;
        }
        int compareObjects5 = compareObjects(isSaveRecords(), serviceParameters.isSaveRecords());
        if (compareObjects5 != 0) {
            return compareObjects5;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ServiceParameters) && compareTo((ServiceParameters) obj) == 0;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Device getDevice() {
        return this.device;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return (getRequestId() == null ? 0 : getRequestId().hashCode()) + 1 + (getMetadata() == null ? 0 : getMetadata().hashCode()) + (getDevice() == null ? 0 : getDevice().hashCode()) + (getCustomer() == null ? 0 : getCustomer().hashCode()) + (isSaveRecords() != null ? isSaveRecords().hashCode() : 0);
    }

    public Boolean isSaveRecords() {
        return Boolean.valueOf(this.saveRecords);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSaveRecords(Boolean bool) {
        this.saveRecords = bool.booleanValue();
    }
}
