package com.amazon.alexa.identity.featuregating;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class AssignmentResult {
    public Map<AssignmentMetadataKey, String> assignmentMetadata;
    public String treatment;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AssignmentMetadataKey {
        LOCALE_ID,
        RANDOMIZATION,
        APP_VERSION
    }

    public AssignmentResult(String str, Map<AssignmentMetadataKey, String> map) {
        this.treatment = str;
        this.assignmentMetadata = map;
    }

    public boolean isValid() {
        String str = this.treatment;
        if (str == null || str.equals("") || this.assignmentMetadata == null) {
            return false;
        }
        for (AssignmentMetadataKey assignmentMetadataKey : AssignmentMetadataKey.values()) {
            if (!this.assignmentMetadata.containsKey(assignmentMetadataKey) || this.assignmentMetadata.get(assignmentMetadataKey).equals("")) {
                return false;
            }
        }
        return true;
    }
}
