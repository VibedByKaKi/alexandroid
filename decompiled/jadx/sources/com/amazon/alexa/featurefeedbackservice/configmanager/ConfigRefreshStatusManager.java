package com.amazon.alexa.featurefeedbackservice.configmanager;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.storage.SharedPreferenceRepo;
import com.amazon.alexa.featurefeedbackservice.util.ValidationUtils;
import dagger.Lazy;
import java.util.Objects;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes17.dex */
public class ConfigRefreshStatusManager {
    static final int DEFAULT_WAIT_TIME_FAILURE = 600;
    static final int DEFAULT_WAIT_TIME_SUCCESS = 3600;
    static final int MIN_WAIT_TIME = 60;
    public static final int NO_WAIT_TIME = 0;
    private static final String TAG = "ConfigRefreshStatusManager";
    private Integer configRetrievalWaitTimeForFailure;
    private Integer configRetrievalWaitTimeForSuccess;
    private Lazy<SharedPreferenceRepo> repo;

    public ConfigRefreshStatusManager(@NonNull Lazy<SharedPreferenceRepo> lazy) {
        ValidationUtils.validateNonNullObject("repo", lazy);
        this.repo = lazy;
    }

    private int getConfigRetrievalWaitTime(boolean z) {
        Integer num = z ? this.configRetrievalWaitTimeForSuccess : this.configRetrievalWaitTimeForFailure;
        if (num == null) {
            return z ? 3600 : 600;
        }
        if (num.intValue() <= 60) {
            return 60;
        }
        return num.intValue();
    }

    public int getConfigRefreshWaitTime(boolean z) {
        if (z) {
            return 0;
        }
        ValidationUtils.validateNonNullLazyObject("repo", this.repo);
        ConfigRefreshStatus configRefreshStatus = this.repo.get().getConfigRefreshStatus();
        Objects.toString(configRefreshStatus);
        if (configRefreshStatus.isInitial()) {
            return 0;
        }
        return getConfigRetrievalWaitTime(configRefreshStatus.isSuccess());
    }

    public void setConfigRefreshStatus(ConfigRefreshStatus configRefreshStatus) {
        ValidationUtils.validateNonNullLazyObject("repo", this.repo);
        this.repo.get().setConfigRefreshStatus(configRefreshStatus);
    }

    public void setConfigRetrievalWaitTimeForFailure(Integer num) {
        this.configRetrievalWaitTimeForFailure = num;
    }

    public void setConfigRetrievalWaitTimeForSuccess(Integer num) {
        this.configRetrievalWaitTimeForSuccess = num;
    }
}
