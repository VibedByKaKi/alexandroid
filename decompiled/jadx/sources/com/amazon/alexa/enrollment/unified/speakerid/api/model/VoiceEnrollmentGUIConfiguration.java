package com.amazon.alexa.enrollment.unified.speakerid.api.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceEnrollmentGUIConfiguration {
    private final long getVoiceEnrollmentStatusApiTimeout;
    private final boolean guiEnrollmentEnabled;
    private final int maxRetriesPerTrainingPhrase;
    private final long timeIntervalBetweenEnrollmentPhrases;

    public VoiceEnrollmentGUIConfiguration(int i, long j, long j2, boolean z) {
        this.maxRetriesPerTrainingPhrase = i;
        this.getVoiceEnrollmentStatusApiTimeout = j;
        this.timeIntervalBetweenEnrollmentPhrases = j2;
        this.guiEnrollmentEnabled = z;
    }

    public boolean getIsGuiEnrollmentEnabled() {
        return this.guiEnrollmentEnabled;
    }

    public int getMaxRetriesPerTrainingPhrase() {
        return this.maxRetriesPerTrainingPhrase;
    }

    public long getTimeIntervalBetweenEnrollmentPhrases() {
        return this.timeIntervalBetweenEnrollmentPhrases;
    }

    public long getVoiceEnrollmentStatusApiTimeout() {
        return this.getVoiceEnrollmentStatusApiTimeout;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("MaxRetriesPerTrainingPhrase: ");
        stringBuffer.append(this.maxRetriesPerTrainingPhrase);
        stringBuffer.append(" GetVoiceEnrollmentStatusApiTimeout: ");
        stringBuffer.append(this.getVoiceEnrollmentStatusApiTimeout);
        stringBuffer.append(" TimeIntervalBetweenEnrollmentPhrases: ");
        stringBuffer.append(this.timeIntervalBetweenEnrollmentPhrases);
        stringBuffer.append(" GuiEnrollmentEnabled: ");
        stringBuffer.append(this.guiEnrollmentEnabled);
        return stringBuffer.toString();
    }
}
