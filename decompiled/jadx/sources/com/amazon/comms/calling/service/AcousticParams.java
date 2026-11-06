package com.amazon.comms.calling.service;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AcousticParams {
    private final Param[] paramsList = new Param[Constraint.values().length];

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Constraint {
        ECHO_CANCELLATION,
        AUTO_GAIN_CONTROL,
        HIGH_PASS_FILTER,
        NOISE_SUPPRESSION,
        AUDIO_NB_FILTER
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Param {
        private final boolean enabled;
        private final Constraint key;

        public Param(Constraint constraint, boolean z) {
            this.key = constraint;
            this.enabled = z;
        }

        public Constraint getKey() {
            return this.key;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public String toString() {
            return "AcousticParams.Param(key=" + getKey() + ", enabled=" + isEnabled() + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public AcousticParams() {
        initializeAllConstraints(this, true);
    }

    public static AcousticParams disabled() {
        AcousticParams acousticParams = new AcousticParams();
        initializeAllConstraints(acousticParams, false);
        return acousticParams;
    }

    public static AcousticParams enabled() {
        AcousticParams acousticParams = new AcousticParams();
        initializeAllConstraints(acousticParams, true);
        return acousticParams;
    }

    private static void initializeAllConstraints(AcousticParams acousticParams, boolean z) {
        for (Constraint constraint : Constraint.values()) {
            acousticParams.setConstraint(constraint, z);
        }
    }

    public List<Param> getAllParams() {
        return ImmutableList.copyOf(this.paramsList);
    }

    public Param getConstraint(Constraint constraint) {
        return this.paramsList[constraint.ordinal()];
    }

    public void setConstraint(Constraint constraint, boolean z) {
        this.paramsList[constraint.ordinal()] = new Param(constraint, z);
    }
}
