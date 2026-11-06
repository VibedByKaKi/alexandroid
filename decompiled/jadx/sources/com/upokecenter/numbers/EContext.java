package com.upokecenter.numbers;

import androidx.collection.SieveCacheKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class EContext {
    public static final EContext Basic;
    public static final EContext BigDecimalJava;
    public static final EContext Binary128;
    public static final EContext Binary16;
    public static final EContext Binary32;
    public static final EContext Binary64;
    public static final EContext CliDecimal;
    public static final EContext Decimal128;
    public static final EContext Decimal32;
    public static final EContext Decimal64;
    public static final int FlagClamped = 32;
    public static final int FlagDivideByZero = 128;
    public static final int FlagInexact = 1;
    public static final int FlagInvalid = 64;
    public static final int FlagLostDigits = 256;
    public static final int FlagOverflow = 16;
    public static final int FlagRounded = 2;
    public static final int FlagSubnormal = 4;
    public static final int FlagUnderflow = 8;
    private static final EContext ForRoundingDown;
    private static final EContext ForRoundingHalfEven;
    public static final EContext Unlimited;
    public static final EContext UnlimitedHalfEven;
    private final boolean adjustExponent;
    private final EInteger bigintPrecision;
    private final boolean clampNormalExponents;
    private final EInteger exponentMax;
    private final EInteger exponentMin;
    private int flags;
    private final boolean hasExponentRange;
    private final boolean hasFlags;
    private final boolean precisionInBits;
    private final ERounding rounding;
    private final boolean simplified;
    private final int traps;

    static {
        ERounding eRounding = ERounding.HalfUp;
        Basic = ForPrecisionAndRounding(9, eRounding);
        BigDecimalJava = new EContext(0, eRounding, 0, 0, true).WithExponentClamp(true).WithAdjustExponent(false).WithBigExponentRange(EInteger.FromInt32(0).Subtract(EInteger.FromInt64(SieveCacheKt.NodeLinkMask)), EInteger.FromInt32(1).Add(EInteger.FromInt64(SieveCacheKt.NodeLinkMask)));
        ERounding eRounding2 = ERounding.HalfEven;
        Binary128 = ForPrecisionAndRounding(113, eRounding2).WithExponentClamp(true).WithExponentRange(-16382, 16383);
        Binary16 = ForPrecisionAndRounding(11, eRounding2).WithExponentClamp(true).WithExponentRange(-14, 15);
        Binary32 = ForPrecisionAndRounding(24, eRounding2).WithExponentClamp(true).WithExponentRange(-126, 127);
        Binary64 = ForPrecisionAndRounding(53, eRounding2).WithExponentClamp(true).WithExponentRange(-1022, 1023);
        CliDecimal = new EContext(96, eRounding2, 0, 28, true).WithPrecisionInBits(true);
        Decimal128 = new EContext(34, eRounding2, -6143, 6144, true);
        Decimal32 = new EContext(7, eRounding2, -95, 96, true);
        Decimal64 = new EContext(16, eRounding2, -383, 384, true);
        Unlimited = ForPrecision(0);
        UnlimitedHalfEven = ForPrecision(0).WithRounding(eRounding2);
        ForRoundingHalfEven = new EContext(0, eRounding2, 0, 0, false).WithUnlimitedExponents();
        ForRoundingDown = new EContext(0, ERounding.Down, 0, 0, false).WithUnlimitedExponents();
    }

    private EContext(boolean z, EInteger eInteger, boolean z2, EInteger eInteger2, EInteger eInteger3, int i, boolean z3, boolean z4, boolean z5, ERounding eRounding, boolean z6, int i2) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigintPrecision");
            throw null;
        }
        if (eInteger3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("exponentMin");
            throw null;
        }
        if (eInteger2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("exponentMax");
            throw null;
        }
        if (eInteger.signum() < 0) {
            XML$$ExternalSyntheticBUOutline0.m("precision(", eInteger, ") is less than 0");
            throw null;
        }
        if (eInteger3.compareTo(eInteger2) > 0) {
            Single$$ExternalSyntheticBUOutline0.m("exponentMinSmall(", eInteger3, ") is more than ", eInteger2);
            throw null;
        }
        this.adjustExponent = z;
        this.bigintPrecision = eInteger;
        this.clampNormalExponents = z2;
        this.exponentMax = eInteger2;
        this.exponentMin = eInteger3;
        this.flags = i;
        this.hasExponentRange = z3;
        this.hasFlags = z4;
        this.precisionInBits = z5;
        this.rounding = eRounding;
        this.simplified = z6;
        this.traps = i2;
    }

    public static EContext ForPrecision(int i) {
        return new EContext(i, ERounding.HalfUp, 0, 0, false).WithUnlimitedExponents();
    }

    public static EContext ForPrecisionAndRounding(int i, ERounding eRounding) {
        return new EContext(i, eRounding, 0, 0, false).WithUnlimitedExponents();
    }

    public static EContext ForRounding(ERounding eRounding) {
        return eRounding == ERounding.HalfEven ? ForRoundingHalfEven : eRounding == ERounding.Down ? ForRoundingDown : new EContext(0, eRounding, 0, 0, false).WithUnlimitedExponents();
    }

    public EContext Copy() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public boolean ExponentWithinRange(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("exponent");
            return false;
        }
        if (!getHasExponentRange()) {
            return true;
        }
        if (this.bigintPrecision.isZero()) {
            return eInteger.compareTo(getEMax()) <= 0;
        }
        return (this.adjustExponent ? eInteger.Add(this.bigintPrecision).Subtract(1) : eInteger).compareTo(getEMin()) >= 0 && eInteger.compareTo(getEMax()) <= 0;
    }

    public EContext GetNontrapping() {
        return getTraps() == 0 ? this : WithTraps(0).WithBlankFlags();
    }

    public <T> T TriggerTraps(T t, EContext eContext) {
        if (eContext != null && eContext.getFlags() != 0) {
            if (getHasFlags()) {
                this.flags |= eContext.getFlags();
            }
            int flags = eContext.getFlags() & getTraps();
            if (flags != 0) {
                int i = flags & (-40);
                if (i != 0) {
                    for (int i2 = 0; i2 < 32; i2++) {
                        int i3 = (1 << i2) & i;
                        if (i3 != 0) {
                            throw new ETrapException(flags, i3, this, t);
                        }
                    }
                }
                int i4 = flags & 4;
                if (i4 != 0) {
                    throw new ETrapException(flags, i4, this, t);
                }
                int i5 = flags & 1;
                if (i5 != 0) {
                    throw new ETrapException(flags, i5, this, t);
                }
                int i6 = flags & 2;
                if (i6 != 0) {
                    throw new ETrapException(flags, i6, this, t);
                }
                int i7 = flags & 32;
                if (i7 != 0) {
                    throw new ETrapException(flags, i7, this, t);
                }
            }
        }
        return t;
    }

    public EContext WithAdjustExponent(boolean z) {
        return new EContext(z, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithBigExponentRange(EInteger eInteger, EInteger eInteger2) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, eInteger2, eInteger, this.flags, true, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithBigPrecision(EInteger eInteger) {
        return new EContext(this.adjustExponent, eInteger, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithBlankFlags() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, 0, this.hasExponentRange, true, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithExponentClamp(boolean z) {
        return new EContext(this.adjustExponent, this.bigintPrecision, z, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithExponentRange(int i, int i2) {
        return WithBigExponentRange(EInteger.FromInt32(i), EInteger.FromInt32(i2));
    }

    public EContext WithNoFlags() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, 0, this.hasExponentRange, false, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithNoFlagsOrTraps() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, 0, this.hasExponentRange, false, this.precisionInBits, this.rounding, this.simplified, 0);
    }

    public EContext WithPrecision(int i) {
        return WithBigPrecision(EInteger.FromInt32(i));
    }

    public EContext WithPrecisionInBits(boolean z) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, z, this.rounding, this.simplified, this.traps);
    }

    public EContext WithRounding(ERounding eRounding) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, eRounding, this.simplified, this.traps);
    }

    public EContext WithSimplified(boolean z) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, z, this.traps);
    }

    public EContext WithTraps(int i) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, true, this.precisionInBits, this.rounding, this.simplified, i);
    }

    public EContext WithUnlimitedExponents() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, false, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public final boolean getAdjustExponent() {
        return this.adjustExponent;
    }

    public final boolean getClampNormalExponents() {
        return this.hasExponentRange && this.clampNormalExponents;
    }

    public final EInteger getEMax() {
        return this.hasExponentRange ? this.exponentMax : EInteger.FromInt32(0);
    }

    public final EInteger getEMin() {
        return this.hasExponentRange ? this.exponentMin : EInteger.FromInt32(0);
    }

    public final int getFlags() {
        return this.flags;
    }

    public final boolean getHasExponentRange() {
        return this.hasExponentRange;
    }

    public final boolean getHasFlags() {
        return this.hasFlags;
    }

    public final boolean getHasFlagsOrTraps() {
        return getHasFlags() || getTraps() != 0;
    }

    public final boolean getHasMaxPrecision() {
        return !this.bigintPrecision.isZero();
    }

    public final EInteger getPrecision() {
        return this.bigintPrecision;
    }

    public final ERounding getRounding() {
        return this.rounding;
    }

    public final int getTraps() {
        return this.traps;
    }

    public final boolean isPrecisionInBits() {
        return this.precisionInBits;
    }

    public final boolean isSimplified() {
        return this.simplified;
    }

    public final void setFlags(int i) {
        if (getHasFlags()) {
            this.flags = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Can't set flags");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[PrecisionContext ExponentMax=");
        sb.append(this.exponentMax);
        sb.append(", Traps=");
        sb.append(this.traps);
        sb.append(", ExponentMin=");
        sb.append(this.exponentMin);
        sb.append(", HasExponentRange=");
        sb.append(this.hasExponentRange);
        sb.append(", BigintPrecision=");
        sb.append(this.bigintPrecision);
        sb.append(", Rounding=");
        sb.append(this.rounding);
        sb.append(", ClampNormalExponents=");
        sb.append(this.clampNormalExponents);
        sb.append(", AdjustExponent=");
        sb.append(this.adjustExponent);
        sb.append(", Flags=");
        sb.append(this.flags);
        sb.append(", HasFlags=");
        sb.append(this.hasFlags);
        sb.append(", IsSimplified=");
        return a$$ExternalSyntheticOutline0.m(sb, this.simplified, MarkdownConstants.RIGHT_BRACKET);
    }

    public EContext(int i, ERounding eRounding, int i2, int i3, boolean z) {
        this(true, EInteger.FromInt32(i), z, EInteger.FromInt32(i3), EInteger.FromInt32(i2), 0, true, false, false, eRounding, false, 0);
    }

    public EContext(EInteger eInteger, ERounding eRounding, EInteger eInteger2, EInteger eInteger3, boolean z) {
        this(true, eInteger, z, eInteger3, eInteger2, 0, true, false, false, eRounding, false, 0);
    }
}
