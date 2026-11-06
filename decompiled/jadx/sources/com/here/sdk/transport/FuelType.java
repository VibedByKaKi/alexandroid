package com.here.sdk.transport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum FuelType {
    DIESEL(1),
    LPG(2),
    BIO_DIESEL(3),
    CNG(4),
    DIESEL_WITH_ADDITIVES(5),
    E10(6),
    E20(7),
    E85(8),
    ETHANOL(9),
    ETHANOL_WITH_ADDITIVES(10),
    GASOLINE(11),
    GASOHOL_91(12),
    GASOHOL_95(13),
    HVO(14),
    HYDROGEN(15),
    LNG(16),
    MIDGRADE(17),
    PREMIUM(18),
    PREMIUM_WITH_ADDITIVES(19),
    REGULAR(20),
    REGULAR_WITH_ADDITIVES(21),
    OCTANE_87(22),
    OCTANE_89(23),
    OCTANE_90(24),
    OCTANE_91(25),
    OCTANE_92(26),
    OCTANE_93(27),
    OCTANE_95(28),
    OCTANE_98(29),
    OCTANE_100(30);

    public final int value;

    FuelType(int i) {
        this.value = i;
    }
}
