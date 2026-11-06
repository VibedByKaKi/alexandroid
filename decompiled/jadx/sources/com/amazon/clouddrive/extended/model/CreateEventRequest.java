package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateEventRequest implements CloudDriveRequest {
    private String eventType;
    private Map<String, String> parametersMap = new HashMap();

    public CreateEventRequest(String str) {
        this.eventType = str;
    }

    public void addParameter(String str, String str2) {
        this.parametersMap.put(str, str2);
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof CreateEventRequest)) {
            return 1;
        }
        CreateEventRequest createEventRequest = (CreateEventRequest) cloudDriveRequest;
        String eventType = getEventType();
        String eventType2 = createEventRequest.getEventType();
        if (eventType != eventType2) {
            if (eventType == null) {
                return -1;
            }
            if (eventType2 == null) {
                return 1;
            }
            int compareTo = eventType.compareTo(eventType2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        Map<String, String> parametersMap = getParametersMap();
        Map<String, String> parametersMap2 = createEventRequest.getParametersMap();
        if (parametersMap != parametersMap2) {
            if (parametersMap == null) {
                return -1;
            }
            if (parametersMap2 == null) {
                return 1;
            }
            if (parametersMap instanceof Comparable) {
                int compareTo2 = ((Comparable) parametersMap).compareTo(parametersMap2);
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            } else if (!parametersMap.equals(parametersMap2)) {
                int hashCode = parametersMap.hashCode();
                int hashCode2 = parametersMap2.hashCode();
                if (hashCode < hashCode2) {
                    return -1;
                }
                if (hashCode > hashCode2) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getEventType() {
        return this.eventType;
    }

    public Map<String, String> getParametersMap() {
        return this.parametersMap;
    }

    public int hashCode() {
        Map<String, String> map = this.parametersMap;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.eventType;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setParametersMap(Map<String, String> map) {
        this.parametersMap = map;
    }
}
