package com.amazon.alexa.alertsca.metrics;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MetricsElement {
    private final String name;
    private MetricsElement parent;

    public MetricsElement(String str, MetricsElement metricsElement) {
        this.name = str;
        this.parent = metricsElement;
    }

    public MetricsElement element(int i) {
        return new MetricsElement(Integer.toString(i), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(getEventName(), ((MetricsElement) obj).getEventName());
    }

    public MetricsElement failure() {
        return new MetricsElement("Failure", this);
    }

    public String getEventName() {
        LinkedList linkedList = new LinkedList();
        do {
            String str = this.name;
            if (str != null) {
                linkedList.add(0, str);
            }
            this = this.parent;
        } while (this != null);
        return TextUtils.join(".", linkedList);
    }

    public int hashCode() {
        return Objects.hash(getEventName());
    }

    public MetricsElement result(boolean z) {
        return z ? success() : failure();
    }

    public MetricsElement success() {
        return new MetricsElement("Success", this);
    }

    public String toString() {
        return getEventName();
    }

    public MetricsElement(String str) {
        this.name = str;
    }

    public MetricsElement element(String str) {
        return new MetricsElement(str, this);
    }
}
