package com.upokecenter.numbers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
interface IShiftAccumulator {
    FastInteger GetDigitLength();

    FastInteger OverestimateDigitLength();

    void ShiftRightInt(int i);

    void ShiftToDigits(FastInteger fastInteger, FastInteger fastInteger2, boolean z);

    int ShiftedIntMod(int i);

    void TruncateOrShiftRight(FastInteger fastInteger, boolean z);

    FastInteger getDiscardedDigitCount();

    int getLastDiscardedDigit();

    int getOlderDiscardedDigits();

    EInteger getShiftedInt();

    FastInteger getShiftedIntFast();
}
