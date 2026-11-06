package com.amazon.alexa.accessory.frames.smartPlay.dynamicUtterance.models;

import java.time.LocalDateTime;
import java.time.Month;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum Season {
    SPRING("sprg"),
    SUMMER("summ"),
    FALL("fall"),
    WINTER("wint");

    public String metricId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.smartPlay.dynamicUtterance.models.Season$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$Month;

        static {
            int[] iArr = new int[Month.values().length];
            $SwitchMap$java$time$Month = iArr;
            try {
                iArr[Month.MARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$Month[Month.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$Month[Month.MAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$Month[Month.JUNE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$Month[Month.JULY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$Month[Month.AUGUST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$Month[Month.SEPTEMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$Month[Month.OCTOBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$Month[Month.NOVEMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$Month[Month.DECEMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$Month[Month.JANUARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$Month[Month.FEBRUARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    Season(String str) {
        this.metricId = str;
    }

    public static Season fromLocalDateTime(LocalDateTime localDateTime) {
        switch (AnonymousClass1.$SwitchMap$java$time$Month[localDateTime.getMonth().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return SPRING;
            case 4:
            case 5:
            case 6:
                return SUMMER;
            case 7:
            case 8:
            case 9:
                return FALL;
            case 10:
            case 11:
            case 12:
                return WINTER;
            default:
                return null;
        }
    }

    public String getMetricId() {
        return this.metricId;
    }
}
