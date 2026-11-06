package com.amazon.alexa.enrollment.unified.speakerid.training;

import com.amazon.alexa.enrollment.unified.speakerid.api.model.EnrollmentStates;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentTrainingUiModel {
    private final EnrollmentStates currentState;
    private final Integer currentTrainingIndex;
    private final long lastUpdatedTime;
    private final boolean shouldRequestDialogFromUserSpeechProvider;
    private final List<String> trainingPhrases;

    public EnrollmentTrainingUiModel(List<String> list, Integer num, EnrollmentStates enrollmentStates, long j, boolean z) {
        this.trainingPhrases = list;
        this.currentTrainingIndex = num;
        this.currentState = enrollmentStates;
        this.lastUpdatedTime = j;
        this.shouldRequestDialogFromUserSpeechProvider = z;
    }

    public EnrollmentStates getCurrentState() {
        return this.currentState;
    }

    public Integer getCurrentTrainingIndex() {
        return this.currentTrainingIndex;
    }

    public long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public List<String> getTrainingPhrases() {
        return this.trainingPhrases;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it2 = this.trainingPhrases.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(it2.next());
            stringBuffer.append("\n");
        }
        return "currentTrainingIndex: " + this.currentTrainingIndex + " enrollment phrases: " + stringBuffer.toString() + " last updated time : " + this.lastUpdatedTime + " current state: " + this.currentState + " should request dialog: " + this.shouldRequestDialogFromUserSpeechProvider;
    }
}
