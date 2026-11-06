package com.amazon.alexa.aamb.cbl;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class CblViewModel extends ViewModel {
    public static final int CBL_DONE = 3;
    public static final int CBL_START = 1;
    public static final int CBL_UNKNOWN = 0;
    public static final int CBL_WEB_VIEW = 2;
    private String cblCode;
    private final MutableLiveData<Integer> cblFlowLiveData = new MutableLiveData<>();
    private String cblUrl;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CblFlow {
    }

    public String getCblCode() {
        return this.cblCode;
    }

    public MutableLiveData<Integer> getCblFlow() {
        return this.cblFlowLiveData;
    }

    public String getCblUrl() {
        return this.cblUrl;
    }

    public void setCblCode(String str) {
        this.cblCode = str;
    }

    public void setCblFlow(int i) {
        this.cblFlowLiveData.setValue(Integer.valueOf(i));
    }

    public void setCblUrl(String str) {
        this.cblUrl = str;
    }
}
