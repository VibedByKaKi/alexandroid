package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeechToDataMartInputParameters implements Comparable<SpeechToDataMartInputParameters> {
    private ServiceParameters mServiceParams;

    @Override // java.lang.Comparable
    public int compareTo(SpeechToDataMartInputParameters speechToDataMartInputParameters) {
        ServiceParameters serviceParams;
        ServiceParameters serviceParams2;
        if (speechToDataMartInputParameters == null) {
            return -1;
        }
        if (speechToDataMartInputParameters != this && (serviceParams = getServiceParams()) != (serviceParams2 = speechToDataMartInputParameters.getServiceParams())) {
            if (serviceParams == null) {
                return -1;
            }
            if (serviceParams2 == null) {
                return 1;
            }
            int compareTo = serviceParams.compareTo(serviceParams2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SpeechToDataMartInputParameters) && compareTo((SpeechToDataMartInputParameters) obj) == 0;
    }

    public ServiceParameters getServiceParams() {
        return this.mServiceParams;
    }

    public int hashCode() {
        return (getServiceParams() == null ? 0 : getServiceParams().hashCode()) + 1;
    }

    public void setServiceParams(ServiceParameters serviceParameters) {
        this.mServiceParams = serviceParameters;
    }
}
