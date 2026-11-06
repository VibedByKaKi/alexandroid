package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

import com.amazon.alexa.sharing.common.Constants;
import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.enums.EntryDataType;
import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.enums.OperatingSystem;
import com.amazon.comms.log.CommsLogger;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Action {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, Action.class);

    @SerializedName("target")
    private ArrayList<Target> targets = new ArrayList<>();

    public static Action withMobileDeepLink(String str, String str2) {
        Action action = new Action();
        ArrayList<Target> arrayList = new ArrayList<>();
        Target target = new Target();
        EntryData entryData = new EntryData();
        URLHolder uRLHolder = new URLHolder();
        ActionApplication actionApplication = new ActionApplication();
        Target target2 = new Target();
        EntryData entryData2 = new EntryData();
        URLHolder uRLHolder2 = new URLHolder();
        ActionApplication actionApplication2 = new ActionApplication();
        uRLHolder.setUrl(str);
        uRLHolder.setOrigin(str2);
        entryData.setUrl(uRLHolder);
        EntryDataType entryDataType = EntryDataType.MOBILE_ENTRY_DATA;
        entryData.setType(entryDataType);
        target.setEntryData(entryData);
        actionApplication.setOperatingSystem(OperatingSystem.Android);
        target.setActionApplication(actionApplication);
        uRLHolder2.setUrl(str);
        uRLHolder2.setOrigin(str2);
        entryData2.setUrl(uRLHolder2);
        entryData2.setType(entryDataType);
        target2.setEntryData(entryData2);
        actionApplication2.setOperatingSystem(OperatingSystem.iOS);
        target2.setActionApplication(actionApplication2);
        arrayList.add(target);
        arrayList.add(target2);
        action.setTargets(arrayList);
        return action;
    }

    public static Action withNoTargets() {
        Action action = new Action();
        action.setTargets(new ArrayList<>());
        return action;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.targets, ((Action) obj).getTargets());
    }

    public EntryData getAndroidEntryData() {
        ArrayList<Target> arrayList = this.targets;
        if (arrayList == null) {
            return null;
        }
        Iterator<Target> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Target next = it2.next();
            if (next == null) {
                LOG.d("[Content-Sharing] Target Skipped: The entry in the array is not an object");
            } else {
                ActionApplication actionApplication = next.getActionApplication();
                if (actionApplication == null) {
                    LOG.d("[Content-Sharing] Target Skipped: The entry did not contain an <actionApplication> key");
                } else if (actionApplication.getOperatingSystem() == null || !Objects.equals(actionApplication.getOperatingSystem().getSerializedName(), OperatingSystem.Android.getSerializedName())) {
                    LOG.d("[Content-Sharing] Target skipped: <actionApplication.operatingSystem> was not android");
                } else {
                    EntryData entryData = next.getEntryData();
                    if (entryData == null) {
                        LOG.d("[Content-Sharing] Target skipped: The android entry did not contain an <entryData> key");
                    } else {
                        if (entryData.getType() != null && Objects.equals(EntryDataType.MOBILE_ENTRY_DATA.getSerializedName(), entryData.getType().getSerializedName())) {
                            return entryData;
                        }
                        LOG.d("[Content-Sharing] Target skipped: The android entryData did not containa <type> key matching MobileEntryData");
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<Target> getTargets() {
        return this.targets;
    }

    public int hashCode() {
        return Objects.hash(this.targets);
    }

    public void setTargets(ArrayList<Target> arrayList) {
        this.targets = arrayList;
    }

    public String toString() {
        return "Action{targets=" + this.targets + AbstractJsonLexerKt.END_OBJ;
    }
}
