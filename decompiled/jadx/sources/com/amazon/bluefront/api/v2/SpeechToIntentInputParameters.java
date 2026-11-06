package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeechToIntentInputParameters implements Comparable<SpeechToIntentInputParameters> {
    private IntentParameters mIntentParams;
    private ServiceParameters mServiceParams;

    @Override // java.lang.Comparable
    public int compareTo(SpeechToIntentInputParameters speechToIntentInputParameters) {
        if (speechToIntentInputParameters == null) {
            return -1;
        }
        if (speechToIntentInputParameters == this) {
            return 0;
        }
        ServiceParameters serviceParams = getServiceParams();
        ServiceParameters serviceParams2 = speechToIntentInputParameters.getServiceParams();
        if (serviceParams != serviceParams2) {
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
        IntentParameters intentParams = getIntentParams();
        IntentParameters intentParams2 = speechToIntentInputParameters.getIntentParams();
        if (intentParams != intentParams2) {
            if (intentParams == null) {
                return -1;
            }
            if (intentParams2 == null) {
                return 1;
            }
            int compareTo2 = intentParams.compareTo(intentParams2);
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
        return (obj instanceof SpeechToIntentInputParameters) && compareTo((SpeechToIntentInputParameters) obj) == 0;
    }

    public IntentParameters getIntentParams() {
        return this.mIntentParams;
    }

    public ServiceParameters getServiceParams() {
        return this.mServiceParams;
    }

    public int hashCode() {
        return (getServiceParams() == null ? 0 : getServiceParams().hashCode()) + 1 + (getIntentParams() != null ? getIntentParams().hashCode() : 0);
    }

    public void setIntentParams(IntentParameters intentParameters) {
        this.mIntentParams = intentParameters;
    }

    public void setServiceParams(ServiceParameters serviceParameters) {
        this.mServiceParams = serviceParameters;
    }
}
