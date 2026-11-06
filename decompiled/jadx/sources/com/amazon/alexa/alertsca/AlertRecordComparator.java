package com.amazon.alexa.alertsca;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertRecordComparator implements Comparator<AlertRecord> {
    @Override // java.util.Comparator
    public int compare(AlertRecord alertRecord, AlertRecord alertRecord2) {
        return (int) (alertRecord.getScheduledTime().getTime() - alertRecord2.getScheduledTime().getTime());
    }
}
