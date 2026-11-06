package com.amazon.bluefront.api.v1;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class RequestParameters implements Comparable<RequestParameters> {
    private Map<String, String> mMetadata;
    private RecognitionParameters mRecognitionParameters;
    private String mRequestId;

    @Override // java.lang.Comparable
    public int compareTo(RequestParameters requestParameters) {
        if (requestParameters == null) {
            return -1;
        }
        if (requestParameters == this) {
            return 0;
        }
        String requestId = getRequestId();
        String requestId2 = requestParameters.getRequestId();
        if (requestId != requestId2) {
            if (requestId == null) {
                return -1;
            }
            if (requestId2 == null) {
                return 1;
            }
            int compareTo = requestId.compareTo(requestId2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        RecognitionParameters recognitionParameters = getRecognitionParameters();
        RecognitionParameters recognitionParameters2 = requestParameters.getRecognitionParameters();
        if (recognitionParameters != recognitionParameters2) {
            if (recognitionParameters == null) {
                return -1;
            }
            if (recognitionParameters2 == null) {
                return 1;
            }
            int compareTo2 = recognitionParameters.compareTo(recognitionParameters2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        Map<String, String> metadata = getMetadata();
        Map<String, String> metadata2 = requestParameters.getMetadata();
        if (metadata != metadata2) {
            if (metadata == null) {
                return -1;
            }
            if (metadata2 == null) {
                return 1;
            }
            if (metadata instanceof Comparable) {
                int compareTo3 = ((Comparable) metadata).compareTo(metadata2);
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            } else if (!metadata.equals(metadata2)) {
                int hashCode = metadata.hashCode();
                int hashCode2 = metadata2.hashCode();
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
        if (obj == this) {
            return true;
        }
        return (obj instanceof RequestParameters) && compareTo((RequestParameters) obj) == 0;
    }

    public Map<String, String> getMetadata() {
        return this.mMetadata;
    }

    public RecognitionParameters getRecognitionParameters() {
        return this.mRecognitionParameters;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public int hashCode() {
        return (getRequestId() == null ? 0 : getRequestId().hashCode()) + 1 + (getRecognitionParameters() == null ? 0 : getRecognitionParameters().hashCode()) + (getMetadata() != null ? getMetadata().hashCode() : 0);
    }

    public void setMetadata(Map<String, String> map) {
        this.mMetadata = map;
    }

    public void setRecognitionParameters(RecognitionParameters recognitionParameters) {
        this.mRecognitionParameters = recognitionParameters;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }
}
