package com.amazon.alexa.enrollment.api.model;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceEnrollmentStatus {
    private final int currentTrainingPhraseIndex;
    private final EnrollmentStates enrollmentState;
    private final List<String> enrollmentTrainingPhrases;
    private final long lastUpdatedTime;
    private final String qualityCheckResult;

    public VoiceEnrollmentStatus(EnrollmentStates enrollmentStates, int i, long j, List<String> list, String str) {
        this.enrollmentState = enrollmentStates;
        this.currentTrainingPhraseIndex = i;
        this.lastUpdatedTime = j;
        this.enrollmentTrainingPhrases = list;
        this.qualityCheckResult = str;
    }

    public int getCurrentTrainingPhraseIndex() {
        return this.currentTrainingPhraseIndex;
    }

    public EnrollmentStates getEnrollmentState() {
        return this.enrollmentState;
    }

    public List<String> getEnrollmentTrainingPhrases() {
        return this.enrollmentTrainingPhrases;
    }

    public long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public String getQualityCheckResult() {
        return this.qualityCheckResult;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        List<String> list = this.enrollmentTrainingPhrases;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                stringBuffer.append(it2.next());
                stringBuffer.append("\n");
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer("EnrollmentState: ");
        stringBuffer2.append(this.enrollmentState);
        stringBuffer2.append(" CurrentTrainingPhraseIndex: ");
        stringBuffer2.append(this.currentTrainingPhraseIndex);
        stringBuffer2.append(" LastUpdatedTime: ");
        stringBuffer2.append(this.lastUpdatedTime);
        stringBuffer2.append(" EnrollmentTrainingPhrases: ");
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(" QualityCheckResult: ");
        stringBuffer2.append(this.qualityCheckResult);
        return stringBuffer2.toString();
    }
}
