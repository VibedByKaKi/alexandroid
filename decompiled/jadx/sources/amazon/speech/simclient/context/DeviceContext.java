package amazon.speech.simclient.context;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class DeviceContext {
    private static final String DELIMETER = "#";
    private static final String EMPTY_PAYLOAD = "{}";
    private static final String NULL = "null";
    private String mCaller;
    private Lifecycle mLifecycle;
    private final String mName;
    private final String mNamespace;
    private String mPayload;
    private Date mTimeOfSample;
    private long mUncertaintyInMilliseconds = 0;
    private PublishState mPublishState = PublishState.UNPUBLISHED;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PublishState {
        UNPUBLISHED,
        PENDING,
        PUBLISHED
    }

    @Deprecated
    public DeviceContext(String str) {
        String[] split = str.split("#");
        if (split.length < 5) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.mNamespace = split[0];
        this.mName = split[1];
        this.mLifecycle = Lifecycle.fromInt(Integer.parseInt(split[2]));
        this.mCaller = "null".equals(split[3]) ? null : split[3];
        this.mPayload = join("#", (String[]) Arrays.copyOfRange(split, 4, split.length));
    }

    private String join(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(str);
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public boolean deepEquals(DeviceContext deviceContext) {
        return equals(deviceContext) && this.mCaller.equals(deviceContext.mCaller) && this.mPayload.equals(deviceContext.mPayload) && this.mTimeOfSample.equals(deviceContext.mTimeOfSample) && this.mUncertaintyInMilliseconds == deviceContext.mUncertaintyInMilliseconds && this.mPublishState == deviceContext.mPublishState;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof DeviceContext)) {
            DeviceContext deviceContext = (DeviceContext) obj;
            if (getNamespace().equals(deviceContext.getNamespace()) && getName().equals(deviceContext.getName())) {
                return true;
            }
        }
        return false;
    }

    public String getCaller() {
        return this.mCaller;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycle;
    }

    public String getName() {
        return this.mName;
    }

    public String getNamespace() {
        return this.mNamespace;
    }

    public String getPayload() {
        String str = this.mPayload;
        return str != null ? str : EMPTY_PAYLOAD;
    }

    public PublishState getPublishState() {
        return this.mPublishState;
    }

    public String getTimeOfSample() {
        return ISO8601DateUtil.getInstance().getTimestamp(this.mTimeOfSample);
    }

    public Date getTimeOfSampleAsDate() {
        return this.mTimeOfSample;
    }

    public long getUncertaintyInMilliseconds() {
        return this.mUncertaintyInMilliseconds;
    }

    public int hashCode() {
        return Objects.hash(getNamespace(), getName());
    }

    public void setPublishState(PublishState publishState) {
        this.mPublishState = publishState;
    }

    public String toString() {
        return String.format("%s%s%s%s%d%s%s%s%s", getNamespace(), "#", getName(), "#", Integer.valueOf(getLifecycle().getValue()), "#", getCaller() == null ? "null" : getCaller(), "#", getPayload());
    }

    public DeviceContext withCaller(String str) {
        this.mCaller = str;
        return this;
    }

    public DeviceContext withLifecycle(Lifecycle lifecycle) {
        this.mLifecycle = lifecycle;
        return this;
    }

    public DeviceContext withPayload(String str) {
        this.mPayload = str;
        return this;
    }

    public DeviceContext withTimeOfSample(Date date) {
        this.mTimeOfSample = date;
        return this;
    }

    public DeviceContext withUncertaintyInMilliseconds(long j) {
        if (j >= 0) {
            this.mUncertaintyInMilliseconds = j;
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("uncertaintyInMilliseconds cannot be negative.");
        return null;
    }

    public DeviceContext(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                this.mNamespace = str;
                this.mName = str2;
                this.mTimeOfSample = new Date();
                this.mLifecycle = Lifecycle.TRANSIENT;
                return;
            }
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        throw null;
    }
}
