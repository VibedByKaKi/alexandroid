package com.amazon.alexa.biloba.view.recent;

import com.amazon.alexa.biloba.generated.models.Activity;
import com.amazon.alexa.biloba.generated.models.Message;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;
import com.amazon.alexa.biloba.view.recent.models.ActivityHeader;
import com.amazon.alexa.biloba.view.recent.models.ActivityItem;
import com.amazon.alexa.biloba.view.recent.models.NoticeItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ActivityContainerByDate {
    private final Map<String, List<Activity>> activities = new HashMap();
    private final List<String> headers = new ArrayList();
    private final Map<String, Message> messages = new LinkedHashMap();

    public void addActivity(Activity activity) {
        String date = activity.getLocalizedDateTime().getDate();
        List<Activity> list = this.activities.get(date);
        if (list == null) {
            list = new ArrayList<>();
            this.headers.add(date);
        }
        list.add(activity);
        this.activities.put(date, list);
    }

    public void addMessages(Map<String, Message> map) {
        this.messages.putAll(map);
    }

    public void clear() {
        this.activities.clear();
        this.headers.clear();
        this.messages.clear();
    }

    public List<BaseRecyclerItem> getAllActivities() {
        ArrayList arrayList = new ArrayList();
        Iterator<Message> it2 = this.messages.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(new NoticeItem(it2.next()));
        }
        for (String str : this.headers) {
            List<Activity> list = this.activities.get(str);
            if (!list.isEmpty()) {
                arrayList.add(new ActivityHeader(str));
                Iterator<Activity> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new ActivityItem(it3.next()));
                }
            }
        }
        return arrayList;
    }
}
