package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeechToTextInputParameters implements Comparable<SpeechToTextInputParameters> {
    private RecognitionParameters recognitionParams;
    private ServiceParameters serviceParams;

    @Override // java.lang.Comparable
    public int compareTo(SpeechToTextInputParameters speechToTextInputParameters) {
        if (speechToTextInputParameters == null) {
            return -1;
        }
        if (speechToTextInputParameters == this) {
            return 0;
        }
        RecognitionParameters recognitionParams = getRecognitionParams();
        RecognitionParameters recognitionParams2 = speechToTextInputParameters.getRecognitionParams();
        if (recognitionParams != recognitionParams2) {
            if (recognitionParams == null) {
                return -1;
            }
            if (recognitionParams2 == null) {
                return 1;
            }
            int compareTo = recognitionParams.compareTo(recognitionParams2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        ServiceParameters serviceParams = getServiceParams();
        ServiceParameters serviceParams2 = speechToTextInputParameters.getServiceParams();
        if (serviceParams != serviceParams2) {
            if (serviceParams == null) {
                return -1;
            }
            if (serviceParams2 == null) {
                return 1;
            }
            int compareTo2 = serviceParams.compareTo(serviceParams2);
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
        return (obj instanceof SpeechToTextInputParameters) && compareTo((SpeechToTextInputParameters) obj) == 0;
    }

    public RecognitionParameters getRecognitionParams() {
        return this.recognitionParams;
    }

    public ServiceParameters getServiceParams() {
        return this.serviceParams;
    }

    public int hashCode() {
        return (getRecognitionParams() == null ? 0 : getRecognitionParams().hashCode()) + 1 + (getServiceParams() != null ? getServiceParams().hashCode() : 0);
    }

    public void setRecognitionParams(RecognitionParameters recognitionParameters) {
        this.recognitionParams = recognitionParameters;
    }

    public void setServiceParams(ServiceParameters serviceParameters) {
        this.serviceParams = serviceParameters;
    }
}
