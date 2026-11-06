package edu.umd.cs.findbugs.annotations;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes9.dex */
public enum Priority {
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    IGNORE(5);

    private final int priorityValue;

    Priority(int i) {
        this.priorityValue = i;
    }

    public int getPriorityValue() {
        return this.priorityValue;
    }
}
