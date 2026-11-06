package com.amazon.bluefront.api.v1;

import com.amazon.bluefront.api.common.Customer;
import com.amazon.bluefront.api.common.Device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class RecognitionParameters implements Comparable<RecognitionParameters> {
    private Customer mCustomer;
    private Device mDevice;
    private ResultFormat mResultFormat;

    @Override // java.lang.Comparable
    public int compareTo(RecognitionParameters recognitionParameters) {
        if (recognitionParameters == null) {
            return -1;
        }
        if (recognitionParameters == this) {
            return 0;
        }
        Device device = getDevice();
        Device device2 = recognitionParameters.getDevice();
        if (device != device2) {
            if (device == null) {
                return -1;
            }
            if (device2 == null) {
                return 1;
            }
            int compareTo = device.compareTo(device2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        Customer customer = getCustomer();
        Customer customer2 = recognitionParameters.getCustomer();
        if (customer != customer2) {
            if (customer == null) {
                return -1;
            }
            if (customer2 == null) {
                return 1;
            }
            int compareTo2 = customer.compareTo(customer2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        ResultFormat resultFormat = getResultFormat();
        ResultFormat resultFormat2 = recognitionParameters.getResultFormat();
        if (resultFormat != resultFormat2) {
            if (resultFormat == null) {
                return -1;
            }
            if (resultFormat2 == null) {
                return 1;
            }
            int compareTo3 = resultFormat.compareTo(resultFormat2);
            if (compareTo3 != 0) {
                return compareTo3;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RecognitionParameters) && compareTo((RecognitionParameters) obj) == 0;
    }

    public Customer getCustomer() {
        return this.mCustomer;
    }

    public Device getDevice() {
        return this.mDevice;
    }

    public ResultFormat getResultFormat() {
        return this.mResultFormat;
    }

    public int hashCode() {
        return (getDevice() == null ? 0 : getDevice().hashCode()) + 1 + (getCustomer() == null ? 0 : getCustomer().hashCode()) + (getResultFormat() != null ? getResultFormat().hashCode() : 0);
    }

    public void setCustomer(Customer customer) {
        this.mCustomer = customer;
    }

    public void setDevice(Device device) {
        this.mDevice = device;
    }

    public void setResultFormat(ResultFormat resultFormat) {
        this.mResultFormat = resultFormat;
    }
}
