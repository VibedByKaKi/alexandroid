package com.amazon.alexa.accessory.repositories.fitness;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class FitnessSession {
    private final int sequenceId;
    private final UUID uuid;
    private final WorkoutState workoutState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WorkoutState {
        UNKNOWN,
        IDLE,
        ACTIVE,
        PAUSED
    }

    public FitnessSession(UUID uuid, int i, WorkoutState workoutState) {
        Preconditions.notNull(uuid, "uuid");
        Preconditions.notNull(workoutState, "workoutState");
        this.uuid = uuid;
        this.sequenceId = i;
        this.workoutState = workoutState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FitnessSession.class == obj.getClass()) {
            FitnessSession fitnessSession = (FitnessSession) obj;
            if (this.sequenceId == fitnessSession.sequenceId && Objects.equals(this.uuid, fitnessSession.uuid) && this.workoutState == fitnessSession.workoutState) {
                return true;
            }
        }
        return false;
    }

    public int getSequenceId() {
        return this.sequenceId;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public WorkoutState getWorkoutState() {
        return this.workoutState;
    }

    public int hashCode() {
        return Objects.hash(this.uuid, Integer.valueOf(this.sequenceId), this.workoutState);
    }

    public String toString() {
        return "FitnessSession{uuid=" + this.uuid + ", sequenceId=" + this.sequenceId + ", workoutState=" + this.workoutState + AbstractJsonLexerKt.END_OBJ;
    }
}
