package com.amazon.deecomms.nativemodules.cvf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CvfOtpReader$OtpReaderJsInterface$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CvfOtpReader f$0;

    public /* synthetic */ CvfOtpReader$OtpReaderJsInterface$$ExternalSyntheticLambda0(CvfOtpReader cvfOtpReader, int i) {
        this.$r8$classId = i;
        this.f$0 = cvfOtpReader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CvfOtpReader cvfOtpReader = this.f$0;
        switch (i) {
            case 0:
                cvfOtpReader.startSmsConsentListener();
                break;
            default:
                cvfOtpReader.deliverBufferedOtp();
                break;
        }
    }
}
