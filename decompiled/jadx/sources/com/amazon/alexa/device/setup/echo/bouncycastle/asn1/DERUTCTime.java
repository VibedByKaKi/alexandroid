package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Strings;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.time.TimeZones;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERUTCTime extends ASN1Primitive {
    private final byte[] time;

    public DERUTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public static ASN1UTCTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (obj instanceof DERUTCTime) {
            return new ASN1UTCTime(((DERUTCTime) obj).time);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: "));
        return null;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERUTCTime) {
            return Arrays.areEqual(this.time, ((DERUTCTime) aSN1Primitive).time);
        }
        return false;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.write(23);
        int length = this.time.length;
        aSN1OutputStream.writeLength(length);
        for (int i = 0; i != length; i++) {
            aSN1OutputStream.write(this.time[i]);
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int length = this.time.length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(getAdjustedTime());
    }

    public String getAdjustedTime() {
        String time = getTime();
        return time.charAt(0) < '5' ? "20".concat(time) : "19".concat(time);
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat("yyMMddHHmmssz").parse(getTime());
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.time);
        if (fromByteArray.indexOf(45) < 0 && fromByteArray.indexOf(43) < 0) {
            return fromByteArray.length() == 11 ? fromByteArray.substring(0, 10).concat("00GMT+00:00") : fromByteArray.substring(0, 12).concat("GMT+00:00");
        }
        int indexOf = fromByteArray.indexOf(45);
        if (indexOf < 0) {
            indexOf = fromByteArray.indexOf(43);
        }
        if (indexOf == fromByteArray.length() - 3) {
            fromByteArray = fromByteArray.concat("00");
        }
        if (indexOf == 10) {
            StringBuilder sb = new StringBuilder();
            TableInfo$$ExternalSyntheticOutline0.m(fromByteArray, 0, 10, sb, "00GMT");
            TableInfo$$ExternalSyntheticOutline0.m(fromByteArray, 10, 13, sb, ":");
            sb.append(fromByteArray.substring(13, 15));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        TableInfo$$ExternalSyntheticOutline0.m(fromByteArray, 0, 12, sb2, TimeZones.GMT_ID);
        TableInfo$$ExternalSyntheticOutline0.m(fromByteArray, 12, 15, sb2, ":");
        sb2.append(fromByteArray.substring(15, 17));
        return sb2.toString();
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return Strings.fromByteArray(this.time);
    }

    public DERUTCTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$3(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1UTCTime)) {
            return new ASN1UTCTime(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }

    public DERUTCTime(byte[] bArr) {
        this.time = bArr;
    }
}
