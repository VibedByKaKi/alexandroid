package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ResumeState {
    public static final String FAILED = "FAILED";
    public static final String IN_PROGRESS = "IN_PROGRESS";
    public static final String READY_FOR_COMPLETION = "READY_FOR_COMPLETION";
    public static final String COMPLETED = "COMPLETED";
    private static final String[] values = {"IN_PROGRESS", READY_FOR_COMPLETION, COMPLETED, "FAILED"};

    private ResumeState() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
