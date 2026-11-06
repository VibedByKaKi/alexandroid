package com.amazon.alexa.accessorykit.findmy;

import com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class FindMyAccessoryManager$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FindMyAccessoryInformation f$0;

    public /* synthetic */ FindMyAccessoryManager$$ExternalSyntheticLambda8(FindMyAccessoryInformation findMyAccessoryInformation, int i) {
        this.$r8$classId = i;
        this.f$0 = findMyAccessoryInformation;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        FindMyAccessoryInformation findMyAccessoryInformation = this.f$0;
        switch (i) {
            case 0:
                FindMyAccessoryManager.lambda$reportLocationInformation$4(findMyAccessoryInformation, (ReportLocationsResponse) obj);
                break;
            case 1:
                FindMyAccessoryManager.lambda$queryDeviceForUssSettingAndReportLocation$8(findMyAccessoryInformation, (Throwable) obj);
                break;
            case 2:
                FindMyAccessoryManager.lambda$fetchAndReportLocationInformation$1(findMyAccessoryInformation, (Throwable) obj);
                break;
            case 3:
                FindMyAccessoryManager.lambda$fetchAndReportLocationInformation$3(findMyAccessoryInformation, (Throwable) obj);
                break;
            case 4:
                FindMyAccessoryManager.lambda$fetchUssSettingAndReportLocation$12(findMyAccessoryInformation, (Throwable) obj);
                break;
            default:
                FindMyAccessoryManager.lambda$reportLocationInformation$5(findMyAccessoryInformation, (Throwable) obj);
                break;
        }
    }
}
