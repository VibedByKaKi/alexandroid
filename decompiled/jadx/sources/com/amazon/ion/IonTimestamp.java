package com.amazon.ion;

import java.math.BigDecimal;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonTimestamp extends IonValue {
    @Override // com.amazon.ion.IonValue
    IonTimestamp clone() throws UnknownSymbolException;

    Date dateValue();

    BigDecimal getDecimalMillis();

    Integer getLocalOffset() throws NullValueException;

    long getMillis() throws NullValueException;

    void makeNull();

    void setCurrentTime();

    void setCurrentTimeUtc();

    void setDecimalMillis(BigDecimal bigDecimal);

    void setLocalOffset(int i) throws NullValueException;

    void setLocalOffset(Integer num) throws NullValueException;

    void setMillis(long j);

    void setMillisUtc(long j);

    void setTime(Date date);

    void setValue(long j, Integer num);

    void setValue(Timestamp timestamp);

    void setValue(BigDecimal bigDecimal, Integer num);

    Timestamp timestampValue();
}
