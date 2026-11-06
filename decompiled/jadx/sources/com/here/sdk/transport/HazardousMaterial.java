package com.here.sdk.transport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum HazardousMaterial {
    EXPLOSIVE(0),
    GAS(1),
    FLAMMABLE(2),
    COMBUSTIBLE(3),
    ORGANIC(4),
    POISON(5),
    RADIOACTIVE(6),
    CORROSIVE(7),
    POISONOUS_INHALATION(8),
    HARMFUL_TO_WATER(9),
    OTHER(10);

    public final int value;

    HazardousMaterial(int i) {
        this.value = i;
    }
}
