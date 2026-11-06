package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.GetCustomerProvisioneesSetupStatusResponse;
import com.google.common.base.Preconditions;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class RecentlySetupDevicesViewModel implements Parcelable {
    public static final Parcelable.Creator<RecentlySetupDevicesViewModel> CREATOR = new Parcelable.Creator<RecentlySetupDevicesViewModel>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.RecentlySetupDevicesViewModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecentlySetupDevicesViewModel createFromParcel(Parcel parcel) {
            return new RecentlySetupDevicesViewModel(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecentlySetupDevicesViewModel[] newArray(int i) {
            return new RecentlySetupDevicesViewModel[i];
        }
    };
    private final GetCustomerProvisioneesSetupStatusResponse mGetCustomerProvisioneesSetupStatusResponse;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private GetCustomerProvisioneesSetupStatusResponse mGetCustomerProvisioneesSetupStatusResponse;

        public RecentlySetupDevicesViewModel build() {
            Preconditions.checkNotNull(this.mGetCustomerProvisioneesSetupStatusResponse);
            return new RecentlySetupDevicesViewModel(this, 0);
        }

        public Builder setGetCustomerProvisioneesSetupStatusResponse(GetCustomerProvisioneesSetupStatusResponse getCustomerProvisioneesSetupStatusResponse) {
            this.mGetCustomerProvisioneesSetupStatusResponse = getCustomerProvisioneesSetupStatusResponse;
            return this;
        }
    }

    private RecentlySetupDevicesViewModel(Parcel parcel) {
        GetCustomerProvisioneesSetupStatusResponse getCustomerProvisioneesSetupStatusResponse = (GetCustomerProvisioneesSetupStatusResponse) parcel.readParcelable(GetCustomerProvisioneesSetupStatusResponse.class.getClassLoader());
        this.mGetCustomerProvisioneesSetupStatusResponse = getCustomerProvisioneesSetupStatusResponse;
        Preconditions.checkState(getCustomerProvisioneesSetupStatusResponse != null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetCustomerProvisioneesSetupStatusResponse getCustomerProvisioneesSetupStatusResponse() {
        return this.mGetCustomerProvisioneesSetupStatusResponse;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mGetCustomerProvisioneesSetupStatusResponse, i);
    }

    public /* synthetic */ RecentlySetupDevicesViewModel(Builder builder, int i) {
        this(builder);
    }

    private RecentlySetupDevicesViewModel(Builder builder) {
        this.mGetCustomerProvisioneesSetupStatusResponse = builder.mGetCustomerProvisioneesSetupStatusResponse;
    }

    public /* synthetic */ RecentlySetupDevicesViewModel(Parcel parcel, int i) {
        this(parcel);
    }
}
