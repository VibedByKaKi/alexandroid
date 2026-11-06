package com.horcrux.svg;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PropHelper {
    private static final int inputMatrixDataSize = 6;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.horcrux.svg.PropHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$SVGLength$UnitType;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            $SwitchMap$com$horcrux$svg$SVGLength$UnitType = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double fromRelative(String str, double d, double d2, double d3) {
        double doubleValue;
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals(BaseTemplateProvider.NON_INVITATION_KEY)) {
            return 0.0d;
        }
        if (trim.codePointAt(i) == 37) {
            return (Double.valueOf(trim.substring(0, i)).doubleValue() / 100.0d) * d;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            switch (trim.substring(i2)) {
                case "cm":
                    d3 = 35.43307d;
                    length = i2;
                    break;
                case "em":
                    length = i2;
                    break;
                case "in":
                    d3 = 90.0d;
                    length = i2;
                    break;
                case "mm":
                    d3 = 3.543307d;
                    length = i2;
                    break;
                case "pc":
                    d3 = 15.0d;
                    length = i2;
                    break;
                case "pt":
                    d3 = 1.25d;
                    length = i2;
                    break;
                case "px":
                    length = i2;
                    d3 = 1.0d;
                    break;
                default:
                    d3 = 1.0d;
                    break;
            }
            doubleValue = Double.valueOf(trim.substring(0, length)).doubleValue() * d3;
        } else {
            doubleValue = Double.valueOf(trim).doubleValue();
        }
        return doubleValue * d2;
    }

    public static int toMatrixData(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double fromRelative(SVGLength sVGLength, double d, double d2, double d3, double d4) {
        double d5;
        if (sVGLength == null) {
            return d2;
        }
        SVGLength.UnitType unitType = sVGLength.unit;
        double d6 = sVGLength.value;
        switch (AnonymousClass1.$SwitchMap$com$horcrux$svg$SVGLength$UnitType[unitType.ordinal()]) {
            case 1:
            case 2:
                d4 = 1.0d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 3:
                d5 = (d6 / 100.0d) * d;
                return d5 + d2;
            case 4:
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 5:
                d4 /= 2.0d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 6:
                d4 = 35.43307d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 7:
                d4 = 3.543307d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 8:
                d4 = 90.0d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 9:
                d4 = 1.25d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            case 10:
                d4 = 15.0d;
                return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(d6, d4, d3, d2);
            default:
                d5 = d6 * d3;
                return d5 + d2;
        }
    }
}
