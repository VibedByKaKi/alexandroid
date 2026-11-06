package com.amazon.ptz.physical.events;

import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum PhysicalPtzEvent {
    DIRECTIVE_SENT("DirectiveSent"),
    MOTION_ENDED("MotionEnded"),
    OBSTACLE_ENCOUNTERED("ObstacleEncountered"),
    END_OF_RANGE("EndOfRange");

    private final String name;

    PhysicalPtzEvent(@Nonnull String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
