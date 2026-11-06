package com.amazon.dee.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.dee.app.data.reactnative.observers.WritableMapEncodingDataServiceObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(0);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(43);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "accessibilityEnabled");
            sparseArray.put(2, "activityHeader");
            sparseArray.put(3, "activityItem");
            sparseArray.put(4, "activityMessage");
            sparseArray.put(5, "alertV2");
            sparseArray.put(6, "barBorderVisible");
            sparseArray.put(7, "barButtonHandlers");
            sparseArray.put(8, "borderAlpha");
            sparseArray.put(9, "borderVisible");
            sparseArray.put(10, "buttonHandlers");
            sparseArray.put(11, "card");
            sparseArray.put(12, "controlButtonState");
            sparseArray.put(13, "device");
            sparseArray.put(14, "eventPublisher");
            sparseArray.put(15, "fsbFocused");
            sparseArray.put(16, "globalHeader");
            sparseArray.put(17, "globalHeaderState");
            sparseArray.put(18, "handler");
            sparseArray.put(19, "headerIcon");
            sparseArray.put(20, "headerText");
            sparseArray.put(21, "hotkeysHint");
            sparseArray.put(22, "ingressButton");
            sparseArray.put(23, "keyboardDetected");
            sparseArray.put(24, "learnMoreHandler");
            sparseArray.put(25, "library");
            sparseArray.put(26, "membership_view");
            sparseArray.put(27, "menuItem");
            sparseArray.put(28, "messageText");
            sparseArray.put(29, "model");
            sparseArray.put(30, "navigationViewModel");
            sparseArray.put(31, "noticeItem");
            sparseArray.put(32, "notificationVisible");
            sparseArray.put(33, "overflowMenuVisible");
            sparseArray.put(34, "pauseResumeClickable");
            sparseArray.put(35, "profile_settings_view");
            sparseArray.put(36, BizMetricsConstants.SESSION_TYPE);
            sparseArray.put(37, "shouldBarMoveDown");
            sparseArray.put(38, WritableMapEncodingDataServiceObserver.ElementsResponseKey.STATUS_TEXT);
            sparseArray.put(39, "subtitleText");
            sparseArray.put(40, "timezone_view");
            sparseArray.put(41, "viewModel");
            sparseArray.put(42, "viewmodel");
        }

        private InnerBrLookup() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys = new HashMap<>(0);

        private InnerLayoutIdLookup() {
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.amazon.alexa.biloba.DataBinderMapperImpl());
        arrayList.add(new com.amazon.dee.app.core.DataBinderMapperImpl());
        arrayList.add(new com.amazon.tarazed.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m("view must have a tag");
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m("view must have a tag");
        return null;
    }
}
