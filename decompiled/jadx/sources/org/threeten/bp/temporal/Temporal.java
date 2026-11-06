package org.threeten.bp.temporal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Temporal extends TemporalAccessor {
    boolean isSupported(TemporalUnit temporalUnit);

    Temporal minus(long j, TemporalUnit temporalUnit);

    Temporal minus(TemporalAmount temporalAmount);

    Temporal plus(long j, TemporalUnit temporalUnit);

    Temporal plus(TemporalAmount temporalAmount);

    long until(Temporal temporal, TemporalUnit temporalUnit);

    Temporal with(TemporalAdjuster temporalAdjuster);

    Temporal with(TemporalField temporalField, long j);
}
