package com.amazon.alexa.accessory.persistence.device.scheme;

import android.database.sqlite.SQLiteDatabase;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceScheme$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceScheme f$0;
    public final /* synthetic */ SQLiteDatabase f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ DeviceScheme$$ExternalSyntheticLambda0(DeviceScheme deviceScheme, SQLiteDatabase sQLiteDatabase, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = deviceScheme;
        this.f$1 = sQLiteDatabase;
        this.f$2 = str;
        this.f$3 = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createIndexCompletable$1(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$createTableCompletable$0(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
