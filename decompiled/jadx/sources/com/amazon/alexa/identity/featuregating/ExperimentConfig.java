package com.amazon.alexa.identity.featuregating;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.identity.Utils;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ExperimentConfig {
    public Allocation[] allocations;
    public String fromAppVersion;
    public Integer numberOfTreatmeants;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Allocation {

        @IntRange(from = 0, to = 100)
        Integer launchAllocation;
        String localeID;

        @Nullable
        String minApplicableVersion;

        @IntRange(from = 0)
        Integer randomization;
        Integer[] treatmentAllocations;

        public Allocation() {
        }

        @IntRange(from = 0)
        public int getTreatmentForSession(@FloatRange(from = 0.0d, to = 100.0d) double d) throws ArithmeticException {
            double d2 = d / 100.0d;
            double intValue = Utils.sum(this.treatmentAllocations).intValue();
            double d3 = 0.0d;
            int i = 0;
            while (true) {
                Integer[] numArr = this.treatmentAllocations;
                if (i >= numArr.length - 1) {
                    return numArr.length - 1;
                }
                double intValue2 = (numArr[i].intValue() / intValue) + d3;
                if (d3 <= d2 && d2 < intValue2) {
                    return i;
                }
                i++;
                d3 = intValue2;
            }
        }

        public boolean isValid(@NonNull ExperimentConfig experimentConfig) {
            Integer num;
            Integer num2;
            Integer[] numArr;
            String str = this.localeID;
            return (str == null || "".equals(str) || (num = this.launchAllocation) == null || !Utils.isBetween(num.intValue(), 0, 100) || (num2 = this.randomization) == null || num2.intValue() < 0 || (numArr = this.treatmentAllocations) == null || numArr.length != experimentConfig.numberOfTreatmeants.intValue()) ? false : true;
        }
    }

    @Nullable
    public Allocation getAllocationForLocale(@NonNull Locale locale) {
        for (Allocation allocation : this.allocations) {
            if (locale.getISO3Country().equals(allocation.localeID)) {
                return allocation;
            }
        }
        return null;
    }

    public boolean isApplicableToAppVersion(@NonNull String str) {
        if (str != null && str.matches("[0-9]+(\\.[0-9]+)*")) {
            String str2 = this.fromAppVersion;
            if (str2 == null) {
                return true;
            }
            String[] split = str2.split(ArcusConfig.PATH_SEPARATOR);
            String[] split2 = str.split(ArcusConfig.PATH_SEPARATOR);
            int min = Math.min(split.length, split2.length);
            for (int i = 0; i < min; i++) {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt < parseInt2) {
                    return true;
                }
                if (parseInt > parseInt2) {
                    return false;
                }
            }
            if (split.length <= split2.length) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid() {
        Allocation[] allocationArr;
        Integer num = this.numberOfTreatmeants;
        if (num == null || num.intValue() == 0 || (allocationArr = this.allocations) == null || allocationArr.length == 0) {
            return false;
        }
        for (Allocation allocation : allocationArr) {
            if (!allocation.isValid(this)) {
                return false;
            }
        }
        return true;
    }
}
