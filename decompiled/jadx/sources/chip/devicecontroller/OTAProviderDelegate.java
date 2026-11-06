package chip.devicecontroller;

import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface OTAProviderDelegate {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ApplyUpdateActionEnum {
        Proceed(0),
        AwaitNextAction(1),
        Discontinue(2);

        private int value;

        ApplyUpdateActionEnum(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ApplyUpdateResponse {
        private ApplyUpdateActionEnum action;
        private long delayedActionTime;

        public ApplyUpdateResponse(ApplyUpdateActionEnum applyUpdateActionEnum, long j) {
            this.action = applyUpdateActionEnum;
            this.delayedActionTime = j;
        }

        public int getAction() {
            return this.action.getValue();
        }

        public long getDelayedActionTime() {
            return this.delayedActionTime;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BDXData {

        @Nullable
        private byte[] data;
        private boolean isEOF;

        public BDXData(byte[] bArr, boolean z) {
            this.data = bArr;
            this.isEOF = z;
        }

        public byte[] getData() {
            return this.data;
        }

        public boolean isEOF() {
            return this.isEOF;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum QueryImageResponseStatusEnum {
        UpdateAvailable(0),
        Busy(1),
        NotAvailable(2),
        DownloadProtocolNotSupported(3);

        private int value;

        QueryImageResponseStatusEnum(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    ApplyUpdateResponse handleApplyUpdateRequest(long j, long j2);

    BDXData handleBDXQuery(long j, int i, long j2, long j3);

    void handleBDXTransferSessionBegin(long j, String str, long j2);

    void handleBDXTransferSessionEnd(long j, long j2);

    void handleOTAQueryFailure(int i);

    QueryImageResponse handleQueryImage(int i, int i2, long j, @Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable byte[] bArr);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class QueryImageResponse {

        @Nullable
        Long delayedActionTime;

        @Nullable
        String filePath;

        @Nullable
        Long softwareVersion;

        @Nullable
        String softwareVersionString;
        QueryImageResponseStatusEnum status;

        @Nullable
        Boolean userConsentNeeded;

        public QueryImageResponse(@Nullable Long l, @Nullable String str, String str2, Boolean bool) {
            this.userConsentNeeded = null;
            this.delayedActionTime = null;
            this.status = QueryImageResponseStatusEnum.UpdateAvailable;
            this.softwareVersion = l;
            this.softwareVersionString = str;
            this.filePath = str2;
            this.userConsentNeeded = bool;
        }

        public Long getDelayedActionTime() {
            return this.delayedActionTime;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public Long getSoftwareVersion() {
            return this.softwareVersion;
        }

        public String getSoftwareVersionString() {
            return this.softwareVersionString;
        }

        public int getStatus() {
            return this.status.getValue();
        }

        public Boolean getUserConsentNeeded() {
            return this.userConsentNeeded;
        }

        public QueryImageResponse(QueryImageResponseStatusEnum queryImageResponseStatusEnum, long j, Boolean bool) {
            this.userConsentNeeded = null;
            this.delayedActionTime = null;
            this.status = queryImageResponseStatusEnum;
            this.delayedActionTime = Long.valueOf(j);
            this.userConsentNeeded = bool;
        }

        public QueryImageResponse(QueryImageResponseStatusEnum queryImageResponseStatusEnum, Boolean bool) {
            this.delayedActionTime = null;
            this.status = queryImageResponseStatusEnum;
            this.userConsentNeeded = bool;
        }
    }

    default void handleNotifyUpdateApplied(long j) {
    }
}
