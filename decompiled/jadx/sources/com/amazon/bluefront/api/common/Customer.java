package com.amazon.bluefront.api.common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Customer implements Comparable<Customer> {
    private String identifier;
    private String translateToObfuscatedCustomerIdFrom;

    @Override // java.lang.Comparable
    public int compareTo(Customer customer) {
        if (customer == null) {
            return -1;
        }
        if (customer == this) {
            return 0;
        }
        String translateToObfuscatedCustomerIdFrom = getTranslateToObfuscatedCustomerIdFrom();
        String translateToObfuscatedCustomerIdFrom2 = customer.getTranslateToObfuscatedCustomerIdFrom();
        if (translateToObfuscatedCustomerIdFrom != translateToObfuscatedCustomerIdFrom2) {
            if (translateToObfuscatedCustomerIdFrom == null) {
                return -1;
            }
            if (translateToObfuscatedCustomerIdFrom2 == null) {
                return 1;
            }
            int compareTo = translateToObfuscatedCustomerIdFrom.compareTo(translateToObfuscatedCustomerIdFrom2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String identifier = getIdentifier();
        String identifier2 = customer.getIdentifier();
        if (identifier != identifier2) {
            if (identifier == null) {
                return -1;
            }
            if (identifier2 == null) {
                return 1;
            }
            int compareTo2 = identifier.compareTo(identifier2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Customer) && compareTo((Customer) obj) == 0;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getTranslateToObfuscatedCustomerIdFrom() {
        return this.translateToObfuscatedCustomerIdFrom;
    }

    public int hashCode() {
        return (getTranslateToObfuscatedCustomerIdFrom() == null ? 0 : getTranslateToObfuscatedCustomerIdFrom().hashCode()) + 1 + (getIdentifier() != null ? getIdentifier().hashCode() : 0);
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setTranslateToObfuscatedCustomerIdFrom(String str) {
        this.translateToObfuscatedCustomerIdFrom = str;
    }
}
