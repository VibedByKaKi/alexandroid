package com.amazon.deecomms.ndt.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.enums.DeviceCommsAvailability;
import com.amazon.deecomms.calling.enums.DropInAvailability;
import com.amazon.deecomms.common.ui.CommsTextView;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.ndt.model.DeviceModel;
import com.amazon.deecomms.ndt.model.DeviceStatusModel;
import com.amazon.deecomms.ndt.model.DropInDisableReason;
import com.amazon.deecomms.ndt.state.DeviceState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DeviceAdapter extends RecyclerView.Adapter implements Filterable {
    private static final int EMPTY = 1;
    private static final int NORMAL = 0;
    private DeviceFilter deviceFilter;
    private final DeviceSelectionListener deviceSelectionListener;
    private List<DropInDisableReason> disabledDropInStates;
    private List<DeviceModel> filteredData;
    private boolean mIsThemedUIEnabled;
    private List<DeviceModel> originalData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class DeviceViewHolder extends RecyclerView.ViewHolder {
        public CommsTextView deviceName;
        private DeviceSelectionListener deviceSelectionListener;
        public CommsTextView deviceStatus;
        private View mainView;

        public DeviceViewHolder(View view, DeviceSelectionListener deviceSelectionListener) {
            super(view);
            this.mainView = view;
            this.deviceName = (CommsTextView) view.findViewById(R.id.drop_in_targeting_device_name);
            this.deviceStatus = (CommsTextView) this.mainView.findViewById(R.id.drop_in_targeting_device_status);
            this.deviceSelectionListener = deviceSelectionListener;
        }
    }

    public DeviceAdapter(DeviceSelectionListener deviceSelectionListener, List<DeviceModel> list, List<DropInDisableReason> list2, boolean z) {
        new ArrayList();
        this.deviceSelectionListener = deviceSelectionListener;
        this.disabledDropInStates = list2;
        this.mIsThemedUIEnabled = z;
        this.deviceFilter = new DeviceFilter(this, 0);
        setDeviceList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean filterDeviceBasedOnDropinDisableReason(String str) {
        DropInDisableReason lookup = DropInDisableReason.lookup(str);
        return lookup == DropInDisableReason.Unknown || this.disabledDropInStates.indexOf(lookup) != -1;
    }

    private static List<DropInDisableReason> getDefaultDisabledDropInStates() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DropInDisableReason.DropInUnavailable);
        arrayList.add(DropInDisableReason.DropInSettingOff);
        arrayList.add(DropInDisableReason.CommsSettingOff);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onBindViewHolder$0(DeviceViewHolder deviceViewHolder, DeviceModel deviceModel, DeviceState deviceState, View view) {
        deviceViewHolder.deviceSelectionListener.deviceSelected(deviceModel, deviceState);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.deviceFilter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<DeviceModel> list = this.filteredData;
        if (list == null || list.size() <= 0) {
            return 1;
        }
        return this.filteredData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<DeviceModel> list = this.filteredData;
        return (list == null || list.size() == 0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i >= this.filteredData.size()) {
            return;
        }
        DeviceViewHolder deviceViewHolder = (DeviceViewHolder) viewHolder;
        if (viewHolder.getItemViewType() == 1) {
            deviceViewHolder.deviceName.setText(R.string.no_devices_available);
            deviceViewHolder.deviceName.setTextColor(Utils.getColorFromResource(R.color.device_targeting_inactive_device));
        } else {
            DeviceModel deviceModel = this.filteredData.get(i);
            DeviceState stateForCurrentDevice = CommsDaggerWrapper.getComponent().getDeviceStateManager().getStateForCurrentDevice(deviceModel);
            stateForCurrentDevice.setTextAndColor(deviceViewHolder.deviceName, deviceViewHolder.deviceStatus, deviceModel);
            deviceViewHolder.mainView.setOnClickListener(new DeviceAdapter$$ExternalSyntheticLambda0(deviceViewHolder, 0, deviceModel, stateForCurrentDevice));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DeviceViewHolder(this.mIsThemedUIEnabled ? LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fiesta_drop_in_targeting_list_item, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drop_in_targeting_list_item, viewGroup, false), this.deviceSelectionListener);
    }

    public void setDeviceList(List<DeviceModel> list) {
        this.originalData = list;
        this.filteredData = new ArrayList(this.originalData.size());
        getFilter().filter("");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class DeviceFilter extends Filter {
        private DeviceFilter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$publishResults$0(DeviceModel deviceModel, DeviceModel deviceModel2) {
            return deviceModel.getDeviceName().compareTo(deviceModel2.getDeviceName());
        }

        private boolean shouldFilterDevice(DeviceModel deviceModel) {
            DeviceStatusModel deviceStatus = deviceModel.getDeviceStatus();
            String dropInUnsupportedReason = deviceModel.getDropInUnsupportedReason();
            return (dropInUnsupportedReason == null || !DeviceAdapter.this.filterDeviceBasedOnDropinDisableReason(dropInUnsupportedReason)) && deviceStatus.getDeviceDropInAvailability() != DropInAvailability.OFF && deviceStatus.getDeviceCommsAvailability() == DeviceCommsAvailability.ON;
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            for (DeviceModel deviceModel : DeviceAdapter.this.originalData) {
                if (shouldFilterDevice(deviceModel)) {
                    DeviceAdapter.this.filteredData.add(deviceModel);
                }
            }
            List list = DeviceAdapter.this.filteredData;
            filterResults.values = list;
            filterResults.count = list.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Collections.sort(DeviceAdapter.this.filteredData, new DeviceAdapter$DeviceFilter$$ExternalSyntheticLambda0());
            DeviceAdapter.this.notifyDataSetChanged();
        }

        public /* synthetic */ DeviceFilter(DeviceAdapter deviceAdapter, int i) {
            this();
        }
    }

    public DeviceAdapter(DeviceSelectionListener deviceSelectionListener, List<DeviceModel> list, boolean z) {
        this(deviceSelectionListener, list, getDefaultDisabledDropInStates(), z);
    }

    public DeviceAdapter(DeviceSelectionListener deviceSelectionListener) {
        this(deviceSelectionListener, new ArrayList(), getDefaultDisabledDropInStates(), false);
    }
}
