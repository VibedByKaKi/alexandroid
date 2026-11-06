package com.google.googlejavaformat.java.javadoc;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class NestingCounter {
    private int value;

    public void decrementIfPositive() {
        int i = this.value;
        if (i > 0) {
            this.value = i - 1;
        }
    }

    public void increment() {
        this.value++;
    }

    public void incrementIfPositive() {
        int i = this.value;
        if (i > 0) {
            this.value = i + 1;
        }
    }

    public boolean isPositive() {
        return this.value > 0;
    }

    public void reset() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }
}
