package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class GetCustomerProvisioneesSetupStatusResponse {
    private final ImmutableList<ProvisioneeSetupStatus> mProvisioneeSetupStatuses;
    private final String mSearchIntervalUsed;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private final List<ProvisioneeSetupStatus> mProvisioneeSetupStatuses = new ArrayList();
        private String mSearchIntervalUsed;

        public Builder addProvisioneeSetupStatus(ProvisioneeSetupStatus provisioneeSetupStatus) {
            this.mProvisioneeSetupStatuses.add(provisioneeSetupStatus);
            return this;
        }

        public GetCustomerProvisioneesSetupStatusResponse createResponse() {
            return new GetCustomerProvisioneesSetupStatusResponse(this);
        }

        public Builder setSearchIntervalUsed(String str) {
            this.mSearchIntervalUsed = str;
            return this;
        }
    }

    private GetCustomerProvisioneesSetupStatusResponse(Builder builder) {
        this.mProvisioneeSetupStatuses = ImmutableList.copyOf((Collection) builder.mProvisioneeSetupStatuses);
        this.mSearchIntervalUsed = builder.mSearchIntervalUsed;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GetCustomerProvisioneesSetupStatusResponse getCustomerProvisioneesSetupStatusResponse = (GetCustomerProvisioneesSetupStatusResponse) obj;
            if (Objects.equal(this.mProvisioneeSetupStatuses, getCustomerProvisioneesSetupStatusResponse.mProvisioneeSetupStatuses) && Objects.equal(this.mSearchIntervalUsed, getCustomerProvisioneesSetupStatusResponse.mSearchIntervalUsed)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<ProvisioneeSetupStatus> getProvisioneeSetupStatuses() {
        return this.mProvisioneeSetupStatuses;
    }

    public String getSearchIntervalUsed() {
        return this.mSearchIntervalUsed;
    }

    public int hashCode() {
        return Objects.hashCode(this.mProvisioneeSetupStatuses, this.mSearchIntervalUsed);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mProvisioneeSetupStatuses", this.mProvisioneeSetupStatuses).add("mSearchIntervalUsed", this.mSearchIntervalUsed).toString();
    }
}
