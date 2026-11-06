package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Strings;
import com.amazon.alexa.ra.core.data.model.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.time.TimeZones;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERGeneralizedTime extends ASN1Primitive {
    private final byte[] time;

    public DERGeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    private String calculateGMTOffset() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(getDate())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m(TimeZones.GMT_ID, str);
        m3869m.append(convert(i));
        m3869m.append(":");
        m3869m.append(convert(i2));
        return m3869m.toString();
    }

    private String convert(int i) {
        return i < 10 ? a$$ExternalSyntheticOutline0.m(i, Constants.FEEDBACK_TYPE_DISLIKE) : Integer.toString(i);
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (obj instanceof DERGeneralizedTime) {
            return new ASN1GeneralizedTime(((DERGeneralizedTime) obj).time);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: "));
        return null;
    }

    private boolean hasFractionalSeconds() {
        int i = 0;
        while (true) {
            byte[] bArr = this.time;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERGeneralizedTime) {
            return Arrays.areEqual(this.time, ((DERGeneralizedTime) aSN1Primitive).time);
        }
        return false;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(24, this.time);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int length = this.time.length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        char charAt;
        String fromByteArray = Strings.fromByteArray(this.time);
        if (fromByteArray.endsWith("Z")) {
            simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (fromByteArray.indexOf(45) > 0 || fromByteArray.indexOf(43) > 0) {
            fromByteArray = getTime();
            simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            String substring = fromByteArray.substring(14);
            int i = 1;
            while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                fromByteArray = fromByteArray.substring(0, 14).concat(substring.substring(0, 4).concat(substring.substring(i)));
            } else if (i2 == 1) {
                StringBuilder sb = new StringBuilder();
                TableInfo$$ExternalSyntheticOutline0.m(substring, 0, i, sb, "00");
                fromByteArray = fromByteArray.substring(0, 14).concat(a$$ExternalSyntheticOutline0.m(substring, i, sb));
            } else if (i2 == 2) {
                StringBuilder sb2 = new StringBuilder();
                TableInfo$$ExternalSyntheticOutline0.m(substring, 0, i, sb2, Constants.FEEDBACK_TYPE_DISLIKE);
                fromByteArray = fromByteArray.substring(0, 14).concat(a$$ExternalSyntheticOutline0.m(substring, i, sb2));
            }
        }
        return simpleDateFormat.parse(fromByteArray);
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.time);
        if (AppLaunchChecker$$ExternalSyntheticOutline0.m(1, fromByteArray) == 'Z') {
            return fromByteArray.substring(0, fromByteArray.length() - 1).concat("GMT+00:00");
        }
        int length = fromByteArray.length();
        int i = length - 5;
        char charAt = fromByteArray.charAt(i);
        if (charAt == '-' || charAt == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(fromByteArray.substring(0, i));
            sb.append(TimeZones.GMT_ID);
            int i2 = length - 2;
            TableInfo$$ExternalSyntheticOutline0.m(fromByteArray, i, i2, sb, ":");
            return a$$ExternalSyntheticOutline0.m(fromByteArray, i2, sb);
        }
        int length2 = fromByteArray.length() - 3;
        char charAt2 = fromByteArray.charAt(length2);
        if (charAt2 != '-' && charAt2 != '+') {
            StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(fromByteArray);
            m.append(calculateGMTOffset());
            return m.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        TableInfo$$ExternalSyntheticOutline0.m(fromByteArray, 0, length2, sb2, TimeZones.GMT_ID);
        sb2.append(fromByteArray.substring(length2));
        sb2.append(":00");
        return sb2.toString();
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.time);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public DERGeneralizedTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$3(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERGeneralizedTime)) {
            return new ASN1GeneralizedTime(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }

    public DERGeneralizedTime(byte[] bArr) {
        this.time = bArr;
    }
}
