package com.amazon.alexa.identity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class PrivacyRegulations {
    private boolean isAgeVerificationRequired = false;
    private ArrayList<Integer> ageGates = new ArrayList<>();
    private ArrayList<String> ageClassifications = new ArrayList<>();
    private Map<String, Boolean> privacyScope = new HashMap();

    public boolean isAgeVerificationRequired() {
        return this.isAgeVerificationRequired;
    }

    public void setAgeClassifications(ArrayList<String> arrayList) {
        this.ageClassifications = arrayList;
    }

    public void setAgeGates(ArrayList<Integer> arrayList) {
        this.ageGates = arrayList;
    }

    public void setAgeVerificationRequired(boolean z) {
        this.isAgeVerificationRequired = z;
    }

    public void setPrivacyScope(Map<String, Boolean> map) {
        this.privacyScope = map;
    }
}
